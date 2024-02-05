




import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author myoss
 */
public class CEmp {
    
    static Connection c;
     static PreparedStatement ss;
     static String query;
     
    
    double ID = Double.parseDouble(login.loginid.getText());

   public void UploadTask(String Tname,double projectnum,double id,String state) throws IOException {
        DB d = new DB();
        try {
            
            query = " UPDATE tasks SET state=(?) where id=(?)";
            ss = d.connect().prepareStatement(query);
//            ss.setString(3, Tname);
            ss.setDouble(2, id);
//            ss.setDouble(4, projectnum);
            ss.setString(1, state);
            ss.execute();
             JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULY", "Update User ", JOptionPane.INFORMATION_MESSAGE);
            
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



 public void entertime(String enter_t,String exit_t,double day,double id) throws IOException {
        DB d = new DB();
        try {
           
            query = "insert into attendance(enter_time,exit_time,day,id) values(?,?,?,?)";//dd
            ss = d.connect().prepareStatement(query);
            ss.setString(1, enter_t);
            ss.setString(2,exit_t);
            ss.setDouble(3, day);
            ss.setDouble(4, id);
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

   public void requestvacation(double id,String from,String to) throws IOException {//Done
        DB d = new DB();
        try {
            
            query = "update person set from_d = (?) ,to_d = (?) ,vacation = 'pending' where id ="+ID ;
            ss = d.connect().prepareStatement(query);
            
            ss.setString(1, from);
            ss.setString(2, to);
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

    DefaultTableModel t = new DefaultTableModel();

    public void vacationstate() {//DONE
        t.addColumn("from");
        t.addColumn("to");
        t.addColumn("state");
        Myvacation.view.setModel(t);

        try {
            DB d = new DB();
            String sql = "select from_d,to_d,vacation from person where id =" + ID;
            ss = d.connect().prepareStatement(sql);
                ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                t.addRow(new String[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Viewpenalties() { //DONE
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("ID");
        t.addColumn("penalties");
        Mypenalties.View.setModel(t);
        try {
            DB d = new DB();
            String sql = "select ID,penalities from person where id =" + ID;
            ss = d.connect().prepareStatement(sql);
                ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                t.addRow(new String[]{
                    String.valueOf(rs.getInt(1)),
                    rs.getString(2)
                });
            }

            //Close
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

//    public void mytask() {
//        t.addColumn("Task Name");
//        t.addColumn("Project Number");
//        mytasks.jTable1.setModel(t);
//        try {
//            DB d = new DB();
//            String sql = "select tname,pnum from tasks where id = " + id + "and state='C'";
//            ResultSet result = d.st.executeQuery(sql);
//            while (result.next()) {
//                t.addRow(new String[]{
//                    result.getString(1),
//                    String.valueOf(result.getInt(2))
//                });
//            }
//            d.Close();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }

     public void assignTask() {
        DefaultTableModel T = new DefaultTableModel();
        t.addColumn("Project Number");
        t.addColumn("Task Name");
      
        complete.view.setModel(t);
        try {
            DB d = new DB();
            String sql = "select tname , pnum from tasks where state = 'c' ";
            ss = d.connect().prepareStatement(sql);
                ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                t.addRow(new String[]{
                    String.valueOf(rs.getInt(2)),
                    rs.getString(1),
                    
                });
            }

            //Close
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

