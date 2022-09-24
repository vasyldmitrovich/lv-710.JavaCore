package com.softserve.edu04.practical_tasks.task3;


import java.util.List;

public enum Continent {
    AFRICA("Algeria"
            , "Angola"
            , "Benin"
            , "Botswana"
            , "Burkina Faso"
            , "Burundi"
            , "Cabo Verde/Cape Verde"
            , "Cameroon"
            , "Central African Republic"
            , "Chad"
            , "Comoros"
            , "Congo/Republic of the Congo"
            , "Democratic Republic of the Congo"
            , "Djibouti"
            , "Egypt (transcontinental - generally considered African)"
            , "Equatorial Guinea"
            , "Eritrea"
            , "Eswatini (formerly Swaziland)"
            , "Ethiopia"
            , "Gabon"
            , "Gambia, The"
            , "Ghana"
            , "Guinea"
            , "Guinea-Bissau"
            , "Ivory Coast/Republic of Côte d'Ivoire"
            , "Kenya"
            , "Lesotho"
            , "Liberia"
            , "Libya"
            , "Madagascar"
            , "Malawi"
            , "Mali"
            , "Mauritania"
            , "Mauritius"
            , "Morocco"
            , "Mozambique"
            , "Namibia"
            , "Niger"
            , "Nigeria"
            , "Rwanda"
            , "Sao Tome and Principe"
            , "Senegal"
            , "Seychelles"
            , "Sierra Leone"
            , "Somalia"
            , "South Africa"
            , "South Sudan"
            , "Sudan"
            , "Tanzania"
            , "Togo"
            , "Tunisia"
            , "Uganda"
            , "Zambia"
            , "Zimbabwe"),

    ASIA("Afghanistan"
            , "Armenia (transcontinental - generally considered Asian)"
            , "Azerbaijan (transcontinental - generally considered Asian)"
            , "Bahrain"
            , "Bangladesh"
            , "Bhutan"
            , "British Indian Ocean Territory (UK territory)"
            , "Brunei"
            , "Cambodia"
            , "China"
            , "Cyprus (transcontinental - generally considered European)"
            , "Egypt (transcontinental - generally considered African)"
            , "Georgia (transcontinental - generally considered Asian)"
            , "Hong Kong (China - Special Administrative Region)"
            , "India"
            , "Indonesia"
            , "Iran"
            , "Iraq"
            , "Israel (U.N. member, though partially unrecognized)"
            , "Japan"
            , "Jordan"
            , "Kazakhstan (transcontinental - generally considered Asian)"
            , "Kuwait"
            , "Kyrgyzstan"
            , "Laos"
            , "Lebanon"
            , "Macau (China - Special Administrative Region)"
            , "Malaysia"
            , "Maldives"
            , "Mongolia"
            , "Myanmar (formerly Burma)"
            , "Nepal"
            , "North Korea (Democratic People's Republic of Korea)"
            , "Oman"
            , "Pakistan"
            , "Palestine(limited recognition)"
            , "Philippines"
            , "Qatar"
            , "Russia(transcontinental - generally considered European)"
            , "Saudi Arabia"
            , "Singapore"
            , "South Korea(Republic of Korea)"
            , "Sri Lanka"
            , "Syria"
            , "Taiwan(limited recognition - claimed by China)"
            , "Tajikistan"
            , "Thailand"
            , "Timor - Leste / East Timor"
            , "Turkey(transcontinental - generally considered European)"
            , "Turkmenistan"
            , "United Arab Emirates"
            , "Uzbekistan"
            , "Vietnam"
            , "Yemen"),

    EUROPE("Albania"
            , "Andorra"
            , "Armenia (transcontinental - generally considered Asian)"
            , "Austria"
            , "Azerbaijan (transcontinental - generally considered Asian)"
            , "Belarus"
            , "Belgium"
            , "Bosnia and Herzegovina"
            , "Bulgaria"
            , "Croatia"
            , "Cyprus (generally considered European)"
            , "Czechia/Czech Republic"
            , "Denmark"
            , "Estonia"
            , "Finland"
            , "France"
            , "Georgia (transcontinental - generally considered Asian)"
            , "Germany"
            , "Greece"
            , "Hungary"
            , "Iceland"
            , "Ireland"
            , "Italy"
            , "Kazakhstan (transcontinental - generally considered Asian)"
            , "Latvia"
            , "Liechtenstein"
            , "Lithuania"
            , "Luxembourg"
            , "Malta"
            , "Moldova"
            , "Monaco"
            , "Montenegro"
            , "Netherlands"
            , "North Macedonia"
            , "Norway"
            , "Poland"
            , "Portugal"
            , "Romania"
            , "Russia (transcontinental - generally considered European)"
            , "San Marino"
            , "Serbia"
            , "Slovakia"
            , "Slovenia"
            , "Spain"
            , "Sweden"
            , "Switzerland"
            , "Turkey (transcontinental - generally considered European)"
            , "Ukraine"
            , "United Kingdom"
            , "Vatican City (Holy See)"),

    NORTH_AMERICA("Antigua and Barbuda"
            , "Bahamas"
            , "Barbados"
            , "Belize"
            , "Canada"
            , "Costa Rica"
            , "Cuba"
            , "Dominica"
            , "Dominican Republic"
            , "El Salvador"
            , "Grenada"
            , "Guatemala"
            , "Haiti"
            , "Honduras"
            , "Jamaica"
            , "Mexico"
            , "Nicaragua"
            , "Panama"
            , "Saint Kitts and Nevis"
            , "Saint Lucia"
            , "Saint Vincent and the Grenadines"
            , "Trinidad and Tobago"
            , "United States of America"),

    OCEANIA("Australia"
            , "Fiji"
            , "Kiribati"
            , "Marshall Islands"
            , "Micronesia (The Federated States of)"
            , "Nauru"
            , "New Zealand"
            , "Palau"
            , "Papua New Guinea"
            , "Samoa"
            , "Solomon Islands"
            , "Tonga"
            , "Tuvalu"
            , "Vanuatu"),

    SOUTH_AMERICA("Argentina"
            , "Bolivia"
            , "Brazil"
            , "Chile"
            , "Colombia"
            , "Ecuador"
            , "Guyana"
            , "Paraguay"
            , "Peru"
            , "Suriname"
            , "Uruguay"
            , "Venezuela");

    Continent(String... countries) {
        this.countries = List.of(countries);
    }

    private final List<String> countries;

    public List<String> getCountries() {
        return countries;
    }

}