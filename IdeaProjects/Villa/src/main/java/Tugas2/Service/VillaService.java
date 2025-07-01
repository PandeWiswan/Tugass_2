package Tugas2.Service;

import Tugas2.Dao.VillaDao;
import java.util.List;

public class VillaService {
    private VillaDao dao = new VillaDao();

    public List<?> getAll() { return dao.findAll(); }

    public Object getById(int id) { return dao.findById(id); }

    public Object create(String json) {
        // parse JSON ke objek
        return dao.insert(json);
    }

    public Object update(int id, String json) {
        return dao.update(id, json);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public int extractId(String path) {
        String[] parts = path.split("/");
        return Integer.parseInt(parts[2]);
    }

    public String toJson(Object obj) {
        // bisa gunakan library simple seperti Gson/Jackson
        return obj.toString();
    }
}
