package FakeDB;

import dominio.RendEscolar;

public class RendEscolarFakeDB extends BaseFakeDB<Rend> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new RendEscolar(1, null, null, 8, 10, null, 0, 0));
        this.tabela.add(new RendEscolar(2, null, null, 7, 6, null, 0, 0));
        this.tabela.add(new RendEscolar(3, null, null, 4.5, 9, null, 0, 0));
        this.tabela.add(new RendEscolar(4, null, null, 9.5, 10, null, 0, 0));
        this.tabela.add(new RendEscolar(5, null, null, 6.5, 8, null, 0, 0));
        this.tabela.add(new RendEscolar(6, null, null, 5.5, 10, null, 0, 0));
        this.tabela.add(new RendEscolar(7, null, null, 9.5, 7, null, 0, 0));
        this.tabela.add(new RendEscolar(8, null, null, 10, 8, null, 0, 0));
        this.tabela.add(new RendEscolar(9, null, null, 7.5, 4.5, null, 0, 0));
        this.tabela.add(new RendEscolar(10, null, null, 8.5, 10, null, 0, 0));
        this.tabela.add(new RendEscolar(11, null, null, 10, 9, null, 0, 0));
        this.tabela.add(new RendEscolar(12, null, null, 3.5, 7, null, 0, 0));

    }

    public RendEscolarFakeDB() {
        super();
    }

}
