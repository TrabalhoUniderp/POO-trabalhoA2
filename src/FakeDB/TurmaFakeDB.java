package FakeDB;

import java.util.ArrayList;
import dominio.Turma;
import dominio.Professor;
import dominio.Disciplina;

public class TurmaFakeDB extends BaseFakeDB<Turma> {

    @Override
    protected void CarregarDados() {

        Disciplina ciencias = new Disciplina(0, "ciencias", null);
        Disciplina matematica = new Disciplina(0, "matematica", null);
        Professor Luiz = new Professor(0, "Luiz", null, null, null, null);
        Professor Alan = new Professor(0, "Alan", null, null, null, null);

        this.tabela.add(new Turma(1, matematica, Luiz, 4));
        this.tabela.add(new Turma(2, ciencias, Alan, 4));
        this.tabela.add(new Turma(3, matematica, Luiz, 4));
    }

    public TurmaFakeDB() {
        super();
    }

}
