package com.lisa.LearnClone;

public class TestClone {
	
	public static void main(String[] args) {
		//�򵥸�ֵ����
		//[�����������ͣ��Լ�String]
		//�����ۣ��������������õ��ںŽ��б�����ֵʱ�������µĶ��󡣡�
		System.out.println("=====����[������������]========");
		int i = 1;
		int j = i;
		System.out.println(i);//1
		System.out.println(j);//1
		j = 2 ;
		System.out.println(i);//1
		System.out.println(j);//2
		i = 3;
		System.out.println(i);//3
		System.out.println(j);//2
		
		//�����ۣ�String�����õ��ںŽ��б�����ֵʱ�������µĶ��󡣡�
		System.out.println("======����[String]=======");
		String s1 = "String1";
		String s2 = s1;
		System.out.println(s1);//String1
		System.out.println(s2);//String1
		s2 = "String2";
		System.out.println(s1);//String1
		System.out.println(s2);//String2
		s1 = "new String1";
		System.out.println(s1);//new String1
		System.out.println(s2);//String2
		
		
		//�򵥸�ֵ����/ǳ����
		//[��Ķ���]
		//�����ۣ������õ��ںŽ��м򵥵Ķ���ֵʱ��ֻ��������һ���µĶ�����ָ���˶�ԭ����������á������������໥�����ġ���
		System.out.println("======�򵥸�ֵ����/ǳ����[����] ֻ�ǰѵ�ַ���ƹ�ȥ�ˣ�����������ʵ����ָ��ͬһ����ַ=======");
		EasyStudent student = new EasyStudent();
		student.setAge(1);
		student.setName("k11");
		EasyClasses easyClass = new EasyClasses();
		easyClass.setClassId(101);
		easyClass.setClassName("101");
		student.setClasses(easyClass);
		
		EasyStudent student2 = student;
		System.out.println("ѧ��2������ѧ��1");
		
		System.out.println(student.toString());//ѧ�� [����=k11, ����=1, �༶=�༶ [�༶ID=101, �༶��=101]]
		System.out.println(student2.toString());//ѧ�� [����=k11, ����=1, �༶=�༶ [�༶ID=101, �༶��=101]]
		
		System.out.println("ѧ��2�ı�");
		student2.setAge(2);
		student2.setName("k22");
		EasyClasses easyClass2 = new EasyClasses();
		easyClass2.setClassId(202);
		easyClass2.setClassName("202");
		student2.setClasses(easyClass2);
		System.out.println(student.toString());
		System.out.println(student2.toString());
		System.out.println("ѧ��1Ҳ���Ÿı���");
		
		System.out.println("ѧ��1�ı�");
		student.setAge(111);
		student.setName("k111");
		easyClass.setClassId(111);
		easyClass.setClassName("111");
		student.setClasses(easyClass);
		System.out.println("ѧ��2Ҳ���Ÿı���");
		System.out.println(student.toString());
		System.out.println(student2.toString());
		
		System.out.println("--------------------------------------------------------------------");
		
		//�������
		//[��Ķ���]
		//�����ۣ����ڶ��������ʵ����clonable�ӿڣ���д��clone������ʹ��clone������ѧ��������п�����ʱ��
		//�����������Ϳ��Կ�����  ��������������ö������޷�����
		//ֻ�������õĶ�������Ҳ����clone���������ܱ���������
		System.out.println("======�������[����]=======");
		System.out.println("======���ʵ�֣����Լ�������ö�����ʵ��clonable�ӿڣ���дclone����=======");
		Student stu1 = new Student();
        stu1.setName("����");
        stu1.setAge(10);
        
        Classes cls = new Classes();
        cls.setClassId(1);
        cls.setClassName("cls1");
        stu1.setClasses(cls);
        
        try {
			Student stu2 = (Student) stu1.clone();
			System.out.println("ѧ��2������ѧ��1");
			System.out.println(stu1.toString());
			System.out.println(stu2.toString());
			
			stu2.setName("stu2");
			stu2.setAge(22);
			Classes cls2 = (Classes)cls.clone();
			cls2.setClassId(222);
	        cls2.setClassName("cls222");
	        stu2.setClasses(cls2);
			System.out.println("ѧ��2�ı�");
			System.out.println(stu1.toString());
			System.out.println(stu2.toString());
			
			stu1.setName("stu1");
			stu1.setAge(11);
	        Classes cls3 = (Classes)cls.clone();
			cls3.setClassId(333);
	        cls3.setClassName("cls333");
	        stu1.setClasses(cls3);
			System.out.println("ѧ��1�ı�");
			System.out.println(stu1.toString());
			System.out.println(stu2.toString());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
        
	}

}
