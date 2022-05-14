package com.dailycodebuffer.facebookclone.service;

import com.dailycodebuffer.facebookclone.model.Post;

import java.util.List;

public interface PostService {
  Post addPost(Post post) throws Exception;

  List<Post> getPost();
}
