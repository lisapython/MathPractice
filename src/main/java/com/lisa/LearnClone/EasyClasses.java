package com.lisa.LearnClone;

public class EasyClasses {

	private int classId;//��������

    private String className;//��������
    
    @Override
    public String toString() {
        return "�༶ [�༶ID=" + classId + ", �༶��=" + className + "]";
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
