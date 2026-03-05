package com.brickbreaker.main;
import java.util.Scanner;
import com.brickbreaker.model.Grid;
import com.brickbreaker.service.*;
import com.brickbreaker.util.*;
public class MainClass {
	    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Grid grid = new Grid();
	        GameService gameService = new GameService();

	        grid.initialize();

	        DisplayUtil.printGrid(grid);

	        while(grid.ballCount > 0){

	            System.out.print("Enter Command (St / Lt / Rt): ");
	            String command = sc.next();

	            if(command.equalsIgnoreCase("St"))
	                gameService.moveStraight(grid);

	            else if(command.equalsIgnoreCase("Lt"))
	                gameService.moveLeft(grid);

	            else if(command.equalsIgnoreCase("Rt"))
	                gameService.moveRight(grid);

	            else{
	                System.out.println("Invalid Command");
	                continue;
	            }

	            DisplayUtil.printGrid(grid);
	        }

	        System.out.println("Game Over");
	    }
	}
