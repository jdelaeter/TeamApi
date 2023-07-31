package fr.badmintonLeDoulieu.api.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "team")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Division")
    private String division;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="teamId")
    private List<PlayerEntity> players;

    public TeamEntity() {

    }

    public TeamEntity(Long id, String name, String division, List<PlayerEntity> players) {
        this.id = id;
        this.name = name;
        this.division = division;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<PlayerEntity> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerEntity> players) {
        this.players = players;
    }

}