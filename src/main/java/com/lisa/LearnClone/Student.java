package com.lisa.LearnClone;

public class Student implements Cloneable {

	private String name;//��������

    private int age;//��������

    private Classes classes;//��������

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + " classes=" + classes +"]";
    }

    //��дclone����
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
