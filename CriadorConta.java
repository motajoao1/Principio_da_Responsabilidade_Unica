package Pessoa;

public class CriadorConta {
  public static void criar(Pessoa usuario) {
    System.out.println("Seu id de usuário é " + usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
  }
}