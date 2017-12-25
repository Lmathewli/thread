package test;

public class Test01 {
    public static void main(String[] args) {
        Thread.currentThread().setName("hi");
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
