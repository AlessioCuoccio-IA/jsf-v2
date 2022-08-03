package it.simpleformwithjsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NovelBean {
	
	private String name;
	private String author;
	private String editor;
	private Integer edition;
	private Float price;
	private String[] genre;
	private String description;
	private String releaseDate;
	private String origin;
	private String saleOutOfIndia;
	
	public NovelBean() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Integer getEdition() {
		return edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String[] getGenre() {
		return genre;
	}

	public void setGenre(String[] genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSaleOutOfIndia() {
		return saleOutOfIndia;
	}

	public void setSaleOutOfIndia(String saleOutOfIndia) {
		this.saleOutOfIndia = saleOutOfIndia;
	}
	
	
	
	
}
