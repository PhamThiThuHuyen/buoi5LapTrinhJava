package com.example.__PhamThiThuHuyen.repository;

import com.example.__PhamThiThuHuyen.model.PHONGBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PHONGBAN, String> {

}
