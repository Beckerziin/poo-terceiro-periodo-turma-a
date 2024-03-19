package KAUA_MATHEUS.primeiro_bimestre;

import java.io.*;

/**
 * Barquivo
 */
public class Barquivo {

    public static void lerTexto(String pCaminhoArquivo){

        int contador_linha = 0;

        try(

            BufferedReader buffReader = new BufferedReader(new FileReader(pCaminhoArquivo))
        ){
                String linha = "";

                while(true){
                    if(linha != null){
                        System.out.println(linha);
                        contador_linha += 1;
                    }else{
                        break;
                    }
                    linha = buffReader.readLine();
                }
                if(contador_linha > 0){
                    System.out.println(contador_linha - 1);
                }
                else{
                    System.out.println(0);
                }
                
            }catch (IOException e){
                e.printStackTrace();
            }

    }

    public static void criaArquivos(String pCaminhoArquivo, String pTextoAEscrever){
        try(

            FileWriter criadorDeArquivos = new FileWriter(pCaminhoArquivo, true);
            BufferedWriter buffer = new BufferedWriter(criadorDeArquivos);
            PrintWriter escritorDeArquivos = new PrintWriter(buffer);
        
        ){
            escritorDeArquivos.append(pTextoAEscrever);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void apagaArquivo(String pCaminhoArquivo){

        File file = new File(pCaminhoArquivo);

        if(file.delete()){
            System.out.format("\u001B[31mO arquivo foi apagado com sucesso! \u001B[m");   
        }

        else{
            System.out.println("\u001B[31mErro ao tentar apagar arquivo! \u001B[m");
        }
    }

}


