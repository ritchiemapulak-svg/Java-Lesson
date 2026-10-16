package sample;

public class SampleClass {
    public static void main(String... args) {
        System.out.println("Hello World");

        int number;
        float PI = 3.14f;
        number = 10_001;
        System.out.println(number + PI);

        int x=11;
        if(x>10 | testMethod()){
            System.out.println("chieSan");
        }

        
        
    }
    public static boolean testMethod(){
        System.out.println("Hi");
        return true;
    }

}

