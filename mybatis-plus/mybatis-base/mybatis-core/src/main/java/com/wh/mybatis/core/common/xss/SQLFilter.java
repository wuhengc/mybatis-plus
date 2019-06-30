package com.wh.mybatis.core.common.xss;

import com.wh.mybatis.core.common.excepton.MyException;
import com.wh.mybatis.core.common.excepton.enums.ErrorEnum;
import org.apache.commons.lang.StringUtils;

/**
 * 防止SQL注入
 */
public class SQLFilter {

    /**
     * SQL注入过滤
     * @param str  待验证的字符串
     */
    public static String sqlInject(String str){
        if(StringUtils.isEmpty(str)){
            return null;
        }
        //去掉'|"|;|\字符
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");

        //转换成小写
        str = str.toLowerCase();

        //非法字符
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alert", "drop"};

        //判断是否包含非法字符
        for(String keyword : keywords){
            if(str.indexOf(keyword) != -1){
                throw new MyException(ErrorEnum.SQL_ILLEGAL);
            }
        }

        return str;
    }
}