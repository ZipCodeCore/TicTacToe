package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if(matrix[0][0] == 'X'){
            if (matrix[0][1]  == 'X'){
                if(matrix[0][2] == 'X'){
                    return true;
                }
            }
            if(matrix[1][0] == 'X'){
                if(matrix[2][0] == 'X'){
                    return true;
                }
            }
            if(matrix[1][1] == 'X'){
                if(matrix[2][2] == 'X'){
                    return true;
                }
            }
        }
        if(matrix[0][2] == 'X') {
            if (matrix[1][1] == 'X') {
                if (matrix[2][0] == 'X') {
                    return true;
                }
            }
            if (matrix[1][2] == 'X') {
                if (matrix[2][2] == 'X') {
                    return true;
                }
            }
        }
        if(matrix[0][1] == 'X'){
            if(matrix[1][1] == 'X'){
                if(matrix[2][1] == 'X'){
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if(matrix[0][0] == 'O'){
            if (matrix[0][1]  == 'O'){
                if(matrix[0][2] == 'O'){
                    return true;
                }
            }
            if(matrix[1][0] == 'O'){
                if(matrix[2][0] == 'O'){
                    return true;
                }
            }
            if(matrix[1][1] == 'O'){
                if(matrix[2][2] == 'O'){
                    return true;
                }
            }
        }
        if(matrix[0][2] == 'O') {
            if (matrix[1][1] == 'O') {
                if (matrix[2][0] == 'O') {
                    return true;
                }
            }
        }
            if(matrix[1][2] == 'O'){
                if(matrix[2][2] == 'O'){
                    return true;
                }
            }
            if(matrix[0][1] == 'O'){
                if(matrix[1][1] == 'O'){
                    if(matrix[2][1] == 'O'){
                        return true;
                    }
                }
            }
            return false;
    }

    public Boolean isTie() {
        return !(this.isInFavorOfX() && this.isInFavorOfO());
    }

    public String getWinner() {
            if(this.isInFavorOfX()){
                return "X";
            }
            if(this.isInFavorOfO()){
                return "O";
            }
        return "";
    }

}
