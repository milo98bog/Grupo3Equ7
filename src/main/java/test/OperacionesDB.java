
package test;

import beans.Maquinas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesDB {
    
    public static void main(String[] args){
        listarMaquina();
        //actualizarMaquina(1,"Corte");
    }

      
    public static void actualizarMaquina(int id,String categoria){
        
        DBConnection con = new DBConnection();
        String sql = "UPDATE maquina SET categoria = '"+categoria+"'WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            con.desconectar();
        }
    }
    
    public static void listarMaquina(){
        
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM maquina";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String categoria = rs.getString("categoria");
                String marca = rs.getString("marca");
                int unidades_disponibles = rs.getInt("unidades_disponibles");
                boolean novedad = rs.getBoolean("novedad");
                
                Maquinas maquinas = new Maquinas(id,titulo,categoria,marca,unidades_disponibles,novedad);
                System.out.println(maquinas.toString());
               
            }
            
            st.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            con.desconectar();
        }
    }
    

    
}
