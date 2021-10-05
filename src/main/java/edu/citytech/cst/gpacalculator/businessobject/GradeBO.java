package edu.citytech.cst.gpacalculator.businessobject;

import edu.citytech.cst.gpacalculator.model.Grade;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class GradeBO {
    public String getMidSemesterGrade(float grade){
        String status = "failing";
        if (grade >= 65)
            status = "Passing";
        return status;
    }
    public Grade getGPA(float score){
        var grade = new Grade();
         if( score >=93)
             grade = new Grade("A",  4.0f, "93 - 100", score);
         else if( score >=90)
             grade = new Grade("-A", 3.7f, "90 - 92.99",score);
         else if( score >=87)
             grade = new Grade("B+", 3.3f, "87 - 89.9", score);
         else if( score >=83)
             grade = new Grade("B",  3.0f, "83 - 86.9", score);
         else if( score >=80)
             grade = new Grade("-B", 2.7f, "80 - 82.9", score);
         else if( score >=77)
             grade = new Grade("C+", 2.3f, "77 - 79.9", score);
         else if( score >=70)
             grade = new Grade("C",  2.0f, "70 - 76.9", score);
         else if( score >=60)
             grade = new Grade("D",  1.0f, "60 - 69.9", score);
         else if( score < 60)
             grade = new Grade("F",  0.0f, "59.9 and below", score);
         return grade;
    }

    public ArrayList rages(int incrementBy){
        ArrayList<Grade> range = new ArrayList<>();
        IntStream.rangeClosed(10, 100)
                .mapToLong(m -> m* incrementBy)
                .filter(f -> f <=110)
                .forEach(e -> {
                    range.add(this.getGPA(e));
                });

        return range;
    }
}
