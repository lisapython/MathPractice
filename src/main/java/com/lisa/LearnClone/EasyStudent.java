package com.lisa.LearnClone;

public class EasyStudent extends SerialClone {

	private String name;//��������

    private int age;//��������

    private EasyClasses classes;//��������
    
    
    public String toString() {
        return "ѧ�� [����=" + name + ", ����=" + age + ", �༶=" + classes + "]";
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
