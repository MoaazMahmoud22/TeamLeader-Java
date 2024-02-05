



import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CAdmin {
    private String username;
    private int pass;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public int getPass() {
        return pass;
    }
    

     static Connection c;
     static PreparedStatement ss;
     static String query;

        public void AddUser(double id,String name,double pass,double salary,String pos) throws IOException {
        DB d = new DB();
        try {
            
            query = "insert into person (id,name1,pass,salary,position) values(?,?,?,?,?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, id);
            ss.setString(2, name);
            ss.setDouble(3, pass);
            ss.setDouble(4, salary);
            ss.setString(5, pos);
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

    public void UpdateUser(double id,double salary,String pos) throws IOException {
        DB d = new DB();
        try {
            
            query = "update person set salary = (?) ,position = (?) where id = (?)" ;
            ss = d.connect().prepareStatement(query);
            ss.setDouble(3, id);
            ss.setDouble(1, salary);
            ss.setString(2, pos);
             JOptionPane.showMessageDialog(null, "UPDATED DONE", "Update User ", JOptionPane.INFORMATION_MESSAGE);
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

    public void View() {
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("ID");
        t.addColumn("Name");
        t.addColumn("Salary");
        t.addColumn("Position");
        view_users.view.setModel(t);
        try {
            DB d = new DB();
            String sql = "select id,name1,salary,position from person";
            ss = d.connect().prepareStatement(sql);
                ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                t.addRow(new String[]{
                    String.valueOf(rs.getInt(1)),
                    rs.getString(2),
                    String.valueOf(rs.getFloat(3)),
                    rs.getString(4)
                });
            }

            //Close
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
 
        
        public void Viewprojects() {
            DefaultTableModel t = new DefaultTableModel();
        t.addColumn("Project number");
        t.addColumn("Progress");
        t.addColumn("Project name");
        Admin_projects.view.setModel(t);
        try {
            DB d = new DB();
            String sql = "select pnum,progras,name1 from projects";
           ss = d.connect().prepareStatement(sql);
           ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                t.addRow(new String[]{
                    String.valueOf(rs.getInt(1)),
                   rs.getString(2),
                   rs.getString(3)
                });
            }

            //Close
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    

          }

    

    public void delete(double id) throws IOException {//DONE
        DB d = new DB();
        try {
            
            query = "delete from person where id=(?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, id);
            
            
            
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULY", " ASS task", JOptionPane.INFORMATION_MESSAGE);
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
