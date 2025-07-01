package Tugas2.Controller;

import Tugas2.Request;
import Tugas2.Response;
import Tugas2.Service.VoucherService;

public class VoucherController {

    private final VoucherService service = new VoucherService();

    public void getAll(Request req, Response res) {
        res.send(service.toJson(service.getAll()));
    }

    public void getById(Request req, Response res) {
        int id = service.extractId(req.getPath());
        Object voucher = service.getById(id);

        if (voucher != null) {
            res.send(service.toJson(voucher));
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Voucher not found\"}");
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

        if (updated != null) {
            res.send(service.toJson(updated));
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Voucher not found\"}");
        }
    }

    /** DELETE /vouchers/:id */
    public void delete(Request req, Response res) {
        int id = service.extractId(req.getPath());
        boolean ok = service.delete(id);

        if (ok) {
            res.send("{\"message\":\"Deleted\"}");
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Voucher not found\"}");
        }
    }
}
