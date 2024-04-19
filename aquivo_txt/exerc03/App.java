import java.io.*;

public class App {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo.txt";

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivo, true));
            out.write("Isso é uma adição!");
            out.close();
            System.out.println("Mensagem adicionada com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao adicionar mensagem ao arquivo: "));
        }
    }
