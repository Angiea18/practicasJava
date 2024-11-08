import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = calculadora.next();
        System.out.println("Hola, " + nombre );

        System.out.println("Elige una operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = calculadora.nextInt();

        System.out.println("Ingrese el primer número: ");
        int num1 = calculadora.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = calculadora.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de sumar es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de restar es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de multiplicar es: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("El resultado de dividir es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        calculadora.close();
    }
}
