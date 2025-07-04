package Tugas2;

import java.io.*;
import java.net.*;

public class Server {
    private final int port;
    private Router router;

    public Server(int port) {
        this.port = port;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server running on port " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(() -> handle(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handle(Socket socket) {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            Request req = Request.parse(in); // fix 1
            Response res = new Response(socket.getOutputStream()); // fix 2

            if (router != null) {
                router.handle(req, res);
            } else {
                res.setStatus(500);
                res.send("{\"error\":\"Router not configured\"}");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
