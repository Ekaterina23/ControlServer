package remindme.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "remind")

public class Remind {
//hibernate.hbm2ddl.auto = validate
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "Фамилия", nullable = false, length = 50)
    private String surname;

    @Column(name = "Имя", nullable = false, length = 50)
    private String first;

    @Column(name = "Должность", nullable = false, length = 50)
    private String position;

    @Column(name = "Дата", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date remindDate;

    public Remind() {    }

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return first;
    }

    public void setName(String first) {
        this.first = first;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public Date getRemindDate() {return remindDate;}

    public void setRemindDate(Date remindDate) {this.remindDate = remindDate;}
}
