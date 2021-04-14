package juniorDev.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.GenericValidator;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class FormIngresar extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastname;
	private String charge;
	private String msg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		
		//Validación de que el nombre, apellido y cargo no sea vacio
		
		if(GenericValidator.isBlankOrNull(this.name)) {
			errors.add("erName",new ActionMessage("error.valor.name"));
		}
		if(GenericValidator.isBlankOrNull(this.lastname)) {
			errors.add("erName",new ActionMessage("error.valor.lastname"));
		}
		if(GenericValidator.isBlankOrNull(this.charge)) {
			errors.add("erName",new ActionMessage("error.valor.charge"));
		}
		
		return errors;
	}

}
