
package model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jialiang Chen
 */
@XmlRootElement
@Entity
public class Usuaris implements Serializable{
    @Id
    @SequenceGenerator(name="Usuaris_Gen", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Usuaris_Gen") 
    private long id;
    private String username;
    private String password;
    @OneToMany(mappedBy = "author")
    private List<Articles> article;
    
     public Usuaris(String u){
        this.username=u;
    }
     public void UsuarisList(Usuaris Usuaris){
        this.id=Usuaris.getId();
        this.username=Usuaris.getUsername();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Articles> getArticles() {
        return article;
    }

    public void setArticles(List<Articles> rental) {
        this.article = rental;
    }
    
}
