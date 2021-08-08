import java.util.Scanner;

class Station {
    public static void main(String[] args) {
        System.out.println("Purchase Date & Time");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting pt:");
        String start = sc.nextLine();
        System.out.println(start);
        System.out.println("Enter the Destination pt");
        String end = sc.nextLine();
        System.out.println(end);
        System.out.println("No. of stops b/w start and end:");
        int stops = sc.nextInt();
        System.out.println(stops + " Stops");
        int cost1 = price(stops);
        System.out.println(cost1);

    }

    public static int price(int stops) {
        int cost;
        if (stops == 18) {
            cost = 20;
            return cost;
        }
        if (stops <= 5) {
            cost = 10;
            return cost;
        }

        stops = stops - 5;
        cost = 10;

        while (stops > 0) {
            stops -= 5;
            cost += 5;
        }
        return cost;

    }
}