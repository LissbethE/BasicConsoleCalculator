public class Operacion {

    public static double sumar(Numero num1, Numero num2) {
        return num1.getValor() + num2.getValor();
    }

    public static double restar(Numero num1, Numero num2) {
        return num1.getValor() - num2.getValor();
    }

    public static double multiplicar(Numero num1, Numero num2) {
        return num1.getValor() * num2.getValor();
    }

    public static double dividir(Numero num1, Numero num2) {
        if (num2.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num1.getValor() / num2.getValor();
    }

    public static double potencia(Numero base, Numero exponente) {
        return Math.pow(base.getValor(), exponente.getValor());
    }

    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}

