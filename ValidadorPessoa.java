package Pessoa;

public class ValidadorPessoa {
   public static boolean validar(Pessoa pessoa){
   
    if (pessoa.getPrimeiroNome().isEmpty()) {
      GerenciadorMensagens.mensagemErroValidacao("primeiro nome");
      return false;
   }

    if (pessoa.getUltimoNome().isEmpty()) {
      GerenciadorMensagens.mensagemErroValidacao("último nome");
      return false;
   }
   
   return true;
   
  }
}