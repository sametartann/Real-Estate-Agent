import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RealEstateAgent realEstateAgent = new RealEstateAgent();

        while (true){
            System.out.println("Do you want to add a house? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            if (!(s.equals("y")|| s.equals("n"))) {
                System.err.println("Uncorrect input!");
            }

            else if (s.equals("n"))
                break;

            else {

                System.out.println("Enter state:");
                String state = scanner.nextLine();
                House h = new House(state);

                System.out.println("Enter price:");
                double price = scanner.nextDouble();
                h.setPrice(price);

                System.out.println("Enter type:");
                String type = scanner.next();
                h.setType(type);

                boolean isAdded = realEstateAgent.addHouse(h);

                if (isAdded) {
                    System.out.println("The house is added to the list.");
                } else {
                    System.err.println("The house is not added to the list!");
                }
            }

        }

        System.out.println("\nAll Houses' Information:\n");
        realEstateAgent.printData();

        System.out.println("\n****************\nMultiples of 10:");

        realEstateAgent.findMultiplesOfTen();

        System.out.println("\n****************\nSort By State:");

        realEstateAgent.sortByState();
        realEstateAgent.printData();

        System.out.println("\n****************\nSort By Price:");

        realEstateAgent.sortByPrice();
        realEstateAgent.printData();

        System.out.println("\n****************\nCalculate Average For Rental:");

        System.out.println(realEstateAgent.calculateAverageForRental());


        /*

        //These lines are to control manually.

        House h1=new House("rental");
        h1.setPrice(2506);
        h1.setType("Flat");
        House h2=new House("sale");
        h2.setPrice(250577.3456);
        h2.setType("Detached house");
        House h3=new House("rental");
        h3.setPrice(2507);
        h3.setType("Villa");
        House h4=new House("rental");
        h4.setPrice(2803);
        h4.setType("Villa");
        House h5=new House("rental");
        h5.setPrice(2502);
        h5.setType("Detached house");
        House h6=new House("sale");
        h6.setPrice(250100);
        h6.setType("Villa");
        House h7=new House("rental");
        h7.setPrice(2500);
        h7.setType("Villa");
        House h8=new House("sale");
        h8.setPrice(249900);
        h8.setType("Villa");
        House h9=new House("rental");
        h9.setPrice(2498);
        h9.setType("Villa");
        House h10=new House("sale");
        h10.setPrice(240097.555666);
        h10.setType("Flat");
        House h11=new House("rental");
        h11.setPrice(2496);
        h11.setType("Villa");
        House h12=new House("sale");
        h12.setPrice(249005);
        h12.setType("Flat");
        House h13=new House("rental");
        h13.setPrice(2494.3569);
        h13.setType("Detached house");
        House h14=new House("sale");
        h14.setPrice(200493);
        h14.setType("Villa");
        House h15=new House("rental");
        h15.setPrice(2492);
        h15.setType("Detached house");
        House h16=new House("sale");
        h16.setPrice(249001);
        h16.setType("Villa");
        House h17=new House("rental");
        h17.setPrice(2490);
        h17.setType("Villa");
        House h18=new House("sale");
        h18.setPrice(248900);
        h18.setType("Villa");
        House h19=new House("rental");
        h19.setPrice(2488);
        h19.setType("Villa");
        House h20=new House("sale");
        h20.setPrice(240087);
        h20.setType("Detached house");
        House h21=new House("rental");
        h21.setPrice(2486);
        h21.setType("Flat");
        House h22=new House("sale");
        h22.setPrice(200485.4441);
        h22.setType("Flat");
        House h23=new House("rental");
        h23.setPrice(2184);
        h23.setType("Detached house");
        House h24=new House("sale");
        h24.setPrice(248300);
        h24.setType("Detached house");
        House h25=new House("rental");
        h25.setPrice(2482);
        h25.setType("Villa");
        House h26=new House("sale");
        h26.setPrice(248100);
        h26.setType("Flat");
        House h27=new House("rental");
        h27.setPrice(2480);
        h27.setType("Villa");
        House h28=new House("sale");
        h28.setPrice(200479);
        h28.setType("Villa");
        House h29=new House("rental");
        h29.setPrice(2478);
        h29.setType("Villa");
        House h30=new House("sale");
        h30.setPrice(240077);
        h30.setType("Villa");
        House h31=new House("rental");
        h31.setPrice(2476);
        h31.setType("Flat");
        House h32=new House("sale");
        h32.setPrice(247500);
        h32.setType("Detached house");
        House h33=new House("rental");
        h33.setPrice(1974);
        h33.setType("Villa");
        House h34=new House("sale");
        h34.setPrice(247300);
        h34.setType("Flat");
        House h35=new House("rental");
        h35.setPrice(2472);
        h35.setType("Villa");
        House h36=new House("sale");
        h36.setPrice(240071);
        h36.setType("Villa");
        House h37=new House("rental");
        h37.setPrice(2470);
        h37.setType("Detached house");
        House h38=new House("sale");
        h38.setPrice(240069);
        h38.setType("Flat");
        House h39=new House("rental");
        h39.setPrice(2468);
        h39.setType("Detached house");
        House h40=new House("rental");
        h40.setPrice(2467.123);
        h40.setType("Villa");
        House h41=new House("sale");
        h41.setPrice(204066);
        h41.setType("Villa");
        House h42=new House("sale");
        h42.setPrice(200465);
        h42.setType("Detached house");
        House h43=new House("rental");
        h43.setPrice(2131.2133);
        h43.setType("Villa");
        House h44=new House("sale");
        h44.setPrice(200463);
        h44.setType("Villa");

        House h45=new House();
        h45.setState("rental");
        h45.setPrice(2462.667);
        h45.setType("Detached house");

        RealEstateAgent realEstateAgent = new RealEstateAgent();
        realEstateAgent.addHouse(h1);
        realEstateAgent.addHouse(h2);
        realEstateAgent.addHouse(h3);
        realEstateAgent.addHouse(h4);
        realEstateAgent.addHouse(h5);
        realEstateAgent.addHouse(h6);
        realEstateAgent.addHouse(h7);
        realEstateAgent.addHouse(h8);
        realEstateAgent.addHouse(h9);
        realEstateAgent.addHouse(h10);
        realEstateAgent.addHouse(h11);
        realEstateAgent.addHouse(h12);
        realEstateAgent.addHouse(h13);
        realEstateAgent.addHouse(h14);
        realEstateAgent.addHouse(h15);
        realEstateAgent.addHouse(h16);
        realEstateAgent.addHouse(h17);
        realEstateAgent.addHouse(h18);
        realEstateAgent.addHouse(h19);
        realEstateAgent.addHouse(h20);
        realEstateAgent.addHouse(h21);
        realEstateAgent.addHouse(h22);
        realEstateAgent.addHouse(h23);
        realEstateAgent.addHouse(h24);
        realEstateAgent.addHouse(h25);
        realEstateAgent.addHouse(h26);
        realEstateAgent.addHouse(h27);
        realEstateAgent.addHouse(h28);
        realEstateAgent.addHouse(h29);
        realEstateAgent.addHouse(h30);
        realEstateAgent.addHouse(h31);
        realEstateAgent.addHouse(h32);
        realEstateAgent.addHouse(h33);
        realEstateAgent.addHouse(h34);
        realEstateAgent.addHouse(h35);
        realEstateAgent.addHouse(h36);
        realEstateAgent.addHouse(h37);
        realEstateAgent.addHouse(h38);
        realEstateAgent.addHouse(h39);
        realEstateAgent.addHouse(h40);
        realEstateAgent.addHouse(h41);
        realEstateAgent.addHouse(h42);
        realEstateAgent.addHouse(h43);
        realEstateAgent.addHouse(h44);
        realEstateAgent.addHouse(h45);

*/
    }

}
