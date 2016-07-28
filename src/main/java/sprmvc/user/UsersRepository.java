package sprmvc.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UsersRepository implements UserRepo {
    private List<User> userList;

    public UsersRepository() {
        userList = new ArrayList<>();
    }

    @Override
    public User save(User user) {
        userList.add(user);
        return userList.get(userList.size()-1);
    }

    @Override
    public User getByUserName(String userName) throws IllegalArgumentException{
        Iterator it = userList.iterator();
        while (it.hasNext()) {
            User itUser = (User) it.next();
            if(itUser.getUserName().equals(userName))
                return itUser;
        }
        throw new IllegalArgumentException();
    }
}
