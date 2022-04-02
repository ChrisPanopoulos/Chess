import java.lang.Math;
/**
 * Class Vasilias implements the "king" pioni.
 * @author Χρήστος Πανόπουλος
 */
public class Vasilias extends Pioni {
	/**
	 * Constructor for class Vasilias
	 * @param isWhite - true if it is white, false if it is black
	 */
	public Vasilias(boolean isWhite) {
		super(isWhite, 'K');//calls the superclass constructor
	}

	@Override
	/**
	 * Checks to see if the specified location is a legal destination for the this pioni. 
	 * The specified destination must be different from the current location. 
	 * The destination follows the format: (char, int).Takes into account the chessboard and its contents.
	 */
	public boolean isLegalMove(char x, int y, Chessboard b) {
		int currentXCoord = Utilities.char2Int(getXCoord());
		int currentYCoord = getYCoord();
		
		if(isWhite() && (b.getPioniAt(x, y)==null || b.getPioniAt(x, y).isWhite()==false)) {
			if(Math.abs(Utilities.int2Char(x)-currentXCoord) <=1 || Math.abs(y-currentYCoord) <= 1) 
				return true;
		}
		if(!isWhite() && (b.getPioniAt(x, y)==null || b.getPioniAt(x, y).isWhite()==true)) {
			if(Math.abs(Utilities.int2Char(x)-currentXCoord) <=1 || Math.abs(y-currentYCoord) <= 1) 
				return true;
		}
		return false;
	}

}