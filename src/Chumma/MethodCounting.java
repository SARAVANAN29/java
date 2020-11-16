package Chumma;

import java.beans.MethodDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Students{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    
}

public class MethodCounting{
	public static void main(String Args []) {
		Students s = new Students();
		Method[] methods = Students.class.getDeclaredMethods();
		List<String> list = new ArrayList();
		for(Method method : methods) {
//			System.out.println(method.getName());
			list.add(method.getName());
		}
		Collections.sort(list);
		for(String method : list) {
			System.out.println(method);
//			list.add(method.getName());
		}
	}
}