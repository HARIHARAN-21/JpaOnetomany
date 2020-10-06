package com.testapplicationdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testapplicationdemo.model.CustomerOrder;

public interface OrderRepository extends JpaRepository<CustomerOrder, Integer>{

}
