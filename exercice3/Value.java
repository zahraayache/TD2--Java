package exercice3;

public class Value extends Expr{
	
	private double val;
	public Value(double expr) {
		this.val = expr;
		// TODO Auto-generated constructor stub
	}
	
	public double eval() {
		return val;
	}

}
