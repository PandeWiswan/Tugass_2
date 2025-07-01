package Tugas2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private String method;
    private String path;
    private Map<String, String> headers = new HashMap<>();
    private String body;

    public Request(InputStream in) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        method = parts[0];
        path = parts[1];

        while (!(line = reader.readLine()).isEmpty()) {
            String[] kv = line.split(": ");
            headers.put(kv[0], kv[1]);
        }

        if (headers.containsKey("Content-Length")) {
            int len = Integer.parseInt(headers.get("Content-Length"));
            char[] buf = new char[len];
            reader.read(buf);
            body = new String(buf);
        }
    }

    public String getMethod() { return method; }
    public String getPath() { return path; }
    public String getBody() { return body; }
}