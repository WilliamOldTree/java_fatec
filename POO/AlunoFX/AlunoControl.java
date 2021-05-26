import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AlunoControl {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "dd/MM/yyyy" );

    private List<Aluno> alunos = new ArrayList<>( );

    private SimpleStringProperty id = new SimpleStringProperty ( );
    public SimpleStringProperty idProperty() { return id; }

    private SimpleStringProperty ra = new SimpleStringProperty ( );
    public SimpleStringProperty raProperty() { return ra; }

    private SimpleStringProperty nome = new SimpleStringProperty ( );
    public SimpleStringProperty nomeProperty() { return nome; }

    private SimpleStringProperty nascimento = new SimpleStringProperty ( );
    public SimpleStringProperty nascimentoProperty() { return nascimento; }

    public void adicionar ( ) { this.alunos.add ( this.getEntity ( )); }

    public void pesquisarPorAluno ( ) {

        String value = nome.get ( );
        for (Aluno aluno : this.alunos) {
            if (aluno.getNome ( ).contains ( value )) {
                this.setEntity ( aluno );
                break;
            }
        }
    }

    public void setEntity ( Aluno aluno ) {

        try {

            id.set ( String.valueOf ( aluno.getId ( )));
            ra.set ( aluno.getRa ( ));
            nome.set ( aluno.getNome ( ));
            nascimento.set ( aluno.getNascimento ( ).format ( formatter ));

        } catch ( Exception e ) { e.printStackTrace ( ); }
    }

    public Aluno getEntity ( ) {

        Aluno aluno = new Aluno ( );
        try {

            aluno.setId ( Long.parseLong ( id.get ( )));
            aluno.setRa ( ra.get ( ));
            aluno.setNome ( nome.get ( ));
            aluno.setNascimento ( LocalDate.parse ( nascimento.get ( ), formatter ));

        } catch ( Exception e ) { e.printStackTrace ( ); }

        id.set ( "" );
        ra.set ( "" );
        nome.set ( "" );
        nascimento.set ( "" );

        return aluno;
    }
}
