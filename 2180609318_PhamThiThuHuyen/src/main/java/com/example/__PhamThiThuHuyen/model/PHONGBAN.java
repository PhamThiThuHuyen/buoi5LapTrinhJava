package com.example.__PhamThiThuHuyen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phongban")
public class PHONGBAN {
    @Id
    @Column(name = "MaPhong", nullable = false, length = 2)
    private String maphong;
    @Column(name = "TenPhong", nullable = false, length = 30)
    private String tenphong;

}
