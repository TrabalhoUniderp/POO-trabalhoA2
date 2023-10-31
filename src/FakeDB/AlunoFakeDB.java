package FakeDB;

import dominio.Aluno;

import java.time.LocalDate;

public class AlunoFakeDB extends BaseFakeDB<Aluno> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Aluno(1, "Pedro", LocalDate.of(1996, 2, 20), "pedro", "pedrinho123", 5));
        this.tabela.add(new Aluno(2, "Joao", LocalDate.of(1998, 11, 14), "joao", "joaozinho123", 5));
        this.tabela.add(new Aluno(3, "Jose", LocalDate.of(1995, 5, 26), "jose", "jose123", 5));
        this.tabela.add(new Aluno(4, "Carlos", LocalDate.of(1996, 6, 2), "Carlos", "carlos123", 5));
        this.tabela.add(new Aluno(5, "Eduardo", LocalDate.of(1998, 8, 12), "eduardo", "eduardo123", 5));
        this.tabela.add(new Aluno(6, "Guilhemer", LocalDate.of(1997, 4, 23), "guilhemer", "guilhemer123", 5));
        this.tabela.add(new Aluno(7, "Vitor", LocalDate.of(1994, 12, 7), "vitor", "vitor123", 5));
        this.tabela.add(new Aluno(8, "Thiago", LocalDate.of(1996, 4, 9), "thiago", "thiago123", 5));
        this.tabela.add(new Aluno(9, "Ana", LocalDate.of(1995, 3, 12), "ana", "ana123", 5));
        this.tabela.add(new Aluno(10, "Mariana", LocalDate.of(1998, 9, 17), "mariana", "mariana123", 5));
        this.tabela.add(new Aluno(11, "Julia", LocalDate.of(1997, 10, 10), "julia", "julia123", 5));
        this.tabela.add(new Aluno(12, "Valesca", LocalDate.of(1996, 11, 22), "valesca", "valesca123", 5));

    }

    public AlunoFakeDB() {
        super();
    }

}