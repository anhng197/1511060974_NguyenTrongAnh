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
public class quoctich {

    public quoctich(int maquoctich, String tenquoctich) {
        this.maquoctich = maquoctich;
        this.tenquoctich = tenquoctich;
    }

    public int getMaquoctich() {
        return maquoctich;
    }

    public void setMaquoctich(int maquoctich) {
        this.maquoctich = maquoctich;
    }

    public String getTenquoctich() {
        return tenquoctich;
    }

    public void setTenquoctich(String tenquoctich) {
        this.tenquoctich = tenquoctich;
    }
   int maquoctich;
   String tenquoctich;
}
