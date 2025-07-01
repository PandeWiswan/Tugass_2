package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.BookingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class BookingController {
    private final BookingService service = new BookingService();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void getAll(Request req, Response res) {
        try {
            String json = objectMapper.writeValueAsString(service.getAll());
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to fetch bookings\"}");
        }
    }

    public void getById(Request req, Response res) {
        try {
            String[] parts = req.getPath().split("/");
            int id = Integer.parseInt(parts[2]);
            String json = objectMapper.writeValueAsString(service.getById(id));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to fetch booking by ID\"}");
        }
    }

    public void create(Request req, Response res) {
        try {
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            String json = objectMapper.writeValueAsString(service.create(body));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to create booking\"}");
        }
    }

    public void update(Request req, Response res) {
        try {
            String[] parts = req.getPath().split("/");
            int id = Integer.parseInt(parts[2]);
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            String json = objectMapper.writeValueAsString(service.update(id, body));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to update booking\"}");
        }
    }

    public void delete(Request req, Response res) {
        try {
            String[] parts = req.getPath().split("/");
            int id = Integer.parseInt(parts[2]);
            String json = objectMapper.writeValueAsString(service.delete(id));
            res.send(json);
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to delete booking\"}");
        }
    }
}
