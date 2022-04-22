package ro.fasttrackit.finalGraduationProject.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    private String date;
//    private LocalDateTime date;


    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToOne(cascade = CascadeType.ALL)
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    private Institution institution;

    public Reservation() {
    }

    public Reservation(Person person, City city, Institution institution, String date) {
        this.person = person;
        this.city = city;
        this.institution = institution;
        this.date = date;
//        this.date = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public City getCity() {
        return city;
    }

    public Institution getInstitution() {
        return institution;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", person=" + person +
                ", city=" + city +
                ", institution=" + institution +
                '}';
    }

    //    public LocalDateTime getDate() {
//        return date;
//    }
}
