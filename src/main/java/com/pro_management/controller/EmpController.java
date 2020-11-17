package com.pro_management.controller;

import com.pro_management.model.Emp;
import com.pro_management.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;
    //添加员工
    @PostMapping("insert")
    public String insert(Emp emp){
        empService.insert(emp);
        return "redirect:main";
    }
    //
    @GetMapping("getById")
    public String getById(int empId,Model model){
       Emp emp = empService.getById(empId);
       model.addAttribute("emp",emp);
       return "update";
    }
    /*
    @GetMapping("getEmpWithPro")
    public String getEmpWithPro(int empId, Model model){
        Emp emp = empService.getEmpWithPro(empId);
        model.addAttribute("emp",emp);
        return "weekly";
    }
    */


    //遍历所有员工信息
    @GetMapping("main")
    public String list(Model model){
        List<Emp> list = empService.list();
        model.addAttribute("list",list);
        return "main";
    }
    //
    @PostMapping("update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:main";
    }
    //删除
    @GetMapping("delete")
    public String delete(int empId){
        empService.delete(empId);
        return "redirect:main";
    }
}
