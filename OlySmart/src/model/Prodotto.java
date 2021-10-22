package model;



import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Prodotto {
	private static DataSource ds;

	static {
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");

			ds = (DataSource) envCtx.lookup("jdbc/olysmart_database");

		} catch (NamingException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
	
       
	private int codice;
	private String nome;
	private String descrizione;
	private Double prezzo_acquisto;
	private String disponibilitā;
	private int iva;
	private Double prezzo_vendita;
	private String marca;
	private int numero_pezzi_disponibili;
	private int sconto;
	private String specifiche;
	private String tipo;
	private String offerta;
	private String immagine;
	
	public Prodotto() {
		
	}

    public Prodotto(int codice, String nome, String descrizione, Double prezzo_acquisto, String disponibilitā, int iva, Double prezzo_vendita, String marca, 
    		int numero_pezzi_disponibili, int sconto, String specifiche, String tipo, String offerta, String immagine)
    {
    	this.codice=codice;
    	this.nome=nome;
    	this.descrizione=descrizione;
    	this.prezzo_acquisto=prezzo_acquisto;
    	this.disponibilitā=disponibilitā;
    	this.iva=iva;
    	this.prezzo_vendita=prezzo_vendita;
    	this.marca=marca;
    	this.numero_pezzi_disponibili=numero_pezzi_disponibili;
    	this.sconto=sconto;
    	this.specifiche=specifiche;
    	this.tipo=tipo;
    	this.offerta=offerta;
    	this.immagine=immagine;
    }
    
    
    
	/**
	 * @return the codice
	 */
	public int getCodice() {
		return codice;
	}



	/**
	 * @param codice the codice to set
	 */
	public void setCodice(int codice) {
		this.codice = codice;
	}



	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}



	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}



	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}



	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	/**
	 * @return the prezzo_acquisto
	 */
	public Double getPrezzo_acquisto() {
		return prezzo_acquisto;
	}



	/**
	 * @param prezzo_acquisto the prezzo_acquisto to set
	 */
	public void setPrezzo_acquisto(Double prezzo_acquisto) {
		this.prezzo_acquisto = prezzo_acquisto;
	}



	/**
	 * @return the disponibilitā
	 */
	public String getDisponibilitā() {
		return disponibilitā;
	}



	/**
	 * @param disponibilitā the disponibilitā to set
	 */
	public void setDisponibilitā(String disponibilitā) {
		this.disponibilitā = disponibilitā;
	}



	/**
	 * @return the iva
	 */
	public int getIva() {
		return iva;
	}



	/**
	 * @param iva the iva to set
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}



	/**
	 * @return the prezzo_vendita
	 */
	public Double getPrezzo_vendita() {
		return prezzo_vendita;
	}



	/**
	 * @param prezzo_vendita the prezzo_vendita to set
	 */
	public void setPrezzo_vendita(Double prezzo_vendita) {
		this.prezzo_vendita = prezzo_vendita;
	}



	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}



	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}



	/**
	 * @return the numero_pezzi_disponibili
	 */
	public int getNumero_pezzi_disponibili() {
		return numero_pezzi_disponibili;
	}



	/**
	 * @param numero_pezzi_disponibili the numero_pezzi_disponibili to set
	 */
	public void setNumero_pezzi_disponibili(int numero_pezzi_disponibili) {
		this.numero_pezzi_disponibili = numero_pezzi_disponibili;
	}



	/**
	 * @return the sconto
	 */
	public int getSconto() {
		return sconto;
	}



	/**
	 * @param sconto the sconto to set
	 */
	public void setSconto(int sconto) {
		this.sconto = sconto;
	}



	/**
	 * @return the specifiche
	 */
	public String getSpecifiche() {
		return specifiche;
	}



	/**
	 * @param specifiche the specifiche to set
	 */
	public void setSpecifiche(String specifiche) {
		this.specifiche = specifiche;
	}



	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}



	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	/**
	 * @return the offerta
	 */
	public String getOfferta() {
		return offerta;
	}



	/**
	 * @param offerta the offerta to set
	 */
	public void setOfferta(String offerta) {
		this.offerta = offerta;
	}



	/**
	 * @return the immagine
	 */
	public String getImmagine() {
		return immagine;
	}



	/**
	 * @param immagine the immagine to set
	 */
	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
}


