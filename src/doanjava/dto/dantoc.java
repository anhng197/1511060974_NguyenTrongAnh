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
public class dantoc {
    int madantoc;
    String tendantoc;

    public int getMadantoc() {
        return madantoc;
    }

    public void setMadantoc(int madantoc) {
        this.madantoc = madantoc;
    }

    public String getTendantoc() {
        return tendantoc;
    }

    public void setTendantoc(String tendantoc) {
        this.tendantoc = tendantoc;
    }

    public dantoc(int madantoc, String tendantoc) {
        this.madantoc = madantoc;
        this.tendantoc = tendantoc;
    }
}
