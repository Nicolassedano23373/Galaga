import java.awt.*;

public class Bullet extends Character {


    private int x, y;

    private final int size = 16;

    public boolean hasClicked;



    public Bullet() {

        setX(Character.getCharacter().getX());+Character.getCharacter().getSize()/3);

        setY(Character.getCharacter().getY());-Character.getCharacter().getSize());

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

    public void update(Board game){

        if(hasClicked){

            y--;

        }

    }

}



        






