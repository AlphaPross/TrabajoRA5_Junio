package Guardar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Usuarios.UsuariosAdmin;

public class Guardar {
	
	public void GuardarData(String [] cadena) throws IOException {
        FileWriter f = new FileWriter("data/data.dat",true);
        BufferedWriter b = new BufferedWriter(f);
        b.newLine();
        for ( int j= 0; j < cadena.length; j++) {
        	b.write(cadena[j]);
		}
        b.close(); 
		
	}
	
	public void GuardarLibros(String cadena) throws IOException {
		FileWriter f = new FileWriter("data/Libros.dat",true);
        BufferedWriter b = new BufferedWriter(f);
        b.newLine();
        b.write(cadena);
        b.close(); 
	}
	
	public void GuardarDataSobrescribir(String [][] cadena) throws IOException {
		FileWriter f = new FileWriter("data/data.dat");
        BufferedWriter b = new BufferedWriter(f);
        
        for ( int j= 0; j <= 2; j++) {
        	for (int i = 0; i < 5; i++) {
        		if (cadena[j][i]!="") {
        			if (i<4) {
        				b.write(cadena[j][i]+";");
					}
        			if (i==4) {
						b.write(cadena[j][i]);
					}
				}
        	}
        	
        	if (cadena[j][0]!="") {
        		if (cadena[j+1][0]!="") {
        			b.newLine();
				}
       		}
        }
        b.close(); 
	}

}
