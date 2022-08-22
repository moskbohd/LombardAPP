package edu.mosk.lombardapp.service.price.interfaces;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.price.PriceHistory;

import java.util.List;

public interface IPriceHistoryServiceImpl {
    PriceHistory create(PriceHistory priceHistory);
    PriceHistory update(PriceHistory priceHistory);
    PriceHistory get(String id);
    void delete(String id);
    List<PriceHistory> getAll();
}
