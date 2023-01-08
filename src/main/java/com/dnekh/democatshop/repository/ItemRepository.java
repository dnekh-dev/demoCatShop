package com.dnekh.democatshop.repository;

import com.dnekh.democatshop.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
