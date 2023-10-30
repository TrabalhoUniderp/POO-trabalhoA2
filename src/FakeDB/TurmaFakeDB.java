package FakeDB;

import dominio.Turma;

public class TurmaFakeDB extends BaseFakeDB<Turma> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Turma(1, matematica, Luiz, 4));
        this.tabela.add(new Turma(2, ciencias, Alan, 4));
        this.tabela.add(new Turma(3, matematica, Luiz, 4));
    }

    public TurmaFakeDB() {
        super();
    }

}
