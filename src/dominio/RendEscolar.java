package dominio;

public class RendEscolar extends BaseIdentificador {

    private Aluno aluno;
    private Turma turma;
    private double notaProva1;
    private double notaProva2;
    private NotaTrabalho trabalho1;
    private NotaTrabalho trabalho2;
    private NotaTrabalho trabalho3;
    private NotaTrabalho trabalho4;
    private double mediaTrabalhos;
    private double mediageralAluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

     public NotaTrabalho getTrabalho1() {
        return trabalho1;
    }

    public void setTrabalho1(NotaTrabalho trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public NotaTrabalho getTrabalho2() {
        return trabalho2;
    }

    public void setTrabalho2(NotaTrabalho trabalho2) {
        this.trabalho2 = trabalho2;
    }

    public NotaTrabalho getTrabalho3() {
        return trabalho3;
    }

    public void setTrabalho3(NotaTrabalho trabalho3) {
        this.trabalho3 = trabalho3;
    }

    public NotaTrabalho getTrabalho4() {
        return trabalho4;
    }

    public void setTrabalho4(NotaTrabalho trabalho4) {
        this.trabalho4 = trabalho4;
    }


    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public double getMediageralAluno() {
        return mediageralAluno;
    }

    public void setMediageralAluno(double mediageralAluno) {
        this.mediageralAluno = mediageralAluno;
    }

    public RendEscolar(int codigo, Aluno aluno, Turma turma, double notaProva1, double notaProva2,
            NotaTrabalho trabalhos, double mediaTrabalhos, double mediageralAluno) {
        super(codigo);
        this.aluno = aluno;
        this.turma = turma;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.trabalho1 = trabalho1;
        this.trabalho2 = trabalho2;
        this.trabalho3 = trabalho3;
        this.trabalho4 = trabalho4;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediageralAluno = mediageralAluno;
    }

    @Override
    public void Imprimir() {
        System.out.println(this.codigo);
        System.out.println(this.aluno);
        System.out.println(this.turma);
        System.out.println(this.notaProva1);
        System.out.println(this.notaProva2);
        System.out.println(this.trabalhos);
        System.out.println(this.mediaTrabalhos);
        System.out.println(this.mediageralAluno);

    }

}
