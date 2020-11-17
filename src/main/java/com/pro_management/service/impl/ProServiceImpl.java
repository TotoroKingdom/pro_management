package com.pro_management.service.impl;

import com.pro_management.mapper.ProMapper;
import com.pro_management.model.Pro;
import com.pro_management.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProServiceImpl implements ProService {

    @Autowired
    private ProMapper proMapper;

    @Override
    public void insertPro(Pro pro) {
        proMapper.insertPro(pro);
    }

    @Override
    public Pro getByIdPro(int proId) {
        return proMapper.getByIdPro(proId);
    }

    @Override
    public List<Pro> listPro() {
        return proMapper.listPro();
    }

    @Override
    public void updatePro(Pro pro) {
        proMapper.updatePro(pro);
    }

    @Override
    public void deletePro(int proId) {
        proMapper.deletePro(proId);
    }
}
