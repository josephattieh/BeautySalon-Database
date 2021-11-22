package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Scene5d {
	Label supp;
    Pane pane;
    TextField prodid;
    TextField prodname;
    ComboBox suppId;
    TextField price;
    Button button;
    Label label;
    Label label0;
    Label label1;
    Label label2;
    TextField prodname1;
    Label label3;
    TextField price1;
    Label label4;
    Button button0;
    Button button1;
    Scene scene;
    AnchorPane anchorpane;

    public Scene5d() {
    	supp = new Label("");
    	anchorpane = new AnchorPane();
        pane = new Pane();
        prodid = new TextField();
        prodname = new TextField();
        suppId = new ComboBox(buildData("SELECT suppid FROM SUPPLIER;"));
        suppId.setLayoutX(234.0);
        suppId.setLayoutY(296.0);
        suppId.setPrefHeight(45.0);
        suppId.setPrefWidth(300.0);
        suppId.setPromptText("Supplier Id");
        suppId.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");

        supp = new Label("");
        
        supp.setLayoutY(380.0);
        supp.setLayoutX(235.0);
        
        supp.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        supp.setFont(new Font("System Bold", 20.0));
        suppId.getSelectionModel().select("Not used");
		 suppId.valueProperty().addListener(e->{
	        	if(suppId.getValue().toString().compareTo("Not used")==0) {
	        			supp.setText("");
	        	}else
	        		supp.setText(buildData("SELECT companyName FROM SUPPLIER WHERE suppID=\""+ suppId.getValue().toString()+"\";").get(0));
	        });
        price = new TextField();
        button = new Button();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        prodname1 = new TextField();
        label3 = new Label();
        price1 = new TextField();
        label4 = new Label();
        button0 = new Button();
        button1 = new Button();

        
        prodid.setLayoutX(234.0);
        prodid.setLayoutY(22.0);
        prodid.setPrefHeight(45.0);
        prodid.setPrefWidth(300.0);
        prodid.setPromptText("ID");
        prodid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        prodid.setFont(new Font("System Bold", 16.0));

        prodname.setLayoutX(234.0);
        prodname.setLayoutY(86.0);
        prodname.setPrefHeight(45.0);
        prodname.setPrefWidth(300.0);
        prodname.setPromptText("Name");
        prodname.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        prodname.setFont(new Font("System Bold", 16.0));

        
        price.setLayoutX(235.0);
        price.setLayoutY(223.0);
        price.setPrefHeight(45.0);
        price.setPrefWidth(300.0);
        price.setPromptText("Price");
        price.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        price.setFont(new Font("System Bold", 16.0));

        
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(85.0);
        button.setText("Select");
        button.setLayoutX(450.0);
        button.setLayoutY(430.0);

        label.setLayoutX(42.0);
        label.setLayoutY(29.0);
        label.setText("Product ID");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label.setFont(new Font("System Bold", 20.0));

        label0.setLayoutX(56.0);
        label0.setLayoutY(94.0);
        label0.setText(" Name ");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label0.setFont(new Font("System Bold", 20.0));

        label1.setLayoutX(69.0);
        label1.setLayoutY(231.0);
        label1.setText("Price");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label1.setFont(new Font("System Bold", 20.0));

        label2.setLayoutX(56.0);
        label2.setLayoutY(304.0);
        label2.setText("Supp Id");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label2.setFont(new Font("System Bold", 20.0));

        prodname1.setLayoutX(234.0);
        prodname1.setLayoutY(155.0);
        prodname1.setPrefHeight(45.0);
        prodname1.setPrefWidth(300.0);
        prodname1.setPromptText("Type");
        prodname1.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        prodname1.setFont(new Font("System Bold", 16.0));

        label3.setLayoutX(69.0);
        label3.setLayoutY(163.0);
        label3.setText("Type");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label3.setFont(new Font("System Bold", 20.0));

        


        pane.getChildren().add(prodid);
        pane.getChildren().add(prodname);
        pane.getChildren().add(suppId);
        pane.getChildren().add(price);
        pane.getChildren().add(button);
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(prodname1);
        pane.getChildren().add(label3);
        pane.getChildren().add(supp);

        pane.getChildren().add(label4);

        anchorpane.setPrefHeight(650.0);
		anchorpane.setPrefWidth(1000.0);
		anchorpane.setStyle("-fx-background-color: #EC2590;");
		
        pane.setLayoutX(50.0);
        pane.setLayoutY(55.0);
        pane.setPrefHeight(550.0);
        pane.setPrefWidth(885.0);
        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
        anchorpane.getChildren().add(pane);
        scene = new Scene(anchorpane);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


    }


	public String SearchOnACriteria() {/////////addd salary
		StringBuilder sb = new StringBuilder();
		
	
		sb.append("SELECT * FROM PRODUCT_LIST ");
		int i=0;
		int j=0;
		if(prodid.getText().toString().length()!=0 && prodid.getText()!=null) {
			i++;
		}
		
		
		if(prodname.getText().toString().length()!=0 && prodname.getText()!=null) {
			i++;
		}
		
		if(price.getText().toString().length()!=0 && price.getText()!=null) {
			i++;
		}
		if(prodname1.getText().toString().length()!=0 && prodname1.getText()!=null) {
			i++;
		}
		if(suppId.getValue().toString().compareTo("Not used")!=0) {
			i++;
		}
			
		if(i!=0) {
			sb.append(" WHERE ");
		}
		if(prodid.getText().toString().length()!=0 && prodid.getText()!=null) {
			sb.append("prodId=\""+ prodid.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
		
	
		if(prodname.getText().toString().length()!=0 && prodname.getText()!=null) {
			sb.append("prodName=\""+prodname.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
		if(prodname1.getText().toString().length()!=0 && prodname1.getText()!=null) {
			sb.append("prodType =\""+prodname1.getText()+"\"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(suppId.getValue().toString().compareTo("Not used")!=0) {
				sb.append(" suppID =\""+suppId.getValue().toString()+"\"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(price.getText().toString().length()!=0 && price.getText()!=null) {
			sb.append(" prodPrice ="+price.getText()+"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
		
		
		
				
		suppId.getSelectionModel().select("Not used");	
		sb.append(";");
		
		System.out.println(sb.toString());
		return sb.toString();}

	public Scene getScene() {
		return scene;
	}


	public Pane getPane() {
		return pane;
	}


	public void setPane(Pane pane) {
		this.pane = pane;
	}


	public TextField getProdid() {
		return prodid;
	}


	public void setProdid(TextField prodid) {
		this.prodid = prodid;
	}


	public TextField getProdname() {
		return prodname;
	}


	public void setProdname(TextField prodname) {
		this.prodname = prodname;
	}




	public TextField getPrice() {
		return price;
	}


	public void setPrice(TextField price) {
		this.price = price;
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


	public TextField getProdname1() {
		return prodname1;
	}


	public void setProdname1(TextField prodname1) {
		this.prodname1 = prodname1;
	}


	public Label getLabel3() {
		return label3;
	}


	public void setLabel3(Label label3) {
		this.label3 = label3;
	}


	public TextField getPrice1() {
		return price1;
	}


	public void setPrice1(TextField price1) {
		this.price1 = price1;
	}


	public Label getLabel4() {
		return label4;
	}


	public void setLabel4(Label label4) {
		this.label4 = label4;
	}


	public Button getButton0() {
		return button0;
	}


	public void setButton0(Button button0) {
		this.button0 = button0;
	}


	public Button getButton1() {
		return button1;
	}


	public void setButton1(Button button1) {
		this.button1 = button1;
	}


	public AnchorPane getAnchorpane() {
		return anchorpane;
	}


	public void setAnchorpane(AnchorPane anchorpane) {
		this.anchorpane = anchorpane;
	}


	public void setScene(Scene scene) {
		this.scene = scene;
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
	public ComboBox getSupp() {
		return suppId;
	}
}
