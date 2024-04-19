import java.io.*;

public class App{
    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\Daniela\\Documentos\\Exercises_Files_Java\\arquivo_binario\\exerc16\\dados.csvarquivo.bin";

        try (InputStream inputStream = new FileInputStream(nomeArquivo)) {
            byte[] buffer = new byte[100];
            int bytesRead = inputStream.read(buffer);

            if (bytesRead != -1) {
                System.out.println("Primeiros 100 bytes do arquivo:");
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
            } else {
                System.out.println("O arquivo está vazio.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
