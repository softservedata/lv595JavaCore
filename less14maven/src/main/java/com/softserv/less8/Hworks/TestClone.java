package com.softserve.edu.less8.Hworks;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonClonable personOrigin = new PersonClonable(new FullNameClonable("Petro", "Petryshyn"), 25){

            @Override
            public String activity() {
                return "originPerson";
            }
        };
        PersonClonable personCloned =   (PersonClonable) personOrigin.clone();
/*        {
            @Override
                    public String activity;() {
                return "clonePerson";
        };
*/
//       personOrigin.getFullName() = new FullNameClonable("","");
       personCloned.getFullName().setFirstName("Mari4ka");
//        personCloned.setFirstName("Mari4ka");
//        personCloned.fullName.setFirstName("Mari4ka");
        personCloned.setAge(24);
            System.out.println("PerOrig - " + personOrigin +
                    "\n\t ativity - " + personOrigin.activity());
            System.out.println("PerClon - " + personCloned +
                    "\n\t ativity - " + personCloned.activity());
    }
}


/////////////////////////////////////////
class PersonClonable extends Person implements Cloneable{
private FullNameClonable fullName;

    @Override
    public FullNameClonable getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "PersonClonable{" +
                "fullName=" + fullName +
                + super.getAge() + '}';
    }

    public PersonClonable(FullNameClonable fullName, int age) {
        super(fullName, age);
        this.fullName = new FullNameClonable(fullName);
        super.setAge(age);
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
//        tempPerson.fullName = (FullNameClonable) tempPerson.fullName.clone();
        return tempPerson;
    }
}

class FullNameClonable extends FullName implements Cloneable {
    public FullNameClonable() { super();
    }

    public FullNameClonable(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public FullNameClonable(FullNameClonable fullName) {
        super(fullName.getFirstName(), fullName.getLastName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }
}