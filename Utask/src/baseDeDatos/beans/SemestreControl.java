package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import calendar.MyDate;

public class SemestreControl {
	private Connection conn;

	public SemestreControl(Connection conn) {
		this.conn = conn;
	}
	
	public void insterUsuarioSemestre(int idUsuario, Semestre semestre) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			sql = "SELECT * FROM semestre WHERE nombre = '" + semestre.getNombre() +"'";
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				int idSemestre = rs.getInt("idSemestre");
				sql = "INSERT INTO usuario-semestre(idUsuario, idSemestre) "
				+ "VALUES (" + idUsuario + "," + idSemestre+ ")";
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
	
	public void insertSemestre(Semestre semestre) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO semestre(nombre, inicio_dia, inicio_mes, inicio_anho, fin_dia, fin_mes, fin_anho, activo) "
					+ "VALUES ('" + semestre.getNombre() + "'," + semestre.getInicio().getDay() + ","
					+ semestre.getInicio().getMonth() + "," + semestre.getInicio().getYear() + ","
					+ semestre.getFin().getDay() + "," + semestre.getFin().getMonth() + ","
					+ semestre.getFin().getYear() + ",'" + semestre.getActivo() + "')";
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

	public ArrayList<Semestre> getSemestres() {
		ArrayList<Semestre> semestres = new ArrayList<>();
		String sql = "SELECT idSemestre, nombre, inicio_dia, inicio_mes, inicio_anho, fin_dia, fin_mes, fin_anho, activo FROM semestre";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Semestre s = new Semestre();
				s.setIdSemestre(rs.getInt(1));
				s.setNombre(rs.getString(2));
				s.setInicio(new MyDate(rs.getInt(3), rs.getInt(4), rs.getInt(5)));
				s.setFin(new MyDate(rs.getInt(6), rs.getInt(7), rs.getInt(8)));
				s.setActivo(rs.getInt(9));
				/*
				 * p.setIdEmployee(rs.getInt(1)); p.setName(rs.getString(2));
				 * p.setPhone(rs.getString(3)); p.setDepto(rs.getInt(4));
				 * p.setUuid(rs.getInt(5));
				 */
				semestres.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return semestres;
	}

	public void deleteSemestre(int idSemestre) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM semestre WHERE idSemestre = " + idSemestre;
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

	public void updateSemestre(Semestre semestre) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE semestre SET nombre = ?, inicio_dia = ?, inicio_mes = ?, inicio_anho = ?, fin_dia = ?, fin_mes = ?, fin_anho = ?, activo = ? WHERE idSemestre = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, semestre.getNombre());
			statement.setInt(2, semestre.getInicio().getDay());
			statement.setInt(3, semestre.getInicio().getMonth());
			statement.setInt(4, semestre.getInicio().getYear());
			statement.setInt(5, semestre.getFin().getDay());
			statement.setInt(6, semestre.getFin().getMonth());
			statement.setInt(7, semestre.getFin().getYear());
			statement.setInt(8, semestre.getActivo());
			statement.setInt(9, semestre.getIdSemestre());
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
