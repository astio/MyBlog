package cn.bozhong.blog.aop;

import org.springframework.stereotype.Component;

@Component("test")
public class TestImpl implements Test {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}


}
