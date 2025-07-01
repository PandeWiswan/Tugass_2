package Tugas2.Service;

import Tugas2.Dao.VoucherDao;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class VoucherService {

    private final VoucherDao dao = new VoucherDao();

    public List<Map<String, Object>> getAll() {
        return dao.getAll();
    }

    public Map<String, Object> getById(int id) {
        return dao.getById(id);
    }

    public Map<String, Object> create(String body) {
        Map<String, Object> data = parseJsonBody(body);
        return dao.create(data);
    }

    public Map<String, Object> update(int id, String body) {
        Map<String, Object> data = parseJsonBody(body);
        return dao.update(id, data);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public String toJson(Object data) {
        return data.toString(); // tampilkan isi Map sebagai string biasa
    }

    public int extractId(String path) {
        try {
            String[] parts = path.split("/");
            return Integer.parseInt(parts[parts.length - 1]);
        } catch (Exception e) {
            return -1;
        }
    }

    private Map<String, Object> parseJsonBody(String body) {
        Map<String, Object> data = new HashMap<>();

        // Contoh body: {"code":"DISC20","discount":20}
        body = body.trim().replaceAll("[{}\"]", "");
        String[] pairs = body.split(",");

        for (String pair : pairs) {
            String[] kv = pair.split(":");
            if (kv.length == 2) {
                String key = kv[0].trim();
                String value = kv[1].trim();

                try {
                    data.put(key, Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    data.put(key, value);
                }
            }
        }

        return data;
    }
}
