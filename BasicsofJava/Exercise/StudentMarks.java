package BasicsofJava.Exercise;

public class StudentMarks {
    public static void main(String[] args) {
        int maths = 10;
    int science = 30;
    int sst = 20;
    int hindi = 55;
    int marathi = 45;
    int total = maths+science+sst+hindi+marathi;
    System.out.println("total: " + total);
    double average = total/5.0;
    System.out.println("average: " + average);

}
}