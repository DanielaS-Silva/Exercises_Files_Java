package br.danielaprojetojava;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo.txt";

        try {

            BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivo));
            
            out.write("Olá, mundo!");
            
            out.close();
            
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
