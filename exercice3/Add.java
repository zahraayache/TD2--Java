package exercice3;

public class Add extends Expr{
	private Expr expr1;
	private Expr expr2;
	private double expr;
	public Add(Expr expr1, Expr expr2) {
		// TODO Auto-generated constructor stub
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.expr = expr1.eval() + expr2.eval();
	}
	
	

	public double eval() {
		
		return this.expr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.expr1.eval() + " + " + this.expr2.eval() + " = " + this.expr;
	}
}
