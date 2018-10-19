//WRITTEN BY BRAEDEN TRAUTZ
package tictactoe;

import java.util.Scanner;

public class TicTacToeMain {

public static void main(String[] args) {
    Board board = new Board();
    Player p1 = new Player(1, board);
    Player p2 = new Player(2, board);
    System.out.println(p1.getName() + ", you are 'X'");
    System.out.println(p2.getName() + ", you are 'O'");
    System.out.println("Here's your board...");
    board.display();
    p1.doMove();
    p2.doMove();
    Scanner scan = new Scanner(System.in);
    boolean p1win = false;
    boolean p2win = false;


//  This next section runs the entire game through, questioning players to play
//      again or stop when they win or draw.

    while (p1win == false && p2win == false) {
        if (board.checkWin(p1) == false && board.checkWin(p2) == false) {
            p1.doMove();
        } else if (board.checkWin(p1) == true) {
            p1win = true;
            System.out.println(p1.getName() + " wins!\nWould you like to play again? Type yes or no for your choice");
            String choice = scan.nextLine();
            if (choice.equals("yes")) {
                board.resetBoard();
                p1win = false;
            } else {
                System.out.println("Thanks for playing!");
            }
        }
        if (board.checkWin(p1) == false && board.checkWin(p2) == false) {
            p2.doMove();
        } else if (board.checkWin(p2) == true) {
            p2win = true;
            System.out.println(p2.getName() + " wins!\nWould you like to play again? Type yes or no for your choice");
            String choice = scan.nextLine();
            if (choice.equals("yes")) {
                board.resetBoard();
                p2win = false;
            } else {
                System.out.println("Thanks for playing!");
            }
        }
        if (board.checkTie()) {
            System.out.println("Draw!\nWould you like to play again?");
            String choice = scan.nextLine();
            if (choice.equals("yes")) {
                board.resetBoard();
            } else {
                System.out.println("Thanks for playing!");
            }
        }

    }

}

}//end of file