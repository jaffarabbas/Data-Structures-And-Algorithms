package DSA;

/* IMPORTANT: Multiple classes and nested static classes are supported */




/*

* uncomment this if you want to read input.

//imports for BufferedReader

import java.io.BufferedReader;

import java.io.InputStreamReader;




//import for Scanner and other utility classes

import java.util.*;

*/

import java.util.Scanner;




// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail




class sumset {

    public static void main(String args[] ) throws Exception {

/* Sample code to perform I/O:

* Use either of these methods for input




//BufferedReader

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine(); // Reading input from STDIN

System.out.println("Hi, " + name + "."); // Writing output to STDOUT




//Scanner

Scanner s = new Scanner(System.in);

String name = s.nextLine(); // Reading input from STDIN

System.out.println("Hi, " + name + "."); // Writing output to STDOUT




*/




// Write your code here

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++){

            a[i]=sc.nextInt();

        }

        int m=sc.nextInt();

        int c[]=new int[m];

        for(int i=0;i<m;i++){

            c[i]=sc.nextInt();

        }




        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                int diff=c[j]-a[i];

                int count=1;

                for(int k=i+1;k<n;k++){

                    for(int l=0;l<m;l++){

                        if(c[l]-a[k]==diff){

                            count++;

                            break;

                        }

                    }

                }

                if(count==n){

                    System.out.print(diff+" ");

                }

            }

        }



    }

}

