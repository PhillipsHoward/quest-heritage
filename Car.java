class Car extends Vehicle {
    
    public Car(String brand, int kilometers){
        super(brand,kilometers);
    }

    public void doStuff() {
        System.out.println ("Je suis " + super.brand + " et je fais vroum vroum.");
    }

}