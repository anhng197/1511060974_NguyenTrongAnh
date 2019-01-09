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
public class tinhthanh {

    public tinhthanh(int matinhthanh, String tentinhthanh) {
        this.matinhthanh = matinhthanh;
        this.tentinhthanh = tentinhthanh;
    }

    public int getMatinhthanh() {
        return matinhthanh;
    }

    public void setMatinhthanh(int matinhthanh) {
        this.matinhthanh = matinhthanh;
    }

    public String getTentinhthanh() {
        return tentinhthanh;
    }

    public void setTentinhthanh(String tentinhthanh) {
        this.tentinhthanh = tentinhthanh;
    }
    int matinhthanh;
    String tentinhthanh;
}
