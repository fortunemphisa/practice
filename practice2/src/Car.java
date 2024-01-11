// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Car {
    public  String Color ="Black";
    int mileage = 20;

    public  void OwnerDetails(){
        System.out.println( "This car is bought by: ");
    }

protected void display(){
    System.out.print(" Color:"+ Color);
    System.out.println("Mileage: "+mileage);

}

public static void main(String[] args) {
       Car a = new Car();
       a.display();
    }
}