/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava.bll;

import doanjava.dal.EmployeeDAL;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class EmployeeBLL {
      EmployeeDAL dal = new EmployeeDAL();
    public ResultSet readEmployee () {
        ResultSet rs = dal.readEmployee();
        return rs;
    }
    public void addNewEmployee(int manhanvien,String hoten,String bidanh, String didong, int dienthoainha, int diachiemail, 
            Date ngaysinh, String noisinh, String tentinhthanh, int cmnd, Date ngaycapcmnd, Date noicapcmnd, String quequan,
            String diachi, String tamtru, int tenloainhanvien,  Date ngayvaolam, String tenphongban, String tencongviec,
            String tenchucvu, int mucluongcb, int heso, int mucluong, int phucapluong, int sosolaodong, Date ngaycapsolaodong,
            int noicapsolaodong, int taikhoannganhang, int ngayhang, String tenhocvan, String tenbangcap, String tenngoaingu, String tentinhoc, 
            String tendantoc, String tenquoctich, String tentongiao, int gioitinh) {
       
            dal.addNewEmployee(  manhanvien,hoten, bidanh,  didong,  dienthoainha,  diachiemail, 
            ngaysinh,  noisinh, tentinhthanh, cmnd,  ngaycapcmnd,  noicapcmnd,  quequan,
            diachi,  tamtru, tenloainhanvien,  ngayvaolam, tenphongban,  tencongviec,
           tenchucvu,  mucluongcb,  heso, mucluong,  phucapluong,  sosolaodong,  ngaycapsolaodong,
           noicapsolaodong, taikhoannganhang,ngayhang,  tenhocvan, tenbangcap,  tenngoaingu,  tentinhoc, 
             tendantoc,  tenquoctich,  tentongiao, gioitinh);
     
    }
    public void deleteEmployee(int manhanvien) throws Exception{
       
            dal.deleteEmployee(manhanvien);
      
    }
    public void editEmployee(int manhanvien,String hoten,String bidanh, String didong, int dienthoainha, int diachiemail, 
            Date ngaysinh, String noisinh, String tentinhthanh, int cmnd, Date ngaycapcmnd, Date noicapcmnd, String quequan,
            String diachi, String tamtru, int tenloainhanvien,  Date ngayvaolam, String tenphongban, String tencongviec,
            String tenchucvu, int mucluongcb, int heso, int mucluong, int phucapluong, int sosolaodong, Date ngaycapsolaodong,
            int noicapsolaodong, int taikhoannganhang, int ngayhang, String tenhocvan, String tenbangcap, String tenngoaingu, String tentinhoc, 
            String tendantoc, String tenquoctich, String tentongiao, int gioitinh) {
        
            dal.editEmployee( manhanvien,hoten, bidanh,  didong,  dienthoainha,  diachiemail, 
            ngaysinh,  noisinh, tentinhthanh, cmnd,  ngaycapcmnd,  noicapcmnd,  quequan,
            diachi,  tamtru, tenloainhanvien,  ngayvaolam, tenphongban,  tencongviec,
           tenchucvu,  mucluongcb,  heso, mucluong,  phucapluong,  sosolaodong,  ngaycapsolaodong,
           noicapsolaodong, taikhoannganhang,ngayhang,  tenhocvan, tenbangcap,  tenngoaingu,  tentinhoc, 
             tendantoc,  tenquoctich,  tentongiao, gioitinh );
     
    }
    
    public static void main(String[] args) {
        
    }
    
}
