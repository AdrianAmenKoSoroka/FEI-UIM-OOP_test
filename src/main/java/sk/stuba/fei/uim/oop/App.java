package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args){
        System.out.println("Hello world!");

        int[] A_arr = new int[]{1,6,7,9,10,15,20,-5,3,-6};
        int[] B_arr = new int[]{7,-3,-2,6,-90,90,-2,-5,3};

        for (int index = 0; index < A_arr.length && index < B_arr.length; index++) {
            System.out.println(A_arr[index] + " Comparing with: " + B_arr[index] + " output: " + App.Compare(A_arr[index], B_arr[index]));
        }

    }

    public static int Compare(int A, int B){
        if (A > B){
            return 2;
        }else if (A == B){
            return 0;
        }
        return -1;
    }
}
