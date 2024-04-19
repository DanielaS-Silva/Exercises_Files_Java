mport java.io.*;

class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}

public class App {
    public static void main(String[] args) {
        try (ObjectInputStream objetoEntrada = new ObjectInputStream(new FileInputStream("C:\\Users\\Daniela\\Documentos\\ArquivoJava\\arquivotexto\\exerc12\\meuarquivo.bin")) {
            Pessoa pessoa = (Pessoa) objetoEntrada.readObject();
            System.out.println("Detalhes da Pessoa:");
            System.out.println(pessoa);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
