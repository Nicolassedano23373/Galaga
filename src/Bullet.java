import java.awt.*;

public class Bullet<Game> extends Character {
    

        private int x, y;

        private final int size = 16;

        public boolean hasClicked;


        
        public Bullet() {
            
            setX(Game.getCharacter().getX()+Game.getCharacter().getSize()/3);
            
            setY(Game.getCharacter().getY()-Game.getCharacter().getSize());
            
        }

        private void setX(int x){
            
            this.x = x;
            
        }

        private void setY(int y){
            
            this.y = y;
            
        }

        public int getY(){
            
            return y;
            
        }

        public int getX(){
            
            return x;
            
        }

        public void render(Graphics g){
            
            if(hasClicked){
                
                g.setColor(Color.red);
                
                g.fillOval(x,y, size, size);
                
            }
            
        }

        public void update(Game game){
            
            if(hasClicked){
                
                y--;
                
            }
            
        }

    }



        






