package lesson8.CarB;


import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private Double engineCapacity;
    private String color;
    private Integer passengerCapacity;
    private Boolean isAirConditioning;

    private Car() {
        model = "";
        dateOfProduction = null;
        engineCapacity = null;
        color = "";
        passengerCapacity = null;
        isAirConditioning = null;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public Boolean getAirConditioning() {
        return isAirConditioning;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    private void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    private void setAirConditioning(Boolean airConditioning) {
        isAirConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public static CarBuilder getBuilder() {
        Car car = new Car();
        return car.new CarBuilder();
    }


    public class CarBuilder {

        private CarBuilder() {

        }

        public CarBuilder addModel(String model) {
            setModel(model);
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
            setDateOfProduction(dateOfProduction);
            return this;
        }

        public CarBuilder addEngineCapacity(Double engineCapacity) {
            setEngineCapacity(engineCapacity);
            return this;
        }

        public CarBuilder addColor(String color) {
            setColor(color);
            return this;
        }

        public CarBuilder addPassengerCapacity(Integer passengerCapacity) {
            setPassengerCapacity(passengerCapacity);
            return this;
        }

        public CarBuilder addAirConditioning(Boolean airConditioning) {
            setAirConditioning(airConditioning);
            return this;
        }

        public Car build() {
            return Car.this;
        }

    }

}
