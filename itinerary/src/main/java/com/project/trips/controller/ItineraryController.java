package com.project.trips.controller;

import com.project.trips.Response;
import com.project.trips.itinerary.Itinerary;
import com.project.trips.itinerary.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/itinerary")
public class ItineraryController {

    private final ItineraryService itineraryService;

    @Autowired
    ItineraryController(ItineraryService itineraryService) {
        this.itineraryService = itineraryService;
    }

    @GetMapping
    public Itinerary getItinerary() {
        return itineraryService.getItinerary();
    }

    @PostMapping
    public Response createItinerary() {
        return itineraryService.createItinerary();
    }

    @PutMapping
    public Response updateItinerary() {
        return itineraryService.updateItinerary();
    }

    @DeleteMapping
    public Response deleteItinerary() {
        return itineraryService.deleteItinerary();

    }

}
