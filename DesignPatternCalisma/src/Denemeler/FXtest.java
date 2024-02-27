package Denemeler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FXtest extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Soru 12");
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane,400,500);
        primaryStage.show();
    }
}
