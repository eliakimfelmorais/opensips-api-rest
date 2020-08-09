package com.opensips.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opensips.apirest.models.Subscriber;
import com.opensips.apirest.repository.SubscriberRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value="API Rest OpenSIPS DB")
@CrossOrigin(origins="*")
public class SubscriberResource {

	@Autowired
	SubscriberRepository subscriberRepository;
	
	@GetMapping("/subscribers")
	@ApiOperation(value="Return a List of Subscribers")
	public List<Subscriber> listSubscribers(){
		
		return subscriberRepository.findAll();
	}
	
	@GetMapping("/subscribers/{id}")
	@ApiOperation(value="Return an subscriber By Id")
	public Subscriber listSubscribersById(@PathVariable(value = "id") long subscriberId){
		
		
		return subscriberRepository.findById(subscriberId);
	}
	
	
	@PostMapping("/subscribers")
	@ApiOperation(value="Insert a subscriber on database")
	public Subscriber insertSubscriber(@RequestBody Subscriber subscriber) {
		
		return subscriberRepository.save(subscriber);
	}
	
	
	@DeleteMapping("/subscribers/{id}")
	@ApiOperation(value="Delete a subscriber By ID")
	public void deleteSubscriber(@PathVariable long id) {
		
		subscriberRepository.deleteById(id);

		
	}	
	
	@PutMapping("/subscriber")
	@ApiOperation(value="update a subscriber on database")
	public Subscriber UpdateSubscriber(@RequestBody Subscriber subscriberId) {
		
		return subscriberRepository.save(subscriberId);
	}
	
	
}
