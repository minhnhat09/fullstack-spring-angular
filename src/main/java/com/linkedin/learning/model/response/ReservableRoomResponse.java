package com.linkedin.learning.model.response;

import com.linkedin.learning.model.Links;

public class ReservableRoomResponse {

    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;

    public ReservableRoomResponse() {
        super();
    }

    public ReservableRoomResponse(Long id, Integer roomNumber, Integer price, Links links) {
        super();
        this.id = id;
        this.roomNumber = roomNumber;
        this.price = price;
        this.links = links;
    }

    public ReservableRoomResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }


}
