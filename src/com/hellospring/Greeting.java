package com.hellospring;

import java.util.List;
import com.hellointer.*;

public class Greeting implements Greeter {
	private List<String> names;
	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getGreeting() {
		StringBuffer buffer = new StringBuffer();
		for (String name : names) {
			if(names.indexOf(name) == 0)
				buffer.append(name);
			else if(names.indexOf(name) != names.size()-1)
				buffer.append(", "+name);
			else
				buffer.append(" and "+name);
			
		}
		return buffer.toString();
	}

}
