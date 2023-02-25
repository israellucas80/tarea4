import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;

/**
 * Implementa el inicio del programa.
 * 
 * @author Israel Lucas Torrijos
 * @version 0.1
 * @since 0.1
 * @see https://github.com/israellucas80
 *
 */
public class FicheroAleatorioVentana {

	/**
	 * Método de clase que sirve como punto de inicio de ejecución de la aplicación
	 * 
	 * @param String args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		JFrame f = new JFrame("DEPARTAMENTOS.");

		// Nos aseguramos que el fichero exista para evitar posibles errores
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile file;
		file = new RandomAccessFile(fichero, "rw");
		file.close();

		VentanaDepart v = new VentanaDepart(f);
		v.setVisible(true);

	}

}
