package Pessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GerenciadorMensagens {
  public static void mensagemBoasVindas(){
      System.out.println("Seja bem-vinda ou bem-vindo.");
  }

  public static void mensagemFimPrograma() throws IOException {
      BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Tecle enter para sair do programa...");
      teclado.readLine();
  }

  public static void mensagemErroValidacao(String campo) {
      System.out.println("Você não forneceu um " + campo + " válido");
  }

  public static void mensagemSolicitacaoDado(String dado){
      System.out.println("Qual é o seu " + dado + " ?");
  }
}