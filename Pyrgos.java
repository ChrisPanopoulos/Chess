/**
 * Class Pyrgos implements the "rook" pioni.
 * @author Χρήστος Πανόπουλος
 */
public class Pyrgos extends Pioni {
	/**
	 * Constructor for class Pyrgos
	 * @param isWhite - true if it is white, false if it is black
	 */
	public Pyrgos(boolean isWhite) {
		super(isWhite, 'R'); //Calls the superclass constructor
	}

	@Override
	/**
	 * Checks to see if the specified location is a legal destination for the this pioni. 
	 * The specified destination must be different from the current location. 
	 * The destination follow the format: (char, int). Takes into account the chessboard and its contents.
	 */
	public boolean isLegalMove(char x, int y, Chessboard b) {
		int currentXCoord=Utilities.char2Int(getXCoord());
		int currentYCoord=getYCoord();
		int i;
		
		if(currentXCoord==Utilities.char2Int(x) && currentYCoord==y) {
			return false;
			
		}
		
		if(currentXCoord==Utilities.char2Int(x)) {// check for vertical move
			if(currentYCoord < y) {
				for(i = currentYCoord + 1; i<y; i++) {
					if(b.getPioniAt(Utilities.int2Char(currentXCoord), i) != null && b.getPioniAt(x, y).isWhite()==b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
						return false;
				}
			}
		else {
			for(i=currentYCoord-1; i>y; --i) {
				if(b.getPioniAt(Utilities.int2Char(currentXCoord), i)!= null && b.getPioniAt(x, y).isWhite()==b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
					return false;
			}
		}
	}
			
		else if(currentYCoord==y) {//check for horizontal move
			if(currentXCoord < Utilities.char2Int(x) ) {
				for(i=currentXCoord + 1; i< Utilities.char2Int(x); ++i) {
					if(b.getPioniAt(Utilities.int2Char(i), currentYCoord)!=null && b.getPioniAt(x, y).isWhite()==b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
						return false;
				}
			}
			else {
				for(i=currentXCoord - 1; i > Utilities.char2Int(x); --i) {
					if(b.getPioniAt(Utilities.int2Char(i), currentYCoord)!=null && b.getPioniAt(x, y).isWhite()==b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
						return false;
				}
			}
			
		}
		else {
			return false;
		}
		
		return true;
		}
}


	
