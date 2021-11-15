package Pruebadeconexión;
import java.sql.*;

public class Conexion 
{
    public Connection obtenerConexion()
   {
    Connection cnx=null;
    String host="localhost";
    String usuario="root";
    String clave="";
    String bd="javafxapplication";
    String puerto="3306";
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String cadena="jdbc:mysql://"+host+":"+puerto+"/"+bd;
        cnx=DriverManager.getConnection(cadena, usuario, clave);
        
        System.out.println("CONECTADO");
    }
    catch(Exception e)
        {
        System.out.println(e.toString());
        }
    
    return cnx;
   } 
}
