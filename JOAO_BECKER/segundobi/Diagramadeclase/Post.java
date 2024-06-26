package segundobi.Diagramadeclase;

public class Post {

    private String title;
    private String discription;
    private User user;
    
    public Post(String title, String discription, User user) {
        this.title = title;
        this.discription = discription;
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}
