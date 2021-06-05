package com.softserve.edu.less8.Hworks;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person personOrigin = new Person(new FullName("Petro", "Petryshyn"), 25) {
            @Override
            public String activity() {
                return "originPerson";
            }
        };
        Person personCloned =   (Person) personOrigin.clone();
/*        {
            @Override
                    public String activity;() {
                return "clonePerson";
        };
*/
//        personCloned.setFirstName("Mari4ka");
        personCloned.fullName.setFirstName("Mari4ka");
        personCloned.setAge(24);
            System.out.println("PerOrig - " + personOrigin +
                    "\n\t ativity - " + personOrigin.activity());
            System.out.println("PerClon - " + personCloned +
                    "\n\t ativity - " + personCloned.activity());
    }
}


/////////////////////////////////////////
class PersonClonable extends Person implements Cloneable{

    public PersonClonable(FullName fullName, int age) {
        super(fullName, age);
    }

//    public FullName getFullName(){ // throws CloneNotSupportedException {
//        FullName clone = (FullName) super.clone();
//        return (FullName) this.;
//    }

    @Override
    public String activity() {
        return "Clonable Person";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonClonable tempPerson = (PersonClonable) super.clone();
        tempPerson.fullName = (FullName) tempPerson.fullName.clone();
        return tempPerson;
    }
}