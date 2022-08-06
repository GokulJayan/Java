import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 

import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.ListView; 
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 

import java.sql.*; 
      
public class q4 extends Application { 
   @Override 
   public void start(Stage stage) throws Exception
   {         
    GridPane gridPane = new GridPane();     

    Text l1 = new Text("Reg No");   
    TextField textField1 = new TextField();  
    gridPane.add(l1, 0, 0); 
    gridPane.add(textField1, 1, 0); 


    Text l2 = new Text("First Name"); 
    TextField textField2 = new TextField();
    gridPane.add(l2, 0, 1);       
    gridPane.add(textField2, 1, 1);  


    Text l3 = new Text("Last Name"); 
    TextField textField3 = new TextField();  
    gridPane.add(l3, 0, 2); 
    gridPane.add(textField3, 1, 2); 


    Text l4 = new Text("Gender"); 
    ToggleGroup groupGender = new ToggleGroup(); 
    RadioButton maleRadio = new RadioButton("Male"); 
    maleRadio.setToggleGroup(groupGender); 
    RadioButton femaleRadio = new RadioButton("Female"); 
    femaleRadio.setToggleGroup(groupGender); 
    RadioButton othersRadio = new RadioButton("Others"); 
    othersRadio.setToggleGroup(groupGender); 
    gridPane.add(l4, 0, 3); 
    gridPane.add(maleRadio, 1, 3);       
    gridPane.add(femaleRadio, 2, 3); 
    gridPane.add(othersRadio, 3, 3); 


    Text l5 = new Text("Program");
    ChoiceBox programChoiceBox = new ChoiceBox(); 
    programChoiceBox.getItems().addAll("BCE", "BEE", "BME", "BAI", "BCL"); 
    gridPane.add(l5, 0, 4); 
    gridPane.add(programChoiceBox, 1, 4);    


    Text l6 = new Text("Credits");
    TextField textField4 = new TextField();
    gridPane.add(l6, 0, 5); 
    gridPane.add(textField4, 1, 5); 

      
    Button button1 = new Button("Submit"); 
    Button button2 = new Button("Clear");  
    Button button3 = new Button("Search");
    Button button4 = new Button("Update");
    Button button5 = new Button("Delete");
                  
    gridPane.add(button1, 0, 6);  
    gridPane.add(button2, 1, 6); 
    gridPane.add(button3, 2, 6); 
    gridPane.add(button4, 4, 6); 
    gridPane.add(button5, 3, 6); 

    button4.setVisible(false);

    gridPane.setMinSize(500, 500); 
    gridPane.setPadding(new Insets(10, 10, 10, 10));  
    gridPane.setVgap(5); 
    gridPane.setHgap(5);       
    gridPane.setAlignment(Pos.CENTER); 
       
    Scene scene = new Scene(gridPane, 400, 200); 
    
    stage.setTitle("VIT Student"); 
    stage.setScene(scene);
    stage.show(); 

    button1.setOnAction((event) -> {
        String regno = textField1.getText(); //setText()
        String fname = textField2.getText();
        String lname = textField3.getText();
        
        String gender ="";
        if(maleRadio.isSelected())
        gender="Male";
        else if(femaleRadio.isSelected())
        gender="Male";
        else
        gender="Others";

        String program = programChoiceBox.getValue().toString();

        String credits = textField4.getText();
        try
        {
            System.out.println("connecting to DB......");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","sql@1234");  
            PreparedStatement ps = con.prepareStatement("insert into VITStudent values (?,?,?,?,?,?)");
            ps.setString(1, regno);
            ps.setString(2,fname);
            ps.setString(3,lname);
            ps.setString(4,gender);
            ps.setString(5,program);
            ps.setString(6,credits);

            int count = ps.executeUpdate();
            System.out.println(count + " no: of records inserted");
            con.close();
        }catch(Exception e){ System.out.println(e);}    
    });

    button2.setOnAction((event) -> {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        othersRadio.setSelected(false);
        programChoiceBox.setValue("");
        textField4.setText("");
    });

    button3.setOnAction((event) ->{
        String regno;
        String fname;
        String lname;
        String gender;
        String program;
        int credits;

        regno=textField1.getText();
        try
        {
            System.out.println("connecting to DB......");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","sql@1234");  
            
            String sql = "select * from VITStudent where regno='"+regno+"';";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            regno = rs.getString("regno");
            fname = rs.getString("firstname");
            lname = rs.getString("lastname");
            gender = rs.getString("gender");
            program = rs.getString("program");
            credits = rs.getInt("credits");
            
            //PreparedStatement ps = con.prepareStatement("insert into VITStudent values (?,?,?,?,?,?)");

            textField1.setText(regno);
            textField2.setText(fname);
            textField3.setText(lname);
            if(gender.equals("Male"))
            maleRadio.setSelected(true);
            else if(gender.equals("Female"))
            femaleRadio.setSelected(true);
            else
            othersRadio.setSelected(true);

            programChoiceBox.setValue(program);

            textField4.setText(String.valueOf(credits));
        
            button4.setVisible(true);
        
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}    
    });

    button4.setOnAction((event) ->{
        String regno=textField1.getText();
        String credits = textField4.getText();
        try
        {
            System.out.println("connecting to DB......");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","sql@1234");  
            String sql = "update VITStudent set credits="+credits+" where regno='"+regno+"';";
            PreparedStatement ps = con.prepareStatement(sql);
            int count = ps.executeUpdate();
            System.out.println(count + " no: of records updated");
            button4.setVisible(false);
            con.close();
        }catch(Exception e){ System.out.println(e);}    
    });

    button5.setOnAction((event)->{
        String regno=textField1.getText();
        try
        {
            System.out.println("connecting to DB......");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","sql@1234");  
            String sql = "delete from VITStudent where regno='"+regno+"';";
            PreparedStatement ps = con.prepareStatement(sql);
            int count = ps.executeUpdate();
            System.out.println(count + " no: of records deleted");
            con.close();
        }catch(Exception e){ System.out.println(e);}  
    });
   }   
     
      
    public static void main(String args[]){ 
      launch(args); 
   } 
}

