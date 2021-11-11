package ch.bbbaden.ila3_m133_m152_login.formular;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String password, name;

    
    public LoginBean() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String doLogin() {
   
        if (this.getName().equals("Flick") & this.getPassword().equals("Alexander")) {
            return "formularOne.xhtml";
        } else if (this.getName().equals("Metehan") & this.getPassword().equals("Altay")) {
            return "formularOne.xhtml";
        } else if (this.getName().equals("Merlin") & this.getPassword().equals("vanderkolk")) {
            return "formularOne.xhtml";
        } else if (this.getName().equals("1") & this.getPassword().equals("1")) {
            return "formularOne.xhtml";
        } else {
            return "login.xhtml";
        }

    }
}
