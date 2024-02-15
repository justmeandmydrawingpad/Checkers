public class Piece{
    
    //later, will check position and use that to choose piece
    pribvate String pos;
    
    public Piece(String pos){
        
        this.pos = pos;
        
    }
    
    private String moveInput;
    
        public String moveInput(){
        
        while(true){
            
            Scanner scan = new Scanner(System.in);
        
            System.out.println("Give move: ");
        
            move = scan.nextLine();
            
            if((int)move.substring(0,1) < 8 && (int)move.substring(0,1) > -1 && move.substring(1,2) < 9 && move.substring(1,2) > -1){
                
                break;
                return move;
                
                
            }
            
        public String getPos(){
            
            return pos;
            
        }
            
                
        }
    }
    
    //may need later but if not remove
    public void setPos(String moveInput){
        
        pos = moveInput;
        
    }
    
    public int getPos(){
        
        return pos;
        
    }

    
    
}