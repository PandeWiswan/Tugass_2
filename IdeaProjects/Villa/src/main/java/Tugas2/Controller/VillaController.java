package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.VillaService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class VillaController {
    private final VillaService service = new VillaService();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void getAll(Request req, Response res) {
        try {
            res.send(objectMapper.writeValueAsString(service.getAll()));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to get villas\"}");
        }
    }

    public void getById(Request req, Response res) {
        try {
            int id = extractId(req);
            res.send(objectMapper.writeValueAsString(service.getById(id)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to get villa by ID\"}");
        }
    }

    public void create(Request req, Response res) {
        try {
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            res.send(objectMapper.writeValueAsString(service.create(body)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to create villa\"}");
        }
    }

    public void update(Request req, Response res) {
        try {
            int id = extractId(req);
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            res.send(objectMapper.writeValueAsString(service.update(id, body)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to update villa\"}");
        }
    }

    public void delete(Request req, Response res) {
        try {
            int id = extractId(req);
            res.send(objectMapper.writeValueAsString(service.delete(id)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to delete villa\"}");
        }
    }

    public void getRoomsByVillaId(Request req, Response res) {
        try {
            int villaId = extractId(req);
            res.send(objectMapper.writeValueAsString(service.getRoomsByVillaId(villaId)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to get rooms by villa ID\"}");
        }
    }

    public void getBookingsByVillaId(Request req, Response res) {
        try {
            int villaId = extractId(req);
            res.send(objectMapper.writeValueAsString(service.getBookingsByVillaId(villaId)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to get bookings by villa ID\"}");
        }
    }

    public void getReviewsByVillaId(Request req, Response res) {
        try {
            int villaId = extractId(req);
            res.send(objectMapper.writeValueAsString(service.getReviewsByVillaId(villaId)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to get reviews by villa ID\"}");
        }
    }

    public void searchAvailability(Request req, Response res) {
        try {
            String ciDate = req.getQueryParam("ci_date");
            String coDate = req.getQueryParam("co_date");
            res.send(objectMapper.writeValueAsString(service.searchAvailability(ciDate, coDate)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to search availability\"}");
        }
    }

    public void createRoomForVilla(Request req, Response res) {
        try {
            int villaId = extractId(req);
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            res.send(objectMapper.writeValueAsString(service.createRoomForVilla(villaId, body)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to create room for villa\"}");
        }
    }

    public void updateRoomInVilla(Request req, Response res) {
        try {
            String[] parts = req.getPath().split("/");
            int villaId = Integer.parseInt(parts[2]);
            int roomId = Integer.parseInt(parts[4]);
            Map<String, Object> body = objectMapper.readValue(req.getBody(), Map.class);
            res.send(objectMapper.writeValueAsString(service.updateRoomInVilla(villaId, roomId, body)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to update room\"}");
        }
    }

    public void deleteRoomFromVilla(Request req, Response res) {
        try {
            String[] parts = req.getPath().split("/");
            int villaId = Integer.parseInt(parts[2]);
            int roomId = Integer.parseInt(parts[4]);
            res.send(objectMapper.writeValueAsString(service.deleteRoomFromVilla(villaId, roomId)));
        } catch (Exception e) {
            res.setStatus(500);
            res.send("{\"error\":\"Failed to delete room\"}");
        }
    }

    private int extractId(Request req) {
        String[] parts = req.getPath().split("/");
        return Integer.parseInt(parts[2]);
    }
}
