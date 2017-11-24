
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Admin_Universo {
    private Universo u;
    private File archivo = null;
    
    public Admin_Universo() {
        
    }


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Universo getU() {
        return u;
    }

    public void setU(Universo u) {
        this.u = u;
    }

    
    
    public void escribirarchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (seres_vivos s : u.getSv()) {
                System.out.println(s.getNombre_raza());
                bw.write(s.getNombre_raza() + "|");
                bw.write(s.getNumero_ki() + "|");
                bw.write(s.getNumero_max_años() + "|");
                bw.write(s.getNombre_planeta() + "|");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargararchivo() {
        if (archivo.exists()) {
            
            Scanner sc = null;
             u = new Universo(archivo.getName());
            
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {                    
                    u.getSv().add(new seres_vivos(sc.next(), sc.nextInt(), sc.nextInt(), sc.next()));
                }
                
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
