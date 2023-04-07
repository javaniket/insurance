package in.bank.Insurance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.Insurance.model.Insurance;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long>{

	List<Insurance> findByCustomerId(int customerId);

}
