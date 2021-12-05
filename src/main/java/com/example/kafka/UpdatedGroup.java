package com.example.kafka;

public class UpdatedGroup {
    private String uuid;
    private Double currentQuantity;

    public UpdatedGroup(String uuid, Double currentQuantity) {
        this.uuid = uuid;
        this.currentQuantity = currentQuantity;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Double getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Double currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
}
