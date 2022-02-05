package com.marcind.springhttpclient.services;

import java.util.List;

import com.marcind.springhttpclient.api.domain.Fact;

public interface ApiService 
{
	Fact[] getFacts(Integer amount);
}
