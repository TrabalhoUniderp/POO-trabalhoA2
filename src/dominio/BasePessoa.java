package dominio;

import java.util.Date;

public abstract class BasePessoa extends BaseDadosComuns {

    protected java.util.Date dataNascimento;
    protected String nomeUsuario;
    protected String senha;

    public java.util.Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BasePessoa(String nome, Date dataNascimento, String nomeUsuario, String senha) {
        super(nome);
        this.dataNascimento = dataNascimento;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

}
