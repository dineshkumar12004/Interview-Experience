import java.util.Scanner;

class ArrayLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int N = sc.nextInt();
        int [] arr = new int[10];

        // getting input for array
        for(int i=0; i<N;i++){
            arr[i] = sc.nextInt();
        }

        // checking if arr[i] last digit is divisible by 10
        for(int i=0;i<N;i++){
            int rem = arr[i]%10;
            if(rem%10==0){
                System.out.println("YES");
            }
        }
        sc.close();
    }

}