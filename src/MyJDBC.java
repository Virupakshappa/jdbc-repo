import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/itachi";
        String uname = "root";
        String pass = "";
        //String query = "select * from academy";
//        String query = "insert into academy values(5,'Minato')";
        int rNum = 6;
        String rName = "Tobirama";
        String query = "insert into academy values(?,?)";

//        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection con = DriverManager.getConnection(url, uname, pass);
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(query);
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,rNum);
            st.setString(2,rName);
            int count = st.executeUpdate();

//            while (rs.next()) {
//                String userData = rs.getInt(1) + " " +rs.getString(2);
//                System.out.println(userData);
                  System.out.println("number of rows affected : " +count);
//            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
