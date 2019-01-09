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
public class congviec {

    public congviec(int macongviec, String tencongviec) {
        this.macongviec = macongviec;
        this.tencongviec = tencongviec;
    }

    public int getMacongviec() {
        return macongviec;
    }

    public void setMacongviec(int macongviec) {
        this.macongviec = macongviec;
    }

    public String getTencongviec() {
        return tencongviec;
    }

    public void setTencongviec(String tencongviec) {
        this.tencongviec = tencongviec;
    }
    int macongviec;
    String tencongviec;
}
