package com.tt.reflect;

public class MainTest {
	
	public static void main(String[] args) {
		ReflectTest r = new ReflectTest();
		//ע��㣬���bean�����������Ĺ��캯��������Ҫ�Լ�д�� �޲ҹ��캯�����ڻᱨ��
		TestBean bean = r.getBean();
		System.out.println("bean:"+bean.getStatus());
		
		TestBean paramBean = r.getParamBean();
		System.out.println("paramBean:"+paramBean.getStatus());
		
		Object reflectMethod = r.reflectMethod();
		System.out.println(reflectMethod);
	}

}
