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

import com.ameotech.services.orderservice.entity.Rating;
import com.ameotech.services.orderservice.service.RatingService;

@RestController
@RequestMapping("/api/rating")
public class RatingController {
	@Autowired
	private RatingService _ratingService;

	@GetMapping("/allratings")
	public ResponseEntity<List<Rating>> getAll() {
		List<Rating> ratings = null;
		try {
			ratings = _ratingService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
	}
	
	@GetMapping("/byid/{ratingId}")
	public ResponseEntity<Rating> getbyId(@PathVariable("ratingId") int ratingId){
		Rating rating = null;
		try {
			rating = _ratingService.GetById(ratingId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Rating>(rating, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<Rating> addUpdate(@RequestBody Rating _rating){
		Rating rating = null;
		try {
			rating = _ratingService.AddUpdate(_rating);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Rating>(rating, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{ratingId}")
	public ResponseEntity<Rating> deleteRating(@PathVariable int ratingId){
		Rating rating = null;
		try {
			rating = _ratingService.Delete(ratingId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Rating>(rating, HttpStatus.OK);
	}
}
