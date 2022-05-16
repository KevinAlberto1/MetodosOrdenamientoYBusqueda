
public class MyB {
    private long[] vector=new long[100000];
    private long[] vT=new long[vector.length];
    private int INI,FIN,temp;
    
    public void crearVector(){
        for(int i=0; i<vector.length; i++){
            vector[i]=(long)(Math.random()*100000);
            vT[i]=vector[i];
        }
    }
    
    public String mostrarVector(){
        String cad="";
        for(int i=0; i<vector.length; i++)
            cad += "[" + vector[i] + "], ";
        
        return cad;
    }
    
    public void ReOrden(){
        for(int i=0; i<vector.length; i++)
            vector[i]=vT[i];
        
    }

    public void ordenBurbuja() {
        long t;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 1; j < vector.length; j++) {
                if (vector[j] < vector[j - 1]) {
                    t = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = t;
                }
            }
        }
    }
    
     public void shellSort() {
         shellSort(vector);
     }
    public void shellSort(long[] arreglo) {
        long aux;
        for (int increment = arreglo.length / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < arreglo.length; i++) {
                for (int j = i; j >= increment && arreglo[j - increment] > arreglo[j]; j -= increment) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j - increment];
                    arreglo[j - increment] = aux;
                }
            }
        }

    }
    
    
    public void quick() {
        quick(vector, 0, vector.length - 1);
    }
    public void quick(long[] arreglo, int primero, int ultimo) {

        long pivote = arreglo[primero]; // tomamos primer elemento como pivote
        int i = primero;         // i realiza la búsqueda de izquierda a derecha
        int j = ultimo;         // j realiza la búsqueda de derecha a izquierda
        long aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (arreglo[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (arreglo[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = arreglo[i];                      // los intercambia
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }

        arreglo[primero] = arreglo[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        arreglo[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (primero < j - 1) {
            quick(arreglo, primero, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < ultimo) {
            quick(arreglo, j + 1, ultimo);          // ordenamos subarray derecho
        }
    }
    
    public void Radix() {
        Radix(vector);
    }
    public static void Radix(long[] arr) {
        long [][] bucket = new long [10][arr.length];
        int [] bucketOfElement = new int [10];
        long max = 0;
        // Encuentra el elemento más grande en la matriz
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Calcula el número de bits del elemento más grande
        long maxLength = (max + "").length();
        for (int m = 0, n = 1; m < maxLength; m++, n *= 10) {
            // Coloca los números en arr en los cubos correspondientes según sus unidades, decenas, centenas, etc.
            for (int i = 0; i < arr.length; i++) {
                int digit = (int) arr[i] / n % 10;
                // Asignar el valor de arr [i] a la matriz bidimensional en el depósito
                bucket[digit][bucketOfElement[digit]] = arr[i];
                bucketOfElement[digit]++;
            }
            int index = 0;
            // Leer los elementos en el depósito y reasignarlos a arr
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < bucketOfElement[j]; k++) {
                    arr[index] = bucket[j][k];
                    index++;
                }
                bucketOfElement[j] = 0;// Borrar el número de elementos en cada uno
            }
        }
    }
    
    public long busquedaSec(long dato){
        return busquedaSec(vector, dato);
    }
    private long busquedaSec(long vector[], long dato){
        //propiedades iniciales
        INI=0;
        FIN=vector.length-1;
        for(temp =0; temp<vector.length; temp++){
           if(vector[temp]==dato){
               return temp;
           } 
        }
        return -1;
    }
    
    
    public int busquedaBinaria(long dato){
        return busquedaBinaria(vector, dato);
    }
    private int busquedaBinaria(long vector[], long dato){
        INI = 0;
        FIN = vector.length - 1;
        int pos = -1;
        
        
        while (INI <= FIN) {
            int mitad = (INI + FIN) / 2;
            if (dato == vector[mitad]) {
                 pos=mitad;
                break;
            } else if (dato < vector[mitad]) {
                FIN = mitad - 1;
            } else 
                INI = mitad + 1;
        }
        return pos;
    }
    
    
    
    
    
    
    
}

