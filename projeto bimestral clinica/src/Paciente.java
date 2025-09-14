public class Paciente {
    private static int contador = 0;


    private int id;
    private String nome;
    private int idade;
    private String sintoma;


    public Paciente(String nome, int idade, String sintoma) {
        this.id = ++contador;
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
    }


    // Getters
    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public String getSintoma() {
        return sintoma;
    }


    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }


    // Método exigido: exibirInfo() - não sobrescrever toString()
    public String exibirInfo() {
        return String.format("ID: %d | Nome: %s | Idade: %d | Sintoma: %s", id, nome, idade, sintoma);
    }
}