package com.lisa.LearnClone;

public class EasyClasses {

	private int classId;//基本类型

    private String className;//引用类型
    
    @Override
    public String toString() {
        return "班级 [班级ID=" + classId + ", 班级名=" + className + "]";
    }

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
    
    
}
