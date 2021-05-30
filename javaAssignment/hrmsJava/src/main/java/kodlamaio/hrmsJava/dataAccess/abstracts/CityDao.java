package kodlamaio.hrmsJava.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsJava.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{
	City getByCityName(String cityName);
}
