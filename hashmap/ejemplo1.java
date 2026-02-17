import java.util.HashMap;

public class ejemplo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> placas = new HashMap<>();
        placas.put("ABC", 101);
        placas.put("XYZ", 202);
        placas.put("LMN", 303);
        placas.put("PQR", 404);
        placas.put("DEF", 505);

        int contadorPares = 0;
        for (int valor : placas.values()) {
            if (valor % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Total números pares en placas: " + contadorPares);
    }
}