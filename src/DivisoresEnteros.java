
import java.util.Scanner;

public class DivisoresEnteros {

    public static void main(String[] args) {

        int valor;

        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca un valor entero positivo: ");
        valor = lectura.nextInt();

        if (valor < 1) {
            System.out.println("Numero no valido");
        } else {
            visualizarDivisores(valor);
        }
    }

    public static void visualizarDivisores(int valor) {

        System.out.println("Los divisores son: ");
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                System.out.println(i);
            }

        }
    }
}


