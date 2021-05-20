package poo.propriedades;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {

    private TextField txtRaca = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtPeso = new TextField();
    private PetControl control = new PetControl();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    @Override
    public void start (Stage stage) throws Exception{
        GridPane gp = new GridPane();
        Scene scn = new Scene(gp, 600, 400);

        gp.add(new Label("Nome"),0,0);
        gp.add(txtNome, 1,0);
        gp.add(new Label("Raca"),0,1);
        gp.add(txtRaca, 1,1);
        gp.add(new Label("Peso"),0,2);
        gp.add(txtPeso, 1,2);
        gp.add(btnAdicionar, 0,3);
        gp.add(btnPesquisar,1,3 );

        btnAdicionar.setOnAction((e)->{control.adicionar();});
        btnPesquisar.setOnAction((e)->{control.pesquisarPorNome();});

        Bindings.bindBidirectional(txtNome.textProperty(),control.nomeProperty());
        Bindings.bindBidirectional(txtRaca.textProperty(),control.racaProperty());

        stage.setScene(scn);
        stage.setTitle("Pets BCE Tradicional");
        stage.show();
    }

    public static void main(String[] args) {
    Application.launch(PetBoundary.class, args);
    }//end main
}// end class
