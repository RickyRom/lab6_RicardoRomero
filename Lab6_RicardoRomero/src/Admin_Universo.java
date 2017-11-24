
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
    private ArrayList<Universo> listaU = new ArrayList();
    private File archivo = null;
    
    public Admin_Universo() {
        
    }

    public ArrayList<Universo> getListaU() {
        return listaU;
    }

    public void setListaU(ArrayList<Universo> listaU) {
        this.listaU = listaU;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaU=" + listaU;
    }
    
    public void setUniverso(Universo u) {
        this.listaU.add(u);
    }
    
    public void escribirarchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Universo u : listaU) {
                bw.write(u.getNombre() + "|");
                bw.write(u.getSv() + "|");
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
            listaU = new ArrayList();
            
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {                    
                    listaU.add(new Universo(sc.next()));
                }
                
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
