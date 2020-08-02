package in.dminc.springboot.paging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.dminc.springboot.paging.model.Country;
import in.dminc.springboot.paging.service.ICountryService;

@RestController
public class CountryPagintionController {

	@Autowired
	ICountryService countryService;

	@GetMapping("/countries/{pageNo}/{pageSize}")
	public List<Country> getPaginatedCountries(@PathVariable int pageNo, @PathVariable int pageSize) {
		return countryService.findPaginated(pageNo, pageSize);
	}

}
