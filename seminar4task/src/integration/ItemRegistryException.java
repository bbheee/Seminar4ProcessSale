/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * This exception will be thrown if there is a failure for the itemID.
 * @author beibei
 */
public class ItemRegistryException extends RuntimeException {
    
    public ItemRegistryException(String ID) {
        super("Database failure! Cannot access ID: "+ ID );
    }
    
}
