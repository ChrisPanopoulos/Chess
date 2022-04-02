/**
 * Class ChessBoard implements a chessboard.
 * @author Χρήστος Πανόπουλος
 */
public class Chessboard {
    private Pioni[][] board;
  /**
   * Constructor for class ChessBoard creates an object Chessboard which is an 8x8 2d array
   */  
    public Chessboard() {
        board = new Pioni[8][8];
    }
  /**
   * Returns the pioni at a given position.
   * @param xPos - The X-coordinate of the position
   * @param yPos - The Y-coordinate of the position
   * @return The pioni at positon (xPos, yPos).
   */  
    public Pioni getPioniAt(char xPos, int yPos) {
        return board[Utilities.char2Int(xPos)-1][yPos-1];
    }
   /**
    * Places a pioni at a location on the board
    * @param p - the pioni
    * @param xPos - the X-coordinate of the location
    * @param yPos - the Y-coordinate of the location
    */ 
    public void placePioniAt(Pioni p, char xPos, int yPos) {
        board[Utilities.char2Int(xPos)][yPos] = p;
        p.setPosition(xPos, yPos);
    }
    /**
     * places all pieces on the board for a new game to begin
     */
    public void loadBoard()  {
            board=new Pioni[8][8];
            board[0][0]=new Pyrgos(true);
            board[0][0].setPosition('A',1);
            board[7][0]=new Pyrgos(true);
            board[7][0].setPosition('H',1);
            board[1][0]=new Alogo(true);
            board[1][0].setPosition('B',1);
            board[6][0]=new Alogo(true);
            board[6][0].setPosition('G',1);
            board[2][0]=new Stratigos(true);
            board[2][0].setPosition('C',1);
            board[5][0]=new Stratigos(true);
            board[5][0].setPosition('F',1);
            board[4][0]=new Vasilias(true);
            board[4][0].setPosition('E',1);
            board[3][0]=new Vasilissa(true);
            board[3][0].setPosition('D',1);
            board[0][7]=new Pyrgos(false);
            board[0][7].setPosition('A',8);
            board[7][7]=new Pyrgos(false);
            board[7][7].setPosition('H',8);
            board[1][7]=new Alogo(false);
            board[1][7].setPosition('B', 8);
            board[6][7]=new Alogo(false);
            board[6][7].setPosition('G',8);
            board[2][7]=new Stratigos(false);
            board[2][7].setPosition('C',8);
            board[5][7]=new Stratigos(false);
            board[5][7].setPosition('F',8);
            board[4][7]=new Vasilias(false);
            board[4][7].setPosition('E',8);
            board[3][7]=new Vasilissa(false);
            board[3][7].setPosition('D',8);
            for(int i=0;i<8;i++)
            {
                board[i][1]=new Stratiotis(true);
                board[i][1].setPosition(Utilities.int2Char(i+1),2);
                board[i][6]=new Stratiotis(false);
                board[i][6].setPosition(Utilities.int2Char(i+1),7);
               }
    }
    /**
     * Moves a pioni. It does not make any check regarding the legality of the move.
     * @param xOrig - The X-coordinate of the origin of pioni
     * @param yOrig - The Y-coordinate of the origin of pioni
     * @param xDest - The X-coordinate of the destination of pioni
     * @param yDest - The Y-coordinate of the destination of pioni
     */
    public void move(char xOrig, int yOrig, char xDest, int yDest) {
        board[Utilities.char2Int(xDest)-1][yDest-1]=board[Utilities.char2Int(xOrig)-1][yOrig-1];
        board[Utilities.char2Int(xDest)-1][yDest-1].setPosition(xDest, yDest);
        board[Utilities.char2Int(xOrig)-1][yOrig-1]=null;
    }
    /**
     * Prints the chessboard with all the pieces on it
     */
    public void printBoard()
       {
           System.out.println("   a  b  c  d  e  f  g  h  ");
           System.out.println("--------------------------");
           for (int i=0;i<8;i++)
           {
             System.out.print((8-i));
               for (int j=0;j<8;j++)
               {
                   if (board[j][7-i]==null) 
                   System.out.print("   ");
                   else
                   System.out.print("  "+board[j][7-i].getType());
               }
                System.out.println("  "+(8-i));
           }
            System.out.println("--------------------------");
            System.out.println("   a  b  c  d  e  f  g  h  ");
          
       }
       
}
