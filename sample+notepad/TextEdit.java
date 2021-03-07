import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileSystemView;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class TextEdit extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextArea area;
    private JFrame frame;
    private int returnValue = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        String ingest = "";
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose Destination.");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        String ae = e.getActionCommand();
        if (ae.equals("Open")) {
            returnValue = jfc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File f = new File(jfc.getSelectedFile().getAbsolutePath());
                try {
                    FileReader read = new FileReader(f);
                    Scanner scan = new Scanner(read);
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine() + "\n";
                        ingest = ingest + line;
                    }
                    area.setText(ingest);
                    scan.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else if (ae.equals("Save")) {
            returnValue = jfc.showSaveDialog(null);
            try {
                File f = new File(jfc.getSelectedFile().getAbsolutePath());
                FileWriter out = new FileWriter(f);
                out.write(area.getText());
                out.close();
            } catch (FileNotFoundException ex) {
                Component f = null;
                JOptionPane.showMessageDialog(f, "File Not Found.");
            } catch (IOException ex) {
                Component f = null;
                JOptionPane.showMessageDialog(f, "Error.");
            }
        } else if (ae.equals("New")) {
            area.setText("");
        } else if (ae.equals("Quit")) {
            System.exit(0);
        }
    }

    public TextEdit() {
        run();
    }

    public void run() {
        this.frame = new JFrame("Smart Undo");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TextEdit.class.getName()).log(Level.SEVERE, null, ex);
        }

        // set attributes of the text window
        this.area = new JTextArea();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(area);
        frame.setSize(1024, 768);
        frame.setVisible(true);

        // build the application menu
        JMenuBar menu_main = new JMenuBar();
        JMenu menu_file = new JMenu("File");
        JMenuItem menuitem_new = new JMenuItem("New");
        JMenuItem menuitem_open = new JMenuItem("Open");
        JMenuItem menuitem_save = new JMenuItem("Save");
        JMenuItem menuitem_quit = new JMenuItem("Quit");

        // build the undo menu
        JMenu menu_undo = new JMenu("Undo");
        JMenuItem menuitem_quick_undo = new JMenuItem("Quick Undo");
        JMenuItem menuitem_undo_line = new JMenuItem("Undo Line");
        JMenuItem menuitem_undo_paragraph = new JMenuItem("Undo Paragraph");
        JMenuItem menuitem_undo_chapter = new JMenuItem("Undo Chapter");
        JMenuItem menuitem_custom_undo = new JMenuItem("Custon Undo");
        JMenuItem menuitem_edit_history = new JMenuItem("Edit History");

        menuitem_new.addActionListener(this);
        menuitem_open.addActionListener(this);
        menuitem_save.addActionListener(this);
        menuitem_quit.addActionListener(this);

        // file menu
        menu_main.add(menu_file);
        menu_file.add(menuitem_new);
        menu_file.add(menuitem_open);
        menu_file.add(menuitem_save);
        menu_file.add(menuitem_quit);

        // undo menu
        menu_main.add(menu_undo);
        menu_undo.add(menuitem_quick_undo);
        menu_undo.add(menuitem_undo_line);
        menu_undo.add(menuitem_undo_paragraph);
        menu_undo.add(menuitem_undo_chapter);
        menu_undo.add(menuitem_custom_undo);
        menu_undo.add(menuitem_edit_history);

        frame.setJMenuBar(menu_main);
    }

}
