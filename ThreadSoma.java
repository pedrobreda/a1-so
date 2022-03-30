package a1so;

public class ThreadSoma extends Thread {
  public int limite;

  ThreadSoma(int limite) {
    this.limite = limite;
  }

  @Override
  public void run() {
    int soma = 0;
    System.out.println(this.getName() + " Executando...");

    for (int i = 6; i < limite; i++) {
      if (i % 5 == 0) {
        soma = soma + i;
      }
    }
    System.out.println("A soma dos múltiplos de 5 menores que " + limite + " é: " + soma);
    System.out.println(this.getName() + " Finalizado.");
  }
}
