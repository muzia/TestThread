package com.example.admin.testthread.runableTest;

/**
 * Created by lifei on 2018/2/5.
 */

public class ReportTask {
    /**
     * 同步方法(默认对象所)
     * 同步代码块 synchronized(obj)
     * <p>
     * 当一个线程访问对象的某个synchronized同步方法时，
     * 其他线程对对象中所有其它synchronized同步方法的访问将被阻塞
     */
    public void report1() {
        synchronized (this) {
            // //持有锁的对象为ReportTask的实例对象
            System.out.println("1号业务员进办公室");
            try {
                System.out.println("1号业务员开始汇报");
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("1号业务员汇报完毕");
            System.out.println("1号业务员出办公室");
        }
    }

    public  void report2() {
        synchronized (ReportTask.class){
            //持有锁的对象为ReportTest的class对象
            System.out.println("2号业务员进办公室");
            try {
                System.out.println("2号业务员开始汇报");
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("2号业务员汇报完毕");
            System.out.println("2号业务员出办公室");
        }

    }
   /* public static synchronized void staticReport2() {

            //持有锁的对象为ReportTest的class对象
            System.out.println("2号业务员进办公室");
            try {
                System.out.println("2号业务员开始汇报");
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("2号业务员汇报完毕");
            System.out.println("2号业务员出办公室");


    }*/

    String window = "window";

    public void report3() {
        synchronized (window) {
            //  //持有锁的对象window
            System.out.println("T进办公室");
        }
    }

}
