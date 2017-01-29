package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */

public class Koristaja extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        Label l = new Label();
        stack.getChildren().add(l);
        l.setText("oled tore");

        for (int i = 0; i < 1500; i++) {
            Circle joonistanRingi = new Circle(100);
            joonistanRingi.setTranslateX(Math.random() * 500);
            joonistanRingi.setTranslateY(Math.random() * 500);
            stack.getChildren().add(joonistanRingi);
            joonistanRingi.setFill(Color.RED);
            joonistanRingi.setOnMouseEntered(event -> {
                joonistanRingi.setFill(Color.TRANSPARENT);
            });
        }

        for (int i = 0; i < 1100; i++) {
            Circle joonistanRingi = new Circle(100);
            joonistanRingi.setTranslateX(Math.random() * -250);
            joonistanRingi.setTranslateY(Math.random() * -250);
            stack.getChildren().add(joonistanRingi);
            joonistanRingi.setFill(Color.RED);
            joonistanRingi.setOnMouseEntered(event -> {
                joonistanRingi.setFill(Color.TRANSPARENT);
            });
        }


        primaryStage.show();

    }
}