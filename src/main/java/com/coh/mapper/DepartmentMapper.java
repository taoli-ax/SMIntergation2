package com.coh.mapper;

import com.coh.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DepartmentMapper {
    List<Department> findAll();
}
