package com.softserve.edu.homework04.Enums;

public enum ContinentEnum {
	Asia("Japan", "China", "India", "Mongolia", "Pakistan", "Saudi Arabia"),
	Africa("Algeria", "Botswana", "Cameroon", "Ethiopia", "Kenya"),
	NorthAmerica("Canada", "Costa Rica", "Guatemala", "United States"),
	SouthAmerica("Argentina", "Brazil", "Colombia "), Europe("Ukraine", "United Kingdom", "Portugal", "Spain", "Italy"),
	Australia("Australia", "Papua", "New Guinea");

	private String[] countries;

	private ContinentEnum(String... countries) {
		this.countries = countries;
	}

	public String getContinet(String country) {
		String string = null;
		for (String country1 : countries) {
			if (country.equals(country1)) {
				string = this.name();
				break;
			} else {
				string = "Country doesn't belong to this continent";
			}
		}
		return string;
	}

	public void printCounties() {
		for (String country : countries) {
			System.out.println(country);
		}
	}

	public String[] getCountries() {
		return this.countries;
	}

	public String toString() {
		String string = "Countries of continent are:\n";
		for (String country : countries) {
			string += country + "\n";
		}
		return string;
	}
}
