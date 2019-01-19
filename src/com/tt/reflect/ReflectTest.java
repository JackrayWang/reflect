package com.tt.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	
	/**
	 * ͨ����ȫ�� ����һ�� �����
	 * ���췽��  ��������
	 * @return
	 */
	public TestBean getBean() {
		
		TestBean testBean =null;
		try {
			testBean = (TestBean) Class.forName("com.tt.reflect.TestBean").newInstance();
		} catch (InstantiationException e) {
			//�ö�����ʵ����
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			//���ø���Ĺ��췽������Private����Ȩ�ޡ�
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//û���ҵ���Ӧ����
			e.printStackTrace();
		}
		return testBean;
	}
	
	/**
	 * �в����� ���캯������
	 * @return
	 */
	public TestBean getParamBean() {
		TestBean testBean = null;
		
		try {
			testBean = (TestBean) Class.forName("com.tt.reflect.TestBean").getConstructor(String.class).newInstance("������");
		} catch (InstantiationException e) {
			//�ö�����ʵ����
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			//���ø���Ĺ��췽������Private����Ȩ�ޡ�
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			//�����쳣�Ĵ���
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			//�����쳣
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			//�˷����������쳣
			e.printStackTrace();
		} catch (SecurityException e) {
			//Ȩ�޲���
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//û���ҵ���
			e.printStackTrace();
		}
		
		return testBean;
	}
	
	/**
	 * ���䷽��
	 * @return
	 */
	public Object reflectMethod() {
		Object obj = null;
		//��ȡһ��bean
		TestBean bean = getBean();
		try {
			//�вη���  һ�����������ж������ ���ݲ�����ѭ��ָ��  ���������ͼ���  ���ŷָ�
			Method method = bean.getClass().getMethod("setName", String.class);
			//ָ��set����
			method.invoke(bean, "sad");
			//�޲η���
			Method method2 = bean.getClass().getMethod("getName");
			obj = method2.invoke(bean);
			
		} catch (NoSuchMethodException e) {
			// û�и÷���
			e.printStackTrace();
		} catch (SecurityException e) {
			// Ȩ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// ��ѭ�����  ���Ի��߷���Ϊ˽��
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// ���������쳣
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// �����쳣
			e.printStackTrace();
		}
		
		return obj;
		
	}
}
