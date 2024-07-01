import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JdbcConncectivity {
    public static void main(String[] args) throws SQLException{



            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/login_schema","root","password");
            Statement statement=connection.createStatement();
            ResultSet rs;
            PreparedStatement pst;
            String qry="";
            int id,age,choice;
            String name,city;

        Scanner in=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        while(true)
        {
            System.out.println("   ");
            System.out.println("MY SQL DATABASE");
            System.out.println("Select the option:");
            System.out.println("1.INSERT");
            System.out.println("2.UPDATE");
            System.out.println("3.DELETE");
            System.out.println("4.SELECT");
            System.out.println("5.EXIT");
            choice=in.nextInt();
            System.out.println("_______________________________________________");
            switch(choice)
            {
                case 1:
                    System.out.println("INSERT NEW DATA");
                    System.out.println("ENTER NAME: ");
                    name=str.nextLine();
                    System.out.println("ENTER AGE: ");
                    age =in.nextInt();
                    System.out.println("ENTER THE CITY: ");
                    city=str.nextLine();

                    qry="INSERT INTO users(NAME,AGE,CITY) VALUES(?,?,?)";
                    pst= connection.prepareStatement(qry);
                    pst.setString(1,name);
                    pst.setInt(2,age);
                    pst.setString(3,city);
                    pst.executeUpdate();
                    System.out.println("DATA INSERTED SUCCESSFULLY");
                    break;

                case 2:
                    System.out.println("ENTER ID: ");
                    id=in.nextInt();
                    System.out.println("ENTER NAME: ");
                    name=str.nextLine();
                    System.out.println("ENTER AGE: ");
                    age =in.nextInt();
                    System.out.println("ENTER THE CITY: ");
                    city=str.nextLine();
                    System.out.println("DATA UPDATED SUCCESSFULLY");
                    qry="UPDATE users SET NAME=?,AGE=?,CITY=? WHERE ID=?";
                    pst=connection.prepareStatement(qry);
                    pst.setString(1,name);
                    pst.setInt(2,age);
                    pst.setString(3,city);
                    pst.setInt(4,id);
                    pst.executeUpdate();
                    System.out.println("DATA UPDATED SUCCESSFULLY");

                    break;

                case 3:
                    System.out.println("ENTER THE ID :");
                    id=in.nextInt();
                    qry="DELETE FROM users WHERE ID=?";
                    pst=connection.prepareStatement(qry);
                    pst.setInt(1,id);
                    pst.executeUpdate();
                    System.out.println("DATA DELETED SUCCESSFULLY");
                    break;

                case 4:
                    System.out.println("DATA DISPLAYED SUCCESSFULLY");
                    qry="Select ID,NAME,AGE,CITY from users";
                    rs=statement.executeQuery(qry);
                    while(rs.next())
                    {
                       id= rs.getInt("ID");
                       name=rs.getString("NAME");
                       age=rs.getInt("AGE");
                       city=rs.getString("CITY");
                        System.out.print(id+" ");
                        System.out.print(name+" ");
                        System.out.print(age+" ");
                        System.out.println(city+" ");
                    }
                    break;

                case 5:
                    System.out.println("THANK YOU");
                    System.exit(0);
                default:
                    System.out.println("INVALID SELECTION");
                    break;
            }


        }

        }


    }
