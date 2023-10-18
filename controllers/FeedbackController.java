package com.paytmbus.reservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.paytmbus.reservation.models.feedback;
import com.paytmbus.reservation.services.FeedbackService;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping
    public ResponseEntity<List<feedback>> getAllFeedbacks() {
        List<feedback> feedbacks = feedbackService.getAllFeedbacks();
        return ResponseEntity.ok(feedbacks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<feedback> getFeedbackById(@PathVariable Long id) {
        feedback feedback = feedbackService.getFeedbackById(id);
        if (feedback != null) {
            return ResponseEntity.ok(feedback);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<String> saveFeedback(@RequestBody feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return ResponseEntity.status(HttpStatus.CREATED).body("Feedback saved successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
        return ResponseEntity.ok("Feedback deleted successfully!");
    }
}