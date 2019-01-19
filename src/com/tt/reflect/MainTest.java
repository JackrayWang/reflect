package com.tt.reflect;

public class MainTest {
	
	public static void main(String[] args) {
		ReflectTest r = new ReflectTest();
		//注意点，如果bean里面有其他的构造函数，则需要自己写明 无惨构造函数否在会报错
		TestBean bean = r.getBean();
		System.out.println("bean:"+bean.getStatus());
		
		TestBean paramBean = r.getParamBean();
		System.out.println("paramBean:"+paramBean.getStatus());
		
		Object reflectMethod = r.reflectMethod();
		System.out.println(reflectMethod);
	}

}
