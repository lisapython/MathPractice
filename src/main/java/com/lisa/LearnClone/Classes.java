package com.lisa.LearnClone;

public class Classes implements Cloneable {

	private int classId;//��������

    private String className;//��������

    @Override
    protected Classes clone() throws CloneNotSupportedException {
    	Classes cls = (Classes)super.clone();
        return cls;
    }
    
    @Override
    public String toString() {
        return "Classes [classId=" + classId + ", className=" + className + "]";
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
