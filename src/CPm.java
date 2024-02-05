


import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CPm {
    static Connection c;
     static PreparedStatement ss;
     static String query;

    public void pop() throws SQLException {
        DB d = new DB();
        double id = Double.parseDouble(project_prograss.pronum.getText());
        String sql = "select progras from projects where pnum = '" + id + "'";
        ss = d.connect().prepareStatement(sql);
        ResultSet rs = ss.executeQuery();
        while (rs.next()) {
            String p = rs.getString("progras");
            project_prograss.proProg.setText(p + "\n");
        }
    }

    public void pmwr(double id,String report) throws IOException {
        DB d = new DB();
        try {
            
            query = "update person set Notes = (?) where id = (?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(2, id);
            ss.setString(1, report);
            
             JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULY", "Update User ", JOptionPane.INFORMATION_MESSAGE);
            ss.execute();
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        } finally {
            try {
//                c.close();
                ss.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        }

   public void assp(double id,double pNum,String Pname) throws IOException {
        DB d = new DB();
        try {
            
            query = "insert into projects (ID,name1,pnum) values(?,?,?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, id);
            ss.setString(2, Pname);
            ss.setDouble(3, pNum);
           
            
             JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULY", "Update User ", JOptionPane.INFORMATION_MESSAGE);
            ss.execute();
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        } finally {
            try {
//                c.close();
                ss.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        }

    public void view_attendance() throws SQLException {
        DB d = new DB();
        DefaultTableModel v = new DefaultTableModel();
        v.addColumn("ID");
        v.addColumn("Enter Time");
        v.addColumn("Exit Time");
        v.addColumn("Day");
        Attendance_pro.view.setModel(v);
        String sql = "select * from attendance";
        ss = d.connect().prepareStatement(sql);
        ResultSet rs = ss.executeQuery();

        while (rs.next()) {
            v.addRow(new String[]{
                String.valueOf(rs.getInt("id")),
                rs.getString("enter_time"),
                rs.getString("exit_time"),
                rs.getString("Day")

            });
        }
    }
    
        public void deleteReport(double id) throws SQLException {

            DB d = new DB();
        try {
            
            query = "update person set Notes = NULL where id = (?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, id);
            
            
             JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULY", "Update User ", JOptionPane.INFORMATION_MESSAGE);
            ss.execute();
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        } finally {
            try {
//                c.close();
                ss.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        }

    
    
}
