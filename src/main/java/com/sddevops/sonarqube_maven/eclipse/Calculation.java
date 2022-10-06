package com.sddevops.sonarqube_maven.eclipse;

/**
 * @author keyongenesis - Republic Polytechnic
 *
 */

public class Calculation {
    public Calculation(){}

    public float divide(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }else{
            return a/b;
        }
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

}
