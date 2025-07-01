package Tugas2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int port;
    private Router router;

    public Server(int port) {
        this.port = port;
        this.router = new Router();
    }

    public void start() {
        // Daftarkan route
        router.registerRoutes();

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server running on port " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(() -> {
                    try {
                        Request req = new Request(clientSocket.getInputStream());
                        Response res = new Response(clientSocket.getOutputStream());
                        router.handle(req, res);
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
