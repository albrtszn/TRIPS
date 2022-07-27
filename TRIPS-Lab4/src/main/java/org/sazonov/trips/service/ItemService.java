package org.sazonov.trips.service;

import lombok.AllArgsConstructor;
import org.sazonov.trips.entity.Item;
import org.sazonov.trips.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAll(){
        return itemRepository.findAll();
    }
    public Item findById(int index){
        return itemRepository.findById(index);
    }
    public Item save(String FName,
                     String SName,
                     String favourTech,
                     String prof,
                     String CONFIRM){
        return  itemRepository.save(new Item(FName,SName,favourTech,prof,CONFIRM));
    }
}
