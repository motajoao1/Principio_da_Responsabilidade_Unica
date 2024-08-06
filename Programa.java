package Pessoa;

import java.io.IOException;

public class Programa {

  public static void main(String[] args) throws IOException {

    GerenciadorMensagens.mensagemBoasVindas();

    // Obtém dados da pessoa
    Pessoa usuario = CapturadorDadosPessoa.obterDados();

    // Verifica se os nomes são válidos
    if (ValidadorPessoa.validar(usuario) == false) {
      GerenciadorMensagens.mensagemFimPrograma();
      return;
    }

    // Cria um id para o usuário
    CriadorConta.criar(usuario);
    
    GerenciadorMensagens.mensagemFimPrograma();

  }

}