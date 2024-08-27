package com.project.trips.service;

import com.project.trips.itinerary.Item;
import com.project.trips.itinerary.ItemResponse;
import com.project.trips.itinerary.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public Item getItem() {
        return new Item();
    }

    @Override
    public ItemResponse createItem() {
        return new ItemResponse();
    }

    @Override
    public ItemResponse updateItem() {
        return new ItemResponse();
    }

    @Override
    public ItemResponse deleteItem() {
        return new ItemResponse();
    }
}
