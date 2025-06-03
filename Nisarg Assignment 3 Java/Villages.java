import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

// @author Name : Nisarg Khatri, 000881890
public class Villages {

    private double x;
    private double y;
    private double size;
    private Color color;
    private String name;

//  Creating a three object for House Constructor.
    public House house1;
    public House house2;
    public House house3;

    public Villages(String name, double x, double y, Color color){
//        Setting a values
                this.name = name;
                this.x = x;
                this.y = y;
                this.color =  color;
                this.size = 150;

//              Creating and setting a value to three different House constructor.
                house1 =new House(x,y, size+50, color);
                house2 =new House(x+250,y+30, size+20, color);
                house3 =new House(x+475,y+60, size-10, color);

//                Getting a random int value for a particular village.
                int randomnum = (int)(Math.random() * 22 + 3);
//                Sending a value to setOccupants in house class.
                house1.setOccupants(randomnum);
    }

    public void draw(GraphicsContext gc){

//        Drawing three different house.
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);

//      Displaying a name size and thepopulation of the village.
        gc.setFill(Color.WHITE);
        gc.setFont(new Font(20));
        gc.fillText(String.format(name + " (size %.1fm, Population %d)", house1.getSize(), house1.getOccupants()), x, y+size*1.5);
    }

}
