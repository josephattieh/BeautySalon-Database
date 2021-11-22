package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scene4d {
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
      Scene scene;
	Button load ,button1,button2;
	Label warning ;
    AnchorPane anchorpane;
    Label txt;
	public Scene4d() {
		txt = new Label("");

      
		anchorpane = new AnchorPane();
		warning = new Label("");
        pane = new Pane();
        prodid = new TextField();
        prodname = new TextField();
       
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
        load = new Button();
        button1 = new Button();
        button2 = new Button();
        
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

        suppId = new ComboBox(buildData("SELECT suppid FROM SUPPLIER;"));
        suppId.getSelectionModel().select("Not used");;
        
        suppId.setLayoutX(234.0);
        suppId.setLayoutY(296.0);
        suppId.setPrefHeight(45.0);
        suppId.setPrefWidth(300.0);
        suppId.setPromptText("Supplier Id");
        suppId.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        txt.setLayoutX(243.0);
        txt.setLayoutY(350.0);
        txt.setText("");
        txt.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        txt.setFont(new Font("System Bold", 20.0));
        suppId.valueProperty().addListener(e->{
        if( suppId.getValue().toString().compareTo("Not used")==0)
        	{txt.setText("");
        	}else
        		txt.setText(buildData("SELECT companyName FROM SUPPLIER WHERE suppID=\""+ suppId.getValue().toString()+"\";").get(0));
        });

        price.setLayoutX(235.0);
        price.setLayoutY(223.0);
        price.setPrefHeight(45.0);
        price.setPrefWidth(300.0);
        price.setPromptText("Price");
        price.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        price.setFont(new Font("System Bold", 16.0));

        
        label.setLayoutX(42.0);
        label.setLayoutY(29.0);
        label.setText("Product ID ");
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
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(prodname1);
        pane.getChildren().add(label3);

        pane.getChildren().add(label4);

		load.setLayoutX(545.0);
		load.setLayoutY(60.0);
	

		load.setPrefHeight(40.0);
		load.setPrefWidth(75.0);
		load.setText("Load");

		


		button1.setLayoutX(209.0);
        button1.setLayoutY(470.0);


		button1.setPrefHeight(40.0);
		button1.setPrefWidth(85.0);
		button1.setText("Insert");

		
		button2.setLayoutX(358.0);
        button2.setLayoutY(470.0);
     
        button2.setPrefHeight(40.0);
        button2.setPrefWidth(85.0);
        button2.setText("Update");

        button0.setLayoutX(503.0);
        button0.setLayoutY(470.0);
        button0.setMnemonicParsing(false);
       
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(85.0);
        button0.setText("Delete");

		pane.getChildren().add(button1);
		pane.getChildren().add(button2);
		pane.getChildren().add(button0);
		pane.getChildren().add(load);
		pane.getChildren().add(txt);

		
		
		warning = new  Label();
		warning.setLayoutX(604.0);
		warning.setLayoutY(377.0);
		warning.setTextFill(Color.RED);
		warning.setStyle("-fx-font-size: 25px;");
		pane.getChildren().add(warning);
		pane.setLayoutX(50.0);
        pane.setLayoutY(55.0);
        pane.setPrefHeight(550.0);
        pane.setPrefWidth(885.0);
        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
		anchorpane.getChildren().add(pane);
		anchorpane.setPrefHeight(650.0);
		anchorpane.setPrefWidth(1000.0);
		anchorpane.setStyle("-fx-background-color: #c50bdd;");
	    
		scene = new Scene (anchorpane);
		scene.getStylesheets().add
		(getClass().getResource("application.css").toExternalForm());


	}
	public Scene getScene() {
		return scene;}
	

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

	



	public AnchorPane getAnchorpane() {
		return anchorpane;
	}

	public void setAnchorpane(AnchorPane anchorpane) {
		this.anchorpane = anchorpane;
	}

	public Pane getPane() {
		return pane;
	}

	public void setPane(Pane pane) {
		this.pane = pane;
	}

	public void loadValues() {

		load.setOnAction(e->{	
			try{


				if (!(prodid.getText().length()==0||prodid.getText()==null))
				{ PreparedStatement create = getConnection()
				.prepareStatement(
						"SELECT * FROM PRODUCT_LIST WHERE prodId = \""+ prodid.getText()+"\"");

				ResultSet Result = create.executeQuery();
				Result.next();
				
				prodid.setText(Result.getString("prodId"));
				prodname.setText(Result.getString("prodName"));
				prodname1.setText(Result.getString("prodType"));
				price.setText(Result.getString("prodPrice"));
				suppId.setValue(Result.getString("suppID"));
				
				}} catch (Exception a) {}

		});}
	public void delete (Stage stage , ComboBox p , ComboBox p1) {
		
		button0.setOnAction(e->{
			if(prodid.getText()==null || prodid.getText().length()==0) {
				warning.setText("StaffId Required !");
			} else {
				warning.setText("");
			String STR1= "DELETE FROM PRODUCT_LIST WHERE prodId =\""+prodid.getText()+"\";";
			PreparedStatement create;
			
			stage.close();
			prodid.setText("");
			prodname.setText("");
			suppId.getSelectionModel().select("Not used");
			price.setText("");
			prodname1.setText("");
		

			try {
				create = getConnection()
						.prepareStatement(STR1);
			 create.executeUpdate();
				p.setItems(buildData("SELECT prodID FROM PRODUCT_LIST ORDER BY prodId;"));
				p1.setItems(buildData("SELECT prodID FROM PRODUCT_LIST ORDER BY prodId;"));
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			}});
		
		
	}
	public void update (Stage stage , ComboBox p,ComboBox p1) {
		
		button2.setOnAction(e->{
		
			try{
				
				if(prodid.getText().length()==0 || prodname.getText().length()==0 || suppId.getValue().toString().compareTo("Not used")==0 || price.getText().length()==0
						||prodname1.getText().length()==0 ||prodid.getText()==null || prodname.getText()==null || price.getText()==null
						||prodname1.getText()==null)
				{
					warning.setText("All Fields are required");///////////////
				
				} else {
				warning.setText("");
				
				
					String STR1 = "UPDATE PRODUCT_LIST SET prodId=\""+prodid.getText()+"\" ,prodname=\""+prodname.getText()+"\" , suppId= \""+ suppId.getValue().toString()
					+"\" , prodPrice="+price.getText()+" , prodType=\"" + prodname1.getText() +"\" WHERE prodId =\""
					+prodid.getText()+"\";";
					
					System.out.println(STR1);
					PreparedStatement create = getConnection()
							.prepareStatement(STR1);
					 create.executeUpdate();
					 stage.close();
					 prodid.setText("");
						prodname.setText("");
						suppId.getSelectionModel().select("Not used");						price.setText("");
						prodname1.setText("");
						p.setItems(buildData("SELECT prodID FROM PRODUCT_LIST ORDER BY prodId ;"));
						p1.setItems(buildData("SELECT prodID FROM PRODUCT_LIST ORDER BY prodId;"));


			}}
			catch(Exception et) {}

			
			
		});
	}

	public void insert(Stage stage, ComboBox p , ComboBox p1) {
		button1.setOnAction(e->{
			try {
				
				if(prodid.getText().length()==0 || prodname.getText().length()==0 || suppId.getValue().toString().compareTo("Not used")==0 || price.getText().length()==0
						||prodname1.getText().length()==0 ||prodid.getText()==null || prodname.getText()==null || price.getText()==null
						||prodname1.getText()==null)
				{
					warning.setText("All Fields are required");///////////////
					}
				else {
					warning.setText(" ");
				
				String STR ="INSERT INTO PRODUCT_LIST VALUES ("+ "\""+	prodid.getText()+"\", \""+ prodname.getText()+"\" , \""
				+prodname1.getText()+"\" , "+price.getText() + ",\""+ suppId.getValue().toString()+"\");";
				System.out.println(STR);
				PreparedStatement create = getConnection()
						.prepareStatement(STR);
				 create.executeUpdate();
				 
				 prodid.setText("");
					prodname.setText("");
					suppId.getSelectionModel().select("Not used");
					price.setText("");
					prodname.setText("");
					prodname1.setText("");
					p.setItems(buildData("SELECT prodID FROM PRODUCT_LIST ORDER BY prodId;"));
					p1.setItems(buildData("SELECT prodID FROM PRODUCT_LIST ORDER BY prodId;"));

					stage.close();
				}} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			} 
			);
		
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
