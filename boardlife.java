import java.util.ArrayList;

public class Board{

    
    public void resetBoard(){
        
        ArrayList<String> board = new ArrayList<String>(); 
        
        Piece piece1 = new Piece("A1");
        Piece piece2 = new Piece("C1");
        Piece piece3 = new Piece("E1");
        Piece piece4 = new Piece("G1");
        Piece piece5 = new Piece("B2");
        Piece piece6 = new Piece("D2");
        Piece piece7 = new Piece("F2");
        Piece piece8 = new Piece("H2");
        Piece piece9 = new Piece("A3");
        Piece piece10 = new Piece("C3");
        Piece piece11 = new Piece("E3");
        Piece piece12 = new Piece("G3");
        
        
        
        board.add(piece1);
        board.add(piece2);
        board.add(piece3);
        board.add(piece4);
        board.add(piece5);
        board.add(piece6);
        board.add(piece7);
        board.add(piece8);
        board.add(piece9);
        board.add(piece10);
        board.add(piece11);
        board.add(piece12);
    
            
    }
    
    
}