package apna_college.backtracking;

import java.util.ArrayList;

public class RatInAMazeI {
    public static void main(String[] args) {
        int n = 2;
        int[][] m = {{1, 0},
                    {1, 0}};
        ArrayList<String> ans = findPath(m,n);
        System.out.println(ans);
    }

    private static ArrayList<String> findPath(int[][] m, int n) {
        boolean[][] rat = new boolean[n][n];
        ArrayList<String> ans = maze("",m, rat,0,0);
        return ans;
    }

    private static ArrayList<String> maze(String p, int[][] m, boolean[][] board, int row, int col) {
        ArrayList<String> list = new ArrayList<>();
        if(row==board.length-1 && col==board.length) {
            list.add(p);
            return list;
        }
        if(row==board.length || col== board.length || row<0 || col<0) return list;
        if(row>=0 && col>=0 && row<board.length && col<board.length && m[row][col]==0) return list;
        if(row>=0 && col>=0 && row<board.length && col<board.length && board[row][col]==true) return list;
        board[row][col] = true;
        if(row<board.length) {
            list.addAll(maze(p+'D',m,board,row+1,col));
        }
        if(col<board.length) {
            list.addAll(maze(p+'R',m,board,row,col+1));
        }
        if(row>0) {
            list.addAll(maze(p+'U',m,board,row-1,col));
        }
        if(col>0) {
            list.addAll(maze(p+'L',m,board,row,col-1));
        }
        board[row][col] = false;
        return list;
    }
}
