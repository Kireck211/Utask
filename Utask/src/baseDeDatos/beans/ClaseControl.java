package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClaseControl {
	private Connection conn;

	public ClaseControl(Connection conn) {
		this.conn = conn;
	}

	public void insertClase(Clase clase) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO clase (nombre, inicio, fin, ubicacion, dSemana) " 
			+ "VALUES ('" + clase.getNombre() + "',('"
			+ clase.getInicio().getYear() + "-"
			+ clase.getInicio().getMonth() + "-"
			+ clase.getInicio().getDay() + " "
			+ 00 + ":"
			+ 00 + ":"
			+ 00 + "'),('"
			+ clase.getFin().getYear() + "-"
			+ clase.getFin().getMonth() + "-"
			+ clase.getFin().getDay() + " "
			+ 00 + ":"
			+ 00 + ":"
			+ 00 + "'),'"
			+ clase.getUbicacion() + "',('"
			+ clase.getdSemana() + "'))";
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

	public ArrayList<Clase> getClases() {
		ArrayList<Clase> clases = new ArrayList<Clase>();
		String sql = "SELECT idemployee, name, phone, depto, uuid FROM employee";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Clase c = new Clase();
				
				/*
				p.setIdEmployee(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPhone(rs.getString(3));
				p.setDepto(rs.getInt(4));
				p.setUuid(rs.getInt(5));*/
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
			   sql = "DELETE FROM employee WHERE idemployee = " + idEmployee;
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
		   if (conn == null) { return;}
		   PreparedStatement statement = null;
		   String sql = null;
		   try {			
			   sql = "UPDATE employee SET name = ?, phone = ? WHERE idemployee = ?";
			   statement = conn.prepareStatement(sql);		
			   statement.setString(1, employee.getName());
			   statement.setString(2, employee.getPhone());
			   statement.setInt(3, employee.getIdEmployee());
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
}
