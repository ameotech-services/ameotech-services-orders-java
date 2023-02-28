package com.ameotech.services.orderservice.repository;

import org.springframework.stereotype.Repository;

import com.ameotech.services.orderservice.entity.orders;

import ameotech.services.common.repos.BaseRepository;
@Repository
public interface OrderRepository extends BaseRepository<orders , Integer> {

}
