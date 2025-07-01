package Tugas2.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoucherDao {
    private final Map<Integer, Map<String, Object>> vouchers = new HashMap<>();
    private int nextId = 1;

    public List<Map<String, Object>> getAll() {
        return new ArrayList<>(vouchers.values());
    }

    public Map<String, Object> getById(int id) {
        return vouchers.get(id);
    }

    public Map<String, Object> create(Map<String, Object> data) {
        int id = nextId++;
        data.put("id", id);
        vouchers.put(id, data);
        return data;
    }

    public Map<String, Object> update(int id, Map<String, Object> data) {
        if (!vouchers.containsKey(id)) return null;
        data.put("id", id);
        vouchers.put(id, data);
        return data;
    }

    public boolean delete(int id) {
        return vouchers.remove(id) != null;
    }
}
