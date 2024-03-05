public class Circulo extends FIgura{
	private double radio;
	
	public Circulo(double radio){
	this.radio = radio;
	}
	
	@Overrride
	public double area(){
		return Math.PI*radio*radio;
	}
	
	@Override
	public double perimetro(){
		return 2*Math.PI*radio;
	}
}
