package com.softserve.edu.less8.Hworks;

public class WrapperSample {
    public static void main(String[ ] args) {

//       String text = "Hello World";
        int text = 123;
        Box box = new Box();
        box.set(text);
//        String i =  (String) box.get();
        int i =  (int) box.get();
//        System.out.println("I = " + i);
//        System.out.println("I = " + i);
        System.out.println("text = " +text + ", after = " + i);


        String textJ = "Hello World";
        WrapperBox boxExternal = new WrapperBox();
        boxExternal.set(textJ);
        Integer j;
//        j = (Integer)  boxExternal.get();

        VrapperBox test = new VrapperBox();
        test.set(textJ);
//        j = (Integer) test.get("123");
//        System.out.println("Vrapper\n\t textJ = " +textJ + ", j = " + j);

    }
}

//-------------------------------

class VrapperBox{
    private Box box = new Box();
    private int i;
    private String str;
    private boolean bool;

    public VrapperBox() {
//        value = new T();
    }

    public Box getValue() {
        return box;
    }

    public void set(String value) {
        this.str =  value;
    }

    public void set(int i) {
        this.i =  i;
    }

    public void set(boolean bool) {
        this.bool =  bool;
    }

    public String get(String str) {
        return this.str;
    }

    public int get(int i) {
        return this.i;
    }

    public boolean get(boolean bool) {
        return this.bool;
    }



}


//--------------------------------
class WrapperBox {
    private Box box = new Box();
    public void set(String text) { this.box.set(text); }
    public String get( ) { return (String) box.get(); }
}


//--------------------------------
class Box {
    private Object obj;
    public void set(Object obj) { this.obj = obj; }
    public Object get( ) { return obj; }
}
