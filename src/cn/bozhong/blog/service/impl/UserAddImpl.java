package cn.bozhong.blog.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.bozhong.blog.exception.UserAccountException;
import cn.bozhong.blog.mapper.UserMapper;

import cn.bozhong.blog.pojo.User;
import cn.bozhong.blog.service.UserAdd;
@Service("userAdd")
public class UserAddImpl implements UserAdd{
  // UserMapperImpl userMapperImpl =new UserMapperImpl();
	@Autowired
	private UserMapper userMapper;
	
	/*
	 * @Transactional(propagation=Propagation.REQUIRED) 
如果有事务, 那么加入事务, 没有的话新建一个(默认情况下)
@Transactional(propagation=Propagation.NOT_SUPPORTED) 
容器不为这个方法开启事务
@Transactional(propagation=Propagation.REQUIRES_NEW) 
不管是否存在事务,都创建一个新的事务,原来的挂起,新的执行完毕,继续执行老的事务
@Transactional(propagation=Propagation.MANDATORY) 
必须在一个已有的事务中执行,否则抛出异常
@Transactional(propagation=Propagation.NEVER) 
必须在一个没有的事务中执行,否则抛出异常(与Propagation.MANDATORY相反)
@Transactional(propagation=Propagation.SUPPORTS) 
如果其他bean调用这个方法,在其他bean中声明事务,那就用事务.如果其他bean没有声明事务,那就不用事务.

事物超时设置:
@Transactional(timeout=30) //默认是30秒

事务隔离级别:
@Transactional(isolation = Isolation.READ_UNCOMMITTED)
读取未提交数据(会出现脏读, 不可重复读) 基本不使用
@Transactional(isolation = Isolation.READ_COMMITTED)
读取已提交数据(会出现不可重复读和幻读)
@Transactional(isolation = Isolation.REPEATABLE_READ)
可重复读(会出现幻读)
@Transactional(isolation = Isolation.SERIALIZABLE)
	 * 
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW,
			isolation=Isolation.READ_COMMITTED,noRollbackFor={UserAccountException.class},timeout=3
,readOnly=false
		)
	@Override
	public boolean userAdd(User user) {
		// TODO Auto-generated method stub
	
			
	//		userMapperImpl.addUser(user);
			
			userMapper.addUser(user);
			System.out.println("hehe");
		
			return true;
	
			
		}
		


		@Override
		public void updatePassword(String password, String userId) {
			// TODO Auto-generated method stub
			userMapper.updatePassword(password, userId);
			
		}
		
	}


