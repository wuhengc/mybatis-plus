package com.wh.mybatis.core.dept.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wh.mybatis.core.common.util.PageUtils;
import com.wh.mybatis.core.common.util.Query;
import com.wh.mybatis.core.dept.entity.Dept;
import com.wh.mybatis.core.dept.mapper.DeptMapper;
import com.wh.mybatis.core.dept.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wh
 * @since 2019-06-28
 */
@Service
@Slf4j
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Dept> page=baseMapper.selectPage(new Query<Dept>(params).getPage(),
                new QueryWrapper<Dept>().lambda());
        return new PageUtils(page);
    }

    @Override
    public Dept findDeptById(String id) {
        return deptMapper.findDeptById(id);
    }

}
