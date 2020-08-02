package in.dminc.springboot.paging.service;

import java.util.List;

import in.dminc.springboot.paging.model.Country;

public interface ICountryService {
	
	List<Country> findPaginated(int pageNo, int pageSize);

}
