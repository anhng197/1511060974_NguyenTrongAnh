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
public class bangcap {
    int mabangcap;
    String tenbangcap;

    public int getMabangcap() {
        return mabangcap;
    }

    public void setMabangcap(int mabangcap) {
        this.mabangcap = mabangcap;
    }

    public String getTenbangcap() {
        return tenbangcap;
    }

    public void setTenbangcap(String tenbangcap) {
        this.tenbangcap = tenbangcap;
    }

    public bangcap(int mabangcap, String tenbangcap) {
        this.mabangcap = mabangcap;
        this.tenbangcap = tenbangcap;
    }
}
