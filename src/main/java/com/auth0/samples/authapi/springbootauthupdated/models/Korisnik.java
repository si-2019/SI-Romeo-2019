package com.auth0.samples.authapi.springbootauthupdated.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Korisnik")
public class Korisnik {

  @Id
  private Long id;

  private long idOdsjek;
  private long idUloga;
  private String ime;
  private String prezime;
  private java.sql.Date datumRodjenja;
  private String jmbg;
  private String email;
  private String mjestoRodjenja;
  private String kanton;
  private String drzavljanstvo;
  private String telefon;
  private String spol;
  private String imePrezimeMajke;
  private String imePrezimeOca;
  private String adresa;
  private String username;
  private String password;
  private String linkedin;
  private String website;
  private String fotografija;
  private String indeks;
  private String ciklus;
  private String semestar;
  private String titula;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public long getIdOdsjek() {
    return idOdsjek;
  }

  public void setIdOdsjek(long idOdsjek) {
    this.idOdsjek = idOdsjek;
  }


  public long getIdUloga() {
    return idUloga;
  }

  public void setIdUloga(long idUloga) {
    this.idUloga = idUloga;
  }


  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }


  public String getPrezime() {
    return prezime;
  }

  public void setPrezime(String prezime) {
    this.prezime = prezime;
  }


  public java.sql.Date getDatumRodjenja() {
    return datumRodjenja;
  }

  public void setDatumRodjenja(java.sql.Date datumRodjenja) {
    this.datumRodjenja = datumRodjenja;
  }


  public String getJmbg() {
    return jmbg;
  }

  public void setJmbg(String jmbg) {
    this.jmbg = jmbg;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getMjestoRodjenja() {
    return mjestoRodjenja;
  }

  public void setMjestoRodjenja(String mjestoRodjenja) {
    this.mjestoRodjenja = mjestoRodjenja;
  }


  public String getKanton() {
    return kanton;
  }

  public void setKanton(String kanton) {
    this.kanton = kanton;
  }


  public String getDrzavljanstvo() {
    return drzavljanstvo;
  }

  public void setDrzavljanstvo(String drzavljanstvo) {
    this.drzavljanstvo = drzavljanstvo;
  }


  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }


  public String getSpol() {
    return spol;
  }

  public void setSpol(String spol) {
    this.spol = spol;
  }


  public String getImePrezimeMajke() {
    return imePrezimeMajke;
  }

  public void setImePrezimeMajke(String imePrezimeMajke) {
    this.imePrezimeMajke = imePrezimeMajke;
  }


  public String getImePrezimeOca() {
    return imePrezimeOca;
  }

  public void setImePrezimeOca(String imePrezimeOca) {
    this.imePrezimeOca = imePrezimeOca;
  }


  public String getAdresa() {
    return adresa;
  }

  public void setAdresa(String adresa) {
    this.adresa = adresa;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  public String getFotografija() {
    return fotografija;
  }

  public void setFotografija(String fotografija) {
    this.fotografija = fotografija;
  }


  public String getIndeks() {
    return indeks;
  }

  public void setIndeks(String indeks) {
    this.indeks = indeks;
  }


  public String getCiklus() {
    return ciklus;
  }

  public void setCiklus(String ciklus) {
    this.ciklus = ciklus;
  }


  public String getSemestar() {
    return semestar;
  }

  public void setSemestar(String semestar) {
    this.semestar = semestar;
  }


  public String getTitula() {
    return titula;
  }

  public void setTitula(String titula) {
    this.titula = titula;
  }

}
