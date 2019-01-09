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
public class hocvan {

    public hocvan(int mahocvan, String tenhocvan) {
        this.mahocvan = mahocvan;
        this.tenhocvan = tenhocvan;
    }

    public int getMahocvan() {
        return mahocvan;
    }

    public void setMahocvan(int mahocvan) {
        this.mahocvan = mahocvan;
    }

    public String getTenhocvan() {
        return tenhocvan;
    }

    public void setTenhocvan(String tenhocvan) {
        this.tenhocvan = tenhocvan;
    }
    int mahocvan;
    String tenhocvan;
}
