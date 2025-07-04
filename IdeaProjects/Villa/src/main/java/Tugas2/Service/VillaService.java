package Tugas2.Service;

import Tugas2.Dao.VillaDao;
import java.util.List;
import java.util.Map;

public class VillaService {
    private final VillaDao dao = new VillaDao();

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

    public List<Map<String, Object>> getRoomsByVillaId(int villaId) {
        return dao.getRoomsByVillaId(villaId);
    }

    public List<Map<String, Object>> getBookingsByVillaId(int villaId) {
        return dao.getBookingsByVillaId(villaId);
    }

    public List<Map<String, Object>> getReviewsByVillaId(int villaId) {
        return dao.getReviewsByVillaId(villaId);
    }

    public List<Map<String, Object>> searchAvailability(String checkinDate, String checkoutDate) {
        return dao.searchAvailability(checkinDate, checkoutDate);
    }

    public Map<String, Object> createRoomForVilla(int villaId, Map<String, Object> data) {
        dao.createRoomForVilla(villaId, data);
        return data;
    }

    public Map<String, Object> updateRoomInVilla(int villaId, int roomId, Map<String, Object> data) {
        dao.updateRoomInVilla(villaId, roomId, data);
        return dao.getRoomById(roomId);
    }

    public Map<String, Object> deleteRoomFromVilla(int villaId, int roomId) {
        Map<String, Object> deleted = dao.getRoomById(roomId);
        dao.deleteRoomFromVilla(villaId, roomId);
        return deleted;
    }
}