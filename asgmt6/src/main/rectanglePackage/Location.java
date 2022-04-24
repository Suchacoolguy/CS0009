import java.io.Serializable;

public class Location implements Serializable{
    public int x_position;
    public int y_position;

    public void setLocation(int x, int y)
    {
        x_position = x;
        y_position = y;
    }

    public int getX_position() {
        return x_position;
    }

    public int getY_position() {
        return y_position;
    }
}
