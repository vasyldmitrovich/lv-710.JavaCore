package com.softserve.edu13.practical_tasks;

import com.softserve.edu13.practical_tasks.task_code_conventions.Task;
import com.softserve.edu13.practical_tasks.task_stream_api.TaskAboutStreams;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
//        try {
//            new Task().method();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        new TaskAboutStreams().run();
    }
}
