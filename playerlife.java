public class Player{
    
    private String piece;
    
    public String pieceInput(){
        
        while (true){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What piece will you move: ");
        
        //check type not variable
        //.getClass() == class
        if(scan == "Pawn" || scan == "King" || scan == "Queen" || scan == "Rook" || scan == "Bishop" || scan == "Knight" || ){
            
            break;
            return scan;
            
        }
        
        
    }
    }
    
    
    
    public void setPiece(pieceChoice){
        
        piece = pieceChoice;
        
    }
    public String getPiece(){
        
        return piece;
        
    }
    
    
    
}