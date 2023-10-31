package FakeDB;

import dominio.NotaTrabalho;

public class NotaTrabalhoFakeDB extends BaseFakeDB<NotaTrabalho> {

    @Override
    public void CarregarDados() {
        this.tabela.add(new NotaTrabalho(1, null, null, 10));
        this.tabela.add(new NotaTrabalho(2, null, null, 7.5));
        this.tabela.add(new NotaTrabalho(3, null, null, 8));
        this.tabela.add(new NotaTrabalho(4, null, null, 5.5));
        this.tabela.add(new NotaTrabalho(5, null, null, 6));
        this.tabela.add(new NotaTrabalho(6, null, null, 10));
        this.tabela.add(new NotaTrabalho(7, null, null, 4));
        this.tabela.add(new NotaTrabalho(8, null, null, 8));
        this.tabela.add(new NotaTrabalho(9, null, null, 9.5));
        this.tabela.add(new NotaTrabalho(10, null, null, 3));
        this.tabela.add(new NotaTrabalho(11, null, null, 7.5));
        this.tabela.add(new NotaTrabalho(12, null, null, 10));

    }

}
