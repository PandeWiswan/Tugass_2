package Tugas2;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(8000);
        Router router = new Router();
        router.registerRoutes();
        server.setRouter(router);
        server.start();
    }
}