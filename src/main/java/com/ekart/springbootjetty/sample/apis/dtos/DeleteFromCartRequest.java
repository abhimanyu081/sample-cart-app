package com.ekart.springbootjetty.sample.apis.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by nikhil.vavs on 11/01/17.
 */
@ApiModel(description = "Delete from cart Request DTO")
public class DeleteFromCartRequest {

    @NotNull(message = "{deleteFromCartRequest.userID.notnull}")
    @ApiModelProperty(name = "user_id", value = "user id")
    @JsonProperty(value = "user_id", required = true)
    private int userID;

    @NotNull(message = "{deleteFromCartRequest.productID.notnull}")
    @ApiModelProperty(name = "product_id", value = "product id")
    @JsonProperty(value = "product_id", required = false)
    private int productID;

    public DeleteFromCartRequest(int userID, int productID) {
        this.userID = userID;
        this.productID = productID;
    }

    public DeleteFromCartRequest() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "Delete from cart request: {user_id: " + userID + ", product_id: " + productID + "}";
    }
}
