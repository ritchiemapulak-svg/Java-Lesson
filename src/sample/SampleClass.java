package sample;

public class SampleClass {
    static int onlyOneBranch; // this is a global variable
    public String color; // Null is the value of this!, this is an object.

    public static void main(String... args) {
        // System.out.println("Hello World");

        // int number;
        // float PI = 3.14f;
        // number = 10_001;
        // System.out.println(number + PI);

        // int x = 11;
        // if (x > 10 | testMethod()) {
        // System.out.println("chieSan");
        // }

        // int total = onlyOneBranch + number;
        // System.out.println(total);

        // int y = 6;
        // switch (y) {
        // default:
        // System.out.println("Hello default");

        // case 1:
        // System.out.println("Ritchie");

        // case 2:
        // System.out.println("Ian");
        // }

        // PARENT_LOOP: for (int a = 1; a <= 4; a++) {
        // if (a == 1) {
        // System.out.print(a);
        // continue PARENT_LOOP; // skips the rest of the loop for a = 1
        // } else if (a == 2) {
        // continue; // skips the rest of the loop for a = 2
        // } else {
        // System.out.print(" " + a);
        // }

        // for (int b = 0; b < a; b++) {
        // System.out.println("Blah blah");
        // }
        // }

        // Declaration of Arrays

        // int[] ids, types;
        // int ids[], types; //1D array : ids
        // int[][] vars1;
        // int vars2 [][];
        // int[] vars3[];
        // int[] vars4[], space [][];

        String pokemon = "Charizard";
        String anime = "Solo Leveling";

        boolean b = pokemon.equals(anime);
        System.out.println(b);
        String name = new String("Bruh");// Object , independent

        System.out.println(name.toString());

        // CREATING AN OBJECT:
        // new ___
        // concat

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        // String y; not an object
        // String x; not an object
        // String z = String y + new String(); 2 objects created in this line.

        class Dog {
            public String color; // example 1
            public static String name; // example 2
        }

        // example 1
        Dog myDog = new Dog();
        myDog.color = "midori";
        System.out.println(myDog.color);

        // example 2
        Dog.name = "ChieSan";
        System.out.println(Dog.name);
    

        //In different, java class
        Animal cat= new Animal();

        cat.color="white";
        cat.bruh="name"; 

        System.out.println(cat.color);






    }

    public static boolean testMethod() {
        System.out.println("Hi");
        return true;
    }

}
