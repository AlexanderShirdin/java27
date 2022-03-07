package lesson18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.88.98:3306/students_27?user=DC&password=Hhhh888*"); //localhost
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT t.id, t.name, t.duration, td.id_discipline as id_disc, d.discipline FROM term_discipline as td\n" +
                    "left join term as t on td.id_term = t.id\n" +
                    "left join discipline as d on td.id_discipline = d.id\n" +
                    "where d.status = 1 and t.status = 1\n" +
                    "order by t.name\n" +
                    "limit 10");
            while (rs.next()) {
                System.out.print(rs.getInt("id") + " | ");
                System.out.print(rs.getString("name") + " | ");
                System.out.print(rs.getString("duration") + " | ");
                System.out.print(rs.getInt("id_disc") + " | ");
                System.out.println(rs.getString("discipline"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}