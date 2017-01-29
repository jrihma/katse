package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */

public class Joon extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        TextField textField = new TextField();
        Button submit = new Button("Joonista");
        submit.setDefaultButton(true);
        submit.setTranslateX(160);
        submit.setOnAction(event -> {
            //Küsida input

            String input = textField.getText();
            //Lahutada numbrid

            String[] k = input.split("-");
            int[] intK = new int[4];
            for (int i = 0; i <k.length ; i++) {
                intK[i] = Integer.parseInt(k[i]);

            }
            System.out.println(Arrays.toString(k));

            // Joonista joon vastavalt numbritele

            Line line = new Line(intK[0], intK[1], intK[2], intK[3]);
            pane.getChildren().add(line);


            System.out.println(input);
        });

        pane.getChildren().addAll(textField, submit);

        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
