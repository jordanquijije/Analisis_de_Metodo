package Tercero____Ejercicio;

public class T1_C3_Quijije {

    // 1. Método sobrecargado para el Cubo
    public static double volumen(double lado) {
        return lado * lado * lado;
    }

    // 2. Método sobrecargado para el Cilindro
    public static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // 3. Método sobrecargado para el Prisma Rectangular
    public static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static void main(String[] args) {
        System.out.println("====== SISTEMA DE GEOMETRIA (MENU) ======");
        System.out.println("1. Volumen de un Cubo");
        System.out.println("2. Volumen de un Cilindro");
        System.out.println("3. Volumen de un Prisma Rectangular");
        System.out.println("=========================================\n");

        // Caso de prueba 1: Seleccionando la opcion 1 (Cubo con lado 4.0)
        int opcionSeleccionada1 = 1;
        System.out.println("-> Simulando eleccion en menu: Opción " + opcionSeleccionada1);
        
        if (opcionSeleccionada1 == 1) {
            double medidaLado = 4.0;
            double resultadoCubo = volumen(medidaLado); // Llama al primer método
            System.out.println("Calculando volumen de Cubo (lado = " + medidaLado + "): " + resultadoCubo);
        }

        System.out.println("");

        // Caso de prueba 2: Seleccionando la opcion 3 (Prisma rectangular de 5x3x2)
        int opcionSeleccionada2 = 3;
        System.out.println("-> Simulando eleccion en menu: Opción " + opcionSeleccionada2);
        
        if (opcionSeleccionada2 == 3) {
            double l = 5.0, a = 3.0, h = 2.0;
            double resultadoPrisma = volumen(l, a, h); // Llama al tercer método (sobrecargado)
            System.out.println("Calculando volumen de Prisma (largo=" + l + ", ancho=" + a + ", alto=" + h + "): " + resultadoPrisma);
        }
    }
}