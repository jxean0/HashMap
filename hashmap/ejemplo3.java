import java.util.HashMap;

public class ejemplo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> carros = new HashMap<>();
        carros.put("Toyota", 2018);
        carros.put("Mazda", 2019);
        carros.put("Chevrolet", 2020);
        carros.put("Ford", 2021);
        carros.put("Honda", 2022);

        int contadorPares = 0;
        for (int valor : carros.values()) {
            if (valor % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Total números pares en carros: " + contadorPares);
    }
}