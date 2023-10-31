package FakeDB;

import dominio.Trabalho;

public class TrabalhoFakeDB extends BaseFakeDB<Trabalho> {

    @Override
    public void CarregarDados() {

        this.tabela.add(new Trabalho(1, null, null));
        this.tabela.add(new Trabalho(2, null, null));
        this.tabela.add(new Trabalho(3, null, null));
        this.tabela.add(new Trabalho(4, null, null));

    }

}
