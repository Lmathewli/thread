package test.usestopmethodthread;

public class MyThread extends Thread {
    private int i = 0;
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("i= " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
