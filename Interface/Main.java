package Interface;

public class Main {
    public static void main(String[] args) {
        Country[] countries = {
                new Country("Canada", 9984670),
                new Country("China", 9596960),
                new Country("United States", 9372610),
                new Country("Brazil", 8514877),
                new Country("Australia", 7692024)
        };

        Country countryWithLargestArea = (Country) maximum(countries);

        System.out.println("The country with the largest area is " + countryWithLargestArea.getName());
    }
    // Write and test a method
    public static Country maximum(Country[] country) {
        if (country.length == 0) {
            return null;
        }

        Country maxCountry = country[0];

        // Use that method to determine the country with the largest area from an array of countries.
        for (int i = 1; i < country.length; i++) {
            Country currentCountry = country[i];
            if (currentCountry.getMeasure() > maxCountry.getMeasure()) {
                maxCountry = currentCountry;
            }
        }
        // that returns the Country with the largest measure. 
        return maxCountry;
    }
}