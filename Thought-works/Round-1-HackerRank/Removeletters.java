public class Remove {

    // i/p: "hello",["e","o"]
    // o/p: "hll"

    static void print(String s, char[] a) {

        
        for(int i=0;i<s.length();i++){
            int flag = 0;
            for(int j =0; j< a.length;j++){
                if(s.charAt(i) == a[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[2];
        arr[0] = 'e';
        arr[1] = 'o';
        
        print("hello",arr);

    }

}
