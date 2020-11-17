package com.pro_management.controller;

import com.pro_management.model.Pro;
import com.pro_management.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProController {

    @Autowired
    private ProService proService;

    @PostMapping("insertPro")
    public String insertPro(Pro pro){
        proService.insertPro(pro);
        return "redirect:pro";
    }

    @GetMapping("getByIdPro")
    public String getByIdPro(int proId, Model model){
        Pro pro = proService.getByIdPro(proId);
        model.addAttribute("pro",pro);
        return "updatePro";
    }

    @GetMapping("pro")
    public String listPro(Model model){
        List<Pro> listPro = proService.listPro();
        model.addAttribute("listPro",listPro);
        return "pro";
    }


    @PostMapping("updatePro")
    public String updatePro(Pro pro){
        proService.updatePro(pro);
        return "redirect:pro";
    }

    @GetMapping("deletePro")
    public String deletePro(int proId){
        proService.deletePro(proId);
        return "redirect:pro";
    }
}
