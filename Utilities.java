
/**
 * Class Utilities provide methods for turning letters of the chess-board to numbers and vice-versa.
 * @author Χρήστος Πανόπουλος
 */
public class Utilities {
	/**
	 * changes a char in ['A'..'H'] to a number in [1..8]
	 * @param xCharPos - the character
	 * @return the number
	 */
	public static char int2Char(int xCharPos) {
		char newChar=' ';
		switch(xCharPos) {
		  case 0:
			  newChar= 'Z'; //value for x if pioni has not been placed
			  break;
		  case 1:
			  newChar='A';
			  break;
		  case 2:
			  newChar='B';
			  break;
		  case 3:
			  newChar='C';
			  break;
		  case 4:
			  newChar='D';
			  break;
		  case 5:
			  newChar='E';
			  break;
		  case 6:
			  newChar='F';
			  break;
		  case 7:
			  newChar='G';
			  break;
		  case 8:
			  newChar='H';
			  break;
			  
		}
		return newChar;
	
		
	}
	/**
	 * changes a number in [1..8] to a char in ['A'..'H']
	 * @param xIntPos - the number
	 * @return the character
	 */
	public static int char2Int(char xCharPos) {
		int newInt=0;
		
		switch(xCharPos) {
		  case 'Z':
			  newInt = 0;
			  break;
		  case 'A':
			  newInt = 1;
			  break;
		  case 'B':
			  newInt = 2;
			  break;
		  case 'C':
			  newInt = 3;
			  break;
		  case 'D':
			  newInt = 4;
			  break;
		  case 'E':
			  newInt = 5;
			  break;
		  case 'F':
			  newInt = 6;
			  break;
		  case 'G':
			  newInt = 7;
			  break;
		  case 'H':
			  newInt = 8;
			  break;
		}
		return newInt;
		
	}

}
