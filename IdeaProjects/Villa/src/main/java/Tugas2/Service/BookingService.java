package Tugas2.Service;

import Tugas2.Dao.BookingDao;
import java.util.List;
import java.util.Map;

public class BookingService {
    private final BookingDao dao = new BookingDao();

    public List<Map<String, Object>> getAll() {
        return dao.getAll();
    }

    public Map<String, Object> getById(int id) {
        return dao.getById(id);
    }

    public Map<String, Object> create(Map<String, Object> data) {
        dao.create(data);
        return data;
    }

    public Map<String, Object> update(int id, Map<String, Object> data) {
        dao.update(id, data);
        return dao.getById(id);
    }

    public Map<String, Object> delete(int id) {
        Map<String, Object> deleted = dao.getById(id);
        dao.delete(id);
        return deleted;
    }
}
