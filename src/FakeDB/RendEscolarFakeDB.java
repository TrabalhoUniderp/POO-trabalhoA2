package FakeDB;

import dominio.RendEscolar;

public class RendEscolarFakeDB extends BaseFakeDB<RendEscolar> {
    AlunoFakeDB A = new AlunoFakeDB();
    TurmaFakeDB T = new TurmaFakeDB();
    NotaTrabalhoFakeDB N = new NotaTrabalhoFakeDB();
    @Override
    protected void CarregarDados() {
        this.tabela.add(new RendEscolar(1, A.tabela.get(0), T.tabela.get(0), 10, 7, N.tabela.get(0), N.tabela.get(12), N.tabela.get(24), N.tabela.get(36), 10, 9.25));
        this.tabela.add(new RendEscolar(2, A.tabela.get(1), T.tabela.get(0), 8, 3, N.tabela.get(1), N.tabela.get(13), N.tabela.get(25), N.tabela.get(37), 7.5, 6.5));
        this.tabela.add(new RendEscolar(3, A.tabela.get(2), T.tabela.get(0), 7, 7, N.tabela.get(2), N.tabela.get(14), N.tabela.get(26), N.tabela.get(38), 8, 7.5));
        this.tabela.add(new RendEscolar(4, A.tabela.get(3), T.tabela.get(0), 6, 5, N.tabela.get(3), N.tabela.get(15), N.tabela.get(27), N.tabela.get(39), 5.5, 5.5));
        this.tabela.add(new RendEscolar(5, A.tabela.get(4), T.tabela.get(1), 8, 5, N.tabela.get(4), N.tabela.get(16), N.tabela.get(28), N.tabela.get(40), 6, 6.25));
        this.tabela.add(new RendEscolar(6, A.tabela.get(5), T.tabela.get(1), 6, 6, N.tabela.get(5), N.tabela.get(17), N.tabela.get(29), N.tabela.get(41), 10, 8));
        this.tabela.add(new RendEscolar(7, A.tabela.get(6), T.tabela.get(1), 8, 8, N.tabela.get(6), N.tabela.get(18), N.tabela.get(30), N.tabela.get(42), 4, 6));
        this.tabela.add(new RendEscolar(8, A.tabela.get(7), T.tabela.get(1), 9, 10, N.tabela.get(7), N.tabela.get(19), N.tabela.get(31), N.tabela.get(43), 8, 8.75));
        this.tabela.add(new RendEscolar(9, A.tabela.get(8), T.tabela.get(2), 6, 3, N.tabela.get(8), N.tabela.get(20), N.tabela.get(32), N.tabela.get(44), 9.5, 7));
        this.tabela.add(new RendEscolar(10, A.tabela.get(9), T.tabela.get(2), 2, 0, N.tabela.get(9), N.tabela.get(21), N.tabela.get(33), N.tabela.get(45), 3, 2));
        this.tabela.add(new RendEscolar(11, A.tabela.get(10), T.tabela.get(2), 3, 1, N.tabela.get(10), N.tabela.get(22), N.tabela.get(34), N.tabela.get(46), 7.5, 4.75));
        this.tabela.add(new RendEscolar(12, A.tabela.get(11), T.tabela.get(2), 10, 10, N.tabela.get(11), N.tabela.get(23), N.tabela.get(35), N.tabela.get(47), 10, 10));
    }

    public RendEscolarFakeDB() {
        super();
    }

}
