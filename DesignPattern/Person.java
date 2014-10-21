Schwinn Men's Volare 1300 700C Drop Bar Road Bicycle, Blue/White, 18-Inchpackage com.design.pattern.creational.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Person {
	
	private PropertyChangeListener listen;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String firstName;
	
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public PropertyChangeListener getListen() {
		return listen;
	}

	public void setListen(PropertyChangeListener listen) {
		this.listen = listen;
	}

	public void setFirstName(String firstName1) {
		this.listen.propertyChange(new PropertyChangeEvent(this, "firstName", firstName, firstName1));
		this.firstName = firstName1;
		
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
