package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] matrix;

    public Board(Character[][] matrix) {
            this.matrix = matrix;


    }
    public Boolean isInFavorOfX() {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                if(matrix[col][row] == 'X') {
                    return false;
                }

            }
        }
        return true;
    }

    public Boolean isInFavorOfO() {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[col][row] == 'O') {
                    return true;
                }
            }
        }
        return false;

    }
    public Boolean isTie() {
        return null;
    }

    public String getWinner() {

        return null;
    }

}
