






import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CTm {
     static Connection c;
     static PreparedStatement ss;
     static String query;
    
DefaultTableModel t = new DefaultTableModel();
    

     public void accept(double id) throws IOException {//DONE
        DB d = new DB();
        try {
            
            query = "update person set vacation='Accept' where id=(?)";
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


      public void refuse(double id) throws IOException {//DONE
        DB d = new DB();
        try {
            
            query = "update person set vacation='Refuesed' where id=(?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, id);
            
            
            
            JOptionPane.showMessageDialog(null, "REFUSED SUCCESSFULY", " ASS task", JOptionPane.INFORMATION_MESSAGE);
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


 public void vacation() {
        t.addColumn("id");
        t.addColumn("from");
        t.addColumn("to");

        vaction.vaciton.setModel(t);

        try {
            DB d = new DB();
            String sql = "select id,from_d,to_d from person where vacation ='pending' ";
            ss = d.connect().prepareStatement(sql);
                ResultSet rs = ss.executeQuery();

            while (rs.next()) {
                t.addRow(new String[]{
                    String.valueOf(rs.getInt(1)),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void completetasks() throws SQLException {//
        DB d = new DB();

        t.addColumn("Id");
        t.addColumn("Task Name");
        t.addColumn("Project Number ");
        complete.view.setModel(t);
        String sql = "select * from tasks where state ='C'";
        ss = d.connect().prepareStatement(sql);
           ResultSet rs = ss.executeQuery();
        while (rs.next()) {
            t.addRow(new String[]{
                String.valueOf(rs.getInt(2)),
                rs.getString(1),
                String.valueOf(rs.getInt(3))
            });
        }
    }

   
 public void asstask(double id,String tname,double pnum) throws IOException {//DONE
        DB d = new DB();
        try {
            
            query = "insert into tasks (id,tname,pnum) values(?,?,?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, id);
            ss.setString(2, tname);
            ss.setDouble(3, pnum);
            
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

 public void deletepenalites(double id) throws SQLException { //DONE

            DB d = new DB();
        try {
            
            query = "update person set penalities = NULL where id = (?)";
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

    

    public void Viewreport() throws SQLException { //DONE
        DB d = new DB();
        double id = Double.parseDouble(Tmreport.empid2.getText());
        String sql = "select Notes from person where id = '" + id + "'";
        ss = d.connect().prepareStatement(sql);
        ResultSet rs = ss.executeQuery();
        while (rs.next()) {
            String p = rs.getString("Notes");
            Tmreport.reports.setText(p + "\n");
        }
    }
    
   public void asprojprog(double projnum, double prog) throws IOException { //DONE
        DB d = new DB();
        try {
            
            query = "update projects set progras = (?) where pnum = (?)";
            ss = d.connect().prepareStatement(query);
            ss.setDouble(1, prog);
            ss.setDouble(2, projnum);
            
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

    
       public void Writepenalites(double id,double pen) throws IOException { //DONE
        DB d = new DB();
        try {
            
            query = "update person set penalities = (?) where id = (?)" ;
            ss = d.connect().prepareStatement(query);
            ss.setDouble(2, id);
            ss.setDouble(1, pen);
            
             JOptionPane.showMessageDialog(null, "ADD DONE", "Update User ", JOptionPane.INFORMATION_MESSAGE);
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
        
