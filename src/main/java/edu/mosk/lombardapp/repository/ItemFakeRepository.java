package edu.mosk.lombardapp.repository;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0
  @since 11.08.2022
*/

import edu.mosk.lombardapp.service.item.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemFakeRepository {
    public Item create(Item item) {
        return item;
    }
}
