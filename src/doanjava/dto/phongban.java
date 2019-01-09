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
public class phongban {
    int maphongban;
    String tenphongban;

    public int getMaphongban() {
        return maphongban;
    }

    public void setMaphongban(int maphongban) {
        this.maphongban = maphongban;
    }

    public String getTenphongban() {
        return tenphongban;
    }

    public void setTenphongban(String tenphongban) {
        this.tenphongban = tenphongban;
    }

    public phongban(int maphongban, String tenphongban) {
        this.maphongban = maphongban;
        this.tenphongban = tenphongban;
    }
    
    
}
