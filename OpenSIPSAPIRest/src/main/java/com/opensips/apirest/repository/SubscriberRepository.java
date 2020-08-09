package com.opensips.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opensips.apirest.models.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
	
	Subscriber findById(long id);

}
