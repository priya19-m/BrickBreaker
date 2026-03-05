## Brick Breaker Game

## Project Description
  The Brick Breaker Game is a console-based Java application that simulates a simple brick breaker mechanism. 
  The game uses a 7 × 7 grid where a ball is launched from the bottom and moves in different directions to break bricks.
  Each brick has a strength value, and every time the ball hits a brick, its strength decreases by 1. 
  When the strength becomes 0, the brick disappears.
  The player has a limited number of balls (5 lives). The game ends when all balls are used.

## Game Board Structure
``` plaintext
   The game board consists of the following elements:
   Symbol	       Meaning
     w	          Wall
     g	          Ground
     o	          Ball
   1,2,3...	Brick with strength
```

## The user can control the ball using three commands:
Command	Description
   1. St	Move ball straight upward
   2. Lt	Move ball diagonally left-up
   3. Rt	Move ball diagonally right-up

## Brick Rules
   When the ball hits a brick:  Brick strength decreases by 1
   If strength becomes 0, the brick disappears
  Ball count decreases after each move.

## Project Structure 
``` plaintext
src
│
├── com.brickbreaker.model
│     Grid.java
│
├── com.brickbreaker.service
│     GameService.java
│
├── com.brickbreaker.util
│     DisplayUtil.java
│
└── com.brickbreaker.main
      BrickBreakerGame.java
```

## Technologies Used
   Java
   Object Oriented Programming
   Low Level Design
   Console Based Interface

## Key Concepts Used
   1. Object Oriented Design
   2. Modular Programming
   3. Package Structure
   4. Grid Based Game Logic
   5. Input Handling
   6. Array Manipulation

## OUTPUT:
<img width="969" height="670" alt="Screenshot 2026-03-05 210445" src="https://github.com/user-attachments/assets/6ac096bc-11f9-47cc-98d6-9600f59b1e2f" />
<img width="883" height="666" alt="Screenshot 2026-03-05 210518" src="https://github.com/user-attachments/assets/e7024139-375e-4c16-9836-1bcd58849b5b" />

## Student Details:
NAME : PRIYADHARSHINI M
ROLL NO: 717823P141

