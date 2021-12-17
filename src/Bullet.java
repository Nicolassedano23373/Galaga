import java.awt.*;

public class Bullet extends Board
{
    Color col;
    Bullet()
    {
        int width = 10;
        int height = 10;

        x = 0;
        int y = 0;

        Object attribute = "bullet";
        col = Color.RED;
    }

    public void update()
    {
        int y = 10;
    }

    public void makeColor()
    {
        col = Color.GREEN;
    }
    public void draw(Graphics g, Component c)
    {
        g.setColor(col);
        int y = 4;
        int width = 4;
        int height = 4;
        g.fillOval(x, y, width, height);

        boolean moveUp;
        if(moveUp)
    }
}







