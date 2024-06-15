package com.example.__PhamThiThuHuyen.service;

import com.example.__PhamThiThuHuyen.model.PHONGBAN;
import com.example.__PhamThiThuHuyen.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanService {
    @Autowired
    private static PhongBanRepository phongBanRepository;
    public static List<PHONGBAN> getAllPHONG(){
        return phongBanRepository.findAll();
    }
}
