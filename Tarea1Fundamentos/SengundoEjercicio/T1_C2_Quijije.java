package SengundoEjercicio;

public class T1_C2_Quijije {

    // Firma 1: Calcula el promedio de tres notas
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    // Firma 2: Determina el estado del estudiante según su promedio
    public static String determinarEstado(double promedioFinal) {
        if (promedioFinal >= 14.0) {
            return "Aprobado";
        } else if (promedioFinal >= 9.0) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    // Firma 3: Calcula la nota mínima en el supletorio para aprobar con 14 en total
    public static double calcularNotaSupletorio(double promedioActual) {
        // Si el promedio final entre la nota acumulada y el supletorio debe ser 14:
        // (promedioActual + supletorio) / 2 = 14  -->  supletorio = 28 - promedioActual
        return 28.0 - promedioActual;
    }

    public static void main(String[] args) {
        // Caso de prueba 1: Estudiante con notas altas (Aprobado directo)
        double n1 = 15.0, n2 = 14.5, n3 = 16.0;
        double promedio1 = calcularPromedio(n1, n2, n3);
        String estado1 = determinarEstado(promedio1);

        System.out.println("--- CASO DE PRUEBA 1 ---");
        System.out.println("Notas: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Promedio final: " + promedio1);
        System.out.println("Estado: " + estado1);
        System.out.println("------------------------\n");

        // Caso de prueba 2: Estudiante que cae en rango de supletorio
        double n4 = 11.0, n5 = 12.0, n6 = 10.0;
        double promedio2 = calcularPromedio(n4, n5, n6);
        String estado2 = determinarEstado(promedio2);

        System.out.println("--- CASO DE PRUEBA 2 ---");
        System.out.println("Notas: " + n4 + ", " + n5 + ", " + n6);
        System.out.println("Promedio final: " + promedio2);
        System.out.println("Estado: " + estado2);
        
        if (estado2.equals("Supletorio")) {
            double minimaSuple = calcularNotaSupletorio(promedio2);
            System.out.println("Nota minima requerida en el supletorio: " + minimaSuple);
        }
        System.out.println("------------------------");
    }
}