import java.io.*;
import java.util.*;

class quiz {

    // Rows and columns in the given grid
    static int R, C;

    // For searching in all 8 direction
    static int[] a = { -1, -1, -1,-1, 0, 0, 1, 1, 1,1 };
    static int[] b = { 0,-1, 0, 1, -1, 1, -1, 0, 1 ,0};


    static boolean search2D(char[][] grid, int row,
                            int col, String word)
    {


        // If first character of word  doesn't match with  given starting point in grid.
        if (grid[row][col] != word.charAt(0))
            return false;

        int len = word.length();


        // Search word in all 8 directions
        // starting from (row, col)
        for (int dir = 0; dir < 8; dir++) {


            int key, rd = row + a[dir], cd = col + b[dir];


            for (key = 1; key < len; key++) {
                // If out of bound break
                if (rd >= R || rd < 0 || cd >= C || cd < 0)
                    break;

                // If not matched, break
                if (grid[rd][cd] != word.charAt(key))
                    break;


                rd += a[dir];
                cd += b[dir];
            }

            if (key == len)
                return true;
        }
        return false;
    }


    static void patternSearch(
            char[][] grid,
            String word)
    {
        // Consider every point as starting
        // point and search given word
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (search2D(grid, row, col, word))
                    System.out.println( "pattern found at " + row + ", " + col);
            }
        }
    }


    public static void main(String args[])
    {
        R = 10;
        C = 10;
        char[][] grid = { {'E', 'T','Q' ,'I','C' ,'A','T','R','O', 'D'},
                {'E' ,'I' ,'A' ,'R' ,'B' ,'C' ,'L' ,'A', 'S' ,'S'},
                {'F', 'T','O', 'Z', 'W' ,'V', 'A', 'N', 'Q' ,'S'},
                {'A' ,'E' ,'Q', 'N', 'S', 'P', 'D', 'F', 'S', 'A'},
                {'E' ,'A' ,'D', 'G', 'R' ,'E' ,'Y' ,'I' ,'S','I'},
                {'A' ,'S' ,'A' ,'S' ,'D' ,'O' ,'S' ,'D' ,'A' ,'M'},
                {'R' ,'A' ,'G' ,'J' ,'P' ,'H' ,'Q', 'W', 'E', 'E'},
                {'G' ,'H' ,'J', 'T', 'Q', 'E', 'E' ,'E' ,'Q' ,'W'},
                {'H' ,'Z', 'X' ,'D' ,'R' ,'E' ,'E' ,'F' ,'Y', 'W'}};
        patternSearch(grid, "PROPER");
        System.out.println();
        patternSearch(grid, "EEE");
    }
} 