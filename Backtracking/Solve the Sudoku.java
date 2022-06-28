// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int board[][])
    {
        // add your code here
        boolean hasLeft = false;
        int row = -1, col = -1;
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j]==0) {
                    row = i;
                    col = j;
                    hasLeft = true;
                    break;
                }
            }
            if(hasLeft==true) break;
        }
        if(hasLeft==false) return true;
        for(int i=1;i<=9;i++) {
            if(isSafe(board,i,row,col)) {
                board[row][col] = i;
                if(SolveSudoku(board)){
                    //board[row][col] = 0;
                    return true;
                }
                else {
                    board[row][col] = 0;
                    //return false;
                }
            }
        }
        return false;
    }
    
    static boolean isSafe(int[][] board, int n, int row, int col) {
        for(int i=0;i<9;i++) {
            if(board[i][col]==n) return false;
        }
        for(int i=0;i<9;i++) {
            if(board[row][i]==n) return false;
        }
        int rowStart = row-row%3;
        int colStart = col-col%3;
        for(int i=rowStart;i<rowStart+3;i++) {
            for(int j=colStart;j<colStart+3;j++) {
                if(board[i][j]==n) return false;
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                System.out.print(grid[i][j]+" ");
            }
            //System.out.println();
        }
    }
}