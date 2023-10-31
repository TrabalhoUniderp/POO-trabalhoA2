package dominio;

public class Turma extends BaseIdentificador {

    private Disciplina disciplina;
    private Professor professor;
    private int capacidadeTurma;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }

    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }

    public Turma(int codigo, Disciplina disciplina, Professor professor, int capacidadeTurma) {
        super(codigo);
        this.disciplina = disciplina;
        this.professor = professor;
        this.capacidadeTurma = capacidadeTurma;
    }

    @Override
    public void Imprimir() {
        System.out.println(this.codigo);
        System.out.println(this.disciplina);
        System.out.println(this.professor);
        System.out.println(this.capacidadeTurma);
    }

}
