
package imageviewer;

import Model.Image;
import Model.ImageSet;
import Persistence.ImageSetLoader;
public class ImageViewer {

   
    public static void main(String[] args) {
        ImageSet images = ImageSet.getInstance();
        ImageSetLoader.load(images);
        
        for (Image elemento : images) {
            System.out.println(elemento.toString());
        }
    }
}
