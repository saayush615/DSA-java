package DSA.Recursion.Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        //Q1: count number of ways to reach (1,1) from (3,3)
//        System.out.println(count(3,3));
        //Q2: by only using R=right & D=down how many ways to reach (1,1)
//        path("",3,3);
        //Q3
//        System.out.println(pathRet("",3,3));
        //Q4:Diagonal
//        System.out.println(pathDiagonal("",3,3));
        //Q5.
//         boolean[][] board = {
//                 {true,true,true},
//                 {true,false,true},
//                 {true,true,true}
//         };
//         pathRestriction("",board,0,0);
         //Q6:
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPath("",board,0,0);

        //Q7:(very cool thing)
//        int[][] path = new int[board.length][board[0].length];
//        allPathPrint("",board,0,0,path,1);
    }
    // Q1. How may path to reach to (1,1)
    static int count(int r,int c){
        // if it reaches to 1 row or 1 col then it has sured step to reach (3,3)
        if (r == 1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;
    }
    //Q2.
    static void path(String p,int r,int c){
        if (r == 1 && c ==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p +'D',r-1,c);
        }
        if (c>1){
            path(p +'R',r,c-1);
        }
    }
    //Q3.
    static ArrayList<String> pathRet(String p, int r, int c){
        if (r == 1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(pathRet(p +'D',r-1,c));
        }
        if (c>1){
            list.addAll(pathRet(p +'R',r,c-1));
        }

        return list;
    }
    //Q4: you can go right,down(as Horizontal and vertical) and diagonal
    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if (r == 1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r>1 && c>1){
            // going diagonally both the row and coloumn is reduced by 1
            list.addAll(pathDiagonal(p +'D',r-1,c-1)); // D= diagonal
        }
        if (r>1){
            list.addAll(pathDiagonal(p +'V',r-1,c)); // V is vertical
        }
        if (c>1){
            list.addAll(pathDiagonal(p +'H',r,c-1)); // H is horizontal
        }

        return list;
    }

    // Q5: *see the indexing of this question in notebook its little diffrent (0,0) -> (2,2)
    static void pathRestriction(String p,boolean[][] maze,int r,int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r < maze.length -1){
            pathRestriction(p +'D',maze,r+1,c);
        }
        if (c < maze[0].length -1){
            pathRestriction(p +'R',maze,r,c+1);
        }
    }

    //Q6; all directions are allowed
    static void allPath(String p,boolean[][] maze,int r,int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        // i am considring this block in my path
        maze[r][c] = false;

        if (r < maze.length -1){
            allPath(p +'D',maze,r+1,c);
        }
        if (c < maze[0].length -1){
            allPath(p +'R',maze,r,c+1);
        }
        if (r > 0){
            allPath(p +'U',maze,r-1,c);
        }
        if (c > 0){
            allPath(p +'L',maze,r,c-1);
        }

        // this line is where the function will be over
        // so before the gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    //Q7:
    static void allPathPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if (r == maze.length -1 && c == maze[0].length -1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }

        // i am considring this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length -1){
            allPathPrint(p +'D',maze,r+1,c,path , step+1);
        }
        if (c < maze[0].length -1){
            allPathPrint(p +'R',maze,r,c+1,path , step+1);
        }
        if (r > 0){
            allPathPrint(p +'U',maze,r-1,c,path , step+1);
        }
        if (c > 0){
            allPathPrint(p +'L',maze,r,c-1,path , step+1);
        }

        // this line is where the function will be over
        // so before the gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = step;
    }
}
