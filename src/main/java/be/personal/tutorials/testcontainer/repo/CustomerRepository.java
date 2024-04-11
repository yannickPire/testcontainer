package be.personal.tutorials.testcontainer.repo;

import be.personal.tutorials.testcontainer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
