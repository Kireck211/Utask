package baseDeDatos.beans;

import java.sql.Connection;
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
	
	public ArrayList<Estudiante> getEstudiantes() {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		String sql = "SELECT idemployee, name, phone, depto, uuid FROM employee";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Estudiante e = new Estudiante();
				/*
				p.setIdEmployee(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPhone(rs.getString(3));
				p.setDepto(rs.getInt(4));
				p.setUuid(rs.getInt(5));*/
				estudiantes.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return estudiantes;
	}
	
	public void deleteEstudiante(int idEstudiante){
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
	
	public void updateEstudiante(Estudiante estudiante){
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
