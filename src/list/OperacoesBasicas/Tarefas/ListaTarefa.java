package list.OperacoesBasicas.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Adiciona uma nova tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Remove uma tarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    // Retorna o número de tarefas
    public int obterNumeroDeTarefas() {
        return tarefaList.size();
    }

    // Imprime a descrição da tarefa
    public void obterDescricaoDeTarefas() {
        System.out.println(tarefaList);
    }
}
