package com.project.trips.itinerary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Itinerary {
    private String id;
    private String name;
    private String timestamp;
    private String description;
    private LinkedList<String> items;
}
