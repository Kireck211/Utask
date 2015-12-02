package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProfesorControl {
	private Connection conn;

	public ProfesorControl(Connection conn) {
		this.conn = conn;
	}

	public void insertProfesor(Profesor profesor) {
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

	public ArrayList<Profesor> getProfesores() {

		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		String sql = "SELECT idemployee, name, phone, depto, uuid FROM employee";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Profesor p = new Profesor();
				/*
				p.setIdEmployee(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPhone(rs.getString(3));
				p.setDepto(rs.getInt(4));
				p.setUuid(rs.getInt(5));*/
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

	public void updateProfesor(Profesor profesor) {
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
