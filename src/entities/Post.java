package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private String titulo;
	private String conteudo;
	private Integer likes = 2;
	private LocalDate data = LocalDate.now();
	private List<Comment> comentarios = new ArrayList<>();
	
	public Post(String titulo, String conteudo) {
		this.titulo = titulo;
		this.conteudo = conteudo;
	}
	public Post() {
		
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Titulo: " + titulo + "\n");
		sb.append(" Conteudo " + conteudo + "\n");
		sb.append(" Likes = " + likes + "\n");
		sb.append("Data: " + data + "\n");
		sb.append("Comentários:\n");
		for (Comment c: comentarios) {
			sb.append(c + "\n");
		}
		return sb.toString();
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public List<Comment> getComentarios() {
		return comentarios;
	}
	
	public void addComment(Comment comentario) {
		comentarios.add(comentario);
	}
	public void removeComment(Comment comentario) {
		comentarios.remove(comentario);
	}
	
	
	
	
}
