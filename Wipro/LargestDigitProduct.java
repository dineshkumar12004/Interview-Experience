class LargestDigitProduct{
    public static void main(String[] args){
        int input1 = 1234;
        int input2 = 5678;
        int input3 = 9012;
        int input4 = 4503;

        // largest 1000 digit number
        int a = input1/1000;
        int b = input2/1000;
        int c = input3/1000;
        int d = input4/1000;
        
        // find largest out of a,b,c,d
        int largest1 = a;
        if(b>largest1) largest1 = b;
        if(c>largest1) largest1 = c;
        if(d>largest1) largest1 = d;
        System.out.println(largest1);

        // largets 100 digit number
        int e = (input1/100)%10;
        int f = (input2/100)%10;
        int g = (input3/100)%10;
        int h = (input4/100)%10;
        
        //find largest out of e,f,g,h
        int largest2 = e;
        if(f>largest2) largest2 = f;
        if(g>largest2) largest2 = g;
        if(h>largest2) largest2 = h;
        System.out.println(largest2);

        // largest 10 digit number
        int i = (input1/10)%10;
        int j = (input2/10)%10;
        int k = (input3/10)%10;
        int l = (input4/10)%10;
        
        //find largest out of i,j,k,l
        int largest3 = i;
        if(j>largest3) largest3 = j;
        if(k>largest3) largest3 = k;
        if(l>largest3) largest3 = l;
        System.out.println(largest3);

        // largest digit number
        int largestofall = largest1*largest2*largest3;
        System.out.println("Hurray : "+largestofall);
    }
}