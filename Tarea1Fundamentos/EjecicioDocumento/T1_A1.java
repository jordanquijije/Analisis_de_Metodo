package EjecicioDocumento;

public class T1_A1 {

    public static int producto(int a, int b) {
        System.out.println("producto(" + a + ", " + b + ")");
        return a * b;
    }

    public static int sumaProductos(int x) {
        int r = producto(x, 2) + producto(x, 3);
        System.out.println("r = " + r);
        return producto(1, 2) + producto(1, 3) + producto(r, 5) / r;
    }

    public static void main(String[] args) {
        int resultadoFinal = sumaProductos(4);
        System.out.println(resultadoFinal);
    }
}