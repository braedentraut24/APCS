package tictactoe;
public class Board {

private char[][] board;

/*
 * CONSTRUCTOR Board - Creates a new 3x3 tic tac toe board filled with under-
 * scores as spaces.
 */

public Board() {
    board = new char[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[j][i] = '_';
        }
    }
}

/*
 * METHOD display - Will print the coordinate guidelines and current board
 */

public void display() {
    String boardDisplay = "\n  0 1 2 \n";
    for (int i = 0; i < 3; i++) {
        boardDisplay += i + " ";
        for (int j = 0; j < 3; j++) {
            boardDisplay += board[j][i] + " ";
        }
        boardDisplay += "\n";
    }
    boardDisplay += "\n";
    System.out.print(boardDisplay);
}

/*
 * METHOD replaceTile - Replaces the specified tile at given coordinates with 
 *     the player's symbol (X or O)
 * @param x - The X value of the coordinate pair
 * @param y - The Y value of the coordinate pair
 * @param player - Player's specified Integer (either 1 or 2)
 */

public void replaceTile(int x, int y, int player) {
    int playerNum = player;
    char symbol;
    if (board[x][y] == 'O' || board[x][y] == 'X') {
        System.out.println("This spot is already occupied!");
    }
    if (playerNum == 1) {
        symbol = 'X';
    } else {
        symbol = 'O';
    }
    while (board[x][y] != 'X' && board[x][y] != 'O') {
        board[x][y] = symbol;
        display();
    }
}

/*
 * METHOD resetBoard - Replaces all tiles on the board to their pre-game state
 */

public void resetBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[j][i] = '_';
        }
    }
}

/*
 * METHOD checkValidity - Checks to see if a tile at the specified coordinates
 *     is valid (occupied or not). Will return true if valid, false if not.
 * @param x - The X value of the coordinate pair
 * @param y - The Y value of the coordinate pair
 * @return - True or false based on if given tile is empty
 */

public boolean checkValidity(int x, int y) {
    if (board[x][y] == '_') {
        return true;
    } else {
        return false;
    }
}

/*
 * METHOD checkWin - Returns true or false if there is a winning placement of
 *     symbols on the tic-tac-toe board
 * @return - True or false based on if the board has a winner
 */

public boolean checkWin(Player p) {
    if ((board[0][0] == board[1][0] && board[1][0] == board[2][0]) && board[0][0] == p.getSymbol()) {
        return true;
    } else if ((board[0][1] == board[1][1] && board[1][1] == board[2][1]) && board[0][1] == p.getSymbol()) {
        return true;
    } else if ((board[0][2] == board[1][2] && board[2][0] == board[2][2]) && board[0][2] == p.getSymbol()) {
        return true;
    } else if ((board[0][0] == board[0][1] && board[0][1] == board[0][2]) && board[0][0] == p.getSymbol()) {
        return true;
    } else if ((board[1][0] == board[1][1] && board[1][1] == board[1][2]) && board[1][0] == p.getSymbol()) {
        return true;
    } else if ((board[2][0] == board[2][1] && board[2][1] == board[2][2]) && board[2][0] == p.getSymbol()) {
        return true;
    } else if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[0][0] == p.getSymbol()) {
        return true;
    } else if ((board[2][0] == board[1][1] && board[1][1] == board[0][2]) && board[2][0] == p.getSymbol()) {
        return true;
    } else {
        return false;
    }
}

/*
 * METHOD checkTie - Checks if there was a tie on the board or not
 * @return - True if tie is present, false if not
 */

public boolean checkTie() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == '_') {
                return false;
            }
        }
    }
    return true;
}
}//end of file