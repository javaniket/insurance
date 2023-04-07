package in.bank.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.Insurance.model.Customer;
import in.bank.Insurance.model.Insurance;
import in.bank.Insurance.repository.InsuranceRepository;

@RestController
public class InsuranceController {
	@Autowired
 private InsuranceRepository insuranceRepository;
	@PostMapping("/insurance")
	public List<Insurance> getInsuranceDetails(@RequestBody Customer customer)
	{
		List<Insurance> insurance = insuranceRepository.findByCustomerId(customer.getCustomerId());
		return insurance;
	}
}
