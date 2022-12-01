package todaylab;

import java.io.IOException;

class Multithreading  extends Thread {
    public static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public void run() {
        try {

            while (true) {
                System.out.println("Light: RED");
                Thread.sleep(3000);
                clearConsole();
                System.out.println("Light: GREEN");
                Thread.sleep(5000);
                clearConsole();
                System.out.println("Light: YELLOW");
                Thread.sleep(2000);
                clearConsole();
            }
        } catch (Exception e) {

            System.out.println("Exception is caught");
        }
    }
}


public class ExtendsThread{
    public static void main(String[] args) {

        Multithreading obj = new Multithreading();
        obj.start();

    }
}