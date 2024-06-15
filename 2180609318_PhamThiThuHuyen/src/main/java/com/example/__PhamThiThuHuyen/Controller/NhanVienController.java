package com.example.__PhamThiThuHuyen.Controller;


import com.example.__PhamThiThuHuyen.model.NHANVIEN;
import com.example.__PhamThiThuHuyen.service.NhanVienService;
import com.example.__PhamThiThuHuyen.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private PhongBanService phongBanService;
    @GetMapping
    public String listNhanVien(Model model){
        List<NHANVIEN> nhanvienList = nhanVienService.GetAllNHANVIEN();
        model.addAttribute("nhanvienList", nhanvienList);
        return "NhanVien/list_NhanVien";
    }

}
