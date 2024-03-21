//import java.util.ArrayList;

public class EjerciciosBasicos{
    // Imprimir numeros del 1 al 255
    public static void imprimirNumeros(int numero){
        for(int i=0; i < numero + 1; i++){
            System.out.println(i);
        }
    }

    public static void imprimirImpares(int numero){
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static int sumaNumeros(int numero){
        int suma = 0;
        for (int i = 0; i < numero; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static void iterarArreglo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int numeroMaximo(int arr[]) {
        int numMayor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numMayor) {
                numMayor = arr[1];
            }
        }
        return numMayor;
    }
    
    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        return (double) suma / arreglo.length;
    }

    public static int[] arregloNumerosImpares() {
        int[] y = new int[128];
        for (int i = 0; i < y.length; i++) {
            y[i] = 2 * i + 1;
        }
        return y;
    }
    
    public static int contarMayoresQueY(int[] arreglo, int Y) {
        int contador = 0;
        for (int valor : arreglo) {
            if (valor > Y) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void elevarAlCuadrado(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] *= arreglo[i];
        }
    }

    public static void eliminarNegativos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0) {
                arreglo[i] = 0;
            }
        }
    }

    public static double[] obtenerMinMaxPromedio(int[] arreglo) {
        double[] resultado = new double[3];

        int maximo = arreglo[0];
        int minimo = arreglo[0];
        double suma = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            maximo = Math.max(maximo, arreglo[i]);
            minimo = Math.min(minimo, arreglo[i]);
            suma += arreglo[i];
        }

        double promedio = suma / arreglo.length;

        resultado[0] = maximo;
        resultado[1] = minimo;
        resultado[2] = promedio;

        return resultado;
    }

    public static void cambiarValoresSiguientes(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[arreglo.length - 1] = 0;
    }

    public static void main(String[] args){
        //imprimirNumeros(255);
        //imprimirImpares(255);
        //System.out.println(sumaNumeros(255));
        //int numeros[] = { 1, 3, 5, 7, 9, 13 };
        //iterarArreglo(numeros);
        //int numMayor[] = { -1, 9, 2, 8, -15, 7 };
        //System.out.println(numeroMaximo(numMayor));
        //int[] arreglo = { 2, 10, 3 };
        //System.out.println("Promedio de " + calcularPromedio(arreglo));
        /*int[] impares = arregloNumerosImpares();
        System.out.print("Arreglo de números impares: [");
        for (int i = 0; i < impares.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(impares[i]);
        }
        System.out.println("]");*/
        /*int[] arreglo = {1, 3, 5, 7};
        int Y = 3;
        System.out.println("Número de valores mayores que " + Y + ": " + contarMayoresQueY(arreglo, Y));*/
        /*int[] x = {1, 5, 10, -2};
        elevarAlCuadrado(x);
        System.out.print("Arreglo elevado al cuadrado: [");
        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(x[i]);
        }
        System.out.println("]");*/
        /*int[] x = {1, 5, 10, -2};
        eliminarNegativos(x);
        System.out.print("Arreglo sin números negativos: [");
        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(x[i]);
        }
        System.out.println("]");*/
        /*int[] x = {1, 5, 10, -2};
        double[] resultado = obtenerMinMaxPromedio(x);
        System.out.println("Máximo: " + resultado[0]);
        System.out.println("Mínimo: " + resultado[1]);
        System.out.println("Promedio: " + resultado[2]);*/
        /*int[] x = {1, 5, 10, 7, -2};
        cambiarValoresSiguientes(x);
        System.out.print("Arreglo después de cambiar los valores: [");
        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(x[i]);
        }
        System.out.println("]");*/
    }
}