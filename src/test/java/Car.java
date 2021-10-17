public class Car {

    private int length;
    private int width;
    private int height;

    Car() {

    }
//    Why do you check for arguments/parameters in a constructor if the instance is anyway being created?
//    If the instance won't be created with an invalid parameter value, the method should throw an IllegalArgumentException
//    But... I'm not sure that it is good practice when the constructor throws an exception
//    I'd check parameters before passing them to the constructor

    Car(int length, int width, int height) {
        if (length > 0) {
            System.out.println("Length is " + length);
        } else {
            System.out.println("Check entered length");
        }

        if (width > 0) {
            System.out.println("Width is " + width);
        } else {
            System.out.println("Check entered width");
        }

        if (height > 0) {
            System.out.println("Height is " + height);
        } else {
            System.out.println("Check entered height");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Car setLengthCar(int length) {
        if (length > 0) {
            System.out.println("Length is " + length);
        } else {
            System.out.println("Check entered length");
        }
        return this;
    }

    Car setWidthCar(int width) {
        if (width > 0) {
            System.out.println("Width is " + width);
        } else {
            System.out.println("Check entered width");
        }
        return this;
    }

    Car setHeightCar(int height) {
        if (height > 0) {
            System.out.println("Height is " + height);
        } else {
            System.out.println("Check entered height");
        }
        return this;
    }

    void checkIsThisCarCanBeCreated(int length, int width, int height) {
        if (length > 0 & width > 0 & height > 0) {
            System.out.println("Car with these parameters can be created");
        } else {
            System.out.println("Car with these parameters can not be created");
        }
    }

    Car startEngine() {
        System.out.println("Engine is started");
        return this;
    }

    Car stopEngine() {
        System.out.println("Engine is stopped");
        return this;
    }

    boolean checkRotationsEngine(int rotationsPerMinute) {
        if (rotationsPerMinute > 800 & rotationsPerMinute < 10000) {
            return true;
        } else {
            return false;
        }
    }
//    checkIsEngineStarted-method body is not formatted
        void checkIsEngineStarted (boolean statusEngine){
            if(statusEngine){
                System.out.println("Engine is started");
            } else{
                System.out.println("Engine is not started");
            }
    }
    void unlockDoors(boolean carTrack){
        if (carTrack){
            System.out.println("Doors are opened");
        } else {
            System.out.println("This key can not open this car");
        }
    }


}
