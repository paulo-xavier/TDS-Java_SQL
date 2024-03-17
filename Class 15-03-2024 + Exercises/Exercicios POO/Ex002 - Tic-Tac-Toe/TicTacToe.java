import java.util.Scanner;

public class TicTacToe {
    
    String green = "\033[0;32m";
    String reset = "\033[0m";

    private int rows = 3; 
    private int cols = 3; 
    private String[][] squares;
    private int currentPlayer = 1; 
    public int attempts = 1; 
    private Boolean gameOver = false; 
    private Scanner leitor; 
    
    public TicTacToe(){
        
        squares = new String[rows][cols]; 
        
        int i; 
        for(i = 0; i<rows; i++) {
            for (int c = 0; c < cols; c++) {
                squares[i][c] = ""; 
            }
        }

        startGame(squares); 
    }

    public void startGame(String[][] squares) {

        while (this.gameOver == false) {

            printTicTacToe();
            chooseSquare();
        }

    }

    public void printTicTacToe() {

        System.out.println(green + "\n=== TIC-TAC-TOE ===\n" + reset); 
        
        for (int i = 0; i < rows; i++) {
            for (int c = 0; c < cols; c++) {
                System.out.printf(green + "%7s |", squares[i][c] + reset); 
            }

            System.out.printf("%n");
        }
    }

    public void chooseSquare() {
        leitor = new Scanner(System.in); 

        System.out.println("Choose a row: "); 
        int row = leitor.nextInt(); 
        
        System.out.println("Choose a column"); 
        int col = leitor.nextInt(); 

        Boolean isValid = checkIfSquareIsAvailable(row, col); 

        if (isValid) {
            System.out.print("\033[H\033[2J");
            changeSquare(row, col); 
        
        } else {
            System.out.print("\033[H\033[2J");

            System.out.println("Invalid!! \n"); 

            printTicTacToe();
            chooseSquare();
        }
    }

    public boolean checkIfSquareIsAvailable(int row, int col) {

        if (row > 2 || row < 0 || col > 2 || col < 0) {
            return false; 
        }
        
        if (squares [row][col] == "") {
            return true; 
        }

        return false; 

    }

    public void changeSquare(int row, int col) {
        
        if (this.currentPlayer == 1) {
    
            squares [row][col] = "X"; 
        
        } else {
            squares[row][col] = "O"; 
        }


        Boolean isGameOver = gameOver(); 
        System.out.println(isGameOver); 
    
        if (isGameOver == true) {
            
            System.out.print("\033[H\033[2J");

            printTicTacToe();

            if (this.currentPlayer == 1 && this.attempts < 9) {
                System.out.println(green + " \n --> X wins!!" + reset); 
            
            } else if (this.currentPlayer == 2 && this.attempts < 9) {
                System.out.println(green + " \n --> O wins!!" + reset); 
            
            } else {
                System.out.println(green + "\n --> The game tied!!" + reset); 
            }
            
            this.gameOver = true;  

        } else {

            changeCurrentPlayer(); 
            this.attempts++; 
            System.out.println(this.attempts); 
        }
    }

    public void changeCurrentPlayer() {
        if (this.currentPlayer == 1) {
            this.currentPlayer = 2; 
        } else {
            this.currentPlayer = 1; 
        }
    }

    public boolean gameOver() {
        
        /*Verify rows */
        for (int i = 0; i < this.rows; i++) {
            
            if (!squares[i][0].equals("") && !squares[i][1].equals("") && !squares[i][2].equals("")) {
                
                if (squares[i][0].equals(squares[i][1]) && squares[i][0].equals(squares[i][2])) {
                    return true; 
                }
            }
        }

        /*Verify columns */
        for (int i = 0; i < cols; i++) {
            if (!squares[0][i].equals("") && !squares[1][i].equals("") && !squares[2][i].equals("")) {
                
                if (squares[0][i].equals(squares[1][i]) && squares[0][i].equals(squares[2][i]) ) { 
                    return true; 
                }
            }
        }

        /*Check diagonals */
        if (!squares[0][0].equals("") && !squares[1][1].equals("") && !squares[2][2].equals("")) {

            if (squares[0][0].equals(squares[1][1]) && squares[0][0].equals(squares[2][2])) {
                return true; 
            }

            if (squares[0][2].equals(squares[1][1]) && squares[0][2].equals(squares[2][0])) {
                return true; 
            }
        }

        /*Check if the game is tied */
        if (this.attempts == 9) {
            return true; 
        }

        return false;  
    }    
}

        // PrintTicTacToe()
        
        // Ask rows and cols() [Check if the rows and cols are available and assign]; 
    
        // PrintTicTacToe()
        
        // GameOver()
        
        // Change current player; 