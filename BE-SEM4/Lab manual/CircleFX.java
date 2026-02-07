import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class CircleFX extends Application { //CircleFX
    @Override
    public void start(Stage stage) {
        Circle c = new Circle(150, 100, 50);
        c.setFill(Color.RED);

        Pane root = new Pane(c);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Circle Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
