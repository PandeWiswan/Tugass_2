package Tugas2;

import java.io.OutputStream;
import java.io.PrintWriter;

public class Response {
    private PrintWriter writer;
    private int status = 200;

    public Response(OutputStream out) {
        writer = new PrintWriter(out);
    }

    public void setStatus(int code) {
        this.status = code;
    }

    public void send(String body) {
        writer.print("HTTP/1.1 " + status + " \r\n");
        writer.print("Content-Type: application/json\r\n");
        writer.print("Content-Length: " + body.length() + "\r\n");
        writer.print("\r\n");
        writer.print(body);
        writer.flush();
    }
}
