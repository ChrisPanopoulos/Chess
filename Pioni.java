



/**
 * Abstract class Pioni - implements a piece of chess
 * @author Χρήστος Πανόπουλος
 * 
 */
public abstract class Pioni {
	private int xCoord;
	private int yCoord;
	private boolean white;
	private char type;
	
	/**
	 * 
	 * Constructor for class Pioni
	 * @param white - if the pioni is white or black
	 * @param char - the type of the pioni
	 */
	public Pioni(boolean white, char type) {
		this.white = white;
		this.type = type;
		if(!isWhite()) {
		    this.type = Character.toLowerCase(type);
		  }
	}
	/**
	 * returns the type of the pioni
	 * @return the type
	 * 
	 */
	public char getType() {
		return type;
	}
	/**
	 * returns the X-coordinate of the pioni on the chessboard as a character
	 * @return the X-coordinate
	 */
	public char getXCoord() {
		return Utilities.int2Char(xCoord);
	}
	/**
	 * returns the Y-coordinate of the pioni on the chessboard as a number
	 * @return the Y-coordinate
	 */
	public int getYCoord() {
		return yCoord;
	}
	/**
	 * Checks to see if the specified location is a legal destination for the this pioni. 
	 * The specified destination must be different from the current location. 
	 * The destination follows the format: (char, int). 
	 * Takes into account the chessboard and its contents.
	 * @param x - the X-coordinate of the destination.
	 * @param y - the Y-coordinate of the destination.
	 * @param b - the ChessBoard on which the chess game is played.
	 */
	public abstract boolean isLegalMove(char x, int y, Chessboard b) ;
	/**
	 * returns if the color of the pioni is white or black
	 * @return true if the pioni is white, false if the pioni is black
	 */
	public boolean isWhite() {
		return white;
	}
	/**
	 * Produces a single letter representation of the pioni depending on its type
	 * @ return the representation
	 */
	public String print() {
		if(isWhite())
			return ""+type;
		else
			return ""+Character.toLowerCase(type);
	}
	/**
	 * Changes the position of the pioni on the chessboard
	 * @param x - the new X-coordinate as a character
	 * @param y - the new Y-coordingate as a number
	 */
	public void setPosition(char x, int y) {
		xCoord = Utilities.char2Int(x);
		yCoord = y;
	}
	/**
	 * Produces a description of the pioni as a String
	 * @return the description
	 */
	public String toString() {
		return ""+type+":  "+xCoord+yCoord;
	}

	
	

}
