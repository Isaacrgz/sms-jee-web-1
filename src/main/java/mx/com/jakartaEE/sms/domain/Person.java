package mx.com.jakartaEE.sms.domain;

import jakarta.persistence.*;

@Entity
@NamedQueries(
        @NamedQuery(name="Person.findAll", query="SELECT p FROM Person p ORDER BY p.idPerson")
)
@Table(name = "person")
public class Person {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_person")
    private int idPerson;
    
    private String name;
    
    private String lastname;
    
    private String email;
    
    private String phone;

    public Person() {
    }

    public Person(String name, String lastname, String email, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPersona) {
        this.idPerson = idPersona;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String apellido) {
        this.lastname = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telefono) {
        this.phone = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPerson + ", nombre=" + name + ", apellido=" + lastname + ", email=" + email + ", telefono=" + phone + '}';
    }
    
    
}
