package Beans;

import com.googlecode.objectify.annotation.Parent;
import java.io.Serializable;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Id;

public class User implements Serializable{
    @Parent Key<Users> users;
    @Id public Long id;
    
    public String email;

    public User(String email){
        if(email.equals("")){
            users = Key.create(Users.class, "default");
        }
        else{
            users = Key.create(Users.class, email);
        }
        this.email = email;
    }
    public User(String email, Long id){
        this(email);
        this.id = id;
    }
    
    
    
}
