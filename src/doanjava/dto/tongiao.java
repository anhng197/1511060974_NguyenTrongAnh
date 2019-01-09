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
public class tongiao {
    int matongiao;
    String tentongiao;

    public int getMatongiao() {
        return matongiao;
    }

    public void setMatongiao(int matongiao) {
        this.matongiao = matongiao;
    }

    public String getTentongiao() {
        return tentongiao;
    }

    public void setTentongiao(String tentongiao) {
        this.tentongiao = tentongiao;
    }

    public tongiao(int matongiao, String tentongiao) {
        this.matongiao = matongiao;
        this.tentongiao = tentongiao;
    }
}
