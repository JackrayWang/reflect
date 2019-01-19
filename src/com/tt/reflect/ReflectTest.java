package com.tt.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	
	/**
	 * 通过类全名 构造一个 类对象
	 * 构造方法  不带参数
	 * @return
	 */
	public TestBean getBean() {
		
		TestBean testBean =null;
		try {
			testBean = (TestBean) Class.forName("com.tt.reflect.TestBean").newInstance();
		} catch (InstantiationException e) {
			//该对象不能实例化
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			//调用该类的构造方法，是Private访问权限。
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//没有找到对应的类
			e.printStackTrace();
		}
		return testBean;
	}
	
	/**
	 * 有参数的 构造函数反射
	 * @return
	 */
	public TestBean getParamBean() {
		TestBean testBean = null;
		
		try {
			testBean = (TestBean) Class.forName("com.tt.reflect.TestBean").getConstructor(String.class).newInstance("不锁定");
		} catch (InstantiationException e) {
			//该对象不能实例化
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			//调用该类的构造方法，是Private访问权限。
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			//数据异常的错误
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			//反射异常
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			//此方法不存在异常
			e.printStackTrace();
		} catch (SecurityException e) {
			//权限不足
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//没有找到类
			e.printStackTrace();
		}
		
		return testBean;
	}
	
	
	public Object reflectMethod() {
		Object obj = null;
		//获取一个bean
		TestBean bean = getBean();
		try {
			//有参方法
			Method method = bean.getClass().getMethod("setName", String.class);
			//指定set方法
			method.invoke(bean, "sad");
			//无参方法
			Method method2 = bean.getClass().getMethod("getName");
			obj = method2.invoke(bean);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
		
	}
}
