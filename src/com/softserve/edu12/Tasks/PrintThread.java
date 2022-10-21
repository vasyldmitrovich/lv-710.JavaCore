package com.softserve.edu12.Tasks;

public class PrintThread {
    public static Thread printTextWithInterval(String message, int count, long interval) {
        return new Thread(() -> {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
                try {
                    if (i != count-1) Thread.sleep(interval);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
