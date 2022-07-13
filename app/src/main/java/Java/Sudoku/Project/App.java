/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Java.Sudoku.Project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application{

    //initializations
    Rectangle box_ur;
    Rectangle box_ul;
    Rectangle box_mm;
    Rectangle box_lr;
    Rectangle box_ll;
    Button testButton;
    Node node;

    
    public Parent createApplication() {


        return new Pane(testButton);
    }
    
    //shows the game window and does stuff with the game window
    @Override
    public void start(Stage stage) throws Exception {

        //sets the background
        TilePane tilePane = new TilePane();
        tilePane.setPrefColumns(3);
        tilePane.setPrefRows(3);
        tilePane.setTileAlignment( Pos.CENTER );

        tilePane.getChildren().addAll(
                new Rectangle( 300, 300, Color.GREY),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY ),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY ),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY ),
                new Rectangle( 300, 300, Color.WHITE ),
                new Rectangle( 300, 300, Color.GREY )
        );

        Scene scene = new Scene(tilePane);
        scene.setFill(Color.LIGHTGRAY);

        //shows the packground
        stage.setTitle("Sudoku");
        stage.setScene( scene ); //try to figure out a way to work around this
        stage.show();
    }

    //runs the script
    public static void main(String[] args) {
        launch(args);
    }

}
