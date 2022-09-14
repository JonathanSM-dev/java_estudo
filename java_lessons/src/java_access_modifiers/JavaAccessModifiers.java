package java_access_modifiers;

public class JavaAccessModifiers {
public String publicMessage = "This is public";		//public: visible in all classes in all packages
protected String protectedMessage = "This is protected";//protected: visible to all classes in the same package or classes in other packages that are a subclass
		String defaultMessage = "This is Default";		//default: visible to all classes in the same package 
private String privateMessage = "This is private";		//private: visible only in the same class
}

/*  ------------------- ACCESS LEVEL --------|
	------------|Class|Package|Subclass|World|
	public: 	|  Y  |   Y   |   Y    |  Y  |
	protected:  |  Y  |   Y   |   Y    |  N  |
	default: 	|  Y  |   Y   |   N    |  N  |
	private: 	|  Y  |   N   |   N    |  N  |
---------------------------------------------|
 */