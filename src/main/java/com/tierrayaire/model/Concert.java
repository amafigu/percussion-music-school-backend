package com.tierrayaire.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "concerts")
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Venue cannot be null")
    @Size(min = 1, max = 255, message = "Venue must be between 1 and 255 characters")
    @Column(name = "venue")
    private String venue;

    @Column(name = "venue_link")
    private String venueLink;

    @NotNull(message = "City cannot be null")
    @Size(min = 1, max = 80, message = "City must be between 1 and 80 characters")
    @Column(name = "city")
    private String city;

    @NotNull(message = "Country cannot be null")
    @Size(min = 1, max = 80, message = "Country must be between 1 and 80 characters")
    @Column(name = "country")
    private String country;

    @Column(name = "tickets_link")
    private String ticketsLink;

    @NotNull(message = "Concert date cannot be null")
    @Column(name = "concert_date")
    private Date concertDate;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Concert() {

    }

    public Concert(String venue, String venueLink, String city, String country, String ticketsLink, Date concertDate, Date createdAt, Date updatedAt ) {
        this.venue = venue;
        this.venueLink = venueLink;
        this.city = city;
        this.country = country;
        this.ticketsLink = ticketsLink;
        this.concertDate = concertDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVenueLink() {
        return venueLink;
    }

    public void setVenueLink(String venueLink) {
        this.venueLink = venueLink;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getConcertDate() {
        return concertDate;
    }

    public void setConcertDate(Date concertDate) {
        this.concertDate = concertDate;
    }

    public String getTicketsLink() {
        return ticketsLink;
    }

    public void setTicketsLink(String ticketsLink) {
        this.ticketsLink = ticketsLink;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
