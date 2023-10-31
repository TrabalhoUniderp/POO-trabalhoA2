package FakeDB;

import java.time.LocalDate;

import dominio.Professor;

public class ProfessorFakeDB extends BaseFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Professor(1, "Luiz", LocalDate.of(1960, 12, 31), "Luiz", "luiz123", "professor"));
        this.tabela.add(new Professor(1, "Alan", LocalDate.of(1963, 7, 17), "AlanSantos", "alan123", "professor"));

    }

    public ProfessorFakeDB() {
        super();
    }

}
