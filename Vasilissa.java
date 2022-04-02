/**
 * Class Vasilissa implements the "queen" pioni.
 * @author Χρήστος Πανόπουλος
 */
public class Vasilissa extends Pioni {
/**
 * Constructor for class Vasilissa
 * @param isWhite - true if it is white, false if it is black
 */
	public Vasilissa(boolean isWhite) {
		super(isWhite, 'Q');//calls superclass constructor
		
		
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
		int i;
		
		if(currentXCoord==Utilities.char2Int(x) && currentYCoord==y) {
			return false;
			
		}
		
		if(currentXCoord==Utilities.char2Int(x)) {
			if(currentYCoord < y) {
				for(i = currentYCoord + 1; i<=y; i++) {
					if(b.getPioniAt(Utilities.int2Char(currentXCoord), i) == null || b.getPioniAt(x, y).isWhite()!=b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
						return true;
				}
			}
		else {
			for(i=currentYCoord-1; i>=y; --i) {
				if(b.getPioniAt(Utilities.int2Char(currentXCoord), i)== null || b.getPioniAt(x, y).isWhite()!=b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
					return true;
			}
		}
	}
			
		else if(currentYCoord==y) {
			if(currentXCoord < Utilities.char2Int(x) ) {
				for(i=currentXCoord + 1; i<= Utilities.char2Int(x); ++i) {
					if(b.getPioniAt(Utilities.int2Char(i), currentYCoord)==null || b.getPioniAt(x, y).isWhite()!=b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
						return true;
				}
			}
			else {
				for(i=currentXCoord - 1; i >= Utilities.char2Int(x); --i) {
					if(b.getPioniAt(Utilities.int2Char(i), currentYCoord)==null || b.getPioniAt(x, y).isWhite()!=b.getPioniAt(Utilities.int2Char(currentXCoord), currentYCoord).isWhite())
						return true;
				}
			}
			
		}
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
