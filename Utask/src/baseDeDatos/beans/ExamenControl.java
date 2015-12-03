package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import calendar.MyDateTime;

public class ExamenControl {
	private Connection conn;

	public ExamenControl(Connection conn) {
		this.conn = conn;
	}

	public void insertExamen(Examen examen) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO examen(nombre, inicio_dia, inicio_mes, inicio_anho, fin_dia, fin_mes, fin_anho, ubicacion) "
					+ "VALUES ('" + examen.getNombre() + "'," + examen.getInicio().getYear() + ","
					+ examen.getInicio().getMonth() + "," + examen.getInicio().getDay() + ","
					+ examen.getFin().getYear() + "," + examen.getFin().getMonth() + "," + examen.getFin().getDay()
					+ ",'" + examen.getUbicacion() + "')";
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

	public ArrayList<Examen> getExamenes() {
		ArrayList<Examen> examenes = new ArrayList<Examen>();
		String sql = "SELECT idExamen, nombre, inicio_dia, inicio_mes, inicio_anho, fin_dia, fia_mes, fin_anho, ubicacion FROM examen";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Examen e = new Examen();
				e.setIdExamen(rs.getInt(1));
				e.setNombre(rs.getString(2));
				e.setInicio(new MyDateTime(rs.getInt(3), rs.getInt(4), rs.getInt(5)));
				e.setFin(new MyDateTime(rs.getInt(6), rs.getInt(7), rs.getInt(8)));
				e.setUbicacion(rs.getString(9));
				/*
				 * p.setIdEmployee(rs.getInt(1)); p.setName(rs.getString(2));
				 * p.setPhone(rs.getString(3)); p.setDepto(rs.getInt(4));
				 * p.setUuid(rs.getInt(5));
				 */
				examenes.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return examenes;
	}

	public void deleteExamen(int idExamen) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM examen WHERE idExamen = " + idExamen;
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

	public void updateExamen(Examen examen) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE examen SET nombre = ?, inicio_dia = ?, inicio_mes = ?, inicio_anho = ?, fin_dia = ?, fia_mes = ?, fin_anho = ?, ubicacion = ? WHERE idExamen = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, examen.getNombre());
			statement.setInt(2, examen.getInicio().getDay());
			statement.setInt(3, examen.getInicio().getMonth());
			statement.setInt(4, examen.getInicio().getYear());
			statement.setInt(5, examen.getFin().getDay());
			statement.setInt(6, examen.getFin().getMonth());
			statement.setInt(7, examen.getFin().getYear());
			statement.setString(8, examen.getUbicacion());
			statement.setInt(9, examen.getIdExamen());
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
