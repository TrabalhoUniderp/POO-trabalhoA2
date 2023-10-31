package dominio;

public class Disciplina extends BaseDadosComuns {

    private String ementa;

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Disciplina(int codigo, String nome, String ementa) {
        super(codigo, nome);
        this.ementa = ementa;
    }

    @Override
    public void Imprimir() {
        System.out.println(this.codigo);
        System.out.println(this.nome);
        System.out.println(this.ementa);
    }

}
