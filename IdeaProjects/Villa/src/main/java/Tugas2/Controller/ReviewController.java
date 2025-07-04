package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.ReviewService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class ReviewController {
    private final ReviewService service = new ReviewService();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void getAll(Request req, Response res) {
        try {
            String json = objectMapper.writeValueAsString(service.getAll());
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to fetch reviews\"}");
        }
    }

    public void getByBookingId(Request req, Response res) {
        try {
            int id = Integer.parseInt(req.getPath().split("/")[2]);
            String json = objectMapper.writeValueAsString(service.getByBookingId(id));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to fetch review\"}");
        }
    }

    public void create(Request req, Response res) {
        try {
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            String json = objectMapper.writeValueAsString(service.create(body));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to create review\"}");
        }
    }

    public void update(Request req, Response res) {
        try {
            int id = Integer.parseInt(req.getPath().split("/")[2]);
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            String json = objectMapper.writeValueAsString(service.update(id, body));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to update review\"}");
        }
    }

    public void delete(Request req, Response res) {
        try {
            int id = Integer.parseInt(req.getPath().split("/")[2]);
            String json = objectMapper.writeValueAsString(service.delete(id));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to delete review\"}");
        }
    }
}
