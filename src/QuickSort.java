public class QuickSort {
    public void ordenarQuicksort(double[] array) {
        array = quicksort1(array);
    }

    public double[] quicksort1(double[] numeros) {
        return quicksort2(numeros,0, numeros.length-1);
    }

    public double[] quicksort2(double[] numeros, double izq, double der) {
        if(izq >= der){
            return numeros;
        }
        double i = izq, d = der;
        if(izq != der){
            double pivote;
            double aux;
            pivote = izq;
            while(izq != der){
                while(numeros[(int) der] >= numeros[(int) pivote] && izq < der){
                   der--;
                }
                while (numeros[(int) izq]<numeros[(int) pivote] && izq <der){
                    izq++;
                }
                if(der != izq) {
                    aux = numeros[(int) der];
                    numeros[(int) der] = numeros[(int) izq];
                    numeros[(int) izq] = aux;
                }
                if (izq == der) {
                    quicksort2(numeros, i, izq-1);
                    quicksort2(numeros,izq+1,d);
                }
            }
        }
        else
            return numeros;
        return numeros;
    }
}
