package com.softserve.hw4;

public class Country {
	String[] Africa = { "Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cameroon", "Cape Verde",
			"Central African Republic", "Chad", "Comoros", "Republic of the Congo", "Democratic Republic of the Congo",
			"Côte d'Ivoire", "Djibouti", "Equatorial Guinea", "Egypt", "Eritrea", "Ethiopia", "Gabon", "The Gambia",
			"Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali",
			"Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Senegal",
			"Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Swaziland", "Tanzania",
			"Togo", "Tunisia", "Uganda", "Western Sahara", "Zambia", "Zimbabwe" };
	String[] Asia = { "Afghanistan", "Armenia", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Cambodia",
			"China", "East Timor", "Georgia", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan",
			"Kazakhstan", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", "Mongolia", "Myanmar",
			"Nepal", "North Korea", "Oman", "Pakistan", "Palestine", "Philippines", "Qatar", "Saudi Arabia",
			"Singapore", "South Korea", "Sri Lanka", "Syria", "Tajikistan", "Thailand", "Turkey", "Turkmenistan",
			"Taiwan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen" };
	String[] Europe = { "Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria",
			"Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "Georgia", "Germany", "Greece",
			"Hungary", "Iceland", "Republic of Ireland", "Italy", "Kosovo", "Latvia", "Liechtenstein", "Lithuania",
			"Luxembourg", "North Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "Norway",
			"Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "France",
			"Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom", "Vatican City" };
	String[] NorthAmerica = { "Canada", "United States of America", "Mexico", "Belize", "Antigua and Barbuda",
			"Anguilla", "Aruba", "The Bahamas", "Barbados", "Bermuda", "Bonaire", "British Virgin Islands",
			"Cayman Islands", "Clipperton Island", "Costa Rica", "Cuba", "Curaçao", "Dominica", "Dominican Republic",
			"El Salvador", "Greenland", "Grenada", "Guadeloupe", "Guatemala", "Haiti", "Honduras", "Jamaica",
			"Martinique", "Montserrat", "Navassa Island", "Nicaragua", "Panama", "Puerto Rico", "Saba",
			"Saint Barthelemy", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon",
			"Saint Vincent and the Grenadines", "Sint Eustatius", "Sint Maarten", "Trinidad and Tobago",
			"Turks and Caicos", "US Virgin Islands" };
	String[] SouthAmerica = { "Brazil", "Argentina", "Bolivia", "Chile", "Colombia", "Ecuador", "Falkland Islands",
			"French Guiana", "Guyana", "Paraguay", "Peru", "South Georgia and the South Sandwich Islands", "Suriname",
			"Uruguay", "Venezuela" };
	String[] Oceania = { "Australia", "Fiji", "New Zealand", "Federated States of Micronesia", "Kiribati",
			"Marshall Islands", "Nauru", "Palau", "Papua New Guinea", "Samoa", "Solomon Islands", "Tonga", "Tuvalu",
			"Vanuatu" };

	public void getContinent(String c1) {
		String c2 = "null";
		for (int i = 0; i < Africa.length; i++) {
			if (Africa[i].toLowerCase().contentEquals(c1.toLowerCase())) {
				c2 = "Africa";
			}
		}
		if (c2 == "null") {
			for (int i = 0; i < Asia.length; i++) {
				if (Asia[i].toLowerCase().contentEquals(c1.toLowerCase())) {
					c2 = "Asia";
				}
			}
		}
		if (c2 == "null") {
			for (int i = 0; i < Europe.length; i++) {
				if (Europe[i].toLowerCase().contentEquals(c1.toLowerCase())) {
					c2 = "Europe";
				}
			}
		}
		if (c2 == "null") {
			for (int i = 0; i < NorthAmerica.length; i++) {
				if (NorthAmerica[i].toLowerCase().contentEquals(c1.toLowerCase())) {
					c2 = "NorthAmerica";
				}
			}
		}
		if (c2 == "null") {
			for (int i = 0; i < SouthAmerica.length; i++) {
				if (SouthAmerica[i].toLowerCase().contentEquals(c1.toLowerCase())) {
					c2 = "SouthAmerica";
				}
			}
		}
		if (c2 == "null") {
			for (int i = 0; i < Oceania.length; i++) {
				if (Oceania[i].toLowerCase().contentEquals(c1.toLowerCase())) {
					c2 = "Oceania";
				}
			}
		}
		switch (c2) {
		case "Africa":
			System.out.println(Continent.AFRICA);
			break;
		case "Asia":
			System.out.println(Continent.ASIA);
			break;
		case "Europe":
			System.out.println(Continent.EUROPE);
			break;
		case "NorthAmerica":
			System.out.println(Continent.NORTHAMERICA);
			break;
		case "SouthAmerica":
			System.out.println(Continent.SOUTHAMERICA);
			break;
		case "Oceania":
			System.out.println(Continent.OCEANIA);
			break;
		case "null":
			System.out.println("Wikipedia doesn't know your country exists^^\nTry one more time\n");
			break;
		}

	}

}
