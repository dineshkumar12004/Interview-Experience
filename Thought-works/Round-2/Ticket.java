import java.util.*;

class Ticket{
    private String start;
    private String end;
    private int stops;
    private int cost;
    private HashMap<String,Integer> map;

    // Ticket(){
    //     start = null;
    //     end = null;
    //     stops = 0;
    // }
    
    Ticket(String s, String e){
        start = s;
        end = e;
        HashMap<String,Integer> temp=new HashMap<String,Integer>();  
        temp.put("A",3);  //Put elements in Map  
        temp.put("B",7);    
        temp.put("C",12);   
        temp.put("D",23);  
        this.map = temp; 
        
    } 
    
    //calculate cost
    public void calculate(){
        int temp = Math.abs(map.get(end) - map.get(start));
        this.stops = temp; 
        // int temp = s;
        if(temp == 18){
            cost = 20;
            return;
        }
        if(temp <= 5){
            cost = 10;
            return ;
        }
        
        temp = temp - 5; //17
        cost = 10;

        // while(temp >0){
        //     temp -= 5;
        //     cost += 5;
        // }
        cost += (int)(Math.ceil(temp/5.0)) * 5;
    }
    
    //print
    public void print(){
        System.out.println("Starting Point: " + start);
        System.out.println("Ending Point: " + end);
        System.out.println("Number of stops: " + stops);
        System.out.println("Cost: Rs " + cost);
    }
    //hashmap
    public HashMap<String, Integer> getcostmap(){
        return this.map;
    }
    
}

class Station {
	public static void main (String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String e = scn.nextLine();
		// int stp = scn.nextInt();
		
		Ticket t1 = new Ticket(s, e);
		t1.calculate();
		t1.print();
		
        scn.close();
	}
}