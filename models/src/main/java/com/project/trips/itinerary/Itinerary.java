package com.project.trips.itinerary;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Itinerary {
    @Id
    private String id;
    private String name;
    private String timestamp;
    private String description;
    private ArrayList<String> items;
}
