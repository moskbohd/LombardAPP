package edu.mosk.lombardapp.service.interfaces;
/*
  @author   george
  @project   summerschool
  @class  IItemService
  @version  1.0.0 
  @since 22.07.22 - 12.47
*/

import edu.mosk.lombardapp.model.Item;

import java.util.List;

public interface IItemService {
    Item create(Item item);
    Item update(Item item);
    Item get(String id);
    void delete(String id);
    List<Item> getAll();



}
