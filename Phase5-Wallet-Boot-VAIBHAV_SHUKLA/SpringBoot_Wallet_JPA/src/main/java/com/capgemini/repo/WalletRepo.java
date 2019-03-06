package com.capgemini.repo;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.bean.Customer;
public interface WalletRepo extends CrudRepository<Customer, String>{}