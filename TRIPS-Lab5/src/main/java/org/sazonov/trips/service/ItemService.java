package org.sazonov.trips.service;

import lombok.AllArgsConstructor;
import org.sazonov.trips.entity.Form.ItemForm;
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

    /**
     * Find all items
     * @return List
     */
    public List<Item> findAll(){
        return itemRepository.findAll();
    }
    /**
     * Find by Id
     * @param index
     * @return Item
     */
    public Item findById(Integer index){
        return itemRepository.getById(index);
    }
    /**
     * Save by Strings
     * @return Item
     */
    public Item save(String FName, String SName, String Class,
                     String q1, String q2, String q3, String q4, String q5,
                     String q6, String q7, String q8, String q9, String q10){
        return  itemRepository.save(new Item(FName,SName,Class,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10));
    }
    /**
     * Save by Form
     * @param itemForm
     * @return Item
     */
    public Item save(ItemForm itemForm){
        return itemRepository.save(new Item(itemForm));
    }
    /**
     * Save by Entity
     * @param item
     * @return Item
     */
    public Item save(Item item){
        return itemRepository.save(item);
    }
}
