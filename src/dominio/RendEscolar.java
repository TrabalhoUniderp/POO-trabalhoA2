package dominio;

public class RendEscolar extends BaseIdentificador {

    private Aluno aluno;
    private Turma turma;
    private double notaProva1;
    private double notaProva2;
    private NotaTrabalho trabalhos;
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

    public NotaTrabalho getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(NotaTrabalho trabalhos) {
        this.trabalhos = trabalhos;
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
        this.trabalhos = trabalhos;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediageralAluno = mediageralAluno;
    }

}
