package test.test03;

public class RunTest01 {
    public static void main(String[] args) {
        MyThread01 myThread = new MyThread01();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        
    }
}
