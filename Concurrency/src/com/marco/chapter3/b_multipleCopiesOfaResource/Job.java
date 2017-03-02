package com.marco.chapter3.b_multipleCopiesOfaResource;


/**
 * Created by marco on 16/10/27.
 */
public class Job implements Runnable {

    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a job\n",Thread.currentThread().getName());

        printQueue.printJob(new Object());

        System.out.printf("%s: The document has been printed\n",Thread.currentThread().getName());
    }
}
