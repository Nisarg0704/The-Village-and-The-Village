import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


//@author Name : Nisarg Khatri, 000881890
public class Door {

    private double x;
    private double y;
    private double height;


//    Setting the Values.
    public void Gate(double x, double y, double height){
        this.x = x;
        this.y = y;
        this.height = height;

    }


    //    setting the parameters like the color, size and position of the door in house.
    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, height/2, height);
    }

}
