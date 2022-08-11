package edu.mosk.lombardapp.service.impls;
/*
  @author   george
  @project   summerschool
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 22.07.22 - 12.53
*/

import edu.mosk.lombardapp.model.Item;
import edu.mosk.lombardapp.repository.ItemFakeRepository;
import edu.mosk.lombardapp.service.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    ItemFakeRepository repository;

    @Override
    public Item create(Item item) { return repository.save(item);
    }

    @Override
    public Item update(Item item) {
        return repository.update(item);
    }

    @Override
    public Item get(String id) { return repository.findById(id);
    }

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() { return repository.findAll();  }
}
