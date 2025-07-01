package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.VillaService;
import java.util.List;

public class VillaController {
    private VillaService service = new VillaService();

    public void getAll(Request req, Response res) {
        List<?> list = service.getAll();
        res.send(service.toJson(list));
    }

    public void getById(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object villa = service.getById(id);
        if (villa != null) res.send(service.toJson(villa));
        else {
            res.setStatus(404);
            res.send("{\"error\":\"Villa not found\"}");
        }
    }

    public void create(Request req, Response res) {
        Object created = service.create(req.getBody());
        res.setStatus(201);
        res.send(service.toJson(created));
    }

    public void update(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object updated = service.update(id, req.getBody());
        if (updated != null) res.send(service.toJson(updated));
        else {
            res.setStatus(404);
            res.send("{\"error\":\"Villa not found\"}");
        }
    }

    public void delete(Request req, Response res) {
        int id = service.extractId(req.getPath());
        boolean ok = service.delete(id);
        if (ok) res.send("{\"message\":\"Deleted\"}");
        else {
            res.setStatus(404);
            res.send("{\"error\":\"Villa not found\"}");
        }
    }
}
