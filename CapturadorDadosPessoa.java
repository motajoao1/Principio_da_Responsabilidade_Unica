package Pessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapturadorDadosPessoa {
  public static Pessoa obterDados() throws IOException {
    Pessoa pessoa = new Pessoa();

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    GerenciadorMensagens.mensagemSolicitacaoDado("primeiro nome");
    pessoa.setPrimeiroNome(teclado.readLine());

    GerenciadorMensagens.mensagemSolicitacaoDado("último nome");
    pessoa.setUltimoNome(teclado.readLine());

    return pessoa;

  }
}