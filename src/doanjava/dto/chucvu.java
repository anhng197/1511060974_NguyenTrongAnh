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
public class chucvu {

    public chucvu(int machucvu, String tenchucvu) {
        this.machucvu = machucvu;
        this.tenchucvu = tenchucvu;
    }

    public int getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }
    int machucvu;
    String tenchucvu;
}
