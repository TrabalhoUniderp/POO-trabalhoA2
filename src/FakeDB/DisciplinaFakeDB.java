package FakeDB;

import dominio.Disciplina;

public class DisciplinaFakeDB extends BaseFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Disciplina(1, mateamtica, calculos));
        this.tabela.add(new Disciplina(2, ciencias, natureza));

    }

    public DisciplinaFakeDB() {
        super();
    }

}
