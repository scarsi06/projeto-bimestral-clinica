import java.util.LinkedList;


public class FilaDeAtendimento {
    private LinkedList<Paciente> fila;


    public FilaDeAtendimento() {
        this.fila = new LinkedList<>();
    }


    public void adicionarPaciente(Paciente p) {
        fila.addLast(p);
        System.out.println("Paciente adicionado à fila: " + p.exibirInfo());
    }


    public Paciente atenderPaciente() {
        if (fila.isEmpty()) {
            return null;
        }
        return fila.removeFirst();
    }


    public boolean estaVazia() {
        return fila.isEmpty();
    }


    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.println("--- Fila de Atendimento ---");
        for (Paciente p : fila) {
            System.out.println(p.exibirInfo());
        }
        System.out.println("---------------------------");
    }
}