package com.healthcaresystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcaresystem.model.Feedback;

@Repository
public interface FeedbackDaoInterface extends JpaRepository<Feedback, Integer> {

}
