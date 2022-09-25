import java.util.ArrayList;

public class RealEstateAgent {

    private ArrayList<House> houseArray;

    //CONSTRUCTOR

    public RealEstateAgent() {
        houseArray = new ArrayList<House>();
    }

    public boolean addHouse(House h) {  // Add new house advert to ArrayList
        boolean isAddedBefore = false;  //the same advert should not be added to the list before
        for (House house : houseArray) {
            if (h.getPrice() == house.getPrice() &&
                    h.getState().equals(house.getState()) &&
                    h.getType().equals(house.getType())) {
                isAddedBefore = true; // same advert was added before
                break;
            }
        }

        if(!isAddedBefore) {
            houseArray.add(h);
            return true;
        }
        return false;
    }

    public ArrayList<House> sortByPrice(){	//Selection Sort

        for (int i = 0; i < houseArray.size()-1; i++) {

            int minimumIndex = i;
            for (int j = i+1; j < houseArray.size(); j++) {
                if (houseArray.get(j).getPrice() < houseArray.get(minimumIndex).getPrice())
                    minimumIndex = j;   // Find the minimum house price
            }
            //swap the minimum element with the first element of houseArray
            House tempHouse = houseArray.get(i);
            houseArray.set(i, houseArray.get(minimumIndex));
            houseArray.set(minimumIndex, tempHouse);

        }
        return houseArray;
    }

    public ArrayList<House> sortByState(){	//Bubble Sort
        for (int i = 0; i < houseArray.size() - 1; i++) {
            for (int j = 0; j < houseArray.size() - i - 1; j++) {
                if (houseArray.get(j).getState().compareTo(houseArray.get(j+1).getState()) >0) {
                    //swap the element in j with j+1'th element of houseArray
                    House tempHouse = houseArray.get(j);
                    houseArray.set(j, houseArray.get(j+1));
                    houseArray.set(j+1, tempHouse);
                }
            }
        }
        return houseArray;
    }

    public void findMultiplesOfTen() {
        for(int i=9; i < houseArray.size(); i += 10) {  //i=9 because array index starts with 0
            System.out.println("\u001B[31m" + houseArray.get(i) + "\u001B[0m");     // "\u001B[31m" makes console text red, "\u001B[0m" resets text color
        }
    }

    public double calculateAverageForRental(){
        double sum = 0;
        int count = 0;

        for (House house : houseArray) {
            if (house.getState().equals("rental")){
                sum += house.getPrice();
                count++;
            }
        }

        return (count != 0)? (sum / count) : 0;
    }

    public void printData() {
        for (House house : houseArray) {
            System.out.println(house);
        }
    }

}
