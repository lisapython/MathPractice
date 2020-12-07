package com.lisa.LearnClone;

public class Student implements Cloneable {

	private String name;//引用类型

    private int age;//基本类型

    private Classes classes;//引用类型

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + " classes=" + classes +"]";
    }

    //重写clone方法
    @Override
    protected Student clone() throws CloneNotSupportedException {
    	Student stu = (Student)super.clone();
        return stu;
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

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}  
    
    
}
