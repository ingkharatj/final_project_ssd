public abstract class Pizza {

    final void makePizza(){

        if(customerWantNeapolitan()){
            addNeapolitanDough();
        }

        if(customerWantRoman()){
            addRomanDough();
        }


        if(customerWantMeat()){
            addMeat();
        }

        putInBox();
    }



    abstract void addMeat();
    abstract void  addNeapolitanDough();
    abstract void addRomanDough();


    boolean customerWantNeapolitan(){
        return true;
    }

    boolean customerWantRoman(){
        return true;
    }


    boolean customerWantMeat(){
        return true;
    }

    public void putInBox(){
        System.out.print("Put the Pizza in box");
    }


}
