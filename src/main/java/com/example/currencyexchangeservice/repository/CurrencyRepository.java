package com.example.currencyexchangeservice.repository;

import com.example.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<ExchangeValue, Integer> {

    ExchangeValue findByFromAndTo(String from, String to);
}
