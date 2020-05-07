public class PizzaSculptor {
    public static void main(String[] args){



        //หน้านี้ อยากให้ print menu pizza 4 หน้าที่เรามี
        // อยากให้ customer เลือกได้ว่าจะเอา pizza แบบไหน
        // ใช้ printBox ใน Pizza สร้างหรอบเมนูสวยๆ

        Pizza pep = new PepperoniPizza();
        pep.makePizza();
        System.out.println();
        Pizza pep2 = new SaucelessPizza();
        pep2.makePizza();
    }
}
