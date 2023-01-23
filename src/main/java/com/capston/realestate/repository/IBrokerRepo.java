package com.capston.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capston.realestate.model.Broker;

@Repository
public interface IBrokerRepo extends JpaRepository<Broker, Integer> {

}
