package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.BookingService;

public class BookingController {

    private final BookingService service = new BookingService();

    public void getAll(Request req, Response res) {
        res.send(service.toJson(service.getAll()));
    }

    public void getById(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object booking = service.getById(id);

        if (booking != null) {
            res.send(service.toJson(booking));
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Booking not found\"}");
        }
    }

    /** POST /bookings */
    public void create(Request req, Response res) {
        Object created = service.create(req.getBody());
        res.setStatus(201); // Created
        res.send(service.toJson(created));
    }

    /** PUT /bookings/:id */
    public void update(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object updated = service.update(id, req.getBody());

        if (updated != null) {
            res.send(service.toJson(updated));
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Booking not found\"}");
        }
    }

    /** DELETE /bookings/:id */
    public void delete(Request req, Response res) {
        int id = service.extractId(req.getPath());
        boolean ok = service.delete(id);

        if (ok) {
            res.send("{\"message\":\"Deleted\"}");
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Booking not found\"}");
        }
    }
}
