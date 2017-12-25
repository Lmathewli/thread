package test.test01;

public class TunMyThread {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("运行结束");
    }
}
