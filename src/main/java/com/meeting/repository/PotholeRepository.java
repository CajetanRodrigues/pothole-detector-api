package com.meeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meeting.model.Pothole;

@Repository
public interface PotholeRepository    extends JpaRepository<Pothole, Integer>  {

}
