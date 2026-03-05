package com.brickbreaker.util;
import com.brickbreaker.model.Grid;
public class DisplayUtil {

    public static void printGrid(Grid grid){

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(grid.board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ball Count: " + grid.ballCount);
    }
}
