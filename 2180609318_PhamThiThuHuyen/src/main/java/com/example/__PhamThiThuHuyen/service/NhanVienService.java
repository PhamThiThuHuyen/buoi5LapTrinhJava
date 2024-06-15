package com.example.__PhamThiThuHuyen.service;

import com.example.__PhamThiThuHuyen.model.NHANVIEN;
import com.example.__PhamThiThuHuyen.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    public List<NHANVIEN> GetAllNHANVIEN(){
        return nhanVienRepository.findAll();
    }
    public Optional<NHANVIEN> getNHANVIENById(String id){
        return nhanVienRepository.findById(id);
    }
    public NHANVIEN saveNhanVien(NHANVIEN nhanvien){
        return nhanVienRepository.save(nhanvien);
    }
    public void deleteNhanVien(String id){
        nhanVienRepository.deleteById(id);
    }
}
