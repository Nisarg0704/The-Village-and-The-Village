import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


//@author Name : Nisarg Khatri, 000881890
public class House {
    private double x;
    private double y;
    private double size;
    private int occupants;
    private Color color;

//    Creating a object for Door class
    Door door = new Door();

//    Creating a object for windows class
    Window win;

    private double a;

    public House(double x, double y, double size, Color color) {
//        Setting a value.
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        a += x + size;

//        Calling a Gate method of door class and passing the parameters.
        door.Gate(x+size/2, y+size/2, size/2);

//        Calling a Windows Constructor and setting the value.
        win = new Window(x+size/7,y+size/10, size/4);
    }
    public House(double x, double y){
        this.x = x;
        this.y = y;
        this.size = 180;
        this.color = Color.DARKORANGE;
        a = size;

//        Calling a Gate method of door class and passing the parameters.
        door.Gate(x+size/2, y+size/2, size/2);

//        Calling a Windows Constructor and setting the value.
        win = new Window(x+size/7,y+size/10, size/4);
    }

//    Setting the value of the Occupants.
    public void setOccupants(int occupants){
        this.occupants = occupants;
    }

//    Getting the vlaue of the Occupants.
    public int getOccupants(){
        return occupants;
    }

//    Getting the size of the village.
    public double getSize(){
        a /= 20;
        return a;
    }


//    Drawing the door and the Windows of the House.
    public void draw(GraphicsContext gc){
        gc.setFill(color);
        gc.fillRect(x,y,size,size);
        door.draw(gc);
        win.draw(gc);
    }
}
