package FakeDB;

import dominio.Turma;
import dominio.Professor;

import java.time.LocalDate;

import dominio.Disciplina;

public class TurmaFakeDB extends BaseFakeDB<Turma> {

    @Override
    protected void CarregarDados() {

        Disciplina ciencias = new Disciplina(0, "ciencias", null);
        Disciplina matematica = new Disciplina(0, "matematica", null);
        Professor Luiz = new Professor(0, "Luiz", LocalDate.of(1994, 04, 05), "profLuiz", "senha321", "professor");
        Professor Alan = new Professor(0, "Alan", LocalDate.of(1993, 12, 31), "profAlan", "senha123", "professor");

        this.tabela.add(new Turma(1, matematica, ciencias, Luiz, Alan, 4));
        this.tabela.add(new Turma(1, matematica, ciencias, Luiz, Alan, 4));
        this.tabela.add(new Turma(1, matematica, ciencias, Luiz, Alan, 4));
    }

    public TurmaFakeDB() {
        super();
    }

}
