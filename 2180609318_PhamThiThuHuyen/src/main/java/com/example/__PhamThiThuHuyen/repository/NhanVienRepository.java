package com.example.__PhamThiThuHuyen.repository;

import com.example.__PhamThiThuHuyen.model.NHANVIEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NHANVIEN, String> {
}
