package com.project.trips.itinerary;

import com.project.trips.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItineraryResponse extends Response {
    private String itineraryId;
    private String name;
}
