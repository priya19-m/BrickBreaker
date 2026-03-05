package com.brickbreaker.service;


import com.brickbreaker.model.Grid;

public class GameService {
	    public void moveStraight(Grid grid) {

	        int r = grid.ballRow - 1;
	        int c = grid.ballCol;
            while (r > 0) {

	            if (Character.isDigit(grid.board[r][c])) {

	                int strength = grid.board[r][c] - '0';
	                strength--;

	                if (strength == 0)
	                    grid.board[r][c] = ' ';
	                else
	                    grid.board[r][c] = (char) (strength + '0');

	                grid.ballCount--;
	                return;
	            }

	            r--;
	        }

	        grid.ballCount--;
	    }

	    public void moveLeft(Grid grid) {

	        int r = grid.ballRow - 1;
	        int c = grid.ballCol - 1;

	        while (r > 0) {

	            if (c == 0) {
	                c = 1; 
	            }

	            if (Character.isDigit(grid.board[r][c])) {

	                int strength = grid.board[r][c] - '0';
	                strength--;

	                if (strength == 0)
	                    grid.board[r][c] = ' ';
	                else
	                    grid.board[r][c] = (char) (strength + '0');

	                grid.ballCount--;
	                return;
	            }

	            r--;
	            c--;
	        }

	        grid.ballCount--;
	    }
	    
	    public void moveRight(Grid grid) {

	        int r = grid.ballRow - 1;
	        int c = grid.ballCol + 1;

	        while (r > 0) {

	            if (c == 6) {
	                c = 5; 
	            }

	            if (Character.isDigit(grid.board[r][c])) {

	                int strength = grid.board[r][c] - '0';
	                strength--;

	                if (strength == 0)
	                    grid.board[r][c] = ' ';
	                else
	                    grid.board[r][c] = (char) (strength + '0');

	                grid.ballCount--;
	                return;
	            }

	            r--;
	            c++;
	        }

	        grid.ballCount--;
	    }
	}