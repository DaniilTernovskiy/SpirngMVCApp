package web.models;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="users")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String username;

    @Column(name="Sex")
    private String sex;

    @Column(name = "favorite_sport")
    private String favoriteSport;

    public User() {}

}
