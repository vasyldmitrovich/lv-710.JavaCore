package com.softserve.edu12.practical_tasks.task1;

public class TaskCreator {
    private final String OUTPUT;
    private final int AMOUNT_OF_REPEATED;
    private final Long TIMEOUT;

    public TaskCreator(String OUTPUT, int AMOUNT_OF_REPEATED, Long TIMEOUT) {
        this.OUTPUT = OUTPUT;
        this.AMOUNT_OF_REPEATED = AMOUNT_OF_REPEATED;
        this.TIMEOUT = TIMEOUT;
    }

    public void printTextWithIntervals() {
        for (int i = 0; i < AMOUNT_OF_REPEATED; i++) {
            System.out.println(OUTPUT);
            if (i == AMOUNT_OF_REPEATED - 1) break;
            try {
                Thread.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
