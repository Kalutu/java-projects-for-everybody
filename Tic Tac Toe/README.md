# Tic Tac Toe in Java
This is a simple implementation of the Tic Tac Toe game in Java, where two players take turns to place their mark (X or O) on a 3x3 board. The game ends when one player gets three marks in a row, column, or diagonal, or when the board is filled with marks without a winner.

## Usage
- To play the game, simply run the TicTacToe class in your Java IDE or command line.
- You will see an empty board with a prompt for the first player to enter their move. 
- Enter the row and column numbers (0-2) for your mark, and the game will update the board and prompt the other player to make their move. 
- The game will continue until there is a winner or a draw, at which point the program will display the final board and exit.

## Implementation
The game is implemented using a 2D char array to represent the board, with '-' representing empty spots, 'X' for player 1, and 'O' for player 2. The program uses a simple algorithm to check for wins and draws, by checking each row, column, and diagonal for matching marks.

The program also includes basic error handling to ensure that players cannot place their mark on an already filled spot or outside the board boundaries.

## Contributing
Contributions to this project are welcome, including suggestions for improvement, bug fixes, or additional features. Please fork the project and create a new pull request with your changes.
