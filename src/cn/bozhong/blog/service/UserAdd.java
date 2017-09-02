package cn.bozhong.blog.service;

import cn.bozhong.blog.pojo.User;

public interface UserAdd {
  boolean userAdd(User user);
  void updatePassword(String password,String userId);
}
