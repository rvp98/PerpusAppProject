/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Factory;

import MainPackage.Constant;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praset
 */
public interface ViewContract <T> {
    void setDataTable();
    DefaultTableModel generateDefaultTableModel();
    void showMessage(String message);
    void changeCondition(Constant.CurrState state);
    void clearData();
    T generateData();
    boolean validateData();
}