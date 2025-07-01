package Tugas2;

import java.io.BufferedReader;
import java.io.IOException;

public class Request {
    private String method;
    private String path;
    private String body = "";

    public static Request parse(BufferedReader in) throws IOException {
        Request req = new Request();

        String line = in.readLine();
        if (line == null || line.isEmpty()) return req;

        String[] requestLine = line.split(" ");
        if (requestLine.length >= 2) {
            req.method = requestLine[0];
            req.path = requestLine[1];
        }

        // Skip headers
        while ((line = in.readLine()) != null && !line.isEmpty()) {}

        // Read body if present
        StringBuilder bodyBuilder = new StringBuilder();
        while (in.ready() && (line = in.readLine()) != null) {
            bodyBuilder.append(line).append("\n");
        }

        req.body = bodyBuilder.toString().trim();
        return req;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getBody() {
        return body;
    }
}
