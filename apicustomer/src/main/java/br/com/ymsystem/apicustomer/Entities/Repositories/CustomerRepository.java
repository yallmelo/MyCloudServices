package br.com.ymsystem.apicustomer.Entities.Repositories;

import br.com.ymsystem.apicustomer.Entities.Model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
