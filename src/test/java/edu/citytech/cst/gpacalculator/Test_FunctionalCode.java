package edu.citytech.cst.gpacalculator;

import edu.citytech.cst.gpacalculator.businessobject.GradeBO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.stream.IntStream;

@DisplayName("Standard code vs Functional code")
public class Test_FunctionalCode {

    @Test
    @DisplayName("For Loop.....Standard code vs Functional code")
    void e01(){
        System.out.println("Welcome Unit testing");

        for (int i = 10 ; i <=100 ; i++) {

            if (i * 5 > 100)
                break;

            var g = new GradeBO().getGPA(i * 5);
            System.out.println(g);
        }
    }

    public static void p (int booboo){

    }

    @Test
    @DisplayName("Functional Coding")
    void e02(){

//        System.out.println("x");
//        Consumer x = System.out::println;
//        Object y = 100;

        IntStream.rangeClosed(10, 100).forEach(e -> {
            System.out.println("e: "+e *5);
        });
    }
}
