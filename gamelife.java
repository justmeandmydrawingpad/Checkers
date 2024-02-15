public class Game{
    
    
    public void game(){
        
        Board board = new board;
        
        //check if in check, for now true
        while(true){
            
            String playerpiece = player.getPiece(player.pieceInput);
            
            //get rid of this functionality later as the arraylist will be created with pieces already inside,
            //later will be setting attributes and removing pieces in arraylist
            board.addPiece(playerpiece);
            
            playerpiece.setPos(playerpiece.pieceInput());
            
            System.out.println(playerpiece.getPos());
            
            
            
            
        }
        
        
    //public void winner(game())
    //   
    //}
    
    
    
}