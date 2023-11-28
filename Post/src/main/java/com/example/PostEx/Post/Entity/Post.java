package com.example.PostEx.Post.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Post {
@jakarta.persistence.Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int pid;
private String name;
@OneToMany(targetEntity = Comments.class, cascade = CascadeType.ALL)
private List<Comments> comment;
}
