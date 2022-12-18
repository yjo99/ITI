

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
  //      write your answer here

	//q1) find the highest populated city of each cont;
	Set<String> allCont=countryDao.getAllContinents();



	for(String c : allCont){

		List<Country> allCountries=countryDao.findCountriesByContinent(c);
		Optional<City> data = allCountries.stream().map((x) -> x.getCities().stream().max(Comparator.comparing(City::getPopulation))).max(Comparator.comparing(City::getPopulation));
		data.ifPresent(System.out::println);	
	
	}

    }

}
