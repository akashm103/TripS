package com.project.trips.itinerary;

public interface ItemService {
    Item getItem();
    ItemResponse createItem();
    ItemResponse updateItem();
    ItemResponse deleteItem();
}
