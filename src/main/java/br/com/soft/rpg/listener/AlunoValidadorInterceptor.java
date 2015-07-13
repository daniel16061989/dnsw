package br.com.soft.rpg.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import br.com.soft.rpg.session.UsuarioLogado;

public class AlunoValidadorInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public void init() {
		System.out.println("init");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		if (invocation.getProxy().getActionName().equals("fazerLogin")
				|| invocation.getProxy().getNamespace().equals("/cadastrarAluno")
				|| invocation.getProxy().getNamespace().equals("/registrar")) {
			return invocation.invoke();
		}
		
		if (invocation.getProxy().getActionName().equals("fazerLogout")) {
			return invocation.invoke();
		}

		UsuarioLogado usuarioLogado = (UsuarioLogado) invocation.getInvocationContext().getSession().get("usuarioLogado");
		if (!(usuarioLogado != null && usuarioLogado.getUsuario() != null)) {
			return "naoLogado";
		}

		return invocation.invoke();
	}

}
