package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EstudianteControl {
	private Connection conn;

	public EstudianteControl(Connection conn) {
		this.conn = conn;
	}

	public void insertEstudiante(Estudiante estudiante) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO estudiante(nombre, carrera, email) " + "VALUES ('" + estudiante.getNombre() + "','"
					+ estudiante.getCarrera() + "','" + estudiante.getEmail() + "')";
			statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {

				} finally {
					sql = null;
				}
			}
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		String sql = "SELECT idEstudiante, nombre, carrera, email FROM estudiante";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Estudiante e = new Estudiante();
				e.setIdEstudiante(rs.getInt(1));
				e.setNombre(rs.getString(2));
				e.setCarrera(rs.getString(3));
				e.setEmail(rs.getString(4));
				estudiantes.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return estudiantes;
	}

	public void deleteEstudiante(int idEstudiante) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM estudiante WHERE idEstudiante = " + idEstudiante;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
				} finally {
					sql = null;
				}
			}
		}
	}

	public void updateEstudiante(Estudiante estudiante) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE clase SET nombre = ?, carrera = ?, email = ? WHERE idEstudiante = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, estudiante.getNombre());
			statement.setString(2, estudiante.getCarrera());
			statement.setString(3, estudiante.getEmail());
			statement.setInt(4, estudiante.getIdEstudiante());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
				} finally {
					sql = null;
				}
			}
		}

	}
}
