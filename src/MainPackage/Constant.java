/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author praset
 */
public class Constant {
    public static enum CurrState {
        create,
        update
    }
    
    public static enum PetugasRole {
        owner,
        admin,
        petugas
    }
    
    public static enum SortBy {
        asc,
        desc
    }
    
    public static String defaultDateFormat = "yyyy-mm-dd";
}
