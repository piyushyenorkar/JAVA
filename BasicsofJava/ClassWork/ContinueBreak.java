package BasicsofJava.ClassWork;

public class ContinueBreak {
    public static void main(String[] args){
        int i;
        for (i=1; i<=10; i++){
        if (i == 5){
            continue;//it will skip the element in loop
        }else if (i == 8) {
            break;// it will stop the loop and execute out of the looop
        }
        System.out.println(i);
    }

}
}
//in nested loop it break only very inside loop not his parent loop 