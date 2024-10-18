package com.cesur.general.services;

import java.util.List;

import com.cesur.general.models.dtos.CommentDTO;

public interface CommentService {

    void saveComment(CommentDTO comment);

    List<CommentDTO> getCommentsByIncidenceId(Long id);

    void deleteComment(Long id);
}
