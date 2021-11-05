package rocks.zipcodewilmington.tictactoe;

import java.io.StringReader;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    private Character[][] matrix; // created instance variable

    public Board(Character[][] matrix) { // constructor
        this.matrix = matrix; // initialized instance variable
    }


// work in progress   MADE SOME PROGRESS
   
    public Boolean isInFavorOfX() {

            /*   example
     {           col
             row{'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}



           Ways to win
           row1 [0][0],[0][1],[0][2]
           row2 [1][0],[1][1],[1][2]
           row3 [2][0],[2][1],[2][2]
           --------------------------
           col1 [0][0],[1][0],[2][0]
           col1 [0][1],[1][1],[2][1]
           col1 [0][2],[1][2],[2][2]
           ----------------------------
           diag1[0][0],[1][1],[2][2]
           diag2[0][2],[1][1],[2][0]
        }
      */

        Boolean isInFavorOfX = false;


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                   if(matrix[row][0] == 'X' && matrix[row][1] == 'X' && matrix[row][2] == 'X'){//horizontal win
                    isInFavorOfX = true;

              }else if(matrix[0][col] == 'X' && matrix[1][col] == 'X' && matrix[2][col] == 'X'){//vertical win
                    isInFavorOfX =true;

              }else if(matrix[row][0] == 'X' && matrix[row][1] == 'X' && matrix[row][2] == 'X'){//diagonal win
                  isInFavorOfX = true;

              }else if(matrix[row][2] == 'X' && matrix[row][1] == 'X' && matrix[row][0] == 'X'){
                  isInFavorOfX =true;

              }

            }
        }


        return isInFavorOfX;
    }


    public Boolean isInFavorOfO() {

        Boolean isInFavorOfO = false;


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if(matrix[row][0] == 'O' && matrix[row][1] == 'O' && matrix[row][2] == 'O'){
                    isInFavorOfO = true;

                }else if(matrix[0][col] == 'O' && matrix[1][col] == 'O' && matrix[2][col] == 'O'){
                    isInFavorOfO =true;

                }else if(matrix[row][0] == 'O' && matrix[row][1] == 'O' && matrix[row][2] == 'O'){
                    isInFavorOfO = true;

                }else if(matrix[row][2] == 'O' && matrix[row][1] == 'O' && matrix[row][0] == 'O'){
                    isInFavorOfO =true;

                }

            }
        }


        return isInFavorOfO;
    }

    public Boolean isTie() {


        return (isInFavorOfO() || isInFavorOfX());
    }

    public String getWinner() {
        String winner = "";
       if(isInFavorOfX()){
          winner = "X";

       }else if(isInFavorOfO()){
          winner = "O";

       }


        return winner;
    }

}
