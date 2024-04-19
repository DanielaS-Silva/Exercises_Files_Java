import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\Daniela\\Documentos\\Exercises_Files_Java\\arquivo_txt\\exerc06\\dados.csv";

        try {
            BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));

            String linha;
            while ((linha = in.readLine()) != null) {
               
                String[] campos = linha.split(",");
                
               
                for (String campo : campos) {
                    System.out.print(campo + "\t");
                }
                System.out.println();
            }

            in.close();

        } catch (IOException e) {  
        }
    }
}
