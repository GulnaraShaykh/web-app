package task1_web;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(9999, 64);
        server.start();
    }
}
