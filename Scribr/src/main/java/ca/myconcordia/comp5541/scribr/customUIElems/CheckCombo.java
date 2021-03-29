package ca.myconcordia.comp5541.scribr.customUIElems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author sarsingh
 */
public class CheckCombo implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    JComboBox cb = (JComboBox) e.getSource();
    CheckComboStore store = (CheckComboStore) cb.getSelectedItem();
    CheckComboRenderer ccr = (CheckComboRenderer) cb.getRenderer();
    ccr.checkBox.setSelected((store.state = !store.state));
  }

  public JPanel getContent() {
    String[] ids = { "north", "west", "south", "east" };
    Boolean[] values = { Boolean.TRUE, Boolean.FALSE, Boolean.FALSE,
        Boolean.FALSE };
    CheckComboStore[] stores = new CheckComboStore[ids.length];
    for (int j = 0; j < ids.length; j++)
      stores[j] = new CheckComboStore(ids[j], values[j]);
    JComboBox combo = new JComboBox(stores);
    combo.setRenderer(new CheckComboRenderer());
    combo.addActionListener(this);
    JPanel panel = new JPanel();
    panel.add(combo);
    return panel;
  }
}
