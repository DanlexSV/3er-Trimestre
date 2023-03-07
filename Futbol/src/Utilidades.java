import javax.swing.JOptionPane;

public class Utilidades {
	
	public Jugador datosJugador() {
		Jugador jug = new Jugador();
		jug.setNombre(JOptionPane.showInputDialog("Escribe el nombre del jugador"));
		jug.setAño_Nacimiento(JOptionPane.showInputDialog("Escribe el año de nacimiento"));
		jug.setDNI(JOptionPane.showInputDialog("Escribe el DNI del jugador"));
		jug.setDorsal(Integer.parseInt(JOptionPane.showInputDialog("Escribe el número dorsal")));
		jug.setEnmarcacion(JOptionPane.showInputDialog("Escribe la enmarcación"));
		return jug;
	}
}
