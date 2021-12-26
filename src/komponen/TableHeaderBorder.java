/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponen;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Cahya Robbi
 */
public class TableHeaderBorder implements TableCellRenderer{
    private final TableCellRenderer baseRenderer;

    public TableHeaderBorder(TableCellRenderer baseRenderer){
        this.baseRenderer = baseRenderer;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent c = (JComponent)baseRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setBorder(new EmptyBorder(2,2,2,2));
        return c;
        
    }
    
}
