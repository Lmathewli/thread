package test.test05;

public class CountOperate extends Thread {
    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public CountOperate() {
        System.out.println("count Operate--begin");
        System.out.println("CurrentThreadName:" + Thread.currentThread().getName());
        System.out.println("CurrentThreadNameIsAliVe:" + Thread.currentThread().isAlive());
        System.out.println("ThisName:" + this.getName());
        System.out.println("ThisNameISAliVe:" + this.isAlive());
        System.out.println("count Operate--end");
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
        System.out.println("run---begin");
        System.out.println("CurrentThreadName:" + Thread.currentThread().getName());
        System.out.println("CurrentThreadNameIsAlive:" + Thread.currentThread().isAlive());
        System.out.println("ThisName:" + this.getName());
        System.out.println("ThisNameIsAlive:" + this.isAlive());
        System.out.println("run---end");
    }
}
