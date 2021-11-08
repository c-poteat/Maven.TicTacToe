package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] matrix;

    public Board(Character[][] matrix) {
            this.matrix = matrix;

    }
    public boolean checkHorizontal(Character player) {
        for (int i = 0; i <= 2; i++) {
            if(matrix[i][0] == player && matrix[i][1] == player && matrix [i][2] == player) {
                return true;
            }

        }
        return false;
    }

    public boolean checkVertical(Character player) {
        for (int i = 0; i <= 2; i++) {
            if(matrix[0][i] == player && matrix[1][i] == player && matrix [2][i] == player) {
                return true;
            }

        }
        return false;
    }

    public Boolean isInFavorOfX() {


        return null;
    }

    public Boolean isInFavorOfO() {

    return null;
    }
    public Boolean isTie() {
        return null;
    }

    public String getWinner() {

        return null;
    }

}
