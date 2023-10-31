package FakeDB;

import dominio.NotaTrabalho;

public class NotaTrabalhoFakeDB extends BaseFakeDB<NotaTrabalho> {
    AlunoFakeDB A = new AlunoFakeDB();
    TrabalhoFakeDB T = new TrabalhoFakeDB();
    @Override
    public void CarregarDados() {
        this.tabela.add(new NotaTrabalho(1, A.tabela.get(0), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(2, A.tabela.get(1), T.tabela.get(0), 7.5));
        this.tabela.add(new NotaTrabalho(3, A.tabela.get(2), T.tabela.get(0), 8));
        this.tabela.add(new NotaTrabalho(4, A.tabela.get(3), T.tabela.get(0), 5.5));
        this.tabela.add(new NotaTrabalho(5, A.tabela.get(4), T.tabela.get(0), 6));
        this.tabela.add(new NotaTrabalho(6, A.tabela.get(5), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(7, A.tabela.get(6), T.tabela.get(1), 4));
        this.tabela.add(new NotaTrabalho(8, A.tabela.get(7), T.tabela.get(1), 8));
        this.tabela.add(new NotaTrabalho(9, A.tabela.get(8), T.tabela.get(1), 9.5));
        this.tabela.add(new NotaTrabalho(10, A.tabela.get(9), T.tabela.get(1), 3));
        this.tabela.add(new NotaTrabalho(11, A.tabela.get(10), T.tabela.get(1), 7.5));
        this.tabela.add(new NotaTrabalho(12, A.tabela.get(11), T.tabela.get(1), 10));
        this.tabela.add(new NotaTrabalho(13, A.tabela.get(0), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(14, A.tabela.get(1), T.tabela.get(0), 7.5));
        this.tabela.add(new NotaTrabalho(15, A.tabela.get(2), T.tabela.get(0), 8));
        this.tabela.add(new NotaTrabalho(16, A.tabela.get(3), T.tabela.get(0), 5.5));
        this.tabela.add(new NotaTrabalho(17, A.tabela.get(4), T.tabela.get(0), 6));
        this.tabela.add(new NotaTrabalho(18, A.tabela.get(5), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(19, A.tabela.get(6), T.tabela.get(1), 4));
        this.tabela.add(new NotaTrabalho(20, A.tabela.get(7), T.tabela.get(1), 8));
        this.tabela.add(new NotaTrabalho(21, A.tabela.get(8), T.tabela.get(1), 9.5));
        this.tabela.add(new NotaTrabalho(22, A.tabela.get(9), T.tabela.get(1), 3));
        this.tabela.add(new NotaTrabalho(23, A.tabela.get(10), T.tabela.get(1), 7.5));
        this.tabela.add(new NotaTrabalho(24, A.tabela.get(11), T.tabela.get(1), 10));
        this.tabela.add(new NotaTrabalho(25, A.tabela.get(0), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(26, A.tabela.get(1), T.tabela.get(0), 7.5));
        this.tabela.add(new NotaTrabalho(27, A.tabela.get(2), T.tabela.get(0), 8));
        this.tabela.add(new NotaTrabalho(28, A.tabela.get(3), T.tabela.get(0), 5.5));
        this.tabela.add(new NotaTrabalho(29, A.tabela.get(4), T.tabela.get(0), 6));
        this.tabela.add(new NotaTrabalho(30, A.tabela.get(5), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(31, A.tabela.get(6), T.tabela.get(1), 4));
        this.tabela.add(new NotaTrabalho(32, A.tabela.get(7), T.tabela.get(1), 8));
        this.tabela.add(new NotaTrabalho(33, A.tabela.get(8), T.tabela.get(1), 9.5));
        this.tabela.add(new NotaTrabalho(34, A.tabela.get(9), T.tabela.get(1), 3));
        this.tabela.add(new NotaTrabalho(35, A.tabela.get(10), T.tabela.get(1), 7.5));
        this.tabela.add(new NotaTrabalho(36, A.tabela.get(11), T.tabela.get(1), 10));
        this.tabela.add(new NotaTrabalho(37, A.tabela.get(0), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(38, A.tabela.get(1), T.tabela.get(0), 7.5));
        this.tabela.add(new NotaTrabalho(39, A.tabela.get(2), T.tabela.get(0), 8));
        this.tabela.add(new NotaTrabalho(40, A.tabela.get(3), T.tabela.get(0), 5.5));
        this.tabela.add(new NotaTrabalho(41, A.tabela.get(4), T.tabela.get(0), 6));
        this.tabela.add(new NotaTrabalho(42, A.tabela.get(5), T.tabela.get(0), 10));
        this.tabela.add(new NotaTrabalho(43, A.tabela.get(6), T.tabela.get(1), 4));
        this.tabela.add(new NotaTrabalho(44, A.tabela.get(7), T.tabela.get(1), 8));
        this.tabela.add(new NotaTrabalho(45, A.tabela.get(8), T.tabela.get(1), 9.5));
        this.tabela.add(new NotaTrabalho(46, A.tabela.get(9), T.tabela.get(1), 3));
        this.tabela.add(new NotaTrabalho(47, A.tabela.get(10), T.tabela.get(1), 7.5));
        this.tabela.add(new NotaTrabalho(48, A.tabela.get(11), T.tabela.get(1), 10));


    }

}
