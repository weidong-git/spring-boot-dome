package start.dome.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import start.dome.bean.Cat;

public interface CatRepository extends PagingAndSortingRepository<Cat, Integer>{

}
