
package Model;

/**
 *
 * @author Noemi
 */
public class Image {
    private final String name;
    private final String link;
    private final int code;
    
    public Image (int code, String name, String link){
        this.name = name;
        this.link = link;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public int getCode() {
        return code;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.code);
    }
    
}
