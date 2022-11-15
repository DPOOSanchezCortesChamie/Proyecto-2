package controlador;

import java.util.List;

import modelo.Admin;
import modelo.EquipoFantasia;

public class ControladorAdmin {
	Admin admin;
	public ControladorAdmin(Admin a) {
		this.admin = a;
	}
	public void crearTemporada(String nominas, String fechas, int presupuesto) {
		admin.crearTemporada(nominas, fechas, presupuesto);
	}
	public List<EquipoFantasia> getMejoresTres() {
		return admin.getMejoresTres();
	}
	public void registrarResultadoPartido(String resultado) {
		admin.registrarResultadoPartido(resultado);
	}
	public void concluirFecha() {
		admin.concluirFecha();
	}
}
