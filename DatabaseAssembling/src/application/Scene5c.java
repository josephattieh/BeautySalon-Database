package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioButtonBuilder;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Scene5c {

	Pane pane;
    Label confirmation;
    TextField id;
    TextField cusname;
    TextField cusphone;
    TextField position;
    Label Name;
    Button button;
    
    Label label;
    Label label0;
    Label label1;
    Label label2;
    Label label3;
    Label label4;
    TextArea cusaddress;
  
    Label label5;

 
   Label label6;
  
  AnchorPane anchorpane;
  Scene scene;

  public Scene5c() {
  	Name = new Label();
  	
  	label6 = new Label();
  	anchorpane = new AnchorPane();
      pane = new Pane();
      confirmation = new Label();
      id = new TextField();
      cusname = new TextField();
      cusphone = new TextField();
      position = new TextField();
      
      button = new Button();
      label = new Label();
      label0 = new Label();
      label1 = new Label();
      label2 = new Label();
      label3 = new Label();
      label4 = new Label();
      cusaddress = new TextArea();
      
      label5 = new Label();
     
      

      
      anchorpane.setPrefHeight(650.0);
		anchorpane.setPrefWidth(1000.0);
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

     

      button.setLayoutX(435.0);
      button.setLayoutY(465.0);
      button.setMnemonicParsing(false);
      button.setPrefHeight(40.0);
      button.setPrefWidth(85.0);
      button.setText("Search");

      
      label.setLayoutX(42.0);
      label.setLayoutY(29.0);
      label.setText("Supplier ID");
      label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
      label.setFont(new Font("System Bold", 20.0));

      label0.setLayoutX(43.0);
      label0.setLayoutY(84.0);
      label0.setText("Company Name");
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

     

      Name = new Label("");
		Name.setLayoutX(235.0);
		Name.setLayoutY(430.0);
	
		Name.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		Name.setFont(new Font("System Bold", 20.0));
		
		

      cusaddress.setLayoutX(240.0);
      cusaddress.setLayoutY(182.0);
      cusaddress.setPrefHeight(53.0);
      cusaddress.setPrefWidth(288.0);
      cusaddress.setPromptText("Address");
      cusaddress.setWrapText(true);
      cusaddress.setFont(new Font("System Bold", 15.0));

           
      pane.getChildren().add(confirmation);
      pane.getChildren().add(id);
      pane.getChildren().add(cusname);
      pane.getChildren().add(cusphone);
      pane.getChildren().add(button);
      
      pane.getChildren().add(label);
      pane.getChildren().add(label0);
      pane.getChildren().add(label1);
      pane.getChildren().add(label2);
      pane.getChildren().add(label3);
      pane.getChildren().add(label4);
      pane.getChildren().add(cusaddress);
     
      pane.getChildren().add(label5);
  
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

	public TextField getCusbalance() {
		return position;
	}

	public void setCusbalance(TextField position) {
		this.position = position;
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


	public Label getLabel5() {
		return label5;
	}

	public void setLabel5(Label label5) {
		this.label5 = label5;
	}



	public AnchorPane getAnchorpane() {
		return anchorpane;
	}

	public void setAnchorpane(AnchorPane anchorpane) {
		this.anchorpane = anchorpane;
	}
	public String SearchOnACriteria() {/////////addd salary
		StringBuilder sb = new StringBuilder();	
	
		sb.append("SELECT * FROM SUPPLIER ");
		int i=0;
		int j=0;
		if(id.getText().toString().length()!=0 && id.getText()!=null) {
			i++;
		}
		
		if(cusname.getText().toString().length()!=0 && cusname.getText()!=null) {
			i++;
		}
	
		
		if(cusphone.getText().toString().length()!=0 && cusphone.getText()!=null) {
			i++;
		}
		if(cusaddress.getText().toString().length()!=0 && cusaddress.getText()!=null) {
			i++;
		}
		
		
			
		if(i!=0) {
			sb.append(" WHERE ");
		}
		if(id.getText().toString().length()!=0 && id.getText()!=null) {
			sb.append("SuppId=\""+id.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
		if(cusname.getText().toString().length()!=0 && cusname.getText()!=null) {
			sb.append("companyName=\""+cusname.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
	
		
	
		if(cusphone.getText().toString().length()!=0 && cusphone.getText()!=null) {
			sb.append("companyPhoneNb="+ cusphone.getText()+"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(cusaddress.getText().toString().length()!=0 && cusaddress.getText()!=null) {
			sb.append("companyAddress LIKE \"%"+cusaddress.getText()+"%\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
	
			
			
		sb.append(";");
		
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
}
