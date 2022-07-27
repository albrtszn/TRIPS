package org.sazonov.trips.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
@Data
@NoArgsConstructor
public class ChangeLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "time")
    private String time;
    @Column(name = "date")
    private String date;
    @Column(name = "info")
    private String info;

    public ChangeLog(String info){
        this.time = (String)LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.date = (String)LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.info = info;
    }
}
