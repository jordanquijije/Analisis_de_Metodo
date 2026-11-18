package PrimerEjercicio;
public class T1_C1_Quijije {

    // Firma 1: Valida que los metros cúbicos ingresados sean correctos (no negativos)
    public static double leerConsumo(double consumoMetros) {
        if (consumoMetros < 0) {
            System.out.println("Error: El consumo no puede ser negativo. Se ajusta a 0.");
            return 0.0;
        }
        return consumoMetros;
    }

    // Firma 2: Calcula el valor total usando los puntos iniciales de el enunciado
    public static double calcularValor(double consumoMetros) {
        double cargoFijo = 2.50;
        double valorConsumo = 0.0;

        if (consumoMetros <= 15) {
            valorConsumo = consumoMetros * 0.40; // Hasta 15 m3 a $0.40
        } else {
            // Primeros 15 m3 a $0.40 + el exceso a $0.75
            valorConsumo = (15 * 0.40) + ((consumoMetros - 15) * 0.75);
        }

        return valorConsumo + cargoFijo;
    }

    // Firma 3: Muestra en pantalla el detalle de la planilla (void porque solo imprime)
    public static void mostrarPlanilla(double consumoMetros, double totalPagar) {
        System.out.println("====== FACTURA DE AGUA POTABLE ======");
        System.out.println("Consumo total medido: " + consumoMetros + " metros cubicos");
        System.out.println("Cargo fijo: $2.50");
        System.out.println("Total a cancelar: $" + totalPagar);
        System.out.println("=====================================\n");
    }

    public static void main(String[] args) {
        // Caso de prueba 1: Consumo normal dentro del rango base (12 metros cúbicos)
        double lectura1 = 12.0;
        double consumoValido1 = leerConsumo(lectura1);
        double total1 = calcularValor(consumoValido1);
        mostrarPlanilla(consumoValido1, total1);

        // Caso de prueba 2: Consumo alto que genera exceso en el segundo tramo (25 metros cúbicos)
        double lectura2 = 25.0;
        double consumoValido2 = leerConsumo(lectura2);
        double total2 = calcularValor(consumoValido2);
        mostrarPlanilla(consumoValido2, total2);
    }
}
