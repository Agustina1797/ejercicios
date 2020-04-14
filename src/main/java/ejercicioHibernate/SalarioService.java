package ejercicioHibernate;

import java.util.List;

public class SalarioService {
	
	private SalarioDao salario;

	public SalarioDao getSalario() {
		return salario;
	}

	public void setSalario(SalarioDao salario) {
		this.salario = salario;
	}
	
	public void insertSalario (SalarioMap sal) {
		salario.insertSalario(sal);
	}
	
	public List<SalarioMap> getAllSalario(){
		return salario.getAllSalario();		
	}
	
	
	
}
