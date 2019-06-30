package com.wh.mybatis.core.dept.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wh.mybatis.core.dept.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wh
 * @since 2019-06-28
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    Dept findDeptById(String id);
}
