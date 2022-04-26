public class Burbuja {
    public static double[] burbuja(double[] arreglo){
        double auxiliar;
        double[] arregloOrdenado;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < (arreglo.length -i-1) ; j++) {
                if(arreglo[j] > arreglo[j+1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
}
