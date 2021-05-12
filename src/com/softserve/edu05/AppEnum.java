package com.softserve.edu05;

/*-
enum Season {
	WINTER, SPRING, SUMMER, AUTUMN
}
*/

/*-
enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");
    
    private String name;
    //
    private Season(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return " ***toString() = " + name;
    }
    
    public Season nextSeason() {
        if (this == Season.WINTER) {
            return SPRING;
        }
        if (this == Season.SPRING) {
            return SUMMER;
        }
        if (this == Season.SUMMER) {
            return Season.AUTUMN;
        }
        return Season.WINTER;
    }
}
*/

/*-
enum Season {
    WINTER("Winter") {
        public Season nextSeason() { return SPRING; }
    },
    SPRING("Spring") {
        public Season nextSeason() { return SUMMER; }
    },
    SUMMER("Summer") {
        public Season nextSeason() { return AUTUMN; }
    },
    AUTUMN("Autumn") {
        public Season nextSeason() { return WINTER; }
    };
    
    private String name;
    //
    private Season(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public abstract Season nextSeason();
}
*/

enum Season {
    WINTER("Winter", "Dec", "Jan", "Feb") {
        public Season nextSeason() {
            return SPRING;
        }
    },
    SPRING("Spring", "March", "App", "may") {
        public Season nextSeason() {
            return SUMMER;
        }
    },
    SUMMER("Summer", "", "", "") {
        public Season nextSeason() {
            return AUTUMN;
        }
    },
    AUTUMN("Autumn", "", "", "") {
        public Season nextSeason() {
            return WINTER;
        }
    };

    private String name;
    private String firstMonth;
    private String secondMonth;
    private String thirdMonth;

    //
    private Season(String name, String firstMonth, String secondMonth,
            String thirdMonth) {
        this.name = name;
        this.firstMonth = firstMonth;
        this.secondMonth = secondMonth;
        this.thirdMonth = thirdMonth;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getMonth() {
        return firstMonth + ", " + secondMonth + ", " + thirdMonth;
    }

    public abstract Season nextSeason();
}

public class AppEnum {
    public static void main(String[] args) {
        /*-
        Season season;
        season = Season.WINTER;
        System.out.println("season.toString() = " + season); // toString()
        System.out.println("season.name() = " + season.name());
        */
        /*-
        System.out.println("Next season = " + season.nextSeason().name());
        //
        String name = "Spring"; // "Spring1" ERROR
        season = Season.valueOf(name.toUpperCase());
        System.out.println("season.name() = " + season.name());
        System.out.println("Next season.name() = " + season.nextSeason().name());
        //
        //
        for (Season current : Season.values()) {
            System.out.println("current = " + current); // current.toString()
        }
        */
        // /*-
        Season season = null;
        String month = "Marth";
        switch (month) {
        case "Deñember":
        case "January":
        case "February":
            season = Season.WINTER;
            break;
        case "Marth":
        case "April":
        case "May":
            season = Season.SPRING;
            break;
        case "June":
        case "Jule":
        case "August":
            season = Season.SUMMER;
            break;
        case "September":
        case "October":
        case "November":
            season = Season.AUTUMN;
            break;
        default:
            System.out.println("No this month\n");
            throw new IllegalArgumentException("Error: Invalid Argument");
        // System.exit(0);
        }
        System.out.println("season = " + season.toString());
        System.out.println("Next season = " + season.nextSeason());
        //
        switch (season) {
        case WINTER:
            System.out.println("Deñember, January, February");
            break;
        case SPRING:
            System.out.println("Marth, April, May");
            break;
        case SUMMER:
            System.out.println("June, Jule, August");
            break;
        case AUTUMN:
            System.out.println("September, October, November");
            break;
        }
        // */
    }
}
