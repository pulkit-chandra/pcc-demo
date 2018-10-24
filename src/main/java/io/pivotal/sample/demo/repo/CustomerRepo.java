package io.pivotal.sample.demo.repo;

import io.pivotal.sample.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo  extends CrudRepository<String, Customer> {
}
