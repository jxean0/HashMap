import java.util.HashMap;

public class ejemplo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> repuestos = new HashMap<>();
        repuestos.put("Filtro de aceite", 10);
        repuestos.put("Pastillas de freno", 25);
        repuestos.put("Bujías", 30);
        repuestos.put("Batería", 15);
        repuestos.put("Correa de distribución", 40);

        int contadorPares = 0;
        for (int valor : repuestos.values()) {
            if (valor % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Total números pares en repuestos: " + contadorPares);
    }
}