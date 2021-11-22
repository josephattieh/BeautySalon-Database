package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Scene5b {

      Pane pane;
      Label confirmation;
      TextField id;
      TextField cusname;
      TextField cusphone;
      ComboBox position;
      Label Name;
      Button button;
      
      Label label;
      Label label0;
      Label label1;
      Label label2;
      Label label3;
      Label label4;
      TextArea cusaddress;
      TextField cusname1;
      Label label5;
      RadioButton radioButton;
     RadioButton radioButton0;
     TextField salaryFrom;
     TextField salaryTo;
     Label label6;
    
    AnchorPane anchorpane;
    Scene scene;

    public Scene5b() {
    	Name = new Label("");
    	salaryFrom = new TextField();
    	salaryTo = new TextField();
    	label6 = new Label();
    	anchorpane = new AnchorPane();
        pane = new Pane();
        confirmation = new Label();
        id = new TextField();
        cusname = new TextField();
        cusphone = new TextField();
        position = new ComboBox(buildData("SELECT staffID FROM STAFF;"));
        position.getSelectionModel().select("Not used");
        
        button = new Button();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        cusaddress = new TextArea();
        cusname1 = new TextField();
        label5 = new Label();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        

        
        anchorpane.setPrefHeight(650.0);
        anchorpane.setPrefWidth(990.0);
        anchorpane.setStyle("-fx-background-color: #EC2590;");

        pane.setLayoutX(50.0);
        pane.setLayoutY(55.0);
        pane.setPrefHeight(550.0);
        pane.setPrefWidth(885.0);
        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");

        confirmation.setLayoutX(30.0);
        confirmation.setLayoutY(465.0);
        confirmation.setPrefHeight(45.0);
        confirmation.setPrefWidth(384.0);
        confirmation.setTextFill(javafx.scene.paint.Color.RED);
        confirmation.setFont(new Font("System Bold", 14.0));

        id.setLayoutX(234.0);
        id.setLayoutY(22.0);
        id.setPrefHeight(45.0);
        id.setPrefWidth(300.0);
        id.setPromptText("ID");
        id.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        id.setFont(new Font("System Bold", 16.0));

        cusname.setLayoutX(234.0);
        cusname.setLayoutY(76.0);
        cusname.setPrefHeight(45.0);
        cusname.setPrefWidth(300.0);
        cusname.setPromptText("Name");
        cusname.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        cusname.setFont(new Font("System Bold", 16.0));

        cusphone.setLayoutX(234.0);
        cusphone.setLayoutY(258.0);
        cusphone.setPrefHeight(45.0);
        cusphone.setPrefWidth(300.0);
        cusphone.setPromptText("Phone");
        cusphone.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        cusphone.setFont(new Font("System Bold", 16.0));
        
        position.setLayoutX(235.0);
        position.setLayoutY(354.0);
        position.setPrefHeight(45.0);
        position.setPrefWidth(300.0);
        position.setPromptText("Staff");
        position.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
       

       

        button.setLayoutX(435.0);
        button.setLayoutY(465.0);
        button.setMnemonicParsing(false);
        
        button.setPrefHeight(40.0);
        button.setPrefWidth(85.0);
        button.setText("Search");

        
        label.setLayoutX(42.0);
        label.setLayoutY(29.0);
        label.setText("Cust ID");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label.setFont(new Font("System Bold", 20.0));

        label0.setLayoutX(43.0);
        label0.setLayoutY(84.0);
        label0.setText("First Name ");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label0.setFont(new Font("System Bold", 20.0));

        label1.setLayoutX(43.0);
        label1.setLayoutY(194.0);
        label1.setText("Address");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label1.setFont(new Font("System Bold", 20.0));

        label2.setLayoutX(40.0);
        label2.setLayoutY(265.0);
        label2.setText("Phone");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label2.setFont(new Font("System Bold", 20.0));

        label3.setLayoutX(43.0);
        label3.setLayoutY(308.0);
        label3.setText("Gender");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label3.setFont(new Font("System Bold", 20.0));

        Name = new Label("");
		Name.setLayoutX(235.0);
		Name.setLayoutY(430.0);
	
		Name.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		Name.setFont(new Font("System Bold", 20.0));
		 position.valueProperty().addListener(e->{
	        	if(position.getValue().toString().compareTo("Not used")==0) {
	        			Name.setText("");
	        	}else
	        		Name.setText(buildData("SELECT Fname FROM STAFF WHERE staffID=\""+ position.getValue().toString()+"\";").get(0)+" "+ buildData("SELECT lName FROM STAFF WHERE staffID=\""+position.getValue().toString()+"\";").get(0));
	        });
		
		
        label4.setLayoutX(42.0);
        label4.setLayoutY(355.0);
        label4.setText("Staff who registered");
        label4.setWrapText(true);
        
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label4.setFont(new Font("System Bold", 20.0));

        cusaddress.setLayoutX(240.0);
        cusaddress.setLayoutY(182.0);
        cusaddress.setPrefHeight(53.0);
        cusaddress.setPrefWidth(288.0);
        cusaddress.setPromptText("Address");
        cusaddress.setWrapText(true);
        cusaddress.setFont(new Font("System Bold", 15.0));

        cusname1.setLayoutX(234.0);
        cusname1.setLayoutY(127.0);
        cusname1.setPrefHeight(45.0);
        cusname1.setPrefWidth(300.0);
        cusname1.setPromptText("Name");
        cusname1.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        cusname1.setFont(new Font("System Bold", 16.0));

        label5.setLayoutX(42.0);
        label5.setLayoutY(134.0);
        label5.setText("Last Name ");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label5.setFont(new Font("System Bold", 20.0));

        radioButton.setLayoutX(246.0);
        radioButton.setLayoutY(309.0);
        radioButton.setMnemonicParsing(false);
        radioButton.setText("Male");
        radioButton.setFont(new Font(18.0));

        radioButton0.setLayoutX(335.0);
        radioButton0.setLayoutY(309.0);
        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Female");
        radioButton0.setFont(new Font(18.0));

       
        pane.getChildren().add(confirmation);
        pane.getChildren().add(id);
        pane.getChildren().add(cusname);
        pane.getChildren().add(cusphone);
        pane.getChildren().add(position);
    
        pane.getChildren().add(button);
        
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(label3);
        pane.getChildren().add(label4);
        pane.getChildren().add(cusaddress);
        pane.getChildren().add(cusname1);
        pane.getChildren().add(label5);
        pane.getChildren().add(radioButton);
        pane.getChildren().add(radioButton0);
        pane.getChildren().add(Name);
      

        
        anchorpane.getChildren().add(pane);
        scene = new Scene(anchorpane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

    }

	public Pane getPane() {
		return pane;
	}

	public void setPane(Pane pane) {
		this.pane = pane;
	}

	public Label getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(Label confirmation) {
		this.confirmation = confirmation;
	}

	public TextField getid() {
		return id;
	}

	public void setid(TextField id) {
		this.id = id;
	}

	public TextField getCusname() {
		return cusname;
	}

	public void setCusname(TextField cusname) {
		this.cusname = cusname;
	}

	public TextField getCusphone() {
		return cusphone;
	}

	public void setCusphone(TextField cusphone) {
		this.cusphone = cusphone;
	}




	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Label getLabel0() {
		return label0;
	}

	public void setLabel0(Label label0) {
		this.label0 = label0;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label label3) {
		this.label3 = label3;
	}

	public Label getLabel4() {
		return label4;
	}

	public void setLabel4(Label label4) {
		this.label4 = label4;
	}

	public TextArea getCusaddress() {
		return cusaddress;
	}

	public void setCusaddress(TextArea cusaddress) {
		this.cusaddress = cusaddress;
	}

	public TextField getCusname1() {
		return cusname1;
	}

	public void setCusname1(TextField cusname1) {
		this.cusname1 = cusname1;
	}

	public Label getLabel5() {
		return label5;
	}

	public void setLabel5(Label label5) {
		this.label5 = label5;
	}

	public RadioButton getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(RadioButton radioButton) {
		this.radioButton = radioButton;
	}

	public RadioButton getRadioButton0() {
		return radioButton0;
	}

	public void setRadioButton0(RadioButton radioButton0) {
		this.radioButton0 = radioButton0;
	}

	public AnchorPane getAnchorpane() {
		return anchorpane;
	}

	public void setAnchorpane(AnchorPane anchorpane) {
		this.anchorpane = anchorpane;
	}
	public String SearchOnACriteria() {/////////addd salary
		StringBuilder sb = new StringBuilder();	
		
		
	
		sb.append("SELECT * FROM CUSTOMER ");
		int i=0;
		int j=0;
		if(id.getText().toString().length()!=0 && id.getText()!=null) {
			i++;
		}
		
		if(cusname.getText().toString().length()!=0 && cusname.getText()!=null) {
			i++;
		}
	
		if(cusname1.getText().toString().length()!=0 && cusname1.getText()!=null) {
			i++;
		}
		if(cusphone.getText().toString().length()!=0 && cusphone.getText()!=null) {
			i++;
		}
		if(cusaddress.getText().toString().length()!=0 && cusaddress.getText()!=null) {
			i++;
		}
		i++;
		
		if(!radioButton.isSelected() && !radioButton0.isSelected()) {
			i--;
		}
		if(position.getValue().toString().compareTo("Not used")!=0) {
			
			i++;
		}
			
		if(i!=0) {
			sb.append(" WHERE ");
		}
		if(id.getText().toString().length()!=0 && id.getText()!=null) {
			sb.append("custId=\""+id.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
		if(cusname.getText().toString().length()!=0 && cusname.getText()!=null) {
			sb.append("fName=\""+cusname.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
	
		if(cusname1.getText().toString().length()!=0 && cusname1.getText()!=null) {
			sb.append("lName=\""+cusname1.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(cusphone.getText().toString().length()!=0 && cusphone.getText()!=null) {
			sb.append("custPhoneNb="+ cusphone.getText()+"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(cusaddress.getText().toString().length()!=0 && cusaddress.getText()!=null) {
			sb.append("address LIKE \"%"+cusaddress.getText()+"%\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(radioButton.isSelected()&& radioButton0.isSelected()) {
			sb.append( "Gender IN (\"M\",\"F\")");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}else
		if(radioButton.isSelected()) {
			sb.append("Gender =\"M\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}}
		else if(radioButton0.isSelected()){
			sb.append("Gender =\"F\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}}
		
		if(position.getValue().toString().compareTo("Not used")!=0) {
			sb.append("staffId =\""+position.getValue().toString()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
			position.getSelectionModel().select("Not used");
			
		}
	
		
		sb.append(";");
		Name.setText("");
		System.out.println(sb.toString());
		return sb.toString();}
		

	public Scene getScene() {
		return scene;
	}
	public static Connection getConnection() throws Exception {
		try {
			String url = "jdbc:mysql://localhost:3306/BEAUTYSalon";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}
	public ObservableList<String> buildData(String SQL){
        Connection c ;
        
        ObservableList<String>  st = FXCollections.observableArrayList();
        try{
        	
          c = getConnection();
          //SQL FOR SELECTING ALL OF CUSTOMER
          
          //ResultSet
          ResultSet rs = c.createStatement().executeQuery(SQL);

         
          while(rs.next()){
              //Iterate Row
             {//Iterate Column
            	  if(rs.getString(1)==null || rs.getString(1).isEmpty() )
            		  st.add("NULL");
            		  else 
                  st.add(rs.getString(1));
              }}
            
              
          
          return st;
 
        }catch(Exception e){
                       
        }
		return st;}
	
	public ComboBox ComboStaff() {
		return position;
	}
}
