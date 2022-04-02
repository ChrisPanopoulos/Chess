import java.lang.Math;
/**
 * Class Stratigos implements the "bishop" pioni.
 * @author Χρήστος Πανόπουλος
 */
public class Stratigos extends Pioni {
/**
 * Constructor for class Stratigos
 * @param isWhite - true if it is white, false if it is black
 */
	public Stratigos(boolean isWhite) {
		super(isWhite, 'B');//calls the superclass constructor
		
	}

	@Override
	/**
	 * Checks to see if the specified location is a legal destination for the this pioni. 
	 * The specified destination must be different from the current location. 
	 * The destination follow the format: (char, int). Takes into account the chessboard and its contents.
	 */
	public boolean isLegalMove(char x, int y, Chessboard b) {
		
		int currentXCoord = Utilities.char2Int(getXCoord());
		int currentYCoord = getYCoord();
		if(isWhite()) {
		    if(b.getPioniAt(x,y)==null) {
		
			if(currentXCoord!=Utilities.char2Int(x) && currentYCoord!=y && Math.abs(currentXCoord-Utilities.char2Int(x))== Math.abs(currentYCoord-y)) 
				return true;
			
		}
		if(b.getPioniAt(x,y)!=null && b.getPioniAt(x,y).isWhite()==false) {
		    if(currentXCoord!=Utilities.char2Int(x) && currentYCoord!=y && Math.abs(currentXCoord-Utilities.char2Int(x))== Math.abs(currentYCoord-y)) 
				return true;
		    
                   }
              }
		if(!isWhite()) {
		    if(b.getPioniAt(x,y)==null) {
		
			if(currentXCoord!=Utilities.char2Int(x) && currentYCoord!=y && Math.abs(currentXCoord-Utilities.char2Int(x))== Math.abs(currentYCoord-y)) 
				return true;
			
		}
		if(b.getPioniAt(x,y)!=null && b.getPioniAt(x,y).isWhite()==true) {
		    if(currentXCoord!=Utilities.char2Int(x) && currentYCoord!=y && Math.abs(currentXCoord-Utilities.char2Int(x))== Math.abs(currentYCoord-y)) 
				return true;
		    
                }
              }
		
		return false;
	}

}
