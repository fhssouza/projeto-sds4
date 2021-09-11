package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

//Serializable empacota os dados em bytes para trafegar melhor
public class SaleSuccessDTO implements Serializable{ 
    
    private String sellerName;
    private Long visitade;
    private Long deals;

    public SaleSuccessDTO(){

    }

    public SaleSuccessDTO(Seller seller, Long visitade, Long deals) {
        sellerName = seller.getName();
        this.visitade = visitade;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisitade() {
        return visitade;
    }

    public void setVisitade(Long visitade) {
        this.visitade = visitade;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
