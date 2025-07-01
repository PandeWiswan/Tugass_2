package Tugas2.Dao;

import java.sql.*;
import java.util.*;

public class VoucherDao {
    private final String url = "jdbc:sqlite:./Villa.db";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<Map<String, Object>> getAll() {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM vouchers";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt("id"));
                row.put("code", rs.getString("code"));
                row.put("description", rs.getString("description"));
                row.put("discount", rs.getDouble("discount"));
                row.put("start_date", rs.getString("start_date"));
                row.put("end_date", rs.getString("end_date"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Map<String, Object> getById(int id) {
        String sql = "SELECT * FROM vouchers WHERE id = ?";
        Map<String, Object> voucher = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                voucher.put("id", rs.getInt("id"));
                voucher.put("code", rs.getString("code"));
                voucher.put("description", rs.getString("description"));
                voucher.put("discount", rs.getDouble("discount"));
                voucher.put("start_date", rs.getString("start_date"));
                voucher.put("end_date", rs.getString("end_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return voucher;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO vouchers(code, description, discount, start_date, end_date) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("code"));
            pstmt.setString(2, (String) data.get("description"));
            pstmt.setDouble(3, (Double) data.get("discount"));
            pstmt.setString(4, (String) data.get("start_date"));
            pstmt.setString(5, (String) data.get("end_date"));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Map<String, Object> data) {
        String sql = "UPDATE vouchers SET code = ?, description = ?, discount = ?, start_date = ?, end_date = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, (String) data.get("code"));
            pstmt.setString(2, (String) data.get("description"));
            pstmt.setDouble(3, (Double) data.get("discount"));
            pstmt.setString(4, (String) data.get("start_date"));
            pstmt.setString(5, (String) data.get("end_date"));
            pstmt.setInt(6, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM vouchers WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
