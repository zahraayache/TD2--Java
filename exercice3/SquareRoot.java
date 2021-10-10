package exercice3;

/**
 * 
 * @author zahra
 *
 */

public class SquareRoot extends Expr{
	
	private double expr;
	/**
	 * 
	 * @param expr
	 */
	public SquareRoot(Expr expr) {
		// TODO Auto-generated constructor stub
		
		this.expr = Math.sqrt(expr.eval()) ;
	}
	
	

	public double eval() {
		
		return this.expr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\u221A" + Math.pow(this.expr, 2) + " = "+ this.eval() ;
	}
}
