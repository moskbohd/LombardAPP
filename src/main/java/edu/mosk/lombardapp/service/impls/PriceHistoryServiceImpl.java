package edu.mosk.lombardapp.service.impls;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 15.08.2022
*/

import edu.mosk.lombardapp.model.PriceHistory;
import edu.mosk.lombardapp.repository.PriceHistoryFakeRepository;
import edu.mosk.lombardapp.service.interfaces.IPriceHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceHistoryServiceImpl implements IPriceHistoryServiceImpl {

    @Autowired
    PriceHistoryFakeRepository repository;

    @Override
    public PriceHistory create(PriceHistory priceHistory) { return repository.save(priceHistory);
    }

    @Override
    public PriceHistory update(PriceHistory priceHistory) { return repository.update(priceHistory);
    }

    @Override
    public PriceHistory get(String id) { return repository.findById(id);
    }

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<PriceHistory> getAll() { return repository.findAll();
    }
}
