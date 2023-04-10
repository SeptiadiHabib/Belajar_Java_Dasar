public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Habib");
        sayHello("Septiadi", "Habib");
    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " +name);
    }
    static void sayHello(String firtName, String lastName){
        System.out.println("Hello " + firtName + " " + lastName);
    }
}
