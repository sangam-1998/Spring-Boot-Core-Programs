package spring.core.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import spring.core.child.Tokan;

@Component("tService")
@Scope("singleton")
public class TokenService {

	@Autowired
	Tokan t;

	@Lookup
	public Tokan getNewTokan() {
		return null;
	}

	public Tokan getT() {
		return t;
	}

	@Override
	public String toString() {
		this.t = getNewTokan();
	    return "TokenService [t=" + t + "]";
	}

	
	
	
	
}
