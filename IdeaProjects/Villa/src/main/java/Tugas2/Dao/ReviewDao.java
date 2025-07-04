package Tugas2.Dao;

import java.sql.*;
import java.util.*;

public class ReviewDao {
    private final String url = "jdbc:sqlite:./Villa.db";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<Map<String, Object>> getAll() {
        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT * FROM reviews";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("booking", rs.getInt("booking"));
                row.put("star", rs.getInt("star"));
                row.put("title", rs.getString("title"));
                row.put("content", rs.getString("content"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Map<String, Object> getByBookingId(int bookingId) {
        String sql = "SELECT * FROM reviews WHERE booking = ?";
        Map<String, Object> review = new HashMap<>();

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, bookingId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                review.put("booking", rs.getInt("booking"));
                review.put("star", rs.getInt("star"));
                review.put("title", rs.getString("title"));
                review.put("content", rs.getString("content"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return review;
    }

    public void create(Map<String, Object> data) {
        String sql = "INSERT INTO reviews (booking, star, title, content) VALUES (?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, (int) data.get("booking"));
            pstmt.setInt(2, (int) data.get("star"));
            pstmt.setString(3, (String) data.get("title"));
            pstmt.setString(4, (String) data.get("content"));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int bookingId, Map<String, Object> data) {
        String sql = "UPDATE reviews SET star = ?, title = ?, content = ? WHERE booking = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, (int) data.get("star"));
            pstmt.setString(2, (String) data.get("title"));
            pstmt.setString(3, (String) data.get("content"));
            pstmt.setInt(4, bookingId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int bookingId) {
        String sql = "DELETE FROM reviews WHERE booking = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, bookingId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
