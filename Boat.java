class Boat extends Vehicle {

    public Boat(String brand, int kilometers){
        super(brand,kilometers);
    }

    public void doStuff() {
        System.out.println ("Je suis " + super.brand + " et je fais glou glou.");
    }

}