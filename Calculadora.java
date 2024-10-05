import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- Calculadora ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Selecciona una operación: ");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }

            if (opcion == 6) {
                System.out.print("Ingresa un número: ");
                double numero = scanner.nextDouble();
                Numero num = new Numero(numero);  // Crear el objeto Numero
                System.out.println("Resultado: " + Operacion.raizCuadrada(num.getValor()));  // Pasar el valor del objeto Numero
            } else {
                System.out.print("Ingresa el primer número: ");
                double numero1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double numero2 = scanner.nextDouble();

                Numero num1 = new Numero(numero1);
                Numero num2 = new Numero(numero2);

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + Operacion.sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + Operacion.restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + Operacion.multiplicar(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.println("Resultado: " + Operacion.dividir(num1, num2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Resultado: " + Operacion.potencia(num1, num2));
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }
        scanner.close();
    }
}

