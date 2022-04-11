package app_thread;

public class Soma {
  public static void main(String[] args) throws InterruptedException {
    long tempo1 = 0, tempo2 = 0;
    char modo = 'T';

    while (Character.toLowerCase(modo) != 'x') {

      if (Character.toLowerCase(modo) == 't') {

        System.out.println("Inicio Thread");
        long tempoInicial = System.currentTimeMillis();


        ThreadFibonacci t0 = new ThreadFibonacci(10);
        ThreadFibonacci t1 = new ThreadFibonacci(20);
        ThreadFibonacci t2 = new ThreadFibonacci(30);
        ThreadFibonacci t3 = new ThreadFibonacci(50);
        ThreadFibonacci t4 = new ThreadFibonacci(50);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t0.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        modo = 'p';

        tempo1 =System.currentTimeMillis() - tempoInicial;
        System.out.println("Rodada finalizada em " + (System.currentTimeMillis() - tempoInicial) + " milisegundos.");
      } else if (Character.toLowerCase(modo) == 'p') {

        System.out.println("Inicio Procedural");

        long tempoInicial = System.currentTimeMillis();
        long fibo10, fibo20, fibo30, fibo40, fibo50;
        fibo10 = fibonacciProcedural(10);
        System.out.println("Resultado de fibo10: " + fibo10);
        fibo20 = fibonacciProcedural(20);
        System.out.println("Resultado de fibo20: " + fibo20);
        fibo30 = fibonacciProcedural(30);
        System.out.println("Resultado de fibo30: " + fibo30);
        fibo40 = fibonacciProcedural(50);
        System.out.println("Resultado de fibo40: " + fibo40);
        fibo50 = fibonacciProcedural(50);
        System.out.println("Resultado de fibo50: " + fibo50);
        tempo2 =System.currentTimeMillis() - tempoInicial;
        System.out.println("Rodada finalizada em " + (System.currentTimeMillis() - tempoInicial) + " milisegundos.");
        modo = 'x';
      } else if (Character.toLowerCase(modo) != 'x') {
        System.out.println("Caracter invalido.");
        modo = 'x';
      }
    }
    System.out.println("Diferenca de " + (tempo2 - tempo1) + " milissegundos.");


  }

  private static long fibonacciProcedural(int n) {
    if (n < 2) return n;

    return fibonacciProcedural (n -1) + fibonacciProcedural (n -2);
  }
}