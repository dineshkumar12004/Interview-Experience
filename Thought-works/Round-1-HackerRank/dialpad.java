public class dialpad {
    static String printPermutations(int n) {
        String arr[] = new String[10];

        // arr[0] = "null";
        // arr[1] =
        arr[2] = "ABC";
        arr[3] = "DEF";
        arr[4] = "GHI";
        arr[5] = "JKL";
        arr[6] = "MNO";
        arr[7] = "PQRS";
        arr[8] = "TUV";
        arr[9] = "WXYZ";

        int x = n / 10; // 2
        int y = n % 10; // 3

        // System.out.println(arr[x].charAt[i])

        String res = "";
        for (int i = 0; i < arr[x].length(); i++) {
            for (int j = 0; j < arr[y].length(); j++) {
                res = res + arr[x].charAt(i) + arr[y].charAt(j) + " ";
            }
        }

        return res;

    }

    public static void main(String[] args) {
        String s = printPermutations(23);
        System.out.println(s);

    }
}
