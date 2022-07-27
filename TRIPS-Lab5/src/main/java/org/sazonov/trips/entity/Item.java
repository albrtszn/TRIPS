package org.sazonov.trips.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.sazonov.trips.entity.Form.ItemForm;
import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Student information
     */
    @Column( name = "First_Name")
    private String FName;
    @Column( name = "Second_Name")
    private String SName;
    @Column( name = "Class")
    private String Grp;
    @Column( name = "Grade")
    private String Grade;
    /**
     * Answers on questions
     */
    @Column( name = "question_1")
    private String q1;
    @Column( name = "question_2")
    private String q2;
    @Column( name = "question_3")
    private String q3;
    @Column( name = "question_4")
    private String q4;
    @Column( name = "question_5")
    private String q5;
    @Column( name = "question_6")
    private String q6;
    @Column( name = "question_7")
    private String q7;
    @Column( name = "question_8")
    private String q8;
    @Column( name = "question_9")
    private String q9;
    @Column( name = "question_10")
    private String q10;

    public Item(String FName,String SName, String Class,
                String q1, String q2, String q3, String q4, String q5,
                String q6, String q7, String q8, String q9, String q10){
        this.FName = FName;
        this.SName = SName;
        this.Grp = Class;
        //this.Grade = checkAnswer();
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.q7 = q7;
        this.q8 = q8;
        this.q9 = q9;
        this.q10 = q10;
    }

    public Item(ItemForm itemForm){
        this.FName = itemForm.getFName();
        this.SName = itemForm.getSName();
        this.Grp = itemForm.getGrp();
        this.Grade = checkAnswer(itemForm);
        this.q1 = itemForm.getQ1();
        this.q2 = itemForm.getQ2();
        this.q3 = itemForm.getQ3();
        this.q4 = itemForm.getQ4();
        this.q5 = itemForm.getQ5();
        this.q6 = itemForm.getQ6();
        this.q7 = itemForm.getQ7();
        this.q8 = itemForm.getQ8();
        this.q9 = itemForm.getQ9();
        this.q10 = itemForm.getQ10();
    }

    public String checkAnswer(ItemForm itemForm){
        int grade = 0;
        if(itemForm.getQ1().equals("correct")){
            grade=grade+1;
        }
        if(itemForm.getQ2().equals("correct")){
            grade++;
        }
        if(itemForm.getQ3().equals("correct")){
            grade++;
        }
        if(itemForm.getQ4().equals("correct")){
            grade++;
        }
        if(itemForm.getQ5().equals("correct")){
            grade++;
        }
        if(itemForm.getQ6().equals("correct")){
            grade++;
        }
        if(itemForm.getQ7().equals("correct")){
            grade++;
        }
        if(itemForm.getQ8().equals("correct")){
            grade++;
        }
        if(itemForm.getQ9().equals("correct")){
            grade++;
        }
        if(itemForm.getQ10().equals("correct")){
            grade++;
        }
        return Integer.toString(grade);
    }
}