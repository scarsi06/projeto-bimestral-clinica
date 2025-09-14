import java.util.Scanner;

public class GerenciadorClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos();


        boolean rodando = true;


        while (rodando) {

System.out.println();
System.out.println("===================================================");
System.out.println("1. Adicionar novo paciente à fila");
System.out.println("2. Atender próximo paciente");
System.out.println("3. Exibir fila de atendimento");
System.out.println("4. Exibir histórico de atendimentos");
System.out.println("5. Sair");
System.out.println("===================================================");
System.out.print("Escolha uma opção: ");

while (!scanner.hasNextInt()) {
        System.out.println("Entrada inválida. Digite um número inteiro correspondente à opção do menu.");
System.out.print("Escolha uma opção: ");
scanner.next(); // descarta entrada inválida
}
int opcao = scanner.nextInt();
scanner.nextLine(); // consome o newline


if (opcao == 1) {
        System.out.print("Nome do paciente: ");
String nome = scanner.nextLine().trim();
while (nome.isEmpty()) {
        System.out.println("Nome não pode ficar vazio. Digite novamente.");
System.out.print("Nome do paciente: ");
nome = scanner.nextLine().trim();
}


        System.out.print("Idade do paciente: ");
while (!scanner.hasNextInt()) {
        System.out.println("Entrada inválida. Digite uma idade inteira.");
System.out.print("Idade do paciente: ");
scanner.next();
}
int idade = scanner.nextInt();
scanner.nextLine();


System.out.print("Sintoma do paciente: ");
String sintoma = scanner.nextLine().trim();
while (sintoma.isEmpty()) {
        System.out.println("Sintoma não pode ficar vazio. Digite novamente.");
System.out.print("Sintoma do paciente: ");
sintoma = scanner.nextLine().trim();
}


Paciente novo = new Paciente(nome, idade, sintoma);
fila.adicionarPaciente(novo);


} else if (opcao == 2) {
        if (fila.estaVazia()) {
        System.out.println("Não há pacientes na fila para atender.");
} else {
Paciente atendido = fila.atenderPaciente();
if (atendido != null) {
        System.out.println("Paciente atendido: " + atendido.exibirInfo());
        historico.adicionarAoHistorico(atendido);
} else {
        System.out.println("Erro ao tentar atender paciente.");
}
        }


        } else if (opcao == 3) {
        fila.mostrarFila();


} else if (opcao == 4) {
        historico.mostrarHistorico();


} else if (opcao == 5) {
        System.out.println("Saindo...");
rodando = false;


        } else {
        System.out.println("Opção desconhecida. Por favor escolha uma opção válida (1-5).");
}
        }


        scanner.close();
}
        }