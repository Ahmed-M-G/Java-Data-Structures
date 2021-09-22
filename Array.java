package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    
    public static int Search(int arr[],int E){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == E)
                return i;
        }
        return -1;
    }
    //=====================================================
    
    public static int[] sort(int arr[]){
        Arrays.sort(arr);
        return arr;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5], el;
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Number To Search : ");
        el = sc.nextInt();
        for(int i = 0; i < a.length; i++){
            System.out.println("Index " + i + " : " + a[i]);
        }
        System.out.println("Is Number exist ? : " + Search(a, el));
        System.out.println("Sort Array ? : " + Arrays.toString(sort(a)));
        
        
    }    
}

