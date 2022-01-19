package oop;

public class main {
    public static void main(String[] args) {

        Vechicle vechicle1 = new Vechicle();
        System.out.println(vechicle1.name);
        vechicle1.setname("bmw");
        vechicle1.setColor("red");
        vechicle1.setModel("x6");
        vechicle1.setCompany("navnith");
        System.out.println(vechicle1.name);
        System.out.println(vechicle1.color);
        System.out.println(vechicle1.model);
        System.out.println(vechicle1.company);
        System.out.println(vechicle1.engine);

        Vechicle vechicle2 = new Vechicle("Audi", "black", "A8", "jaguar","800");
        System.out.println(vechicle2.name);
    }
}
