import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


//@author Nisarg Khatri, 000881890
public class Window {

    private double x;
    private double y;
    private double diameter;


//    Setting the values.
    public Window(double x, double y, double diameter){
        this.x = x;
        this.y = y;
        this.diameter = diameter;

    }

//    setting the parameters like the color, size and position of the windows in house.
    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillOval(x,y,diameter,diameter);
    }
}
