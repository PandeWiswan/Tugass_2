package Tugas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private String method;
    private String path;
    private String body = "";
    private Map<String, String> queryParams = new HashMap<>();

    public static Request parse(BufferedReader in) throws IOException {
        Request req = new Request();

        String line = in.readLine();
        if (line == null || line.isEmpty()) return req;

        String[] requestLine = line.split(" ");
        if (requestLine.length >= 2) {
            req.method = requestLine[0];

            // Pisahkan path dan query string
            String fullPath = requestLine[1];
            int queryIndex = fullPath.indexOf("?");
            if (queryIndex != -1) {
                req.path = fullPath.substring(0, queryIndex);
                String queryString = fullPath.substring(queryIndex + 1);
                req.queryParams = parseQueryParams(queryString);
            } else {
                req.path = fullPath;
            }
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

    private static Map<String, String> parseQueryParams(String query) {
        Map<String, String> result = new HashMap<>();
        if (query == null || query.isEmpty()) return result;

        String[] pairs = query.split("&");
        for (String pair : pairs) {
            String[] kv = pair.split("=", 2);
            if (kv.length == 2) {
                String key = URLDecoder.decode(kv[0], StandardCharsets.UTF_8);
                String value = URLDecoder.decode(kv[1], StandardCharsets.UTF_8);
                result.put(key, value);
            }
        }
        return result;
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

    public String getQueryParam(String key) {
        return queryParams.get(key);
    }

    public Map<String, String> getAllQueryParams() {
        return queryParams;
    }
}
