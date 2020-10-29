package com.DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        int i,j,quorint;
        String qu,temp,final_array;
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Number of fans: ");
        int number_of_fans = scn.nextInt();
        System.out.println("Number to meet: ");
        int number_of_fans_to_meet = scn.nextInt();

        String[] names = new String[number_of_fans];
        for ( i = 0; i < names.length; i++) {
            names[i] = scn.next();
        }
        String[] quarr = new String[names.length];
        Integer[] bef = new Integer[quarr.length];
        String[] finalarr = new String[names.length];
      for ( i = 0; i < names.length; i++)
        {
            for ( j = i + 1; j < names.length; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for ( i = 0; i < names.length; i++) {
            quorint = rand.nextInt(99);
            bef[i] = quorint;
        }
        Arrays.sort(bef, Collections.reverseOrder());

        for ( i = 0; i < names.length; i++) {
            qu = Integer.toString(bef[i]);
            quarr[i] = qu;
            final_array = names[i] +" "+ quarr[i];
            finalarr[i] = final_array;
            System.out.println(finalarr[i]);
        }
        System.out.println("\n");
       for(i=0;i<number_of_fans_to_meet;i++){
                System.out.println(finalarr[i]);
        }
    }
}
