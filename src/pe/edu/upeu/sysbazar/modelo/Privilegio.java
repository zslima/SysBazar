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
public class Privilegio {
    private int idprivilegio;
    private int idu;
    private int idemp;
    private int idrol;
    private String nombp;

    public Privilegio() {
    }

    public Privilegio(int idu, int idemp, int idrol, String nombp) {
        this.idu = idu;
        this.idemp = idemp;
        this.idrol = idrol;
        this.nombp = nombp;
    }

    public int getIdprivilegio() {
        return idprivilegio;
    }

    public void setIdprivilegio(int idprivilegio) {
        this.idprivilegio = idprivilegio;
    }

    public int getIdu() {
        return idu;
    }

    public void setIdu(int idu) {
        this.idu = idu;
    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombp() {
        return nombp;
    }

    public void setNombp(String nombp) {
        this.nombp = nombp;
    }
    
}
