package baseDeDatos.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioControl {
	private Connection conn;

	public UsuarioControl(Connection conn) {
		this.conn = conn;
	}

	public boolean verificarContrasenha(Usuario usuario) {
		if (conn == null)
			return false;
		Statement statement = null;
		String sql = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			sql = "SELECT * FROM usuario WHERE nickname = '" + usuario.getNickName() + "'";
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				String contra = rs.getString("contrasenha");
				if (usuario.getContrasenha().equals(contra)) {
					return true;
				} else {
					return false;
				}
			}
			else 
				return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean buscarUsuario(Usuario usuario) {
		if (conn == null)
			return false;
		Statement statement = null;
		String sql = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			sql = "SELECT * FROM usuario WHERE nickname = '" + usuario.getNickName() + "'";
			rs = statement.executeQuery(sql);
			System.out.println(4 + "" + usuario.getNickName() + 4);
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public void insertUsuario(Usuario usuario) {
		if (conn == null)
			return;
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "INSERT INTO usuario (nickname, contrasenha) " + "VALUES ('" + usuario.getNickName() + "','"
					+ usuario.getContrasenha() + "')";
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

	public ArrayList<Usuario> getUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		String sql = "SELECT usuario, nickname, contrasenha FROM usuario";
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setIdUsuario(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setContrasenha(rs.getString(3));
				/*
				 * p.setIdEmployee(rs.getInt(1)); p.setName(rs.getString(2));
				 * p.setPhone(rs.getString(3)); p.setDepto(rs.getInt(4));
				 * p.setUuid(rs.getInt(5));
				 */
				usuarios.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return usuarios;
	}

	public void deleteUsuario(int idUsuario) {
		if (conn == null) {
			return;
		}
		Statement statement = null;
		String sql = null;
		try {
			statement = conn.createStatement();
			sql = "DELETE FROM usuario WHERE idUsuario = " + idUsuario;
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

	public void updateUsuario(Usuario usuario) {
		if (conn == null) {
			return;
		}
		PreparedStatement statement = null;
		String sql = null;
		try {
			sql = "UPDATE usuario SET nick_name = ?, contrasenha = ? WHERE idUsuario = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, usuario.getNickName());
			statement.setString(2, usuario.getContrasenha());
			statement.setInt(3, usuario.getIdUsuario());
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
