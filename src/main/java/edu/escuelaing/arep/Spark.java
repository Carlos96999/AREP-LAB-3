package edu.escuelaing.arep;

import java.util.HashMap;
import java.util.Map;

public class Spark
{
	private static Map<String, String> fin = new HashMap<>();
	
	/**
	 * Implementamos Spark
	 * @param app String con un html.
	 * @return retorna un String con el contenido del valor
	 */
	public static String get(String app) {
		if(fin.containsKey(app)) {
			return fin.get(app);
		}
		return null;
	}

	/**
	 * Implementa un Post de Spark.
	 * @param llave contiene llave
	 * @param valor contiene valor de la llave
	 */
	public static void post(String llave, String valor) {
		fin.put(llave, valor);
	}

}
