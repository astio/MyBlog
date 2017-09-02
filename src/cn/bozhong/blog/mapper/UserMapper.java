package cn.bozhong.blog.mapper;

import cn.bozhong.blog.pojo.User;

public interface UserMapper {
  User getUser(String userId);
  void addUser(User user);
  void updatePassword(String password,String userId);
}
