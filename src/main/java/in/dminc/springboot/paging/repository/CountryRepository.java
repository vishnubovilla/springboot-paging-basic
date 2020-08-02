package in.dminc.springboot.paging.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.dminc.springboot.paging.model.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
