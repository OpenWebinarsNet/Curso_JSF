package backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import model.Usuario;

@ManagedBean
@RequestScoped
public class Solicitud {
	
	@ManagedProperty(value="#{usuario}")
	private Usuario usuario;

	public Solicitud() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String solicitar(){
		if(this.usuario.getNombre().equals("Marina")){
			//Redirigimos el flujo directamente especificando el nombre de la nueva página en la devolución del método
			System.out.println("Correcto para usuario: " + this.usuario.getNombre());
			return "correcto";//=correcto.xhtml
		}else{
			//Redirigimos el flujo directamente especificando el nombre de la nueva página en la devolución del método
			System.out.println("Incorrecto para usuario: " + this.usuario.getNombre());
			return "incorrecto";//=incorrecto.xhtml
		}
	}

}
