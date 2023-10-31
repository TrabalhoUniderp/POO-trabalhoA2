package FakeDB;

import dominio.Disciplina;

public class DisciplinaFakeDB extends BaseFakeDB<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Disciplina(1, "matematica", "calculos"));
        this.tabela.add(new Disciplina(2, "ciencias", "natureza"));
        this.tabela.add(new Disciplina(3, "fisica", "fenomenos"));
    }

    public DisciplinaFakeDB() {
        super();
    }

}
