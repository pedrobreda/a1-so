package app_thread;

public class Soma {
  public static void main(String[] args) throws InterruptedException {

    long tempoInicial = System.currentTimeMillis();


    ThreadFibonacci t0 = new ThreadFibonacci(10);
    ThreadFibonacci t1 = new ThreadFibonacci(20);
    ThreadFibonacci t2 = new ThreadFibonacci(30);
    ThreadFibonacci t3 = new ThreadFibonacci(40);
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


    System.out.println("Programa finalizado em "+ (System.currentTimeMillis() - tempoInicial) + " milisegundos.");
  }
}