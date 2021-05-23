import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio10 extends Application {

    private class label_text {

        private final HBox pane = new HBox ( );
        private final Label label = new Label ( );
        private final TextField text = new TextField ( );

        label_text ( String text ) {

            this.label.setText ( text );
            this.pane.getChildren ( ).addAll ( this.label, this.text );
        }
    }

    public static void main ( String args[] ) {
        launch ( );
    }

    @Override
    public void start ( Stage stage ) throws Exception {

        VBox pane = new VBox ( );
        Scene scene = new Scene ( pane );

        label_text id = new label_text ( "ID: " );
        id.label.setPrefWidth ( 100 );
        id.text.setPrefWidth ( 400 );

        label_text name = new label_text ( "Nome: " );
        name.label.setPrefWidth ( 100 );
        name.text.setPrefWidth ( 400 );

        label_text tel = new label_text ( "Telefone: " );
        tel.label.setPrefWidth ( 100 );
        tel.text.setPrefWidth ( 400 );

        FlowPane btn_pane = new FlowPane ( );
        btn_pane.getChildren ( ).addAll ( new Button("Salvar"), new Button ( "Pesquisar" ));

        pane.getChildren ( ).addAll ( id.pane, name.pane, tel.pane, btn_pane );

        stage.setScene ( scene );
        stage.show ( );
    }
}