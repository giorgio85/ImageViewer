
package imageviewer;

import Model.Image;
import Model.ImageSet;
import Persistence.ImageSetLoader;
import java.util.Iterator;

/**
 *
 * @author Noemi
 */
public class ImageViewer {

   
    public static void main(String[] args) {
        ImageSet images = ImageSet.getInstance();
        ImageSetLoader.load(images);
        
        Iterator iterador = images.iterator();
        while (iterador.hasNext()) {
            Image elemento = (Image) iterador.next();
            System.out.println(elemento.toString());
        }
    }
}
