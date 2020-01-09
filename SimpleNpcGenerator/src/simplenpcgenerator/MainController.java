/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplenpcgenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Sandyna
 */
public class MainController implements Initializable {
    
    //Gender radio buttons
    @FXML private RadioButton randomRadioButton;
    @FXML private RadioButton noneRadioButton;
    @FXML private RadioButton otherRadioButton;
    @FXML private RadioButton femaleRadioButton;
    @FXML private RadioButton maleRadioButton;
    @FXML private ToggleGroup genderRadioToggleGroup;
    
    
    //randomRadioButtonSelected
    @FXML private Label genderLabel;
    
    //Traits checkbox selection
    @FXML private CheckBox skinColorCheckBox;
    @FXML private CheckBox eyeColorCheckBox;
    @FXML private CheckBox hairColorCheckBox;
    @FXML private CheckBox hairLengthCheckBox;
    @FXML private CheckBox heightCheckBox;
    @FXML private CheckBox bodyTypeCheckBox;
    @FXML private CheckBox personalityCheckBox;
    @FXML private CheckBox wealthCheckBox;
    
    //Traits labels
    @FXML private Label skinColorLabel;
    @FXML private Label eyeColorLabel;
    @FXML private Label hairColorLabel;
    @FXML private Label hairLengthLabel;
    @FXML private Label heightLabel;
    @FXML private Label bodyTypeLabel;
    @FXML private Label personalityLabel;
    @FXML private Label wealthLabel;
    
    //NPC name Text Area (entered by user)
    @FXML private TextField simpleNameTextField; //where user enters optional name
    @FXML private Label simpleNameLabel; //generated to show name above traits
    
    //submit button and submit button action
    @FXML private Button submitButton;
    @FXML public void submitButtonPushed(ActionEvent event)    {
        
        //changes simpleNameLabel to reflect what user entered into simpleNameTextField
        simpleNameLabel.setText(simpleNameTextField.getText());
        
        Traits traits = new Traits();
        
        //Random Gender radio button preselected
        if (randomRadioButton.isSelected()) {
           String randomGender = traits.randomGender();
           genderLabel.setText("Gender is " + randomGender + ".");
        }
        if (noneRadioButton.isSelected())  {
            genderLabel.setText("Gender is no gender.");
        }
        else if (otherRadioButton.isSelected())  {
            genderLabel.setText("Gender is other.");
        }
        else if (femaleRadioButton.isSelected())  {
            genderLabel.setText("Gender is  female.");
        }
        else if (maleRadioButton.isSelected())  {
            genderLabel.setText("Gender is male.");
        }
       

        //shows selected traits labels
        if (skinColorCheckBox.isSelected()) {      
           String skinColor = traits.SkinColor(); 
           skinColorLabel.setText("Skin color is " + skinColor + ".");
        }
        else    {
            skinColorLabel.setText("");
        }
        if (eyeColorCheckBox.isSelected())  {
            String eyeColor = traits.EyeColor();
           eyeColorLabel.setText("Eye color is " + eyeColor + ".");
        }
        else    {
            eyeColorLabel.setText("");
        }
        if (hairColorCheckBox.isSelected()) {
           String hairColor = traits.HairColor();
           hairColorLabel.setText("Hair color is " + hairColor + ".");
        }
        else    {
            hairColorLabel.setText("");
        }
        if (hairLengthCheckBox.isSelected())    {
            String hairLength = traits.HairLength();
           hairLengthLabel.setText("Hair length is " + hairLength + ".");
        }
        else    {
            hairLengthLabel.setText("");
        }
        if (heightCheckBox.isSelected())    {
            String height = traits.Height();
           heightLabel.setText("Height is " + height + ".");
        }
        else    {
            heightLabel.setText("");
        }
        if (bodyTypeCheckBox.isSelected())  {
            String bodyType = traits.BodyType();
           bodyTypeLabel.setText("Body type is " + bodyType + ".");
        }
        else    {
            bodyTypeLabel.setText("");
        }
        if (personalityCheckBox.isSelected())   {
            String personality = traits.Personality();
           personalityLabel.setText("Personality is " + personality + ".");
        }
        else    {
            personalityLabel.setText("");
        }
        if (wealthCheckBox.isSelected())    {
            String wealth = traits.Wealth();
           wealthLabel.setText("Wealth is " + wealth + ".");
        }
        else    {
            wealthLabel.setText("");
        }
    }
    
    @FXML private Button resetButton;
    @FXML public void resetButtonPushed(ActionEvent event)    {
        
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Reset fields to default");
            alert.setHeaderText("Reset to default");
            alert.setContentText("Reset button selected. All areas will clear to default");
            alert.showAndWait();
        
        //clear simpleNameTextField to default
        simpleNameTextField.setText("");
        
        //simpleNameLabel reset
        simpleNameLabel.setText("Simple NPC Name");
        
        this.randomRadioButton.setSelected(true);
            if (randomRadioButton.isSelected()) {
                genderLabel.setText("Gender");
            }
        this.skinColorCheckBox.setSelected(true);
            if (skinColorCheckBox.isSelected()) {
                skinColorLabel.setText("Skin Color");
            }
        this.eyeColorCheckBox.setSelected(true);
            if (eyeColorCheckBox.isSelected()) {
                eyeColorLabel.setText("Eye Color");
            }
        this.hairColorCheckBox.setSelected(true);
            if (hairColorCheckBox.isSelected()) {
                hairColorLabel.setText("Hair Color");
            }
        this.hairLengthCheckBox.setSelected(true);
            if (hairLengthCheckBox.isSelected())    {
                hairLengthLabel.setText("Hair Length");
            }
        this.heightCheckBox.setSelected(true);
            if (heightCheckBox.isSelected())    {
                heightLabel.setText("Height");
            }
        this.bodyTypeCheckBox.setSelected(true);
            if (bodyTypeCheckBox.isSelected())  {
                bodyTypeLabel.setText("Body Type");
            }
        this.personalityCheckBox.setSelected(true);
            if (personalityCheckBox.isSelected())   {
                personalityLabel.setText("Personality");
            }
        this.wealthCheckBox.setSelected(true);
            if (wealthCheckBox.isSelected())    {
                wealthLabel.setText("Wealth");
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Radio button toggle group
        genderRadioToggleGroup = new ToggleGroup();
        this.randomRadioButton.setToggleGroup(genderRadioToggleGroup);
        this.noneRadioButton.setToggleGroup(genderRadioToggleGroup);
        this.otherRadioButton.setToggleGroup(genderRadioToggleGroup);
        this.femaleRadioButton.setToggleGroup(genderRadioToggleGroup);
        this.maleRadioButton.setToggleGroup(genderRadioToggleGroup);
        this.randomRadioButton.setSelected(true);
        
    }    
    
}
