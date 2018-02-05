package com.example.admin.testthread.runableTest;

/**
 * Created by lifei on 2018/2/5.
 */

public class ReportRunnable2 implements Runnable {
    ReportTask reportTask;

    public ReportRunnable2(ReportTask reportTask) {
        this.reportTask = reportTask;
    }

    @Override
    public void run() {
        reportTask.report2();
    }
}
