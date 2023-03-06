
package awsdbcompanyapp;


import java.sql.*;

public class AwsDbCompanyApp {


    public static void main(String[] args){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cis144.copc7rytu50y.us-east-1.rds.amazonaws.com/cis144DB",
                    "lakhdar", 
                    "walid123"
                            );
            
            System.out.println("Connection successfull\n");
         
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee ");
            
            Employee emp = new Employee();
            
            while(rs.next()){
                emp.setEmpID(rs.getInt(1));
                emp.setEmpLname(rs.getString(2));
                emp.setEmpFname(rs.getString(3));
                emp.setEmpAdress1(rs.getString("EmpAddress1"));
                emp.setEmpAdress2(rs.getString("EmpAddress2"));
                emp.setEmpCity(rs.getString(6));
                emp.setEmpState(rs.getString(7));
                System.out.println(emp.toString());
                
            }
            
      
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
