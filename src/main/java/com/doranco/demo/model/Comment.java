package com.doranco.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Comment extends AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
@Lob
private String text;


@ManyToOne(optional = false,fetch = FetchType.LAZY)
@JoinColumn(name = "post_id",nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
private Post post;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getText() {
	return text;
}


public void setText(String text) {
	this.text = text;
}


public Post getPost() {
	return post;
}


public void setPost(Post post) {
	this.post = post;
}








}
