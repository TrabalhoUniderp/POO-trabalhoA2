package FakeDB;

import dominio.RendEscolar;

public class RendEscolarFakeDB extends BaseFakeDB<RendEscolar> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));
        this.tabela.add(new RendEscolar(0, null, null, 0, 0, null, null, null, null, 0, 0));

    }

    public RendEscolarFakeDB() {
        super();
    }

}
