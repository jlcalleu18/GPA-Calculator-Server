package edu.citytech.cst.gpacalculator.controller;

import edu.citytech.cst.gpacalculator.businessobject.GradeBO;
import edu.citytech.cst.gpacalculator.model.Grade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("grade")
public class GradeController {

    @GetMapping("/midsemester")
    public String getMidSemesterGrade(@RequestParam float grade){
        return new GradeBO().getMidSemesterGrade(grade);
    }
    @GetMapping("/gpa")
    public Grade determineGPA(@RequestParam float grade){
        return new GradeBO().getGPA(grade);
    }

    @GetMapping("/range")
    public ArrayList<Grade> range(@RequestParam (defaultValue = "5") int incrementBy){
        return new GradeBO().rages(incrementBy);
    }
}
