package com.cafe.Real.dto;

public class LoginResponseDTO {

	private String token;
    private String tipo;
    private UsuarioDTO usuario;

    public LoginResponseDTO(String token, UsuarioDTO usuario) {
        this.token = token;
        this.tipo = "Bearer";
        this.usuario = usuario;
    }

    // Getters e Setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public UsuarioDTO getUsuario() { return usuario; }
    public void setUsuario(UsuarioDTO usuario) { this.usuario = usuario; }
}
