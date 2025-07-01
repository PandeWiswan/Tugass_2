package Tugas2;

import java.io.OutputStream;
import java.io.PrintWriter;

public class Response {
    private final PrintWriter out;
    private int status = 200;

    public Response(OutputStream outputStream) {
        this.out = new PrintWriter(outputStream, true);
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void send(String body) {
        out.println("HTTP/1.1 " + status + " OK");
        out.println("Content-Type: application/json");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }
}
