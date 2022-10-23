package com.softserve.hw10.task1;

public class TaskManager {

    private final String process;
    private final int taskRepeating;
    private final long timeOut;

    public TaskManager(String process, int taskRepeating, long timeOut){
        this.process = process;
        this.taskRepeating = taskRepeating;
        this.timeOut = timeOut;
    }

    public String getTaskName() {
        return process;
    }

    public int getTaskRepeating() {
        return taskRepeating;
    }

    public long getTimeOut() {
        return timeOut;
    }

    public void printProcessStackTrace() {
        for (int i = 1; i <= getTaskRepeating(); i++) {
            System.out.println(getTaskName());
            if (i == getTaskRepeating()) break;
            try {
                Thread.sleep(getTimeOut());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
