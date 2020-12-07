package com.lisa.LearnClone;

public class TestClone {
	
	public static void main(String[] args) {
		//简单赋值测试
		//[基本数据类型，以及String]
		//【结论：基本数据类型用等于号进行变量赋值时，创建新的对象。】
		System.out.println("=====测试[基本数据类型]========");
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
		
		//【结论：String类型用等于号进行变量赋值时，创建新的对象。】
		System.out.println("======测试[String]=======");
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
		
		
		//简单赋值测试/浅拷贝
		//[类的对象]
		//【结论：仅仅用等于号进行简单的对象赋值时，只是增加了一个新的对象并且指向了对原本对象的引用。两个对象还是相互关联的。】
		System.out.println("======简单赋值测试/浅拷贝[对象] 只是把地址复制过去了，两个变量其实还是指向同一个地址=======");
		EasyStudent student = new EasyStudent();
		student.setAge(1);
		student.setName("k11");
		EasyClasses easyClass = new EasyClasses();
		easyClass.setClassId(101);
		easyClass.setClassName("101");
		student.setClasses(easyClass);
		
		EasyStudent student2 = student;
		System.out.println("学生2拷贝自学生1");
		
		System.out.println(student.toString());//学生 [姓名=k11, 年龄=1, 班级=班级 [班级ID=101, 班级名=101]]
		System.out.println(student2.toString());//学生 [姓名=k11, 年龄=1, 班级=班级 [班级ID=101, 班级名=101]]
		
		System.out.println("学生2改变");
		student2.setAge(2);
		student2.setName("k22");
		EasyClasses easyClass2 = new EasyClasses();
		easyClass2.setClassId(202);
		easyClass2.setClassName("202");
		student2.setClasses(easyClass2);
		System.out.println(student.toString());
		System.out.println(student2.toString());
		System.out.println("学生1也跟着改变了");
		
		System.out.println("学生1改变");
		student.setAge(111);
		student.setName("k111");
		easyClass.setClassId(111);
		easyClass.setClassName("111");
		student.setClasses(easyClass);
		System.out.println("学生2也跟着改变了");
		System.out.println(student.toString());
		System.out.println(student2.toString());
		
		System.out.println("--------------------------------------------------------------------");
		
		//深拷贝测试
		//[类的对象]
		//【结论：类在定义过程中实现了clonable接口，重写了clone方法，使用clone方法对学生对象进行拷贝的时候，
		//基本数据类型可以拷贝了  但是类里面的引用对象还是无法拷贝
		//只有在引用的对象里面也加上clone方法，才能被拷贝。】
		System.out.println("======深拷贝测试[对象]=======");
		System.out.println("======深拷贝实现：类以及类的引用都必须实现clonable接口，重写clone方法=======");
		Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(10);
        
        Classes cls = new Classes();
        cls.setClassId(1);
        cls.setClassName("cls1");
        stu1.setClasses(cls);
        
        try {
			Student stu2 = (Student) stu1.clone();
			System.out.println("学生2拷贝自学生1");
			System.out.println(stu1.toString());
			System.out.println(stu2.toString());
			
			stu2.setName("stu2");
			stu2.setAge(22);
			Classes cls2 = (Classes)cls.clone();
			cls2.setClassId(222);
	        cls2.setClassName("cls222");
	        stu2.setClasses(cls2);
			System.out.println("学生2改变");
			System.out.println(stu1.toString());
			System.out.println(stu2.toString());
			
			stu1.setName("stu1");
			stu1.setAge(11);
	        Classes cls3 = (Classes)cls.clone();
			cls3.setClassId(333);
	        cls3.setClassName("cls333");
	        stu1.setClasses(cls3);
			System.out.println("学生1改变");
			System.out.println(stu1.toString());
			System.out.println(stu2.toString());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
        
	}

}
