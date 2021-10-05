package com.example.commentservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.commentservice.model.Comments;


@Repository
@Transactional
public interface CommentsDao extends JpaRepository<Comments,Integer>{

}
