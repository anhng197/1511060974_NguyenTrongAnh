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
public class tinhoc {

    public tinhoc(int matinhoc, String tentinhoc) {
        this.matinhoc = matinhoc;
        this.tentinhoc = tentinhoc;
    }

    public int getMatinhoc() {
        return matinhoc;
    }

    public void setMatinhoc(int matinhoc) {
        this.matinhoc = matinhoc;
    }

    public String getTentinhoc() {
        return tentinhoc;
    }

    public void setTentinhoc(String tentinhoc) {
        this.tentinhoc = tentinhoc;
    }
    int matinhoc;
    String tentinhoc;
}
