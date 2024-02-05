
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohaz
 */
public class projects {
    int id;
    String name;
//    String is_finished;
    int num_of_emp;

    public projects(int id, String name, int num_of_emp) {
        this.id = id;
        this.name = name;
//        this.is_finished = is_finished;
        this.num_of_emp = num_of_emp;
    }

    projects(JTextField tm_ld_id, JTextField proNum, String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    projects(JTextField tm_ld_id, String text, int type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public String getIs_finished() {
//        return is_finished;
//    }

    public int getNum_of_emp() {
        return num_of_emp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setIs_finished(String is_finished) {
//        this.is_finished = is_finished;
//    }

    public void setNum_of_emp(int num_of_emp) {
        this.num_of_emp = num_of_emp;
    }
    
}
