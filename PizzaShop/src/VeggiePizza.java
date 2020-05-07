public class VeggiePizza extends Pizza {

    String[] doughUsed = {"Custom"};
    String[] sauceUsed = {"Soure Cream", "Cream Cheese"};
    String[] mushroomUsed = {"Portobello","Chanterelles","Porcinis","Truffles"};
    String[] vegetableUsed = {" dill weed","garlic","carrot", "celery","broccoli",
            "radish","bell pepper","broccoli"};
    String[] meatUsed = {};
    String[] cheeseUsed = {"mozzarella cheese",};

    boolean customerWantMeat(){
        return false;
    }


    @Override
    void addPizzaDough() {
        printBox("Veggie Pizza");
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
