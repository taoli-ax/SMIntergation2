package com.coh.service.impl;

import com.coh.mapper.DepartmentMapper;
import com.coh.pojo.Department;
import com.coh.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();

    }

    public DepartmentMapper getDepartmentMapper() {
        return departmentMapper;
    }

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }
}
