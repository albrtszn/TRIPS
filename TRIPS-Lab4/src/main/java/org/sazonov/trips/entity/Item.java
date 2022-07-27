package org.sazonov.trips.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "FName")
    private String FName;
    @Column(name = "SName")
    private String SName;
    @Column(name = "favourTech")
    private String favourTech;
    @Column(name = "prof")
    private String prof;
    @Column(name = "CONFIRM")
    private String CONFIRM;

    public Item(String Fname,
                String SName,
                String favourTech,
                String prof,
                String CONFIRM){
        this.FName = Fname;
        this.SName = SName;
        this.favourTech = favourTech;
        this.prof = prof;
        this.CONFIRM = CONFIRM;
    }
}
