package sprmvc.user;

public interface UserRepo {

    void save(User user);

    User getByUserName(String userName) throws IllegalArgumentException;

}
