package com.ameotech.services.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ameotech.services.orderservice.entity.Comments;
import com.ameotech.services.orderservice.service.CommentsService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
	@Autowired
	private CommentsService _commentService;

	@GetMapping("/allcomments")
	public ResponseEntity<List<Comments>> getallComments() {
		List<Comments> comments = null;
		try {
			comments = _commentService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Comments>>(comments, HttpStatus.OK);
	}
	
	@GetMapping("/byid/{commentId}")
	public ResponseEntity<Comments> getbyId(@PathVariable("commentId")int commentId){
		Comments comment = null;
		try {
			comment = _commentService.GetById(commentId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Comments>(comment, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<Comments> addUpdateComment(@RequestBody Comments comment){
		Comments _comment = null;
		try {
			_comment = _commentService.AddUpdate(comment);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Comments>(_comment, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deletecomment/{commentId}")
	public ResponseEntity<Comments> deleteComment(@PathVariable("commentId") int commentId){
		Comments deletedComment = null;
		try {
			deletedComment = _commentService.Delete(commentId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Comments>(deletedComment, HttpStatus.OK);
	}
	
	@GetMapping("/allcommentsbyorderid/{orderId}")
	public ResponseEntity<List<Comments>> getcommentsbyOrderId(@PathVariable("orderId") int orderId) {
		List<Comments> comments = null;
		try {
			comments = _commentService.getCommentsbyOrderId(orderId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Comments>>(comments, HttpStatus.OK);
	}
	
	@GetMapping("/allcommentsbycustomerid/{customerId}")
	public ResponseEntity<List<Comments>> getcommentsbyCustomerId(@PathVariable("customerId") int customerId) {
		List<Comments> comments = null;
		try {
			comments = _commentService.getCommentsbyCustomerId(customerId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Comments>>(comments, HttpStatus.OK);
	}
}
