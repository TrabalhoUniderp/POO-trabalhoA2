public abstract class BaseFakeDB<Tlista> {

    private ArrayList<Tlista> tabela;

    public ArrayList<Tlista> getTabela() {
        if (this.tabela == tabela){
            this.tabela = new ArrayList
        }
        return this.tabela;
    }

    protected abstract void CarregarDados();

    public BaseFakeDB() {
        this.tabela = new ArrayList<Tlista>();
        this.CarregarDados();
    }

}
