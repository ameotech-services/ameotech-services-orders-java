package com.ameotech.services.orderservice.service.impl;

import org.springframework.stereotype.Service;

import com.ameotech.services.orderservice.entity.Rating;
import com.ameotech.services.orderservice.service.RatingService;

import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;

@Service
public class RatingServiceImpl extends BaseService<Rating, BaseRepository<Rating,Integer>> implements RatingService {
	
}
