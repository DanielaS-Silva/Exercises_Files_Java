import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        String nomeArquivoEntrada = "C:\\Users\\Daniela\\Exercises_Files_java\\aquivo_txt\\exerc07\\meuarquivo.txt";
        String nomeArquivoSaida = "C:\\Users\\Daniela\\Exercises_Files_java\\aquivo_txt\\exerc07\\meuarquivo_ordenado.txt";

        try {

            BufferedReader in = new BufferedReader(new FileReader(nomeArquivoEntrada));

            ArrayList<String> linhas = new ArrayList<>();
            String linha;
            while ((linha = in.readLine()) != null) {
                linhas.add(linha);
            }
            in.close();

            Collections.sort(linhas);

            BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivoSaida));

            for (String linhaOrdenada : linhas) {
                out.write(linhaOrdenada);
                out.newLine(); 
            }
            out.close();

            System.out.println("Linhas ordenadas e salvas em " + nomeArquivoSaida);

        } catch (IOException e) {
          
        }
    }
}
