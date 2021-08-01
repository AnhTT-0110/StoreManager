/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class DistributorResponse {
    
    private int codeDistributor;
    private String nameDistributor;
    private String address;
    private String phoneNumber;
    private String email;
    private String description;

    public DistributorResponse(int codeDistributor, String nameDistributor, String address, String phoneNumber, String email, String description) {
        this.codeDistributor = codeDistributor;
        this.nameDistributor = nameDistributor;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
    }

    public DistributorResponse() {
    }
    
}
