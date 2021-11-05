package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    private Character[][] matrix; // created instance variable

    public Board(Character[][] matrix) { // constructor
        this.matrix = matrix; // initialized instance variable
    }

    public static void main(String[] args) {

        Character[][] board = {
                {'X', 'X', 'O'},
                {'O', 'O', 'X'},
                {'O', 'O', 'X'}
        };
            /*   example
     {           col
             row{'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        }
      */

        Boolean isInFavorOfX = null;
        Integer playerX = 0;
        Integer playerO = 0;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'X') {
                    playerX++;

                } else {
                    playerO++;
                }
            }
        }

        System.out.println("O :"+playerO);
        System.out.println("X :"+playerX);

    }

// work in progress

    public Boolean isInFavorOfX() {
      Character[][] board = this.matrix;
            /*   example
     {           col
             row{'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        }
      */

        Boolean isInFavorOfX = false;
        Integer playerX = 0; //Keeps track of player X turns
        Integer playerO = 0; //Keeps track of player O turns

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'X') {
                    playerX++;

                } else {
                    playerO++;
                }
            }
        }


        return isInFavorOfX;
    }


    public Boolean isInFavorOfO() {

        return null;
    }

    public Boolean isTie() {


        return null;
    }

    public String getWinner() {

        return "X";
    }

}
