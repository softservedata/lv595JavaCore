package com.softserve.edu.less6;

public class PolymorhGames {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Leleka", 2, false);
        System.out.println("str6\tbike1 : " + bike1);
        bike1.engines();

        Bike bike2 = bike1;
        bike2.setModel("Ukraina");
        System.out.println("str11\tbike1 : " + bike1);
        bike2.engines();

//        MotoBike motoBike1 = (MotoBike) bike1;
        MotoBike motoBike1 = new MotoBike("Jupiter", 3, true,0.5);
        System.out.println("str16\tmotoBike1 is " + motoBike1 + "\n\t\t super : " + motoBike1.toStringSuper());
      System.out.println("str17\tEngine volume of motoBike1 is " + motoBike1.getEngineVolume());
        System.out.println("str18\tMotoBike1.model <- Jawa");
        motoBike1.setModel("Jawa");
        ((Bike) motoBike1).setModel("Zayka");
        System.out.println("str21\tReal MotoBike1.model is " + motoBike1.getModel() +
                "\n\t\t Motobike1 is " + motoBike1);
        System.out.println("str23\tThe Super MotoBike1.model is " + ((Bike) motoBike1).getModel());



//        motoBike1 = bike1;
        bike2 = motoBike1; //        bike2 = (MotoBike) bike2;
        System.out.println("str29\tbike2 : " + bike2);
        bike2.model = "Minsk";// bike2.setModel("Minsk"); //motoBike1.model = "Minsk";
        System.out.println("str31\tbike2 : " + bike2);
        bike2.engines();
        System.out.println("str33\tEngine volume of bike2 is " + ((MotoBike) bike2).getEngineVolume());
        System.out.println("str34\tThe MotoBike1 is " + motoBike1);
        System.out.println("str35\tThe motoBike1.model = " + motoBike1.model +
                "\n\t (Bike) motoBike1.model = " + ((Bike) motoBike1).model +
                "\n\t bike2.model = " + bike2.model +
                "\n\t (MotoBike) bike2.model = " + ((MotoBike) bike2).model +
                "\n\t motoBike1.getModel() = " + motoBike1.getModel() +
                "\n\t bike2.getModel() = " + bike2.getModel()
        );
//        System.out.println("str35\tThe Super motoBike1 is " + motoBike1.toStringSuper());

      //        System.out.println("Engine volume of bike2 is " + bike2.getEngineVolume());
/*
        bike2 = (Bike) bike2;
//        bike2 = bike1;

        System.out.println("bike2 : " + bike2);
        bike2.engines();
//        System.out.println("Engine volume of bike2 is " + bike2.engineVolume);

*/    }
}

class MotoBike extends Bike {
    private String modelMoto; // = "MotoOEM";
    private double engineVolume; // = 0.5;
//    public int wheels = 3;

    public double getEngineVolume() {
        return engineVolume;
    }

    public MotoBike() {
        super("MotoOEM", 2, true);
        engineVolume = 0.3;
        model = "MotoOEM";
        System.out.println("Default MotoBike created");
        /*        setModel("MotoOEM");
        setWheels(2);
        setRuler(true);
*/    }

    public MotoBike(String amodel, int awheels, boolean aruler, double aengineVolume) {
        super(amodel, awheels, aruler);
        engineVolume = aengineVolume;
/*        setModel(amodel);
        setRuler(aruler);
        setWheels(awheels);
*/    }
/*
    public MotoBike(int wheels, boolean ruler, double engineVolume) {
        super(wheels, ruler);
        this.engineVolume = engineVolume;
    }
*/

    public void engines(){
        System.out.println("By burning fuel");
    }

    @Override
    public String toString() {
  //      System.out.println("\t\t\tsuper : " + super.toString());
        return  getModel() + "{" +
                "engineVolume=" + engineVolume +
                ", wheels=" + getWheels() +
                ", ruler=" + getRuler() +
                '}';
    }
}

class Bike {
    protected String model; // = "OEM";
    protected int wheels; // = 2;
    protected boolean ruler; // = true;

    public Bike() {
        System.out.println("Defaul bike created");
        model = "OEM";
        wheels = 2;
        ruler = true;
    }

        public Bike(String model, int wheels, boolean ruler) {
            this.wheels = wheels;
            this.ruler = ruler;
            this.model = model;
        }

    public void engines(){
        System.out.println(model + " By legs.");
    }

    @Override
    public String toString() {
        return model + "{" +
                "wheels=" + wheels +
                ", ruler=" + ruler +
                '}';
    }

    public String toStringSuper() {
        return model + "{" +
                "wheels=" + wheels +
                ", ruler=" + ruler +
                '}';
    }


    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getRuler() {
        return ruler;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setRuler(boolean ruler) {
        this.ruler = ruler;
    }
}