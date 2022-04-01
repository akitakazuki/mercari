package com.example.mercari.service;

import java.util.List;

import com.example.mercari.domain.Items;
import com.example.mercari.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    
    public List<Items> findAll(){
        return itemRepository.findAll();
    }
}
