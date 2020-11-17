package com.pro_management.service.impl;

import com.pro_management.mapper.EmpMapper;
import com.pro_management.model.Emp;
import com.pro_management.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void insert(Emp emp) {
        empMapper.insert(emp);
    }

    @Override
    public Emp getById(int empId) {
        return empMapper.getById(empId);
    }

    /*
    @Override
    public Emp getEmpWithPro(int empId){
        return empMapper.getEmpWithPro(empId);
    }
    */
    @Override
    public List<Emp> list() {
        return empMapper.list();
    }

    @Override
    public void update(Emp emp) {
        empMapper.update(emp);
    }

    @Override
    public void delete(int empId) {
        empMapper.delete(empId);
    }
}
