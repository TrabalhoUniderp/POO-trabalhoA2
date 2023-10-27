package dominio;

import java.util.Date;

public class Professor extends BasePessoa {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Professor(String nome, Date dataNascimento, String nomeUsuario, String senha, String cargo) {
        super(nome, dataNascimento, nomeUsuario, senha);
        this.cargo = cargo;
    }

    
    
}
