package com.example.core.repository;

import com.example.core.bean.db.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author：  HyZhan
 * create：  2019/4/14
 * desc：    TODO
 */
public interface EventRepository extends JpaRepository<Event, Integer> {
}