package week2.day2;
import java.util.*;
public class ArrayWrapper {
	static int size = 0;
    static int[] arr = new int[10];


    public void add(int num) {
        if(size >= arr.length) {
            copyArray();
        }
        arr[size++] = num;
    }

    private void copyArray() {
        int[] tmp = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
    }
    public void remove(int index) {
    	int[] tmp = new int[arr.length - 1];
    	int i = 0;
    	for(int j = i;j<tmp.length - 1;j++)
    	{
    	tmp[j]= tmp[j+1];
    	}
    	
    	
    }
    	     
   

   
    public boolean removeValue(int value) {
        return false;
    }

    public  int[] sort(){
    	int j = 0;
        int tmp;
        boolean sorted = false;
        while (!sorted) {
           sorted = true;
           j++;
           for (int i = 0; i < arr.length - j; i++) {
              if (arr[i] > 0) {
                 tmp = arr[i];
                 arr[i] = arr[i + 1];
                 arr[i + 1] = tmp;
                 sorted = false;
              }
           }
        }
        return arr;
    }
    public String toString(){
    	int[] tmp = arr;
    	return Arrays.toString(arr);
    	
    }

    public int search(int value){
    	int k = 0;
    	    for(int i=0; i<arr.length; i++) 
    	         if(arr[i] == value)
    	        	 k=i;
    	             return k;
    	
    }

    public int[] copy(){
        return Arrays.copyOf(arr, arr.length);
    }

    public int[] revers(){
    	for (int k = 0; k < arr.length/2; k++) {
    	    int temp = arr[k];
    	    arr[k] = arr[arr.length-(1+k)];
    	    arr[arr.length-(1+k)] = temp;
    	  
    	}
    	    return arr;
    	}
    

    public int max(){
        return arr[arr.length-1];
    }

    public int min(){
        return arr[0];
    }

}
