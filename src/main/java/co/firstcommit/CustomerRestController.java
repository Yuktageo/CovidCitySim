package co.firstcommit;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.customer.addData.CustomerDataAddition;


@RestController
@RequestMapping("/api/Customers")

public class CustomerRestController {
	
	@GetMapping
	public List<CustomerDataAddition> getAllCustomersData() {
		CustomerDataAddition c1=new CustomerDataAddition();
		c1.setFirstName("Yukta");
		c1.setLastName("Yadav");
		c1.setAge("30");
		c1.setGender("Female");
		CustomerDataAddition c2=new CustomerDataAddition();
		c2.setFirstName("Raunak");
		c2.setLastName("Yadav");
		c2.setAge("19");
		c2.setGender("Male");
		return Arrays.asList(c1,c2);
	}
}
