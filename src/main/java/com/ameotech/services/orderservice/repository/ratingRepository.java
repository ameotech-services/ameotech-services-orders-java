package com.ameotech.services.orderservice.repository;

import org.springframework.stereotype.Repository;

import com.ameotech.services.orderservice.entity.Rating;

import ameotech.services.common.repos.BaseRepository;
@Repository
public interface ratingRepository extends BaseRepository<Rating, Integer> {

}
