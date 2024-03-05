public class CUadrado extends Figura{
	double base;
	double altura;

public CUadrado(double base, double altura){
this.base = base;
this.altura = altura;
}
@Override
public double area(){
	return this.base * this.altura;
}

}
