package Tugas2;
import Tugas2.Controller.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Router {
    private Map<String, BiConsumer<Request, Response>> routes = new HashMap<>();

    public void register(String method, String path, BiConsumer<Request, Response> handler) {
        routes.put(method + " " + path, handler);
    }

    public void registerRoutes() {
        register("GET", "/villas", new VillaController()::getAll);
        register("GET", "/villas/:id", new VillaController()::getById);
        register("POST", "/villas", new VillaController()::create);
        register("PUT", "/villas/:id", new VillaController()::update);
        register("DELETE", "/villas/:id", new VillaController()::delete);

        register("GET", "/rooms", new RoomController()::getAll);
        register("GET", "/customers", new CustomerController()::getAll);
        register("GET", "/bookings", new BookingController()::getAll);
        register("GET", "/vouchers", new VoucherController()::getAll);
    }

    public void handle(Request req, Response res) {
        String key = req.getMethod() + " " + req.getPath();
        BiConsumer<Request, Response> handler = routes.get(key);
        if (handler != null) {
            handler.accept(req, res);
        } else {
            res.setStatus(404);
            res.send("{\"error\":\"Not found\"}");
        }
    }
}