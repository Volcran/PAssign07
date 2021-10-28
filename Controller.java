import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;


public class Controller extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //How to use multiple panes at once
        Pane pane = new Pane();

        //Outer Shape
        Rectangle r3 = new Rectangle(25, 90, 200, 350);
        r3.setFill(Color.GRAY);
        r3.setArcWidth(80);
        r3.setArcHeight(70);


        //Display for calculator
        Rectangle display = new Rectangle();
        display.setHeight(150);
        display.setWidth(180);
        display.setArcWidth(60);
        display.setArcHeight(50);
        display.relocate(35,100);
        pane.getChildren().addAll(r3, display);

        //Outer Circle
        Circle outer = new Circle(80);
        Button bt = new Button("    ");
        bt.setFont(Font.font(75));
        bt.setShape(outer);
        bt.setMaxWidth(500);
        bt.setMaxHeight(500);
        bt.relocate(35,265);
        pane.getChildren().add(bt);

        //Inner Circle
        Circle inner = new Circle(45);
        inner.setFill(Color.GRAY);
        inner.relocate(82,300);
        pane.getChildren().add(inner);

        //Text Boxes
        Text txtMenu = new Text("MENU");
        Text txtBack = new Text("|<<");
        Text txtSkip = new Text(">>|");
        Text txtPlay = new Text("⏯");

        txtMenu.setFont(Font.font(8));
        txtMenu.relocate(115,275);
        txtBack.setFont(Font.font(8));
        txtBack.relocate(40,340);
        txtSkip.setFont(Font.font(8));
        txtSkip.relocate(200,340);
        txtPlay.setFont(Font.font(12));
        txtPlay.relocate(125,405);
        pane.getChildren().addAll(txtMenu,txtBack,txtSkip, txtPlay);


        Scene scene = new Scene(pane,250,500);
        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage

        primaryStage.show(); // Display the stage
    }
}
