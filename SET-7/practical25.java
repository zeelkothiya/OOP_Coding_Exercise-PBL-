//AIM
/*Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of
7). Use a synchronized method so that table outputs do not mix and remain consistent.*/

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400);
            } catch (Exception e) {}
        }
    }
}

class ThreadTable1 extends Thread {
    Table t;
    ThreadTable1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class ThreadTable2 extends Thread {
    Table t;
    ThreadTable2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(7);
    }
}

public class practical25 {
    public static void main(String[] args) {
        Table obj = new Table();
        ThreadTable1 t1 = new ThreadTable1(obj);
        ThreadTable2 t2 = new ThreadTable2(obj);
        t1.start();
        t2.start();
    }
}
