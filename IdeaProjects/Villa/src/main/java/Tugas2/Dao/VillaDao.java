package Tugas2.Dao;

import java.util.ArrayList;
import java.util.List;

public class VillaDao {
    private static List<String> storage = new ArrayList<>();
    private static int counter = 1;

    public List<String> findAll() { return storage; }

    public String findById(int id) {
        return storage.size() >= id ? storage.get(id - 1) : null;
    }

    public String insert(String json) {
        storage.add(json);
        return json;
    }

    public String update(int id, String json) {
        if (storage.size() >= id) {
            storage.set(id - 1, json);
            return json;
        }
        return null;
    }

    public boolean delete(int id) {
        if (storage.size() >= id) {
            storage.remove(id - 1);
            return true;
        }
        return false;
    }
}
