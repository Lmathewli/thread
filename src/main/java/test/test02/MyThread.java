package test.test02;

public class MyThread extends Thread {
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
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
                System.out.println("Run = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
        }
    }
}