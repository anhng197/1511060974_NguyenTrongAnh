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
public class ngoaingu {
    int mangoaingu;
    String tenngoaingu;

    public int getMangoaingu() {
        return mangoaingu;
    }

    public void setMangoaingu(int mangoaingu) {
        this.mangoaingu = mangoaingu;
    }

    public String getTenngoaingu() {
        return tenngoaingu;
    }

    public void setTenngoaingu(String tenngoaingu) {
        this.tenngoaingu = tenngoaingu;
    }

    public ngoaingu(int mangoaingu, String tenngoaingu) {
        this.mangoaingu = mangoaingu;
        this.tenngoaingu = tenngoaingu;
    }
}
