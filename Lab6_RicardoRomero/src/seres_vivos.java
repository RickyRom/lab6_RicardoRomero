/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class seres_vivos {
    private String nombre_raza;
    private int numero_ki;
    private int numero_max_años;
    private String nombre_planeta;

    public seres_vivos() {
    }

    public seres_vivos(String nombre_raza, int numero_ki, int numero_max_años, String nombre_planeta) {
        this.nombre_raza = nombre_raza;
        this.numero_ki = numero_ki;
        this.numero_max_años = numero_max_años;
        this.nombre_planeta = nombre_planeta;
    }

    public String getNombre_raza() {
        return nombre_raza;
    }

    public void setNombre_raza(String nombre_raza) {
        this.nombre_raza = nombre_raza;
    }

    public int getNumero_ki() {
        return numero_ki;
    }

    public void setNumero_ki(int numero_ki) {
        this.numero_ki = numero_ki;
    }

    public int getNumero_max_años() {
        return numero_max_años;
    }

    public void setNumero_max_años(int numero_max_años) {
        this.numero_max_años = numero_max_años;
    }

    public String getNombre_planeta() {
        return nombre_planeta;
    }

    public void setNombre_planeta(String nombre_planeta) {
        this.nombre_planeta = nombre_planeta;
    }

    @Override
    public String toString() {
        return nombre_raza;
    }
}
