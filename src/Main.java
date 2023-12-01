public class Main {
    public static void main(String[] args) {
        myThread1 thread1 = new myThread1();
        myThread2 thread2 = new myThread2();
        Thread thread3 = new Thread(new mythread3());
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("end");
    }

    static class myThread1  extends Thread {
        public void run(){
            for(int i =0 ; i <=9; i++){
                    System.out.println(i);

            }
        }

    }
    static class myThread2  extends Thread {
        public void run(){
            for(int i =0 ; i <=9; i++){
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    static class mythread3 implements Runnable{

        @Override
        public void run() {
            for(int i =0 ; i <=9; i++){
                System.out.println(i);

            }
        }
    }
}