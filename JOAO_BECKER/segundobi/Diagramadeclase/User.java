package segundobi.Diagramadeclase;

public class User {
    private String email;
    private String name;
    private String password;
    private String cellphoneNumber;

    public User(String email, String name, String password, String cellphoneNumber) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.cellphoneNumber = cellphoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }
    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    
    
}
