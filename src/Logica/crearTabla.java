package Logica;

import java.util.Enumeration;
import java.util.Hashtable;

public class crearTabla {
	
	public static void main(String[] args) {
		 
		   Enumeration nombre;//Interfaz normalizada para recorrer ordenadamente
		   //los elementos de una colecci�n
		   Enumeration contenedor = null;
		   String llave;
		   //Crear la tabla
		     Hashtable<String, String> tabla;
		     tabla = new Hashtable<>();   
		     tabla.put("C001","Ingenier�a");
		     tabla.put("C002","Educaci�n");
		     tabla.put("C003","Ciencias B�sicas");
		     tabla.put("C004","Ciencias Contables");
		     tabla.put("C005","Humanidades");
		     nombre = tabla.keys();
		     //Recorro la tabla para mostrarla
		   while(nombre.hasMoreElements()) {//busca elementos en la colecci�n
		      llave = (String) nombre.nextElement();
		      tabla.hashCode();
		      System.out.println("Llave " +llave+ " Programa "+tabla.get(llave)+tabla.hashCode());
		   }
		   Enumeration llaves = tabla.keys();
		    while (llaves.hasMoreElements()) {
		        System.out.println(""+"hashtable llaves: " + llaves.nextElement());
		}
		 
		}   
	

}
