package Repositorio;

import dominio.Disciplina;
import FakeDB.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseRepositorio<DisciplinaFakeDB, Disciplina> {

    public DisciplinaRepositorio() {
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Disciplina Create(Disciplina instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Disciplina Read(int codigo) {
        for (Disciplina diciplina : this.dataset) {
            if (diciplina.getCodigo() == codigo)
                return diciplina;
        }
        return null;
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        Disciplina alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setEmenta(instancia.getEmenta());
        return alvo;
    }

    @Override
    public Disciplina Delete(int codigo) {
        Disciplina alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
