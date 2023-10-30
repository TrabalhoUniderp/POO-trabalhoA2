package FakeDB;

import java.time.LocalDate;

import dominio.Professor;

public class ProfessorFakeDB extends BaseFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Professor(1, Luiz, , LocalDate.of(1960, 12, 31), Luiz31, luiz123 ));
        this.tabela.add(new Professor(1, Alan, , LocalDate.of(1963, 7, 17), Alan7, alan123 ));
        
    }

    public ProfessorFakeDB() {
        super();
    }

}
