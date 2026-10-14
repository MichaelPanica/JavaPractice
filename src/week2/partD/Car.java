/* Define a class `Car` with:
• Fields: `model`, `year`, and `static int count`.
• Constructor: initialises `model` and `year` and increments `count`.
• Method `displayInfo()` prints car details and the total number of cars created. */

public static class Car{
    String model;
    int year;
    static int count;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
        count++;
    }
    void displayInfo(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Total cars: " + count);
    }
}


public static void main(String[] args){
    Car myCar = new Car("BMW",1999);
    Car teosCar = new Car("Volkswagen", 2009);
    Car biancasCar = new Car("Mazda", 2010);

    myCar.displayInfo();
    teosCar.displayInfo();
    biancasCar.displayInfo();
}