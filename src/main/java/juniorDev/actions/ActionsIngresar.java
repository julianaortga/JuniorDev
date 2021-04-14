package juniorDev.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import juniorDev.forms.FormIngresar;

public class ActionsIngresar extends Action {

	//Aqui se coloca la lógica del negocio
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//Se castea el ActionForm por el Formulario a utilizar
		FormIngresar ingresarF = (FormIngresar) form;
		
		if(ingresarF.getName()!=null && ingresarF.getLastname()!=null && ingresarF.getCharge()!=null) {
			ingresarF.setMsg("Bienvenido "+ingresarF.getName()+" "+ingresarF.getLastname()+" developer "+ingresarF.getCharge());
		}
		
		return mapping.findForward("ok");
	}

	
}
