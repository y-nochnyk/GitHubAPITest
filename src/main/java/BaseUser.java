public class BaseUser {

    private String name = "Yaroslav Nochnyk";
    private String type = "User";
    private String location = "Kiev, Ukraine";
    private String created_at = "2019-03-19";

    public BaseUser(){}

    public BaseUser(String name, String type, String location, String created_date) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.created_at = created_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
