import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlunoBoundary extends Application {

    private Label label_id = new Label ( "ID" );
    private Label label_ra = new Label ( "RA" );
    private Label label_nome = new Label ( "Nome" );
    private Label label_nascimento = new Label ( "Nascimento" );

    private TextField text_id = new TextField ( );
    private TextField text_ra = new TextField ( );
    private TextField text_nome = new TextField ( );
    private TextField text_nascimento = new TextField ( );

    private Button adicionar = new Button ( "Adicionar" );
    private Button pesquisar = new Button ( "Pesquisar" );

    private AlunoControl control = new AlunoControl ( );

    public static void main ( String args[] ) {

        launch ( args );
    }

    @Override
    public void start ( Stage stage ) throws Exception {

        Pane pane = new Pane( );
        Scene scene = new Scene ( pane );

        Control nodes[] = new Control[] {
            label_id, text_id,
            label_ra, text_ra,
            label_nome, text_nome,
            label_nascimento, text_nascimento
        };

        Bindings.bindBidirectional ( text_id.textProperty ( ), control.idProperty ( ));
        Bindings.bindBidirectional ( text_ra.textProperty ( ), control.raProperty ( ));
        Bindings.bindBidirectional ( text_nome.textProperty ( ), control.nomeProperty ( ));
        Bindings.bindBidirectional ( text_nascimento.textProperty ( ), control.nascimentoProperty ( ));

        {
            int i = 0;
            boolean is_text = false;

            for ( Control node : nodes ) {

                if ( is_text ) {

                    node.setPrefSize ( 180, 30 );
                    node.relocate ( 80, i );

                    i += 30;

                } else {

                    node.setPrefSize ( 80, 30 );
                    node.relocate ( 0, i );

                }

                pane.getChildren ( ).add ( node );
                is_text = !is_text;
            }

            adicionar.setOnAction ( e -> control.adicionar ( ));
            pesquisar.setOnAction ( e -> control.pesquisarPorAluno ( ));

            adicionar.relocate ( 00, i );
            pesquisar.relocate ( 80, i );
            pane.getChildren ( ).addAll ( adicionar, pesquisar );
        }

        stage.setScene ( scene );
        stage.show ( );
    }
}
