package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class TareaControl {
	private Connection conn;

	public TareaControl(Connection conn) {
		this.conn = conn;
	}

	public void insterUsuarioTarea(int idUsuario, Tarea tarea) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			sql = "SELECT * FROM tarea WHERE nombre = '" + tarea.getNombre() +"'";
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				int idTarea = rs.getInt("idtarea");
				sql = "INSERT INTO usuariotarea (idusuario,"+
				"idtarea) "
				+ "VALUES"
				+ "(" + idUsuario + "," + idTarea+ ")";
				statement.executeUpdate(sql);
			}
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

	public void insertTarea(Tarea tarea) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO tarea(nombre, asignatura, descripcion, realizada) " + "VALUES ('" + tarea.getNombre()
					+ "','" + tarea.getAsignatura() + "','" + tarea.getDescripcion() + "'," + tarea.getRealizada()
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
	
	public Vector<Integer> getIdTareas(int idUsuario) {
		Vector<Integer> idTareas = new Vector<>();
		
		String sql = "SELECT * FROM usuariotarea WHERE idusuario = "+idUsuario;
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				idTareas.add(rs.getInt("idtarea"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		
		return idTareas;
	}

	public Vector<Tarea> getTareas(int idTarea) {

		Vector<Tarea> tareas = new Vector<Tarea>();
		String sql = "SELECT * FROM tarea WHERE idtarea = "+ idTarea;
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Tarea t = new Tarea();
				t.setIdTarea(rs.getInt(1));
				t.setNombre(rs.getString(2));
				t.setAsignatura(rs.getString(3));
				t.setDescripcion(rs.getString(4));
				t.setRealizada(rs.getInt(5));
				/*
				 * p.setIdEmployee(rs.getInt(1)); p.setName(rs.getString(2));
				 * p.setPhone(rs.getString(3)); p.setDepto(rs.getInt(4));
				 * p.setUuid(rs.getInt(5));
				 */
				tareas.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return tareas;
	}

	public void deleteTarea(int idTarea) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM tarea WHERE idtarea = " + idTarea;
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

	public void updateTarea(Tarea tareas) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE employee SET nombre = ?, email = ?, departamento = ?, materia = ?, telefono = ? WHERE idProfesor = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(2, tareas.getNombre());
			statement.setString(3, tareas.getAsignatura());
			statement.setString(4, tareas.getDescripcion());
			statement.setInt(5, tareas.getRealizada());
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
