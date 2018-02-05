package com.example.admin.testthread.runableTest;

/**
 * Created by lifei on 2018/2/5.
 */

public class SynchronizedTest {
    public synchronized void test1(){
        try{
            System.out.println("请鸣人影分身 "+Thread.currentThread().getName()+" 吃拉面");
            Thread.sleep(1000);

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("鸣人影分身 "+Thread.currentThread().getName()+" 吃完拉面了");
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                new SynchronizedTest().test1();
            }
        }, "1号");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                new SynchronizedTest().test1();
            }
        }, "2号");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                new SynchronizedTest().test1();
            }
        }, "3号");
        t1.start();
        t2.start();
        t3.start();
    }
}
