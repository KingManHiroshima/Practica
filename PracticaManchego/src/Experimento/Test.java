package Experimento;
import Pruebadeconexión.Conexion;
import java.sql.*;

public class Test 
{
    public static void main(String[] args) 
    {
    Conexion cnx=new Conexion();
    cnx.obtenerConexion();
 
 //Insert
 try{
    Connection conec=cnx.obtenerConexion();
    String sentencia=" INSERT INTO registroanimal ( raza, genero, peso, fecha) "
    + " VALUES('Jersey','Hembra','119','2019-02-17') ";
    
    Statement st=conec.createStatement();
    int fa=st.executeUpdate(sentencia);
    System.out.println("Filas Insertadas: "+fa);
    
    }
    catch(Exception e)
        {
        System.out.println(e.toString());
        }
    
    }
    
}
