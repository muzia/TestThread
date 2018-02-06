package com.example.admin.testthread.synchronize_test;

/**
 * Created by lifei on 2018/2/5.
 */

public class ReportRunnable3 implements Runnable {
    ReportTask reportTask;

    public ReportRunnable3(ReportTask reportTask) {
        this.reportTask = reportTask;
    }

    @Override
    public void run() {
        reportTask.report3();
    }
}
