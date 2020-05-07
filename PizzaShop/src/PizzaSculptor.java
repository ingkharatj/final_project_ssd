import java.util.Scanner;

public class PizzaSculptor {
    public static void main(String[] args){


        //หน้านี้ อยากให้ print menu pizza 4 หน้าที่เรามี
        // อยากให้ customer เลือกได้ว่าจะเอา pizza แบบไหน
        // ใช้ printBox ใน Pizza สร้างหรอบเมนูสวยๆ
while (true){


        System.out.println("+---------------------------------+");
        System.out.println("|            Pizza menu           |");
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("|  BBQChickenPizza                |");
        System.out.println("|  PepperoniPizza                 |");
        System.out.println("|  SaucelessPizza                 |");
        System.out.println("|  VeggiePizza                    |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");
        Scanner sc = new Scanner(System.in);
        System.out.print("Select your pizza : ");
        String pizza = sc.nextLine();
        
        if(pizza.toLowerCase().equals("pepperonipizza")){
            Pizza pep = new PepperoniPizza();
            pep.makePizza();
            System.out.println();
            
        }
        if(pizza.toLowerCase().equals("saucelesspizza")){
            Pizza pep2 = new SaucelessPizza();
            pep2.makePizza();
            System.out.println();
            
        }
        if(pizza.toLowerCase().equals("bbqchickenpizza")){
            Pizza pep3 = new BBQChickenPizza();
            pep3.makePizza();
            System.out.println();
        
        }
        if(pizza.toLowerCase().equals("veggiepizza")){
            Pizza pep4 = new VeggiePizza();
            pep4.makePizza();
            System.out.println();

    }
    System.out.print("Do you want anything more ? if donot please press q to quit if you want press anythin : ");
    String select = sc.nextLine();
    if (select.toLowerCase().equals("q")){
        break;
    }
    
}
}
}
