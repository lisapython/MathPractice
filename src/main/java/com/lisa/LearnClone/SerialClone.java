package com.lisa.LearnClone;

import java.io.Serializable;

public class SerialClone implements Cloneable, Serializable {

	private static final long serialVersionUID = 5794148504376232369L;
	 
    @Override
    public Object clone() {
        try {
			return DeepClone.clone(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

}
