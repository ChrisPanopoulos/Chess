import java.lang.Math;
/**
 * Class Stratiotis implements the "pawn" pioni.
 * @author Χρήστος Πανόπουλος
 */
public class Stratiotis extends Pioni {
	/**
	 * Constructor for class Stratiotis
	 * @param isWhite - true if it is white, false if it is black
	 */
	public Stratiotis(boolean isWhite) {
		super(isWhite, 'P');
		
		
	}

	@Override
	/**
	 * Checks to see if the specified location is a legal destination for the this pioni. 
	 * The specified destination must be different from the current location. 
	 * The destination follow the format: (char, int).Takes into account the chessboard and its contents.
	 */
	public boolean isLegalMove(char x, int y, Chessboard b) {
		
		int currentXCoord = Utilities.char2Int(getXCoord());
		int currentYCoord = getYCoord();
		
		
		
		  if(isWhite()) {
			 if((b.getPioniAt(x, y)==null && y==currentYCoord+1 && Utilities.char2Int(x)==currentXCoord)) {//one move
				 return true;
				 
			 }
			 
			  if(b.getPioniAt(x, y) != null && y == currentYCoord + 1 && Math.abs(Utilities.char2Int(x)-currentXCoord)==1) {
				 return true;
				 
			 }
			  if(b.getPioniAt(x, y) == null && currentYCoord == 2 && y == 4 && Utilities.char2Int(x)==currentXCoord) {
				 return true;//two moves
				 
			 }
		  }
			 else {
				 if((b.getPioniAt(x, y)==null && y==currentYCoord-1 && Utilities.char2Int(x)==currentXCoord)) {
					 return true;
					 
				 }
				 
				 if(b.getPioniAt(x, y) != null && y == currentYCoord - 1 && Math.abs(Utilities.char2Int(x)-currentXCoord)==1) {
					 return true;
					 
				 }
				 if(b.getPioniAt(x, y) == null && currentYCoord == 7 && y == 5 && Utilities.char2Int(x)==currentXCoord) {
					 return true;
				 }
			 }
				 
			 
			 return false;
		}
	}

		
