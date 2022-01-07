package mx.com.gm.domain;

public class Usuario {
	private int idUsuario;
	private String usuario;
	private String password;

	public Usuario() {
	}

	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuario(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}

	public Usuario(int idUsuario, String usuario, String password) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
	}

	/**
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [idUsuario=");
		builder.append(idUsuario);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
