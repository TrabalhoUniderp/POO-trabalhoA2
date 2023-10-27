package dominio;

import java.util.Date;

public class Aluno extends BasePessoa {

    private int periodo;

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Aluno(String nome, Date dataNascimento, String nomeUsuario, String senha, int periodo) {
        super(nome, dataNascimento, nomeUsuario, senha);
        this.periodo = periodo;
    }

}
