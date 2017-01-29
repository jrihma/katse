package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i < Math.random() * 100; i++) {
            Circle joonistanRingi = new Circle(100);
            joonistanRingi.setTranslateX(Math.random() * 500);
            joonistanRingi.setTranslateY(Math.random() * 500);
            stack.getChildren().add(joonistanRingi);
            joonistanRingi.setFill(Color.RED);
            joonistanRingi.setOnMouseEntered(event -> {
                joonistanRingi.setFill(Color.GREEN);
            });
        }


        primaryStage.show();

    }
}
