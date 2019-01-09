/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava.dto;

/**
 *
 * @author admin
 */
public class loainhanvien {

    public loainhanvien(int maloainhanvien, String tenloainhanvien) {
        this.maloainhanvien = maloainhanvien;
        this.tenloainhanvien = tenloainhanvien;
    }

    public int getMaloainhanvien() {
        return maloainhanvien;
    }

    public void setMaloainhanvien(int maloainhanvien) {
        this.maloainhanvien = maloainhanvien;
    }

    public String getTenloainhanvien() {
        return tenloainhanvien;
    }

    public void setTenloainhanvien(String tenloainhanvien) {
        this.tenloainhanvien = tenloainhanvien;
    }
   int maloainhanvien;
   String tenloainhanvien;
}
