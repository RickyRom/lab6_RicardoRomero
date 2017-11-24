
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Universo {
    private String nombre;
    ArrayList<seres_vivos> sv = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<seres_vivos> getSv() {
        return sv;
    }

    public void setSv(ArrayList<seres_vivos> sv) {
        this.sv = sv;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
