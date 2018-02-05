package com.example.admin.testthread.runableTest;

/**
 * Created by lifei on 2018/2/5.
 */

public class ReportRunnable1 implements Runnable {
    ReportTask reportTask;

    public ReportRunnable1(ReportTask reportTask) {
        this.reportTask = reportTask;
    }

    @Override
    public void run() {
        reportTask.report1();
    }
}
