package Tugas2.Service;

import Tugas2.Dao.ReviewDao;
import java.util.List;
import java.util.Map;

public class ReviewService {
    private final ReviewDao dao = new ReviewDao();

    public List<Map<String, Object>> getAll() {
        return dao.getAll();
    }

    public Map<String, Object> getByBookingId(int id) {
        return dao.getByBookingId(id);
    }

    public Map<String, Object> create(Map<String, Object> data) {
        dao.create(data);
        return data;
    }

    public Map<String, Object> update(int bookingId, Map<String, Object> data) {
        dao.update(bookingId, data);
        return dao.getByBookingId(bookingId);
    }

    public Map<String, Object> delete(int bookingId) {
        Map<String, Object> deleted = dao.getByBookingId(bookingId);
        dao.delete(bookingId);
        return deleted;
    }
}
