package hello;

public class webHello {

    private final Long id;
    private final String content;

    public webHello(Long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
