package app_thread;

public class ThreadFibonacci extends Thread {
  public int limite;
  long tempoInicial = System.currentTimeMillis();

  ThreadFibonacci(int limite) {
    this.limite = limite;
  }

  @Override
  public void run() {
//    int soma = 0;
//    System.out.println(this.getName() + " Executando...");
//
//    for (int i = 6; i < limite; i++) {
//      if (i % 5 == 0) {
//        soma = soma + i;
//      }
//    }
//    System.out.println("A soma dos múltiplos de 5 menores que " + limite + " é: " + soma);
//    System.out.println(this.getName() + " Finalizado.");
      long fibo = 0;
      fibo = fibonnaci(limite);
      System.out.println("Resultado de " + this.getName() + " " + fibo);
      System.out.println(this.getName() + " Finalizado.");

  }

  public long fibonnaci (int n){
    if (n < 2) return n;

    return fibonnaci (n -1) + fibonnaci (n -2);

  }

}
