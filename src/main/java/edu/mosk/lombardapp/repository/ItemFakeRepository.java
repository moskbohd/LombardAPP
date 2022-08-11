package edu.mosk.lombardapp.repository;
/*
  @author   george
  @project   summerschool
  @class  ItemFakeRepository
  @version  1.0.0 
  @since 29.07.22 - 11.05
*/

import edu.mosk.lombardapp.model.Item;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ItemFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = new ArrayList<>(
            Arrays.asList(
            new Item("1","item1"," desc1", now, now),
            new Item("2","item2"," desc2", now, now),
            new Item("3","item3"," desc3", now, now),
            new Item("4","item4"," desc4", now, now)
    ));

    public List<Item> findAll(){
        return this.items;
    }

    public Item findById(String id) {
        return this.items.stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Item update(Item item) {
        this.deleteById(item.getId());
        item.setUpdatedAt(LocalDateTime.now());
        this.items.add(item);
        return  item;
    }

    public void deleteById(String id) {
        Item item = this.findById(id);
        int index = items.indexOf(item);
        this.items.remove(index);

    }

    public Item save(Item item) {
        item.setId(UUID.randomUUID().toString());
        item.setCreatedAt(LocalDateTime.now());
        this.items.add(item);
        return item;
    }
}
