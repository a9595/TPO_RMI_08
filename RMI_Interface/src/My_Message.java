import java.io.Serializable;

/**
 Created by tieorange (Andrii Kovalchuk) on 5/16/2015.
 */
public class My_Message implements Serializable {
    private String content;

    public My_Message(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
