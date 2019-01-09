/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author admin
 */
public class EmployeeDAL {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/qlnhanvien";
    static final String USER = "root";
    static final String PASS = "";
    public ResultSet readEmployee() {
        Connection conn = null;
        Statement stmt = null;
        try {
            
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM qlnhanvien";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
//            try {
//                if (stmt != null)
//                    stmt.close();
//            } catch (SQLException ex) {
//            }
//            try {
//                if (conn != null)
//                    conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
        }
        return null;
  
    }
     public void addNewEmployee (int manhanvien,String hoten,String bidanh, String didong, int dienthoainha, int diachiemail, 
            Date ngaysinh, String noisinh, String tentinhthanh, int cmnd, Date ngaycapcmnd, Date noicapcmnd, String quequan,
            String diachi, String tamtru, int tenloainhanvien,  Date ngayvaolam, String tenphongban, String tencongviec,
            String tenchucvu, int mucluongcb, int heso, int mucluong, int phucapluong, int sosolaodong, Date ngaycapsolaodong,
            int noicapsolaodong, int taikhoannganhang, int ngayhang, String tenhocvan, String tenbangcap, String tenngoaingu, String tentinhoc, 
            String tendantoc, String tenquoctich, String tentongiao, int gioitinh) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO qlnhanvien VALUES ("+ manhanvien +", '"+ hoten +"' ,'"+ bidanh +"','"+  didong +"',"
                    + "'"+ dienthoainha +"','"+ diachiemail +"', '"+ ngaysinh +"', '"+ noisinh +"', "+ tentinhthanh +","
                    + " '"+ cmnd +"', '"+ ngaycapcmnd +"', "+  noicapcmnd +", "+ quequan +", '"+ diachi +"', '"+ tamtru+"', "
                    + "'"+ tenloainhanvien +"', '"+  ngayvaolam +"', '"+  tenphongban +"', '"+ tencongviec +"', '"+ tenchucvu +"', "
                    + "'"+ mucluongcb +"', '"+ heso +"', '"+ mucluong +"', '"+ phucapluong +"', '"+  sosolaodong +"', '"+  ngaycapsolaodong +"',"
                    + "'"+ noicapsolaodong +"' , '"+ taikhoannganhang +"', '"+ ngayhang +"', '"+  tenhocvan +"', "+  tenbangcap +", "
                    + ""+  tenngoaingu +", '"+ tentinhoc +"','"+ tendantoc +"', '"+ tenquoctich +"', "
                    + "'"+ tentongiao +"', '"+ gioitinh +"')";
            //String sql = "INSERT INTO employee VALUES ("+ ma +",'"+ ten +"',"+ gia + ")";
            stmt.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void deleteEmployee (int manhanvien) {
        Connection conn = null;
        Statement stmt = null;
            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                stmt = conn.createStatement();
                String sql = "DELETE FROM qlnhanvien WHERE manhanvien = " + manhanvien;
                stmt.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void editEmployee(int manhanvien,String hoten,String bidanh, String didong, int dienthoainha, int diachiemail, 
            Date ngaysinh, String noisinh, String tentinhthanh, int cmnd, Date ngaycapcmnd, Date noicapcmnd, String quequan,
            String diachi, String tamtru, int tenloainhanvien,  Date ngayvaolam, String tenphongban, String tencongviec,
            String tenchucvu, int mucluongcb, int heso, int mucluong, int phucapluong, int sosolaodong, Date ngaycapsolaodong,
            int noicapsolaodong, int taikhoannganhang, int ngayhang, String tenhocvan, String tenbangcap, String tenngoaingu, String tentinhoc, 
            String tendantoc, String tenquoctich, String tentongiao, int gioitinh) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        //    String sql = "UPDATE nhanvien SET SHCC = "+ SHCC +", ho = '"+ ho +"' ,ten = '"+ ten +"',hovaten = '"+  hovaten +"',"
        //            + " tengoikhac = '"+ tengoikhac +"', gioitinh = '"+ gioitinh +"', ngaysinh = '"+ ngaysinh +"', noisinh = '"+ noisinh +"', socmnd = "+ socmnd +","
         //           + " ngaycap = '"+ ngaycap +"', noicap = '"+ noicap +"', dtdd = "+  dtdd +", dtnr = "+ dtnr +", email = '"+ email +"', dantoc = '"+ dantoc+"', "
          //          + " tongiao = '"+ tongiao +"', quoctich = '"+  quoctich +"', tthonhan = '"+  tthonnhan +"', quequan = '"+ quequan +"', dctt = '"+ dctt +"', "
         //           + " noht = '"+ noht +"', ghichu = '"+ ghichu +"', donvi = '"+ donvi +"', daibieu ='"+ daibieu +"', loainhansu =  '"+  loainhansu +"', bienche = '"+  bienche +"',"
          //          + " ngaytdkhd = '"+ ngaytdkhd +"' , ngaybng = '"+ ngaybng +"',chucdanh = '"+ chucdanh +"',chucvu = '"+  chucvu +"', chieucao = "+  chieucao +", "
           //         + " cannang = "+ cannang +", nhommau = '"+ nhommau +"', trinhtrangsuckhoe = '"+ trinhtrangsuckhoe +"', thanhphanxuatthan =  '"+ thanhphanxuatthan +"', "
           //         + " uutiengiadinh = '"+ uutiengiadinh +"', uutienbanthan = '"+ uutienbanthan +"', nguontuyendung = '"+ nguontuyendung +"', ngaytuyendung = '"+ ngaytuyendung +"' WHERE SHCC = "+ SHCC2;
           
          //  stmt.executeUpdate(sql);
//            ResultSet rs = stmt.executeQuery(sql);
//            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}

