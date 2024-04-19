import java.io.*;

public class App {
    public static void main(String[] args) {
        String arquivoOrigem = "arquivo_grande.bin";
        String arquivoDestino = "copia_arquivo_grande.bin";

        try (InputStream in = new FileInputStream(C:\\Users\\danie\\OneDrive\\PROJ.JAVA\\arquivoOrigem);
             OutputStream out = new FileOutputStream(C:\\Users\\danie\\OneDrive\\PROJ.JAVA\\arquivoDestino)) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
