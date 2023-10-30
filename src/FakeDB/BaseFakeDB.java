package FakeDB;

import java.util.ArrayList;

public abstract class BaseFakeDB<Tlista> {

    protected ArrayList<Tlista> tabela;

    public ArrayList<Tlista> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Tlista>();
        }
        return this.tabela;
    }

    protected abstract void CarregarDados();

    public BaseFakeDB() {
        this.tabela = new ArrayList<Tlista>();
        this.CarregarDados();
    }

}
