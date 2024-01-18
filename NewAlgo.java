package practica;

public class NewAlgo {
    public static int[] sortAsc(int[] arr){
        int[] aux=arr.clone();
        int[] aux2=new int[aux.length-1];
        
        int cont=0;
        int test=0;

        for(int i=0;i<arr.length;i++){
            for(int u=0;u<aux.length;u++){
                if(arr[i]<aux[u]){
                    cont++;
                }else if(arr[i]==aux[u] && u != i){
                    cont++;
                }
            }
            test=((arr.length-1) - (cont));
            aux2[test]= arr[i];
            
            cont=0;
        }

        return aux2;
    }
}
