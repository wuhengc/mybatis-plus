package com.wh.mybatis.core.dept.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.mybatis.core.common.util.PageUtils;
import com.wh.mybatis.core.dept.entity.Dept;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wh
 * @since 2019-06-28
 */
public interface DeptService extends IService<Dept> {

    /**
     * 分页查询
     * @param params
     * @return
     */
     PageUtils queryPage(Map<String, Object> params);

     Dept findDeptById(String id);
}
