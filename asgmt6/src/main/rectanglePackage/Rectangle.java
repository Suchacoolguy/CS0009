import java.io.Serializable;

public class Rectangle implements Serializable{
    int width;
    int height;
    Location topRight;

    public Rectangle(int width, int height, int x, int y)
    {
        this.width = width;
        this.height = height;
        topRight = new Location();
        topRight.setLocation(x, y);
    }

    public int compareTo(Rectangle obj2) 
    {
        return getArea() - obj2.getArea();
    }

    public int getArea() {return (width * height);}

    public int getIntersect(Rectangle rect)
    {
        int width = this.width - (Math.max(this.topRight.getX_position(), rect.topRight.getX_position() - Math.min(this.topRight.getX_position(), rect.topRight.getX_position())));
        int height = this.height - (Math.max(this.topRight.getY_position(), rect.topRight.getY_position() - Math.min(this.topRight.getY_position(), rect.topRight.getY_position())));
        
        if (Math.min(width, height) > 0) 
            return (width * height);
        else
            return 0;
    }
}