package com.pro_management.service;

import com.pro_management.model.Emp;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EmpService {

    public void insert(Emp emp);
    public Emp getById(int empId);
    //public Emp getEmpWithPro(int empId);
    public List<Emp> list();
    public void update(Emp emp);
    public void delete(int empId);

}
