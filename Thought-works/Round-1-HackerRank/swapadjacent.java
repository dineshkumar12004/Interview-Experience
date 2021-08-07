public class swapadjacent {
    //  swap adjacent elements in an array
    //  I/p: a =[1,2,3,4] 
    //  O/p:  a =[2,1,4,3]
    
    static void swap(int [] a){
        
        for(int i = 0; i < a.length; i = i + 2){
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        
        
    }
    
    
	public static void main (String[] args) {
		
		int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        
		
		swap(arr);
	}
}
