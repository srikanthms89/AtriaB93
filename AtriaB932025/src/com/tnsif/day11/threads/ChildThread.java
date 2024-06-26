package com.tnsif.day11.threads;

public class ChildThread extends Thread {
    private int n;
    private String msg;

    public ChildThread(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            System.out.println(msg + i + " " + Thread.currentThread().getName());
        }
    }
}
