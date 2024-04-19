import java.io.*;

public class App {
    public static void main(String[] args) {
        String nomeArquivoEntrada = "C:\\Users\\danie\\OneDrive\\Área de Trabalho\\PROJ.JAVA\\meuarquivo.txt";
        String nomeArquivoSaida = "C:\\Users\\danie\\OneDrive\\Área de Trabalho\\PROJ.JAVA\\meuarquivo_sem_excluir.txt";

        try {
            BufferedReader in = new BufferedReader(new FileReader(nomeArquivoEntrada));
            BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivoSaida));

            String linha;
            while ((linha = in.readLine()) != null) {

                if (!linha.contains("excluir")) {
                    out.write(linha);
                    out.newLine(); 
                }
            }

            in.close();
            out.close();

            System.out.println("Linhas sem a palavra 'excluir' foram salvas em " + nomeArquivoSaida);

        } catch (IOException e) {
           
        }
    }
}
