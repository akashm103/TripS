package com.project.trips.controller;

import com.project.trips.itinerary.Item;
import com.project.trips.itinerary.ItemResponse;
import com.project.trips.itinerary.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/item")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    public Item getItem(){
        return itemService.getItem();
    }

    public ItemResponse createItem(){
        return itemService.createItem();
    }

    public ItemResponse updateItem(){
        return itemService.updateItem();
    }

    public ItemResponse deleteItem(){
        return itemService.deleteItem();
    }

}
