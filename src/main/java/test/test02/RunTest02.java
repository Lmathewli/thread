package test.test02;

public class RunTest02 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("myThread");
        thread.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
