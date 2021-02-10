package edu.escuelaing.arep;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    
	/**
	 * Esta clase permite abrir una pagina /Apps/about que mostrara informacion de la pagina
	 * @param args llamado de la clase a demas motodos
	 */
	public static void main( String[] args ){
        ServidorHTTP servidor = new ServidorHTTP();
        Spark.post("/about", "Encontraras un pequenio catalogo de gomitas que tendras a tu disposicion.\r\n"
        		+ "\r\n"
        		+ "Gomitas Gominola, gomosas para el paladar");
        try {
        	servidor.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
