package com.cesur.general.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesur.general.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{

}
