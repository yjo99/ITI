
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here 
	//q1) find the highest populated city of each country;
	List<Country> allCountries=countryDao.findAllCountries();


	for(Country c : allCountries){
		Optional<City> data = c.getCities().stream().max(Comparator.comparing(City::getPopulation));
		data.ifPresent(System.out::println);	
	
	}

	
	//.sorted(Comparator.comparing(City::getCountryCode))	
   }

}