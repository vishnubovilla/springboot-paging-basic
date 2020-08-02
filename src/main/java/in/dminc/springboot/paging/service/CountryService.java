package in.dminc.springboot.paging.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.dminc.springboot.paging.model.Country;
import in.dminc.springboot.paging.repository.CountryRepository;

@Service
public class CountryService implements ICountryService{

	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public List<Country> findPaginated(int pageNo, int pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<Country> pageResult = countryRepository.findAll(paging);
		return pageResult.toList();
	}

}
