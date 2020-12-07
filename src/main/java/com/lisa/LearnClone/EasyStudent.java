package com.lisa.LearnClone;

public class EasyStudent extends SerialClone {

	private String name;//引用类型

    private int age;//基本类型

    private EasyClasses classes;//引用类型
    
    
    public String toString() {
        return "学生 [姓名=" + name + ", 年龄=" + age + ", 班级=" + classes + "]";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EasyClasses getClasses() {
		return classes;
	}

	public void setClasses(EasyClasses classes) {
		this.classes = classes;
	}
    
    
}
