package com.example.__PhamThiThuHuyen.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhanvien")
public class NHANVIEN {
    @Id
    @Column(name = "MaNV", nullable = false, length = 10)
    private String maNV;
    @Column(name = "TenNV", nullable = false, length = 100)
    private String tenNV;
    @Column(name = "Phai", nullable = false, length = 3)
    private  String phai;
    @Column(name = "NoiSinh", nullable = false, length = 200)
    private  String noisinh;
    @Column(name = "MaPhong", nullable = false, length = 2)
    private  String maphong;
    @Column(name = "Luong", nullable = false)
    private  int luong;

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getPhai() {
        return phai;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public String getMaphong() {
        return maphong;
    }

    public int getLuong() {
        return luong;
    }
}
