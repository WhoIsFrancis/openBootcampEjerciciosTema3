public class Main {
    public static void main(String[] args) {
        // Primera parte del ejercicio
        System.out.println("La suma es suma " + Suma(10, 4, 6));

        // Segunda parte del ejercicio
        Auto auto = new Auto(3);
        System.out.println("El numero de puertas del auto es: " + auto.incrementarPuertas());


    }

    private static int Suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}