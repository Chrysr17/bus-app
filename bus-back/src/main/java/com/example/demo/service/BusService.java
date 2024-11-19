package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bus;
import com.example.demo.repository.BusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }
}
