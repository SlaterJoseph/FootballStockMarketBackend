package com.project.footballstockmarket.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("account")
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    public AccountController(){

    }

    /*
    Create new account
    Param: account payload - the json payload used to create a new account
    Returns a response entity based on success
     */
    @PostMapping()
    public ResponseEntity<String> createAccount(@RequestBody Map<String, String> accountPayload){

        LOGGER.debug("Creating account for user: {}", accountPayload.get("username"));
        return null;
    }

    /*
    Get account
    Param: account id - The id of the account to update
    Returns the account info
     */
    @GetMapping("/{accountId}")
    public ResponseEntity<String> getAccount(@PathVariable long accountId){

        return null;
    }

    /*
    Delete account
    Param: account id - The id of the account to delete
    Returns if the deletion was a success
     */
    @DeleteMapping("/{accountId}")
    public ResponseEntity<String> deleteAccount(@PathVariable long accountId){

        return null;
    }
    /*
    Update an existing account
    Param: account id - The id of the account to update
    Param: updatePayload - The JSON payload of fields to update
    Returns a response entity with updated values
     */
    @PatchMapping("/{accountId}")
    public ResponseEntity<String> updateAccount(@PathVariable long accountId, @RequestBody Map<String, String> updatePayload){

        return null;
    }


}




/*
/ (Post)
{
    email: "",
    password: "",
    username: "",
}

/accountId (get)
{

}

/accountId (delete)
{
}

/accountId (patch)
{
    field to update: ""
}


*/