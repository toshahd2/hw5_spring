package ru.tonru.spring_hw5.model;
import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long id;


    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;


    @Column(name = "phone")
    private String phone;


    public Long getId() {
        return id;
    }


    // Добавлены сеттеры
    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
}
