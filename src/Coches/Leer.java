package Opciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {

	public static String [] LeerAmigos() throws IOException {
		 // Leer archivo
		String []listaAmigos = new String[999];
		int i=0;
        String cadena;
        FileReader f = new FileReader("data/Amigos.dat");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
        	listaAmigos[i] = cadena;
        	i++;
        }
        
        b.close(); 
        return listaAmigos;
	    }
	
	public int ContadorAmigos() throws IOException {
        FileReader f = new FileReader("data/Amigos.dat");
        BufferedReader b = new BufferedReader(f);
        int num=0;
		while((b.readLine())!=null) {
			num++;
			
        }
		
		return num;
	}
	
	public static String [] LeerLibros() throws IOException {
		 // Leer archivo
		String []LeerLibros = new String[999];
		int i=0;
        String cadena;
        FileReader f = new FileReader("data/Libros.dat");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
        	LeerLibros[i] = cadena;
        	i++; 	
        }
        b.close(); 
		return LeerLibros;
	    
	}
	
	public int ContadorLibros() throws IOException {
	
		int num = 0;
		FileReader f = new FileReader("data/Libros.dat");
		BufferedReader b = new BufferedReader(f);
		while((b.readLine())!=null) {
			num++;
 
		}
	
		return num;
	}

}
	
