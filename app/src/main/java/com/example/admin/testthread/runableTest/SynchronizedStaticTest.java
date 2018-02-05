package com.example.admin.testthread.runableTest;

/**
 * Created by lifei on 2018/2/5.
 */

public class SynchronizedStaticTest {
    public static synchronized void test2(){
        try{
            System.out.println("请鸣人 本体 吃拉面：" + Thread.currentThread().getName());
            Thread.sleep(1000);

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("鸣人 本体 吃完拉面了：" + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
//                test2();//test2方法是静态方法，可以直接调用
                test2();//这里的调用方式仅为了作对照
            }
        },"t4");
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                test2();
            }
        },"t5");
        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedStaticTest.test2();
            }
        },"t6");

        t4.start();
        t5.start();
        t6.start();
    }

    /*作者：Anlia
    链接：https://juejin.im/post/5a6fc6a1f265da3e2d33b580*/



}
