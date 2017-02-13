/**
 * Created by daniel on 2/6/17. Runs a simulation of a sudoku game and checks to see if it is correct
 */
public class main {
    public static void main (String[] args){
        // valid sudoku board
        System.out.println("Valid sudoku board");
        System.out.println("Should return true");
        Driver d= new Driver(generateValidBoard());
        System.out.println(d.checkBoard());


        System.out.println("invalid sudoku board");
        System.out.println("Should return false");
        Driver q = new Driver(generateRowInvalidBoard(0));
        System.out.println(q.checkBoard());

        System.out.println("invalid sudoku board");
        System.out.println("Should return false");
        q = new Driver(generateColumnInvalidBoard(0));
        System.out.println(q.checkBoard());
    }

    /**
     * Uses a particular method to generate a valid sudoku board.
     * @param seed
     * @return
     */
    private static int[][] generateValidBoard(int seed){
        int[][] board = new int[9][9];
        int q = seed; // Seed for generating valid board

        for(int i = 0; i<9;i++){
            System.out.println();
            for(int j = 0; j<9; j++){

                board[i][j] = ((q+3*i+j)%9)+1;
                System.out.print(board[i][j]+" ");
            }
            if (i%3==2) q++;
        }
        return board;
    }

    private static int[][] generateValidBoard(){
        return generateValidBoard(0);
    }

    private static int[][] generateRowInvalidBoard(int seed){
        int[][] board = new int[9][9];
        int q = seed; // Seed for generating invalid board

        for(int i = 0; i<9;i++){
            System.out.println();
            for(int j = 0; j<9; j++){

                board[i][j] = i+1;
                System.out.print(board[i][j]+" ");
            }

        }
        return board;
    }
    private static int[][] generateColumnInvalidBoard(int seed){
        int[][] board = new int[9][9];
        int q = seed; // Seed for generating invalid board

        for(int i = 0; i<9;i++){
            System.out.println();
            for(int j = 0; j<9; j++){

                board[i][j] = j+1;
                System.out.print(board[i][j]+" ");
            }

        }
        return board;
    }
}
