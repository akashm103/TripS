package com.project.trips.itinerary;

public interface ItineraryService {
    Itinerary getItinerary();
    ItineraryResponse createItinerary();
    ItineraryResponse updateItinerary();
    ItineraryResponse deleteItinerary();
}
