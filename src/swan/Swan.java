package swan;

import sample.Animal;

public class Swan extends Animal {

    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    // public void helpOtherBirdsSwim(){
    // floatInWater();
    // System.out.println(text);
    // }
    public void helpOtherBirdsSwim() {
        Bird other = new Bird();

        other.floatInWater();
        System.out.println(other.text);

    }

}
