import java.util.ArrayList;
import java.util.Collections;

public class GRUPO {

    public static void main(String[] args) {

        // Creamos un ArrayList con los números del 14 al 16
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(14);
        numeros.add(15);
        numeros.add(16);

        // Mezclamos los números aleatoriamente
        Collections.shuffle(numeros);

        // Asignamos un número a cada grupo
        int grupo1 = numeros.get(0);
        int grupo2 = numeros.get(1);
        int grupo3 = numeros.get(2);

        // Imprimimos los resultados
        System.out.println("Grupo 1: " + grupo1);
        System.out.println("Grupo 2: " + grupo2);
        System.out.println("Grupo 3: " + grupo3);
    }
}

