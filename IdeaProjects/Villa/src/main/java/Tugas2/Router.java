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
        register("GET", "/customers", new CustomerController()::getAll);
        register("GET", "/bookings", new BookingController()::getAll);
        register("GET", "/vouchers", new VoucherController()::getAll);
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
