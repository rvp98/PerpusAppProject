/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Factory;

/**
 *
 * @author praset
 */
public abstract class Entity {
    public abstract String listColumn();
    public abstract String toStringInsert();
    public abstract String toStringUpdate();
    public abstract String getPrimaryKey();
}
