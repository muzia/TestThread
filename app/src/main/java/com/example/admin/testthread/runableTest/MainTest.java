package com.example.admin.testthread.runableTest;

/**
 * Created by lifei on 2018/2/5.
 */

public class MainTest {
    public static void main(String args[]){
        ReportTask reportTask = new ReportTask();
        ReportRunnable1 runnable1 = new ReportRunnable1(reportTask);
        ReportRunnable2 runnable2 = new ReportRunnable2(reportTask);
        ReportRunnable3 runnable3=new ReportRunnable3(reportTask);

        Thread r1 = new Thread(runnable1);
        Thread r2 = new Thread(runnable2);
        Thread r3=new Thread(runnable3);
        r1.start();
        r2.start();
        r3.start();

    }
}
