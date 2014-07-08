/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.sysbazar.modelo;

/**
 *
 * @author USER
 */
public class Rol {
    private int idrol;
    private int idemp;
    private int idu;
    private String rol;

    public Rol() {
    }

    public Rol(int idemp, int idu, String rol) {
        this.idemp = idemp;
        this.idu = idu;
        this.rol = rol;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public int getIdu() {
        return idu;
    }

    public void setIdu(int idu) {
        this.idu = idu;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
