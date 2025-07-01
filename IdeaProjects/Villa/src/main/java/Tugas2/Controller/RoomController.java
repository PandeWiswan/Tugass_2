package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.RoomService;

public class RoomController {
    private RoomService service = new RoomService();

    public void getAll(Request req, Response res) {
        res.send(service.toJson(service.getAll()));
    }

    public void getById(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object obj = service.getById(id);
        if (obj != null) res.send(service.toJson(obj));
        else {
            res.setStatus(404);
            res.send("{\"error\":\"Room not found\"}");
        }
    }

    public void create(Request req, Response res) {
        Object obj = service.create(req.getBody());
        res.setStatus(201);
        res.send(service.toJson(obj));
    }

    public void update(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object obj = service.update(id, req.getBody());
        if (obj != null) res.send(service.toJson(obj));
        else {
            res.setStatus(404);
            res.send("{\"error\":\"Room not found\"}");
        }
    }

    public void delete(Request req, Response res) {
        int id = service.extractId(req.getPath());
        boolean ok = service.delete(id);
        if (ok) res.send("{\"message\":\"Deleted\"}");
        else {
            res.setStatus(404);
            res.send("{\"error\":\"Room not found\"}");
        }
    }
}
