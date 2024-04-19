import java.io.*;

public class App {
    public static void main(String[] args) {
        String nomeArqEntrada = "C:\\Users\\danie\\OneDrive\\PROJ.JAVA\\meuarquivo.txt";
        String nomeArqSaida = "meuarquivo_python.txt";

        try {
            
            BufferedReader in = new BufferedReader(new FileReader(nomeArqEntrada));

           
            BufferedWriter out = new BufferedWriter(new FileWriter(nomeArqSaida));

            String linha;

            
            while ((linha = in.readLine()) != null) {
                
                linha = linha.replaceAll("Java", "Python");
                out.write(linha);
                out.newLine(); 
            }

            
            in.close();
            out.close();

            System.out.println("Substituição concluída. O arquivo foi salvo como " + nomeArquivoSaida);

        } catch (IOException e) {
           
        }
    }
}
