
public class Car {
private String name;
private int price;

public Car() {//기본생성자
	System.out.println("방금 개체가 생상되었습니다");
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public void myprint() {
	System.out.println(this);
}
}
