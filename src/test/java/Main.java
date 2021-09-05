public class Main {

    public static void main(String[] args) {

        Car car = new Car(5, 8, 4);
        car.checkIsEngineStarted(car.checkRotationsEngine(0));

        Car car2 = new Car();
        car2
                .setLengthCar(4)
                .setWidthCar(2)
                .setHeightCar(1);

        Car car3 = new Car();
        car3.checkIsThisCarCanBeCreated(9, 5, 3);
        car3.unlockDoors(true);
        car3
                .startEngine()
                .checkIsEngineStarted(car3.checkRotationsEngine(900));
        car3.stopEngine();
    }
}
