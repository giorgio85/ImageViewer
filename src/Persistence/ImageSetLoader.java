
package Persistence;

import Model.Image;
import Model.ImageSet;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageSetLoader {
    
    public static void load(ImageSet imageSet){
        
        DataBaseHandler db = new DataBaseHandler();
        
        ResultSet resultado = null;
        
        String sql = "select code, name, link from images";
        try {
            resultado = db.consultar(sql);
            if(resultado != null){
                while(resultado.next()){
                    String name, link;
                    int code;
                    code = Integer.parseInt(resultado.getObject(1).toString());
                    name = resultado.getObject(2).toString();
                    link = resultado.getObject(3).toString();
                    imageSet.add(new Image(code, name, link));
                }
            }
        }catch(SQLException e){
        }
        finally{
            try{          
                if(resultado != null){
                    resultado.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }                  
    }
    
}
