import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\danie\\OneDrive\\PROJ.JAVA\\meuarquivo.txt";

        try {
         
            BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));

            int numLinhas = 0;
            String linha;

            while ((linha = in.readLine()) != null) {
                numLinhas++;
            }

            in.close();

            System.out.println("O arquivo '" + nomeArquivo + "' possui " + numLinhas + " linhas.");

        } catch (IOException e) {
            System.err.println("Erro ao contar as linhas do arquivo: ");
        }
    }
}
