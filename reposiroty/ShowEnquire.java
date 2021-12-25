package WebEnquireForm.reposiroty;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import WebEnquireForm.domain.ApiOne;

public interface ShowEnquire extends CrudRepository<ApiOne,Long>{

	
	List<ApiOne> findAll();
}
