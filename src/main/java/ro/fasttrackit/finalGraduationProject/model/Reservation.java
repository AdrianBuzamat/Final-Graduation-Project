package ro.fasttrackit.finalGraduationProject.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String date;
//    private LocalDateTime date;


    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToOne(cascade = CascadeType.ALL)
    private Institution institution;

    public Reservation() {
    }

    public Reservation(Person person, Institution institution, String date) {
        this.person = person;
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

    public Institution getInstitution() {
        return institution;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", person=" + person +
                ", institution=" + institution +
                '}';
    }

    //    public LocalDateTime getDate() {
//        return date;
//    }
}
