
public class Product {
	public Product(int _id,String _name,String _description,double _price,int _stockAmount,String _color) {
		this._id=_id;
		this._name=_name;
		this._description=_description;
		this._price=_price;
		this._stockAmount=_stockAmount;
		this._color=_color;
		System.out.println("Yapýcý blok çalýþtý..");
	}
	public Product() {
		
	}
	//Attribute || Field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _code;//kullanýcý yazamaz okur Encapsulation
	//SOLID
	//Single Responsibility Principle: Bir class veya bir metot sadece bir iþ yapar.
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id=id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name=name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description=description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double price) {
		_price=price;
	}
	public int getStockAmount() {
		return _stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		_stockAmount=stockAmount;
	}
	public String getColor() {
		return _color;
	}
	public void setColor(String color) {
		_color=color;
	}
	public String getCode() {
		return this._name.substring(0,1)+ _id;
	}
	
}
