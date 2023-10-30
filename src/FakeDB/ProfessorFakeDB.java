package FakeDB;

import java.time.LocalDate;

import java.util.ArrayList;

import dominio.Professor;

public class ProfessorFakeDB extends BaseFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Professor(1, "Luiz", LocalDate.of(1960, 12, 31), "Luiz", "luiz", "professor"));
        this.tabela.add(new Professor(1, "Alan", LocalDate.of(1963, 7, 17), "Alan", "alan", "professor"));

    }

    public ProfessorFakeDB() {
        super();
    }

}
