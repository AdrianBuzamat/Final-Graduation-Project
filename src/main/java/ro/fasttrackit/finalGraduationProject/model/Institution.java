package ro.fasttrackit.finalGraduationProject.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Institution {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String city;
    private String type;

    public Institution() {
    }

    public Institution(String name, String city){
        this.name= name;
        this.city = city;
        this.type= null;
    }

    public Institution(String name, String city, String type) {
        this.name = name;
        this.city = city;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
