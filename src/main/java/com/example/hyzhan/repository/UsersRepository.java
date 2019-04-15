package com.example.hyzhan.repository;

import com.example.hyzhan.bean.db.cms.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author：  HyZhan
 * create：  2019/4/14
 * desc：    TODO
 */
public interface UsersRepository extends JpaRepository<User, Integer> {

    Page<User> findByAdmin(Integer admin, Pageable pageable);

    Page<User> findByAdminAndGroupId(Integer admin, Integer groupId, Pageable pageable);
}
