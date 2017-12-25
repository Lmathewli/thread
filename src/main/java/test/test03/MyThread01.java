package test.test03;

public class MyThread01 extends Thread {
    private int count = 5;
    
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
    synchronized public void run() {
        super.run();
        count--;
        // 此示例不能使用for语句，因为使用同步后其他线程就得不到运行的机会了，一直由一个线程运行减法运算
        System.out.println("由" + this.currentThread().getName() + "计算，count = " + count);
    }
}
