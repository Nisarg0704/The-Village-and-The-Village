import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


// @author Name : Nisarg Khatri, 000881890
public class TwoVillage extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        Group root = new Group();
//        creating a  scene and setting the size of the application window.
        Scene scene = new Scene(root,1680, 720, Color.DARKBLUE);
//      setting the size of the canvas.
        Canvas cs =new Canvas(1680, 720);
//        setting the name of the window.
        stage.setTitle("The Village and The Village");
        root.getChildren().add(cs);
        stage.setScene(scene);
        GraphicsContext gc = cs.getGraphicsContext2D();


//      creating the first village and setting the color and position of the village1
        Villages village1 = new Villages("Mississauga", 50, 50, Color.RED);
        village1.draw(gc);


//        Creating the second village and setting the color and population of the village2
        Villages Village2 = new Villages("Kitchener", 300, 400, Color.BLUE);
        Village2.draw(gc);
        stage.show();


//      Creating a King's House and setting the position
        House KingHouse = new House(1020,275);
        KingHouse.draw(gc);
        KingHouse.setOccupants(1);
        gc.setFill(Color.DARKORANGE);
        gc.setFont(new Font(20));
        gc.fillText(String.format("King's House (size %.1fm, Population %d)", KingHouse.getSize(), KingHouse.getOccupants()), 1020, 480);

    }

    public static void main(String[] args) {
        launch();
    }
}