//  package ca.unbsj.cs2383;

public class Merge {

    public static void sort(Comparable[] a){
        sort(a, 0, a.length-1);
    }

    private static boolean less(Comparable v, Comparable w){ return v.compareTo(w) < 0; }

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        //Merge a[lo..mid] with a[mid+1..hi].
        int i=lo, j=mid+1;
        Comparable[] b = new Comparable[hi-lo+1];

        for(int k = lo; k<=hi; k++) // Copy a[lo..hi] to aux[lo..hi].
            b[k-lo] = a[k];

        for(int k = lo; k<= hi; k++) // Merge back to a[lo..hi].
            if(i>mid){
                a[k] = b[j-lo];
                j++;
            }else if (j>hi ){                 
                a[k] = b[i-lo];
                i++;
            }else if (less(b[j-lo], b[i-lo])){
                a[k] = b[j-lo];
                j++;
            }else{                            
                a[k] = b[i-lo];
                i++;
            }
    }

    private static void sort(Comparable[] a, int lo, int hi){
        //sort a [lo...hi].
        if(hi <= lo) return;
        int mid=lo+(hi-lo)/2;
        sort(a, lo, mid); //sort left half.
        sort(a, mid+1, hi); //sort right half
        merge(a, lo, mid, hi); 
    }

    public static void main(String[] args){
        System.out.println("Hey!");

        Comparable[] a = {3,10, 4, 25, 13, 17, 2, 35, 23, 58, 11};
        sort(a);
        for(Comparable aa : a)
            System.out.println(aa);
    }
    
}

