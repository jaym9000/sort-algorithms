// package ca.unbsj.cs2383;
import java.util.Random;
import java.lang.Math;

public class SJSort {
    private static boolean less(Comparable v, Comparable w){ return v.compareTo(w) < 0; }

    private static void exch(Comparable[] a, int i, int j) { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }

    public static void insertionSort(Comparable[] a){
        int N = a.length;
        for(int i=1; i<N; i++){
            for(int j=i; j>0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    public static void swap(Comparable[] array){
        Random rand = new Random();
        int n = array.length;
        // int logz = (int) ((n*Math.log(n) / Math.log(2))/2);
        int i = rand.nextInt(array.length);
        int j = rand.nextInt(array.length);
        int swap=0;
        int times = 0;
        // System.out.println("i: "+i+"\nj: "+j);
        
        //if the values at these position are out of order (left one is bigger than the right one), they are swapped.
        // while(times <= logz){
            if(i>j){
                if(array[i].compareTo(array[j]) < 0){
                    swap = (int) array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }else{
                if(array[j].compareTo(array[i]) < 0){
                    swap = (int) array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        // }
    }
    

    public static void main(String[] args){
        Comparable[] array = {8, 3, 2, 16 ,5 ,34,22 ,12 ,17 ,1 ,9 ,6};
        swap(array);
        insertionSort(array);

        for(Comparable arr : array)
            System.out.println("The array: "+arr);
        
    }
}
