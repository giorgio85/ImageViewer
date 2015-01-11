package Model;

import java.util.ArrayList;
import java.util.HashSet;

public class ImageSet extends HashSet<Image>{
private static ImageSet instance = null;

private ImageSet(){
    super();
}
public static ImageSet getInstance(){
    if(instance == null)
        instance = new ImageSet();
    return instance;
}
public Image get(int code){
    for(Image image: this){
        if(image.getCode() == code)
            return image;
    }
    return null;
}
public Image[] search(String token){
    ArrayList<Image> list = new ArrayList<Image>();
    for(Image image: this){
        if(Integer.toString(image.getCode()).equalsIgnoreCase(token))
            list.add(image);
        else if(image.getLink().equalsIgnoreCase(token))
            list.add(image);
        else if(image.getName().toLowerCase().contains(token.toLowerCase()))
            list.add(image);
    }
    Image[] image= new Image[(list.size())]; 
    return list.toArray(image);
}
    
}

