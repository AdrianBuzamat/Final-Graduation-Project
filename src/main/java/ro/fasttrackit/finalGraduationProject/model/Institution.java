package ro.fasttrackit.finalGraduationProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Institution {
    @Id
    @GeneratedValue
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
