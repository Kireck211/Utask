package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProfesorControl {
	private Connection conn;

	public ProfesorControl(Connection conn) {
		this.conn = conn;
	}

	public void insertMateriaProfesor(int idMateria, int idProfesor){
		if (conn == null)
		return;
	Statement statement = null;
	String sql = null;
	try {
		statement = conn.createStatement();
		sql = "INSERT INTO materiaprofesor(idmateria, idprofesor) " + "VALUES (" + idMateria + "," + idProfesor+ ")";
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
	
	public void insertProfesor(Profesor profesor) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO profesor(nombre, email, departamento, telefono) " + "VALUES ('" + profesor.getNombre()
					+ "','" + profesor.getEmail() + "','" + profesor.getDepartamento() + "'," + profesor.getTelefono()
					+ ")";
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

	public ArrayList<Profesor> getProfesores() {

		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		String sql = "SELECT idProfesor, nombre, email, departamento, materia, telefono FROM employee";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Profesor p = new Profesor();
				p.setIdProfesor(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setEmail(rs.getString(3));
				p.setDepartamento(rs.getString(4));
				p.setMateria(rs.getString(5));
				p.setTelefono(rs.getInt(6));
				/*
				 * p.setIdEmployee(rs.getInt(1)); p.setName(rs.getString(2));
				 * p.setPhone(rs.getString(3)); p.setDepto(rs.getInt(4));
				 * p.setUuid(rs.getInt(5));
				 */
				profesores.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return profesores;
	}

	public void deleteProfesor(int idProfesor) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM profesor WHERE idProfesor = " + idProfesor;
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

	public void updateProfesor(Profesor profesor) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE employee SET nombre = ?, email = ?, departamento = ?, materia = ?, telefono = ? WHERE idProfesor = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, profesor.getNombre());
			statement.setString(2, profesor.getEmail());
			statement.setString(3, profesor.getDepartamento());
			statement.setString(4, profesor.getMateria());
			statement.setInt(5, profesor.getTelefono());
			statement.setInt(6, profesor.getIdProfesor());
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
