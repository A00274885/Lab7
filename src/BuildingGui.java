import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingGui implements ActionListener
{

    JLabel title = new JLabel("Choose a building");
    JLabel result = new JLabel();
    JButton houseButton = new JButton("House");
    JButton apartmentButton = new JButton("Apartment");
    JButton officeButton = new JButton("Office");

    public BuildingGui()
    {
        /*
        * Constructs a Panel with three buttons and two labels
        * The 3 Labels get added to the Action listener allowing for interaction
        * They are all added to a panel and added to the Jframe
        * The Jpanel settings are then defined
        * */
        JFrame frame = new JFrame();

        houseButton.addActionListener(this);
        apartmentButton.addActionListener(this);
        officeButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(title);
        panel.add(houseButton);
        panel.add(apartmentButton);
        panel.add(officeButton);
        panel.add(result);

        frame.add(panel);

        frame.setSize(600,400);
        frame.setTitle("Building constructor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //centers the program to the center of the screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // Takes input of buttons and compares the name, it then creates the required object and sets the result text.
        if (e.getSource() == houseButton)
        {
            House newHouse = new House();
            result.setText(newHouse.toString());
        }
        else if ( e.getSource() == apartmentButton)
        {
            ApartmentBlock newApartment = new ApartmentBlock();
            result.setText(newApartment.toString());
        }
        else
        {
            OfficeBlock newOffice = new OfficeBlock();
            result.setText(newOffice.toString());
        }
    }

    public static void main(String[] args)
    {
        new BuildingGui();
    }
}
