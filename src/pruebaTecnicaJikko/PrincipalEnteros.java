package pruebaTecnicaJikko;

import java.util.HashMap;
import java.util.Map;

public abstract class PrincipalEnteros {
	
    public static int[] encontrarIndices(int[] enteros, int destino) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < enteros.length; i++) {
            int complemento = destino - enteros[i];
            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }
            mapa.put(enteros[i], i);
        }

        // Si no se encuentra solución, se puede lanzar una excepción o devolver null
        return null;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = {2, 7, 11, 15};
        int destino = 9;

        int[] resultado = encontrarIndices(enteros, destino);
        if (resultado != null) {
            System.out.println("Indices: " + resultado[0] + ", " + resultado[1]);
        } else {
            System.out.println("No se encontraron dos numeros que sumen el destino.");
        }
	}

}
