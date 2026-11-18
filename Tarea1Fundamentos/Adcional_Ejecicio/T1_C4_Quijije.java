package Adcional_Ejecicio;

public class T1_C4_Quijije {

    // 1. Cuenta la cantidad de dígitos que tiene un número
    public static int contarDigitos(int n) {
        if (n == 0) {
            return 1;
        }
        int contador = 0;
        int temporal = Math.abs(n);
        while (temporal > 0) {
            temporal /= 10;
            contador++;
        }
        return contador;
    }

    // 2. Calcula la potencia mediante un ciclo (sin usar Math.pow)
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // 3. Determina si el número es de Armstrong
    public static boolean esArmstrong(int n) {
        int totalDigitos = contarDigitos(n);
        int temporal = n;
        int sumaAcumulada = 0;

        while (temporal > 0) {
            int digitoActual = temporal % 10;
            sumaAcumulada += potencia(digitoActual, totalDigitos);
            temporal /= 10;
        }

        return sumaAcumulada == n;
    }

    public static void main(String[] args) {
        // Caso de prueba 1: 153 es un número de Armstrong clásico (1^3 + 5^3 + 3^3 = 153)
        int numeroPrueba1 = 153;
        boolean resultado1 = esArmstrong(numeroPrueba1);
        System.out.println("--- CASO DE PRUEBA 1 ---");
        System.out.println("¿El numero " + numeroPrueba1 + " es de Armstrong?: " + resultado1);

        // Caso de prueba 2: 123 no es un número de Armstrong
        int numeroPrueba2 = 123;
        boolean resultado2 = esArmstrong(numeroPrueba2);
        System.out.println("\n--- CASO DE PRUEBA 2 ---");
        System.out.println("¿El numero " + numeroPrueba2 + " es de Armstrong?: " + resultado2);
    }
}