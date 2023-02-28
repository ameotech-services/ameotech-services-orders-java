package com.ameotech.services.orderservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameotech.services.orderservice.entity.Comments;
import com.ameotech.services.orderservice.repository.CommentsRepository;
import com.ameotech.services.orderservice.service.CommentsService;

import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;
@Service
public class CommentsServiceImpl extends BaseService<Comments, BaseRepository<Comments,Integer>> implements CommentsService {
@Autowired
private CommentsRepository _repoComment;	
	@Override
	public List<Comments> getCommentsbyOrderId(int orderId) {
		return (List<Comments>) _repoComment.findByPlacedOrderId(orderId);
	}
	@Override
	public List<Comments> getCommentsbyCustomerId(int customerId) {
		return (List<Comments>) _repoComment.findByCustomerId(customerId);
	}
}
