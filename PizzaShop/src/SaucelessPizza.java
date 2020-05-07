public class SaucelessPizza extends Pizza {


    String[] doughUsed = {"Neapolitan"};
    String[] sauceUsed = {};
    String[] mushroomUsed = {"Truffles"};
    String[] vegetableUsed = {"Garlic",};
    String[] meatUsed = {" briny littleneck clams"};
    String[] cheeseUsed = {"grated cheese"};

    boolean customerWantSauce(){
        return false;
    }

    @Override
    void addPizzaDough() {
        printBox("Sauceless Pizza");

        System.out.print("Dough Type : ");
        for(String dough : doughUsed){
            System.out.print(dough+" ");
        }
        System.out.println();

    }

    @Override
    void addSauce() {
        System.out.print("Sauce Type : ");
        for(String sauce : sauceUsed){
            System.out.print(sauce+" ");
        }

        System.out.println();
    }

    @Override
    void addMushroom() {
        System.out.print("Select Mushroom : ");
        for(String mushroom : mushroomUsed){
            System.out.print(mushroom+" ");
        }

        System.out.println();


    }

    @Override
    void addVegetable() {
        System.out.print("Select Veggie : ");
        for(String veggie : vegetableUsed){
            System.out.print(veggie+" ");
        }

        System.out.println();

    }

    @Override
    void addMeat() {
        System.out.print("Select Meat : ");
        for(String meat : meatUsed){
            System.out.print(meat+" ");
        }

        System.out.println();

    }

    @Override
    void addCheese() {
        System.out.print("Select Cheese : ");
        for(String cheese : cheeseUsed){
            System.out.print(cheese+" ");
        }

        System.out.println();

    }
}
