import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio11 extends Application {

    public static void main ( String args[] ) {
        launch ( );
    }

    @Override
    public void start ( Stage stage ) throws Exception {

        VBox vbox = new VBox ( );

        HBox hbox = new HBox ( );
        TextField input = new TextField ( );
        input.setPrefSize ( 150, 50 );
        input.setEditable ( false );

        Button btn = new Button ( "CE" );
        btn.setPrefSize ( 50, 50 );
        btn.setOnAction ( event -> input.clear ( ));

        hbox.getChildren ( ).addAll ( input, btn );

        GridPane grid = new GridPane ( );

        char values[][] = new char[][] {
                {'1', '2', '3', '+'},
                {'4', '5', '6', '-'},
                {'7', '8', '9', '*'},
                {'.', '0', '=', '/'}
        };

        for ( int y = 0; y < 4; y++ ) {
            Button line[] = new Button[4];
            for (int x = 0; x < 4; x++) {

                String value = Character.toString(values[y][x]);
                btn = new Button ( value );
                btn.setPrefSize (50, 50);
                line[x] = btn;

                btn.setOnAction ( event -> input.appendText ( value ));
            }
            grid.addRow(y, line[0], line[1], line[2], line[3]);
        }
        vbox.getChildren ( ).addAll ( hbox, grid );

        Scene scene = new Scene ( vbox );

        stage.setScene ( scene );
        stage.show ( );
    }
}
