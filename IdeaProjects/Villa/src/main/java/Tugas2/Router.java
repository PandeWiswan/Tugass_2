package Tugas2;

import Tugas2.Controller.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.regex.*;

public class Router {
    private final Map<String, BiConsumer<Request, Response>> routes = new HashMap<>();
    private final List<RouteEntry> dynamicRoutes = new ArrayList<>();

    public void register(String method, String path, BiConsumer<Request, Response> handler) {
        String key = method + " " + path;

        if (path.contains(":")) {
            String regex = path.replaceAll(":(\\w+)", "(\\\\w+)");
            Pattern pattern = Pattern.compile(method + " " + regex);
            dynamicRoutes.add(new RouteEntry(pattern, handler));
        } else {
            routes.put(key, handler);
        }
    }

    public void registerRoutes() {
        register("GET", "/", (req, res) -> res.send("Server is running!"));

        register("GET", "/villas", new VillaController()::getAll);
        register("GET", "/villas/:id", new VillaController()::getById);
        register("POST", "/villas", new VillaController()::create);
        register("PUT", "/villas/:id", new VillaController()::update);
        register("DELETE", "/villas/:id", new VillaController()::delete);

        register("GET", "/rooms", new RoomController()::getAll);
        register("GET", "/rooms/:id", new RoomController()::getById);
        register("POST", "/rooms", new RoomController()::create);
        register("PUT", "/rooms/:id", new RoomController()::update);
        register("DELETE", "/rooms/:id", new RoomController()::delete);

        register("GET", "/bookings", new BookingController()::getAll);
        register("GET", "/bookings/:id", new BookingController()::getById);
        register("POST", "/bookings", new BookingController()::create);
        register("PUT", "/bookings/:id", new BookingController()::update);
        register("DELETE", "/bookings/:id", new BookingController()::delete);

        register("GET", "/customers", new CustomerController()::getAll);
        register("GET", "/customers/:id", new CustomerController()::getById);
        register("POST", "/customers", new CustomerController()::create);
        register("PUT", "/customers/:id", new CustomerController()::update);
        register("DELETE", "/customers/:id", new CustomerController()::delete);

        register("GET", "/vouchers", new VoucherController()::getAll);
        register("GET", "/vouchers/:id", new VoucherController()::getById);
        register("POST", "/vouchers", new VoucherController()::create);
        register("PUT", "/vouchers/:id", new VoucherController()::update);
        register("DELETE", "/vouchers/:id", new VoucherController()::delete);

        register("GET", "/reviews", new ReviewController()::getAll);
        register("GET", "/reviews/:id", new ReviewController()::getByBookingId);
        register("POST", "/reviews", new ReviewController()::create);
        register("PUT", "/reviews/:id", new ReviewController()::update);
        register("DELETE", "/reviews/:id", new ReviewController()::delete);

    }

    public void handle(Request req, Response res) {
        String key = req.getMethod() + " " + req.getPath();

        // Cek static route (tepat)
        if (routes.containsKey(key)) {
            routes.get(key).accept(req, res);
            return;
        }

        for (RouteEntry route : dynamicRoutes) {
            Matcher matcher = route.pattern.matcher(key);
            if (matcher.matches()) {
                route.handler.accept(req, res);
                return;
            }
        }

        res.setStatus(404);
        res.send("{\"error\":\"Not found\"}");
    }

    private static class RouteEntry {
        Pattern pattern;
        BiConsumer<Request, Response> handler;

        RouteEntry(Pattern pattern, BiConsumer<Request, Response> handler) {
            this.pattern = pattern;
            this.handler = handler;
        }
    }
}
