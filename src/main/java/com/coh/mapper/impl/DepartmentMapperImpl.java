package com.coh.mapper.impl;

import com.coh.mapper.DepartmentMapper;
import com.coh.pojo.Department;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

public class DepartmentMapperImpl extends SqlSessionDaoSupport implements DepartmentMapper {
    @Override
    public List<Department> findAll() {
         return  this.getSqlSession().getMapper(DepartmentMapper.class).findAll();
    }
}
