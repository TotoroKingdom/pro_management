package com.pro_management.service;


import com.pro_management.model.Pro;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProService {

    public void insertPro(Pro pro);
    public Pro getByIdPro(int proId);
    public List<Pro> listPro();
    public void updatePro(Pro pro);
    public void deletePro(int proId);
}
