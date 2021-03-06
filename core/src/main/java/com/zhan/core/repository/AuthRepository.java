package com.zhan.core.repository;

import com.zhan.core.bean.db.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * author：  HyZhan
 * create：  2019/4/14
 * desc：    TODO
 */
public interface AuthRepository extends JpaRepository<Auth, Integer> {

    Optional<Auth> findByGroupIdAndAuthAndModule(Integer groupId, String auth, String module);

    List<Auth> findByGroupId(Integer groupId);

    Optional<Auth> findByGroupIdAndAuth(Integer groupId, String auth);

    void deleteByGroupIdAndAuthIn(Integer groupId, List<String> auths);
}
