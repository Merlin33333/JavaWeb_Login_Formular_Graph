package ch.bbbaden.ila3_m133_m152_login.formular;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "formularBean")
@SessionScoped
public class FormularBean implements Serializable{

    public FormularBean() {
    }
    
    private String eheFürAlle, Initiative99, existenz, kakao, kaffee, kreativität;

    //erstes Formular
    public String getEheFürAlle() {
        return eheFürAlle;
    }

    public void setEheFürAlle(String eheFürAlle) {
        this.eheFürAlle = eheFürAlle;
    }

    public String getExistenz() {
        return existenz;
    }

    public void setExistenz(String existenz) {
        this.existenz = existenz;
    }

    public String getKakao() {
        return kakao;
    }

    public void setKakao(String kakao) {
        this.kakao = kakao;
    }

    public String getKaffee() {
        return kaffee;
    }

    public void setKaffee(String kaffee) {
        this.kaffee = kaffee;
    }
    
    //zweites Formular
    public String getInitiative99() {
        return Initiative99;
    }

    public void setInitiative99(String Initiative99) {
        this.Initiative99 = Initiative99;
    }

    public String getKreativität() {
        return kreativität;
    }

    public void setKreativität(String kreativität) {
        this.kreativität = kreativität;
    }
    
    
}
