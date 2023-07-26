package com.DSA;

public class sumdigonals {
    public static void main(String[] args) {
        int i,j,sum=0,sum2=0;
        int[][] arr = {{1,2,3},{4,5,6},{9,8,9}};
        for (i = 0; i < arr[0].length; i++) {
            for (j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }

        for (i = 0; i < arr[0].length; i++) {
            for (j = 0; j < arr[1].length; j++) {
               if(i==j){
                   sum+=arr[i][j];
               }
               if((i+j) == (arr[0].length - 1)){
                   sum2+=arr[j][i];
               }
            }
            System.out.println("");
        }
        int diff = sum - sum2;
        System.out.println(diff);
    }
}
