import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Sign In");
        System.out.println("2. Go For a Ride");
        System.out.println("Enter Your Choice : ");

        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("1. Driver");
                System.out.println("2. User");
                System.out.println("Enter Your Choice : ");
                switch (sc.nextInt())
                {
                    case 1:
                        Driver d=new Driver();
                        System.out.println("Enter Name : ");
                        String nameD = sc.nextLine();
                        d.setName(nameD);
                        System.out.println("Enter Phone Number : ");
                        String phoneD = sc.nextLine();
                        d.setPhoneno(phoneD);
                        System.out.println("Enter Car Number");
                        String noD = sc.nextLine();
                        d.setCarno(noD);
                        System.out.println("Enter Car Type : ");
                        String modelD = sc.nextLine();
                        d.setCarType(modelD);
                        System.out.println("Enter Is Empty : ");
                        boolean emptyD = sc.nextBoolean();
                        d.setEmpty(emptyD);
                        break;
                    case 2:
                        User u=new User();
                        System.out.println("Enter Name : ");
                        String nameU = sc.nextLine();
                        u.setName(nameU);
                        System.out.println("Enter Phone Number : ");
                        String phoneU = sc.nextLine();
                        u.setPhoneno(phoneU);
                        break;

                    default:
                        System.out.println("Invalid Input");
                }

                break;

            case 2:
                Booking b = new Booking();

                System.out.println("Enter pick Up Location : ");
                String s1=sc.nextLine();

                System.out.println("Enter drop Location : ");
                String s2=sc.nextLine();

                System.out.println("Enter distance : ");
                int d=sc.nextInt();

                System.out.println("Car Type \n1. MINI \n2. Sedan \n3.SUV \nEnter Your Choice : ");
                int t=sc.nextInt();
                b.makeBooking(s1, s2, d, t);

                System.out.println("You have reached to your destination from "+b.getPickupLocation()+" to "+b.getDropLocation());
                System.out.println("Your Total Fair is : "+b.getTotalFair());
                System.out.println("1. Cash");
                System.out.println("2. Card");
                System.out.println("3. UPI");
                System.out.println("Enter your choice : ");
                int p=sc.nextInt();
                b.makePayment(p);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}