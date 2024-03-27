
import java.io.Serializable;

public class Message implements Serializable {

    private String content;
    private boolean isPublic;
    private Node receiver;

    public Message(String content, boolean isPublic) {
        this.content = content;
        this.isPublic = isPublic;
    }

    public Message(String content, boolean isPublic, Node receiver) {
        this.content = content;
        this.isPublic = isPublic;
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public Node getReceiver() {
        return receiver;
    }
}