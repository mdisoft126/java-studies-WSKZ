package com.marcind.springhttpclient.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marcind.springhttpclient.api.domain.Fact;


@Service
public class ApiServiceImpl implements ApiService{

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Fact[] getFacts(Integer amount) {
		// TODO Auto-generated method stub
		
		Fact[] facts = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=" + amount, Fact[].class);
		return facts;
	}

}
