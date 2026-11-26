package BasicsofJava.ClassWork;

public class Array1D {
    public static void main(String[] args){
        //print array of 5 elements 
        //int[] marks;//declaration
        //marks = new int[5];//create array
        int[] score = {10, 20, 30, 40, 50};//initialisation
        System.out.println(score[0]);//accessing array elements
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length);//length of array
        //loop 
        for (int i=0; i<score.length; i++){
            System.out.println(score[i]);//Printing array elements using loop
        }
    }
}
