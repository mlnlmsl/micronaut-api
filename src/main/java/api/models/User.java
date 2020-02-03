package api.models;

// import io.micronaut.core.annotation.Introspected;

import javax.persistence.*;

@Entity(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name= "fullname")
    private String fullname;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFullname(String name){
        this.fullname = name;
    }
    public String getFullname(){
        return  this.fullname;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }

}