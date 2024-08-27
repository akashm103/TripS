package com.project.trips.service;

import com.project.trips.itinerary.Itinerary;
import com.project.trips.itinerary.ItineraryResponse;
import com.project.trips.itinerary.ItineraryService;
import org.springframework.stereotype.Service;

@Service
public class ItineraryServiceImpl implements ItineraryService {
    @Override
    public Itinerary getItinerary(){
        return new Itinerary();
    }

    @Override
    public ItineraryResponse createItinerary() {
        return new ItineraryResponse();
    }

    @Override
    public ItineraryResponse updateItinerary() {
        return new ItineraryResponse();
    }

    @Override
    public ItineraryResponse deleteItinerary() {
        return new ItineraryResponse();
    }

}
