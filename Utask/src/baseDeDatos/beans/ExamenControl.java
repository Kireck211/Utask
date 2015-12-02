package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamenControl {
	private Connection conn;
	
	public ExamenControl(Connection conn){
		this.conn = conn;
	}
	
	public void insertExamen(Examen examen) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "";
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
		String sql = "SELECT idemployee, name, phone, depto, uuid FROM employee";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Examen e = new Examen();
				/*
				p.setIdEmployee(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPhone(rs.getString(3));
				p.setDepto(rs.getInt(4));
				p.setUuid(rs.getInt(5));*/
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
	
	public void updateExamen(Examen examen) {
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
