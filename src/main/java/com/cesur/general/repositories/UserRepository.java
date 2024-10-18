package com.cesur.general.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesur.general.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
