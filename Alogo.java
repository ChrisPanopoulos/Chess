import java.lang.Math;
/**
 * Class Alogo implements the "knight" pioni.
 * @author Χρήστος Πανόπουλος
 */
public class Alogo extends Pioni {
	/**
	 * Constructor for class Alogo
	 * @param isWhite - true if it is white, false if it is black
	 */
	public Alogo(boolean isWhite) {
		super(isWhite, 'N'); //calls the superclass constructor
		
		
	}
/**
 * Checks to see if the specified location is a legal destination for the this pioni. 
 * The specified destination must be different from the current location. 
 * The destination follow the format: (char, int).Takes into account the chessboard and its contents.
 */
	@Override
	public boolean isLegalMove(char x, int y, Chessboard b) {
		
		int currentXCoord = Utilities.char2Int(getXCoord());
		int currentYCoord = getYCoord();
		
		
		if(isWhite()==true && (b.getPioniAt(x,y)==null || b.getPioniAt(x, y).isWhite() == false)) {
			if(Math.abs(Utilities.char2Int(x)-currentXCoord)== 1 && Math.abs(y-currentYCoord)==2 || Math.abs(Utilities.char2Int(x)-currentXCoord)== 2 && Math.abs(y-currentYCoord)== 1) {
				return true;
			}
		}
		if(isWhite()==false && (b.getPioniAt(x,y)==null || b.getPioniAt(x, y).isWhite() == true)) {
			if(Math.abs(Utilities.char2Int(x)-currentXCoord)== 1 && Math.abs(y-currentYCoord)==2 || Math.abs(Utilities.char2Int(x)-currentXCoord)== 2 && Math.abs(y-currentYCoord)== 1) {
				return true;
			}
		}
		return false;
	}

}
