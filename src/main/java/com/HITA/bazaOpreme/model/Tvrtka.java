package com.HITA.bazaOpreme.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "tvrtka")
public class Tvrtka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Šifra ne smije biti prazna")
    @Size(max = 20, message = "Šifra ne smije biti duža od 20 znakova")
    private String sifra;

    @NotBlank(message = "Naziv ne smije biti prazan")
    @Size(max = 50, message = "Naziv ne smije biti duži od 50 znakova")
    private String naziv;

    @Size(max = 50, message = "Adresa ne smije biti duža od 50 znakova")
    private String adresa;

    @Size(max = 20, message = "Telefon ne smije biti duži od 20 znakova")
    private String telefon;

    @Email(message = "Neispravan format e-maila")
    @Size(max = 50, message = "Email ne smije biti duži od 50 znakova")
    private String email;

    @Size(max = 50, message = "Kontakt osoba ne smije biti duža od 50 znakova")
    @Column(name = "kontakt_osoba")
    private String kontaktOsoba;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKontaktOsoba() {
        return kontaktOsoba;
    }

    public void setKontaktOsoba(String kontaktOsoba) {
        this.kontaktOsoba = kontaktOsoba;
    }
}

