package Tugas2.Dao;

import java.util.ArrayList;
import java.util.List;

public class RoomDao {
    private static List<String> storage = new ArrayList<>();

    public List<String> findAll() { return storage; }

    public String findById(int id) {
        return (id > 0 && id <= storage.size()) ? storage.get(id - 1) : null;
    }

    public String insert(String json) {
        storage.add(json);
        return json;
    }

    public String update(int id, String json) {
        if (id > 0 && id <= storage.size()) {
            storage.set(id - 1, json);
            return json;
        }
        return null;
    }

    public boolean delete(int id) {
        if (id > 0 && id <= storage.size()) {
            storage.remove(id - 1);
            return true;
        }
        return false;
    }
}
