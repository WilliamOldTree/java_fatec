
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {

    public void start(Stage stage) {
        Pane pane = new Pane();
        Scene scn = new Scene(pane);
        Label lblHello = new Label("Hello World");
        Button btn = new Button ("OK");

        pane.getChildren().add(lblHello);
        pane.getChildren().add(btn);

        btn.relocate(100, 50);

        stage.setScene(scn);
        stage.setWidth(800);
        stage.setHeight(400);
        stage.setTitle("Minha primeira tela JavaFX");
        stage.show();
    }

    public static void main(String[] args) {

        Application.launch(TelaPrincipal.class, args);

    }


}