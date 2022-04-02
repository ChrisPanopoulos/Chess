/**
 * Class ChessEngine coordinates a game of chess between two players
 * @author Χρήστος Πανόπουλος
 */
public class ChessEngine {
	private Chessboard board;//creates an object of chessboard
	private boolean whitePlayNext;//checks whose turn to play is
	/**
	 * Constructor for class ChessEngine
	 */
	public ChessEngine() {
		board = new Chessboard();
		whitePlayNext = true;
	}
	/**
	 * Initializes a game of chess
	 */
	public void playChess() {
	    printNotation();
	    System.out.println();
	    board.loadBoard();
	    board.printBoard();
	    System.out.println();
	    System.out.println("White execute method nextMove() to enter your move");
	 
	}
	/**
	 * Prints the standard notation used for the game
	 */
	public static void printNotation() {
		System.out.println("White pieces are denoted with upper case letters.");
		System.out.println("Black pieces are denoted with lower case letters.");
		System.out.println();
		System.out.println("K/k: King (Vasilias)");
		System.out.println("Q/q: Queen (Vasilissa)");
		System.out.println("R/r: Rook (Pyrgos)");
		System.out.println("B/b: Bishop (Stratigos)");
		System.out.println("K/k: Knight (Alogo)");
		System.out.println("P/p: Pawn (Stratiotis)");
	}
	/**
	 * The player makes his move. 
	 * If the move is valid, it is executed and the other player is prompted to play. 
	 * Otherwise, no action is taken and the player is asked to make a valid move.
	 * @param xOrig - the X-coordinate of the origin
	 * @param yOrig - the Y-coordinate of the origin
	 * @param xDest - the X-coordinate of the destination
	 * @param yDest - the Y-coordinate of the destination
	 */
	public void nextMove(char xOrig, int yOrig, char xDest, int yDest) {
	    
		Pioni p = board.getPioniAt(xOrig, yOrig);
		if(p.isLegalMove(xDest, yDest, board)) {
		    
			if((whitePlayNext == true && p.isWhite()==true) || (whitePlayNext == false && p.isWhite()==false)) {
				board.move(xOrig, yOrig, xDest, yDest);
				whitePlayNext = !whitePlayNext;
				board.printBoard();
			}
			else {
                         board.printBoard();
                         System.out.println("You try to move your opponet's pieces!!!illegal move");
			}
		}
		else {
                  board.printBoard();
                  System.out.println("illegal move");
		}
		if (whitePlayNext)
		    System.out.println("White execute method nextMove() to enter your move");
		    else
		    System.out.println("Black execute method nextMove() to enter your move");
	}
}

        


	


