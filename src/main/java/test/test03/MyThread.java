package test.test03;

public class MyThread extends Thread {
    private int count = 5;
    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public MyThread(String name) {
        super();
        this.setName(name);
    }
    
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
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count = " + count);
        }
    }
}
