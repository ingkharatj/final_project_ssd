public class BBQChickenPizza extends Pizza{

    String[] doughUsed = {"St. Louis"};
    String[] sauceUsed = {"BBQ Chicken Sauce"};
    String[] mushroomUsed = {"Truffles"};
    String[] vegetableUsed = {"Zucchini","Green peppers","Olives",
            "Garlic","Fresh tomatoes","Onions","Spinach"};
    String[] meatUsed = {"grilled chicken"};
    String[] cheeseUsed = {" Parmesan cheese"};



    @Override
    void addPizzaDough() {
        printBox("BBQ Chicken Pizza");
        System.out.print("Dough Type : ");
        for(String dough : doughUsed){
            System.out.print(dough+" ");
        }
        System.out.println();

    }

    @Override
    void addSauce() {
        printBox("Veggie Pizza");
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
