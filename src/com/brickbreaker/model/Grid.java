package com.brickbreaker.model;

public class Grid {

    public char[][] board = new char[7][7];
    public int ballRow = 6;
    public int ballCol = 3;
    public int ballCount = 5;

    public void initialize() {

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){

                if(i==0 || i==6 || j==0 || j==6)
                    board[i][j]='w';
                else
                    board[i][j]=' ';
            }
        }

        // bricks
        board[2][2]='1';
        board[2][3]='1';
        board[2][4]='1';
        board[3][2]='1';
        board[3][3]='1';
        board[3][4]='1';

        // ground and ball
        board[6][1]='g';
        board[6][2]='g';
        board[6][3]='o';
        board[6][4]='g';
        board[6][5]='g';
    }
}
