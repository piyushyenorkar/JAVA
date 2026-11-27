package BasicsofJava.ClassWork;

public class Array2D {
        public static void main(String[] args){
            int[][] arr= {{10, 20, 30}, {30, 40, 50}};
            System.out.println(arr[1][2]);

            for (int row=0; row < arr.length; row++){
                for (int col=0; col < arr[row].length; col++){
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }

        }
}
