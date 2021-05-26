package poo.propriedades;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class PetControl {
    private List<Pet> lista = new ArrayList<>();


    private StringProperty nome = new SimpleStringProperty("");
    public StringProperty nomeProperty()
    {
        return nome;
    }

    private StringProperty raca = new SimpleStringProperty("");
    public StringProperty racaProperty() {

        return raca;
    }

    public Pet getEntity(){
        Pet p = new Pet();
        p.setNome(nome.get());
        p.setRaca((raca.get()));
        return p;
    }
    public void adicionar(){
        lista.add(getEntity());
    }
    public void pesquisarPorNome (){
        for (Pet p : lista){
            if (p.getNome().contains(nome.get())){
                setEntity(p);
            }
        }
    }
    private void setEntity (Pet p){
        if (p != null){
            nome.set(p.getNome());
            raca.set(p.getRaca());
        }
        raca.set(p.getRaca());
    }


}
