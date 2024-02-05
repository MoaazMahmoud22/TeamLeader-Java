


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clogin {
        static PreparedStatement ss;
        static String query;

        public ResultSet openemp() throws SQLException {
        String sql = "Select id,pass,position from person where position = 'employee' and id=? and pass = ? ";
        
        DB d = new DB();
        
         ss = d.connect().prepareStatement(sql);
        ss.setString(1, login.loginid.getText());
        ss.setString(2, login.password.getText());
        ResultSet rs = ss.executeQuery();
        return rs;
    }

    public ResultSet opentm() throws SQLException {
       String sql = "Select id,pass,position from person where position = 'team leader' and id=? and pass = ? ";
        
        DB d = new DB();
        
         ss = d.connect().prepareStatement(sql);
        ss.setString(1, login.loginid.getText());
        ss.setString(2, login.password.getText());
        ResultSet rs = ss.executeQuery();
        return rs;

    }

    public ResultSet openpm() throws SQLException {
            String sql = "Select id,pass,position from person where position = 'project manager' and id=? and pass = ? ";
        
        DB d = new DB();
        
         ss = d.connect().prepareStatement(sql);
        ss.setString(1, login.loginid.getText());
        ss.setString(2, login.password.getText());
        ResultSet rs = ss.executeQuery();
        return rs;

    }

    public ResultSet opena() throws SQLException {
       String sql = "Select id,pass,position from person where position = 'admin' and id=? and pass = ? ";
        
        DB d = new DB();
        
         ss = d.connect().prepareStatement(sql);
        ss.setString(1, login.loginid.getText());
        ss.setString(2, login.password.getText());
        ResultSet rs = ss.executeQuery();
        return rs;

    }
    
}
