package com.pessoal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.course.entities.OrderItem;
import com.pessoal.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
