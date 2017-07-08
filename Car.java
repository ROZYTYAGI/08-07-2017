package generic;

public class Car<T> {

String model;
String color;
String name;
Car(String ab,String bc,String cd)
{
	super();
	this.model=ab;
	this.color=bc;
	this.name=cd;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Car [model=" + model + ", color=" + color + ", name=" + name + "]";
}	

	
}

