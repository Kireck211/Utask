package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import calendar.MyDateTime;

public class ClaseControl {
	private Connection conn;

	public ClaseControl(Connection conn) {
		this.conn = conn;
	}

	public void insertUsuarioClase(int idUsuario, Clase clase) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			sql = "SELECT * FROM clase WHERE nombre = '" + clase.getNombre() +"'";
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				int idClase = rs.getInt("idclase");
				sql = "INSERT INTO usuarioclase (idusuario,"+
				"idclase) "
				+ "VALUES"
				+ "(" + idUsuario + "," + idClase+ ")";
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

	public void insertClase(Clase clase) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO clase (nombre, ubicacion, lunes, martes, miercoles, jueves, viernes, sabado, domingo) "
					+ "VALUES ('" + clase.getNombre() + "','" + clase.getUbicacion() + "'," + clase.getLunes() + ","
					+ clase.getMartes() + "," + clase.getMiercoles() + "," + clase.getJueves() + ","
					+ clase.getViernes() + "," + clase.getSabado() + "," + clase.getDomingo() + ")";
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
	
	public Vector<Integer> getIdClase(int idUsuario) {
		Vector<Integer> idClases = new Vector<>();
		
		String sql = "SELECT * FROM usuarioclase WHERE idusuario = "+idUsuario;
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				idClases.add(rs.getInt("idclase"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		
		return idClases;
	}

	public Vector<Clase> getClases(int idClase) {
		Vector<Clase> clases = new Vector<Clase>();
		String sql = "SELECT * FROM clase WHERE idClase =" + idClase;
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Clase c = new Clase();
				c.setIdClase(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setUbicacion(rs.getString(3));
				c.setLunes(rs.getInt(4));
				c.setMartes(rs.getInt(5));
				c.setMiercoles(rs.getInt(6));
				c.setJueves(rs.getInt(7));
				c.setViernes(rs.getInt(8));
				c.setSabado(rs.getInt(9));
				c.setDomingo(rs.getInt(10));
				clases.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return clases;
	}

	public void deleteClase(int idClase) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM clase WHERE idClase = " + idClase;
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

	public void updateClase(Clase clase) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE clase SET nombre = ?, inicio_dia = ?, inicio_mes = ?, inicio_anho = ?, fin_dia = ?, fin_mes = ?, fin_anho = ?, ubicacion = ? WHERE idClase = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, clase.getNombre());
			statement.setInt(2, clase.getInicio().getDay());
			statement.setInt(3, clase.getInicio().getMonth());
			statement.setInt(4, clase.getInicio().getYear());
			statement.setInt(5, clase.getFin().getDay());
			statement.setInt(6, clase.getFin().getMonth());
			statement.setInt(7, clase.getFin().getYear());
			statement.setString(8, clase.getUbicacion());
			statement.setInt(9, clase.getIdClase());
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
