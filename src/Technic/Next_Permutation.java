package Technic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Next_Permutation {
    static int N;
    static int[] input;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        input = new int[N];

        for(int i=0;i<N;i++){
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);
        do{
            System.out.println(Arrays.toString(input));
        }while(np());
    }

    public static boolean np(){
        int i= N-1;
        while(i>0 && input[i-1] >= input[i])--i;

        if(i ==0)return false;

        int j=N-1;
        while(input[i-1]>=input[j])--j;

        swap(i-1,j);

        int k=N-1;
        while(i<k){
            swap(i++,k--);
        }
        return true;
    }

    public static void swap(int i,int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}