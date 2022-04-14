package com.kk.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kk.card.model.Card;
import com.kk.card.model.Customer;
import com.kk.card.repository.CardRepository;

@RestController
public class CardController {

	@Autowired
	CardRepository cardRepository;
	
	@PostMapping("/myCards")
	public List<Card> getCardDetails(@RequestBody Customer customer){
		List<Card> cardList = cardRepository.findByCustomerId(customer.getCustomerId());
		return cardList;
	}
}
