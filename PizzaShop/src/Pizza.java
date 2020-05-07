public abstract class Pizza {

    private static int getMaxLength(String... strings) {
        int len = Integer.MIN_VALUE;
        for (String str : strings) {
            len = Math.max(str.length(), len);
        }
        return len;
    }

    private static String padString(String str, int len) {
        StringBuilder sb = new StringBuilder(str);
        return sb.append(fill(' ', len - str.length())).toString();
    }

    private static String fill(char ch, int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void printBox(String... strings) {
        int maxBoxWidth = getMaxLength(strings);
        String line = "+" + fill('-', maxBoxWidth + 2) + "+";
        System.out.println(line);
        for (String str : strings) {
            System.out.printf("| %s |%n", padString(str, maxBoxWidth));
        }
        System.out.println(line);
    }


    final void makePizza(){

        if(customerWantPizzaDough()){
            addPizzaDough();
        }

        if(customerWantSauce()){
            addSauce();
        }

        if(customerWantMushroom()){
            addMushroom();
        }

        if(customerWantVegetable()){
            addVegetable();
        }

        if(customerWantMeat()){
            addMeat();
        }

        if(customerWantCheese()){
            addCheese();
        }


        putInBox();
    }


    //ใส่ abstract
    abstract void addPizzaDough();
    abstract void addSauce();
    abstract void addMushroom();
    abstract void addVegetable();
    abstract void addMeat();
    abstract void addCheese();


    //ใส่ abstract
    boolean customerWantPizzaDough(){
        return true;
    }

    boolean customerWantSauce(){
        return true;
    }

    boolean customerWantMushroom(){
        return true;
    }

    boolean customerWantVegetable(){
        return true;
    }

    boolean customerWantMeat(){
        return true;
    }

    boolean customerWantCheese(){
        return true;
    }

    public void putInBox(){
        System.out.print("Put the Pizza in box");
    }


}
