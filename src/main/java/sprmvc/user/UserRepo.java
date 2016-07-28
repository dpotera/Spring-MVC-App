package sprmvc.user;

public interface UserRepo {

    User save(User user);

    User getByUserName(String userName) throws IllegalArgumentException;

}
