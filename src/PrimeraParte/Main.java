package PrimeraParte;

/** Primera parte:
- Crear una función con tres parámetros que sean números que se suman entre sí.
- Llamar a la función en el main y darle valores. */

public class Main {
    public static void main(String[] args) {
        var result = addNumbers( 2, 3, 4 );
        System.out.println( result );
    }

    public static int addNumbers(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
