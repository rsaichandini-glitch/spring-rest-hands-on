package com.cognizant.handson5.service;

import com.cognizant.handson5.model.Country;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryService {

    private static final Map<String, Country> countries = new HashMap<>();

    static {
        countries.put("IN", new Country("IN", "India"));
        countries.put("US", new Country("US", "United States"));
        countries.put("GB", new Country("GB", "United Kingdom"));
        countries.put("JP", new Country("JP", "Japan"));
    }

    public Country getCountry(String code) {
        return countries.get(code.toUpperCase());
    }
}