package com.softserve.edu.less7;

public class AcarSamples {
    public static void main(String[ ] args) {
        System.out.println("\tACar carX6 = new BmwX6( );");
        ACar carX6 = new BmwX6( );
        carX6.carRides( );
        ((BmwX6)carX6).lightsShine( );

        System.out.println("\n\tACar carX6mod = new BmwX6mod( );");
        ACar carX6mod = new BmwX6mod();
        ((BmwX6mod)carX6mod).carRides();
        ((BmwX6)carX6mod).lightsShine( );

//*
        System.out.println("\n\tBmwX6 carX6mod2 = new BmwX6mod( );");
        BmwX6 carX6mod2 = new BmwX6mod( );
        carX6mod2.carRides(250);
        carX6mod2.lightsShine( );

        System.out.println("\n\tBmwX6 carX6mod3 = new BmwX6mod( );");
        BmwX6 carX6mod3 = new BmwX6mod( ){
            public void lightsShine( ) {
                System.out.println("BmwX6: Halogen Headlights.");
            }
        };
        carX6mod3.carRides(250);
        carX6mod3.lightsShine( );


        // */

/*
        System.out.println("\n\tACar carX6mod2 = new BmwX6modLigth();");
        ACar carX6mod2 = new BmwX6modLigth();
        ((BmwX6modLigth)carX6mod2).setCarLigth(CarLigth.H);
        ((BmwX6modLigth)carX6mod2).carRides(235);
        ((BmwX6modLigth)carX6mod2).lightsShine( );
*/
    }
}

class BmwX6modLigth extends BmwX6mod{
    private CarLigth carLigth;

    public BmwX6modLigth(CarLigth carLigth) {
//        super();
        this.carLigth = carLigth;
    }

    public BmwX6modLigth() {
        this.carLigth = carLigth.H;
    }

    public void setCarLigth(CarLigth carLigth) {
        this.carLigth = carLigth;
    }

    public CarLigth getCarLigth() {
        return carLigth;
    }

    @Override
    public void lightsShine( ) {
        System.out.println("BmwX6mod: " + carLigth);
//        super.lightsShine();
    }

}

class BmwX6mod extends BmwX6 {
    public BmwX6mod( ) { super( ); }

    @Override
    public void workedEngine( ) {
        System.out.println("BmwX6mod: Engine Running on Diesel.");
        System.out.println("BmwX6mod: Max Speed: " + getMaxSpeed( ));
    }

   @Override
    public void workedGearBox( ) {
        System.out.println("BmwX6mod: Sportomatic GearBox.");
    }

    @Override
    public void lightsShine( ) {
        System.out.println("BmwX6mod: Xenon Headlights.");
//        super.lightsShine();
    }
/*
//    @Override
    public void superLightsShine( ) {
//        System.out.println("BmwX6mod: Xenon Headlights.");
        super.lightsShine();
    }
    */
}

enum CarLigth {
    H("Halogen Headligth"),
    X("Xenon Headligth");
    private final String carLigth;

    CarLigth() {
        carLigth = "Halogen Headligth";
    }

    CarLigth(String atypeLigth ) {
        carLigth = atypeLigth;
    }

    public String getCarLigth() {
        return carLigth;
    }

    @Override
    public String toString() {
        return carLigth;
    }
}

 class BmwX6 extends ACar {
    public BmwX6( ) {
        setMaxSpeed(200);
    }

    public void carRides(double aMaxSpeed) {
        setMaxSpeed(aMaxSpeed);
        System.out.println("BmvX6 Rides");
        workedEngine( );
        workedGearBox( );
    }

    @Override
     public void carRides() {
         setMaxSpeed(200);
         System.out.println("BmvX6 Rides");
         workedEngine( );
         workedGearBox( );
     }


     public void workedEngine( ) {
        System.out.println("BmwX6: Engine Running on Petrol.");
        System.out.println("BmwX6: Max Speed: " + getMaxSpeed( ));
    }

    public void workedGearBox( ) {
        System.out.println("BmwX6: Automatic GearBox.");
    }

    public void lightsShine( ) {
        System.out.println("BmwX6: Halogen Headlights.");
    }
}




 abstract class ACar {
    private double maxSpeed;

    public double getMaxSpeed( ) { return maxSpeed; }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void carRides( );
}
