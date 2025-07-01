package Tugas2.Service;

import Tugas2.Dao.CustomerDao;
import java.util.List;

public class CustomerService {
    private CustomerDao dao = new CustomerDao();

    public List<String> getAll() { return dao.findAll(); }

    public String getById(int id) { return dao.findById(id); }

    public String create(String json) { return dao.insert(json); }

    public String update(int id, String json) { return dao.update(id, json); }

    public boolean delete(int id) { return dao.delete(id); }

    public int extractId(String path) {
        String[] parts = path.split("/");
        return Integer.parseInt(parts[2]);
    }

    public String toJson(Object obj) {
        return obj.toString();
    }
}
