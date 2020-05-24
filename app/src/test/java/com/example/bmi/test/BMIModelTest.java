package com.example.bmi.test;


import com.example.bmi.BMIModel;

import org.junit.Test;



public class BMIModelTest {
    @Test
    public void getBMITest(){

        double w;
        double h;
        System.out.println("Testing BMIModel.getBMI");

        w=76;
        h=1.8;
        System.out.println(w+" , "+h);
        System.out.println(BMIModel.getBMI(w,h));

        w=80;
        h=0.5+2.5*Math.random();
        System.out.println(w+" , "+h);
        System.out.println(BMIModel.getBMI(w,h));

        w=150;
        h=1.5;
        System.out.println(w+" , "+h);
        System.out.println(BMIModel.getBMI(w,h));


        }

    @Test
    public void parseDoubleTest() {

        String w;
        String h;
        System.out.println("Testing BMIModel.parseDouble");

        w="60";
        h="1.8";

        System.out.println(w+" , "+h);
        System.out.println(BMIModel.parseDouble(w));
        System.out.println(BMIModel.parseDouble(h));

        w="75.5";
        h="1.65";

        System.out.println(w+" , "+h);
        System.out.println(BMIModel.parseDouble(w));
        System.out.println(BMIModel.parseDouble(h));

        w="100";
        h="1.9";

        System.out.println(w+" , "+h);
        System.out.println(BMIModel.parseDouble(w));
        System.out.println(BMIModel.parseDouble(h));



        }

    @Test
    public void formatBMITest(){

        double bmi;

        System.out.println("Testing BMIModel.formatBMI");

        bmi=24.87649676746;

        System.out.println(bmi);
        System.out.println(BMIModel.formatBMI(bmi));

        bmi=21.45666565;

        System.out.println(bmi);
        System.out.println(BMIModel.formatBMI(bmi));

        bmi=26.25555;

        System.out.println(bmi);
        System.out.println(BMIModel.formatBMI(bmi));


    }

}











