package ro.fasttrackit.finalGraduationProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Institution {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private InstitutionType type;

    public Institution() {
    }

    public Institution(String name) {
        this.name = name;
        this.type = InstitutionType.DEFAULT;
    }

    public Institution(String name, InstitutionType type) {
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public InstitutionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
