package FakeDB;

import dominio.Trabalho;

public class TrabalhoFakeDB extends BaseFakeDB<Trabalho> {

    DisciplinaFakeDB D = new DisciplinaFakeDB();
    @Override
    public void CarregarDados() {

        this.tabela.add(new Trabalho(1, D.tabela.get(0), "trabalho 1"));
        this.tabela.add(new Trabalho(2, D.tabela.get(0), "trabalho 2"));
        this.tabela.add(new Trabalho(3,D.tabela.get(1), "trabalho 3"));
        this.tabela.add(new Trabalho(4, D.tabela.get(1), "trabalho 4"));

    }

}
