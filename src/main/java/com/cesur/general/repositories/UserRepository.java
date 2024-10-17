package com.cesur.general.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cesur.general.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
