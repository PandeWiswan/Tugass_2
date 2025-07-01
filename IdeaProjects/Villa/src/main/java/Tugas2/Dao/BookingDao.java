package Tugas2.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingDao {
    private final Map<Integer, Map<String, Object>> bookings = new HashMap<>();
    private int nextId = 1;

    public List<Map<String, Object>> getAll() {
        return new ArrayList<>(bookings.values());
    }

    public Map<String, Object> getById(int id) {
        return bookings.get(id);
    }

    public Map<String, Object> create(Map<String, Object> data) {
        int id = nextId++;
        data.put("id", id);
        bookings.put(id, data);
        return data;
    }

    public Map<String, Object> update(int id, Map<String, Object> data) {
        if (!bookings.containsKey(id)) return null;
        data.put("id", id); // Ensure ID doesn't change
        bookings.put(id, data);
        return data;
    }

    public boolean delete(int id) {
        return bookings.remove(id) != null;
    }
}
