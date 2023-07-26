package com.DSA;

public class Main {
    static Long fact(Long x){
        if(x==0){
            System.out.println(x);
            return 1L;
        }else{
            System.out.println(x);
            return x*fact(x-1);
        }
    }
    public static void main(String[] args) {
	    Long x = Main.fact(100L);
        System.out.println(x);
    }
}
