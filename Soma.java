package a1so;

public class Soma {
  public static void main(String[] args) throws InterruptedException {
    ThreadSoma t0 = new ThreadSoma(10);
    ThreadSoma t1 = new ThreadSoma(100);
    ThreadSoma t2 = new ThreadSoma(1000);
    ThreadSoma t3 = new ThreadSoma(10000);
    ThreadSoma t4 = new ThreadSoma(100000);
    ThreadSoma t5 = new ThreadSoma(1000000);
    t0.start();
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    t0.join();
    t1.join();
    t2.join();
    t3.join();
    t4.join();
    t5.join();

    System.out.println("Programa finalizado...");
  }
}