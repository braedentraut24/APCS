package tictactoe;

import java.util.Scanner;

public class Player {

private String name;
private int playerNum;
private char symbol;
private Board board;

/**
 * CONSTRUCTOR Player - Creates a player with a specified name, number, symbol
 *     for use in game, and is assigned to the board
 * @param x - Integer value to ID player. Must be 1 or 2, code doesn't support
 *     use of other number.
 * @param b - The board that the player is playing on. Should always be same 
 *     for all players
 */

public Player(int x, Board b) {
    playerNum = x;
    board = b;
    System.out.println("Input player " + playerNum + "'s name");
    Scanner scan = new Scanner(System.in);
    name = scan.nextLine();

    if (playerNum == 1) {
        symbol = 'X';
    } else if (playerNum == 2) {
        symbol = 'O';
    }
}

/**
 * METHOD getName - Returns the name of the player as a string.
 * @return - Returns the name string.
 */
public String getName() {
    return name;
}

/**
 * METHOD getSymbol - Returns the symbol the player is using.
 * @return - a char that is the symbol the player uses
 */
public char getSymbol() {
    return symbol;
}

/**
 * METHOD doMove - Checks validity of player's coordinate input and proceeds
 *     to either reject the input and ask for a new one, or will replace the
 *     specified tile
 */

public void doMove() {
    System.out.println(name + ", please enter the coordinates of where you \nwould like to place an " + symbol + "\n" + "(Two seperate entries; X then Y)");
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    while (x < 0 || x > 3) {
        System.out.println("Invalid space, please try again!");
        x = scan.nextInt();
        y = scan.nextInt();
    }
    while (y < 0 || y > 3) {
        System.out.println("Invalid space, please try again!");
        x = scan.nextInt();
        y = scan.nextInt();
    }
    while (board.checkValidity(x, y) == false) {
        System.out.println("Invalid space, please try again!");
        x = scan.nextInt();
        y = scan.nextInt();
    }
    board.replaceTile(x, y, playerNum);
}

}//end of file