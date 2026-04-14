public class Main {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.carColor = "Blue";
        System.out.println("owner is " + mySedan.ownerName + " and car is " + mySedan.carColor);

        mySedan.startCar();
        
        System.out.println("overriding:");
        mySedan.accelerate(); 
        System.out.println("overloading:");
        mySedan.accelerate(85); 
        
        mySedan.stop();
        mySedan.gas();
        mySedan.turnOffCar();
    }
}
