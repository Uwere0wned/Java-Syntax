/**
 * 
 */
package com.package.name;

/** import */
import com.package.name.ExampleJavaMom;
import com.package.name.utils.ExampleJavaUtils;

/**
 * @author 145981 
 *	nom de l'auteur
 */
public class ExampleJava extends ExampleJavaMom {

	/** première variable.*/
	private Integer var;
	/** other variable. */
	private String anotherVar;

	/**
	 * getter
	 * @return the var
	 */
	public Integer getVar() {
		return var;
	}

	/**
	 * setter
	 * @param var
	 *            the var to set
	 */
	public  void setVar(Integer var) {
		this.var = var;
	}

	/**
	 * @return the anotherVar
	 */
	public  String getAnotherVar() {
		return anotherVar;
	}

	/**
	 * @param anotherVar
	 *            the anotherVar to set
	 */
	public  void setAnotherVar(String anotherVar) {
		this.anotherVar = anotherVar;
	}

	@Override
	public  void getDateNow() {
		// methode héritée de la classe mere AnotherClazzzz
		system.out.println("nous sommes le : " + ClazzzUtils.getDate())
	}

	/**
	 * methode dont l'implémentation sera forcée dans les classes filles
	 */
	public abstract void toto();

}
