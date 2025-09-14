import java.util.Stack;


public class PilhaHistoricoAtendimentos {
    private Stack<Paciente> historico;


    public PilhaHistoricoAtendimentos() {
        this.historico = new Stack<>();
    }


    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }


    public Paciente verUltimoAtendido() {
        if (historico.isEmpty()) {
            return null;
        }
        return historico.peek();
    }


    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum atendimento no histórico.");
            return;
        }
        System.out.println("--- Histórico de Atendimentos (do mais recente ao mais antigo) ---");
        for (int i = historico.size() - 1; i >= 0; i--) {
            Paciente p = historico.get(i);
            System.out.println(p.exibirInfo());
        }
        System.out.println("----------------------------------------------------------------");
    }
}