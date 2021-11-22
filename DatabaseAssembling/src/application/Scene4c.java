package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

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

public class Scene4c {
	Label confirmation;
	Scene scene;
	Label label6;
	TextField cusid;
	TextField cusname;
	TextField cusphone;
	Label Name;
	Button load;
	Button button1;
	Button button2;
	Button chosepic;
	Button button;
	ImageView cusimage;
	Label label;
	Label label0;
	Label label1;
	Label label2;
	Label label3;
	Label label4;
	Button button0;
	TextArea cusaddress;
	TextField cusname1;
	Label label5;
	RadioButton radioButton;
	RadioButton radioButton0;
	
	TextField pass;
	Label label7;
	AnchorPane anchorpane = new AnchorPane();    
	Pane pane;
	Label warning;
	public Scene4c() {
		button1 = new Button();
		button0 = new Button();
		button2 = new Button();
		label7 = new Label();
		pass = new TextField();
		label6 = new Label();
		
		pane = new Pane(); 
		confirmation = new Label();
		cusid = new TextField();
		cusname = new TextField();
		cusphone = new TextField();
	
		load = new Button();
		chosepic = new Button();
		button = new Button();
		cusimage = new ImageView();
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

		
		

		pass.setLayoutX(235.0);
		pass.setLayoutY(380.0);
		pass.setPrefHeight(45.0);
		pass.setPrefWidth(300.0);
		pass.setPromptText("Staff Id");
		pass.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		pass.setFont(new Font("System Bold", 16.0));

		label7.setLayoutX(42.0);
		label7.setLayoutY(380.0);
		label7.setText("StaffId");
		label7.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label7.setFont(new Font("System Bold", 20.0));

		Name = new Label("");
		Name.setLayoutX(235.0);
		Name.setLayoutY(430.0);
	
		Name.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		Name.setFont(new Font("System Bold", 20.0));
		anchorpane.setPrefHeight(650.0);
		anchorpane.setPrefWidth(1000.0);
		anchorpane.setStyle("-fx-background-color: #c50bdd;");
	

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

		cusid.setLayoutX(234.0);
		cusid.setLayoutY(22.0);
		cusid.setPrefHeight(45.0);
		cusid.setPrefWidth(300.0);
		cusid.setPromptText("ID");
		cusid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		cusid.setFont(new Font("System Bold", 16.0));

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


		load.setLayoutX(545.0);
		load.setLayoutY(60.0);
	

		load.setPrefHeight(40.0);
		load.setPrefWidth(75.0);
		load.setText("Load");

		chosepic.setLayoutX(604.0);
		chosepic.setLayoutY(377.0);
		chosepic.setPrefHeight(40.0);
		chosepic.setPrefWidth(75.0);
		chosepic.setText("Browse");

	
/*		cusimage.setFitHeight(186.0);
		cusimage.setFitWidth(248.0);
		cusimage.setLayoutX(603.0);
		cusimage.setLayoutY(132.0);
		cusimage.setPickOnBounds(true);
		cusimage.setPreserveRatio(true);
		cusimage.setImage(new Image(getClass().getResource("default_user_512px.png").toExternalForm()));
*/
		label.setLayoutX(43.0);
		label.setLayoutY(29.0);
		label.setText("Supplier ID");
		label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label.setFont(new Font("System Bold", 20.0));

		label0.setLayoutX(43.0);
		label0.setLayoutY(84.0);
		label0.setText("Company Name ");
		label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label0.setFont(new Font("System Bold", 20.0));

		label1.setLayoutX(43.0);
		label1.setLayoutY(194.0);
		label1.setText("Address");
		label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label1.setFont(new Font("System Bold", 20.0));

		label2.setLayoutX(43.0);
		label2.setLayoutY(265.0);
		label2.setText("Phone");
		label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label2.setFont(new Font("System Bold", 20.0));

		

		label4.setLayoutX(43.0);
		label4.setLayoutY(408.0);
		label4.setText(" ");
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

		label5.setLayoutX(43.0);
		label5.setLayoutY(134.0);
		label5.setText("Last Name ");
		label5.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label5.setFont(new Font("System Bold", 20.0));

		radioButton.setLayoutX(246.0);
		radioButton.setLayoutY(309.0);
	
		


		button1.setLayoutX(209.0);
        button1.setLayoutY(400.0);


		button1.setPrefHeight(40.0);
		button1.setPrefWidth(85.0);
		button1.setText("Insert");

		
		button2.setLayoutX(358.0);
        button2.setLayoutY(400.0);
     
        button2.setPrefHeight(40.0);
        button2.setPrefWidth(85.0);
        button2.setText("Update");

        button0.setLayoutX(503.0);
        button0.setLayoutY(400.0);
        button0.setMnemonicParsing(false);
       
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(85.0);
        button0.setText("Delete");

		pane.getChildren().add(button1);
		pane.getChildren().add(button2);

		pane.getChildren().add(confirmation);
		pane.getChildren().add(cusid);
		pane.getChildren().add(cusname);
		pane.getChildren().add(cusphone);
		
		pane.getChildren().add(load);
//		pane.getChildren().add(chosepic);
		
		pane.getChildren().add(button0);

/*		pane.getChildren().add(cusimage);*/
		pane.getChildren().add(label);
		pane.getChildren().add(label0);
		pane.getChildren().add(label1);
		pane.getChildren().add(label2);
		pane.getChildren().add(label3);
		pane.getChildren().add(label4);
		pane.getChildren().add(Name);
	
		pane.getChildren().add(cusaddress);
		
		
		warning = new  Label();
		warning.setLayoutX(604.0);
		warning.setLayoutY(377.0);
		warning.setTextFill(Color.RED);
		warning.setStyle("-fx-font-size: 25px;");
		pane.getChildren().add(warning);
		anchorpane.getChildren().add(pane);

		scene = new Scene (anchorpane);
		scene.getStylesheets().add
		(getClass().getResource("application.css").toExternalForm());


	}
	public Scene getScene() {
		return scene;
	}
	public Label getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(Label confirmation) {
		this.confirmation = confirmation;
	}

	public TextField getCusid() {
		return cusid;
	}

	public void setCusid(TextField cusid) {
		this.cusid = cusid;
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



	public Button getLoad() {
		return load;
	}

	public void setLoad(Button load) {
		this.load = load;
	}

	public Button getChosepic() {
		return chosepic;
	}

	public void setChosepic(Button chosepic) {
		this.chosepic = chosepic;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public ImageView getCusimage() {
		return cusimage;
	}

	public void setCusimage(ImageView cusimage) {
		this.cusimage = cusimage;
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

	public Pane getPane() {
		return pane;
	}

	public void setPane(Pane pane) {
		this.pane = pane;
	}

	public void loadValues() {

		load.setOnAction(e->{	
			try{
				
				Name.setText("");
				if (!(cusid.getText().length()==0||cusid.getText()==null))
				{ PreparedStatement create = getConnection()
				.prepareStatement(
						"SELECT * FROM SUPPLIER WHERE suppId = \""+ cusid.getText()+"\"");
				ResultSet Result = create.executeQuery();
				
				Result.next();
				
				cusid.setText(Result.getString("suppID"));
			
				cusname.setText(Result.getString("companyName"));
				cusaddress.setText(Result.getString("companyAddress"));
				cusphone.setText(Result.getString("companyPhoneNb"));
				

				}} catch (Exception a) {}

		});}
	public void delete (Stage stage , ComboBox sup1, ComboBox sup2) {
		
		button0.setOnAction(e->{
			if(cusid.getText()==null || cusid.getText().length()==0) {
				warning.setText("SupplierId Required !");
			} else {
				warning.setText("");
			String STR2= "DELETE FROM SUPPLIER WHERE suppId =\""+cusid.getText()+"\";";
			String STR1= "UPDATE PRODUCT_LIST SET suppID=\"SP000\" WHERE suppId =\""+cusid.getText()+"\";";

			PreparedStatement create,create1;
			
			
			
			cusname.setText("");
	     	cusaddress.setText("");
			Name.setText("");
			cusid.setText("");
			cusphone.setText("");
			
			stage.close();
			try {
				create = getConnection()
						.prepareStatement(STR1);
			 create.executeUpdate();
			 create1= getConnection()
						.prepareStatement(STR2);
			 create1.executeUpdate();
			 sup1.setItems(buildData("SELECT suppId FROM SUPPLIER ORDER BY suppId;"));
				sup2.setItems(buildData("SELECT suppId FROM SUPPLIER ORDER BY suppId;"));
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			}});
		
		
	}
	public void update (Stage stage , ComboBox sup1, ComboBox sup2) {
		
		button2.setOnAction(e->{
		
			try{
				
				if(cusid.getText().length()==0 || cusname.getText().length()==0 || cusphone.getText().length()==0
						||cusaddress.getText().length()==0 ||
					cusid.getText()==null || cusname.getText()==null  || cusphone.getText()==null
						||cusaddress.getText()==null  )
				{
					warning.setText("All Fields are required");///////////////
				
				} else {
				warning.setText("");
				
				
					String STR1 = "UPDATE SUPPLIER SET suppid=\""+cusid.getText()+"\" , companyName= \""+ cusname.getText()
					+ "\" , companyAddress=\"" + cusaddress.getText()+"\" ,companyPhoneNb =\"" +cusphone.getText() +"\"  WHERE suppId =\""+
							cusid.getText()+"\";";
					
					System.out.println(STR1);
					PreparedStatement create = getConnection()
							.prepareStatement(STR1);
					 create.executeUpdate();
				
						
						cusname.setText("");
						
						cusaddress.setText("");
						
						cusphone.setText("");
						sup1.setItems(buildData("SELECT suppId FROM SUPPLIER ORDER BY suppId;"));
						sup2.setItems(buildData("SELECT suppId FROM SUPPLIER ORDER BY suppId;"));
						 stage.close();

			
			}}
			catch(Exception et) {}

			
			
		});
	}

	public void insert(Stage stage, ComboBox sup1 , ComboBox sup2) {
		button1.setOnAction(e->{
			try {
				
				if(cusid.getText().length()==0 || cusname.getText().length()==0 || cusphone.getText().length()==0
						||cusaddress.getText().length()==0 ||
					cusid.getText()==null || cusname.getText()==null  || cusphone.getText()==null
						||cusaddress.getText()==null  )
				{
					warning.setText("All Fields are required");///////////////
					}
				else {
					warning.setText(" ");
				
				
				String STR ="INSERT INTO SUPPLIER VALUES ("+ "\""+	cusid.getText()+"\", \""+ cusname.getText()+"\" ,  "+
						cusphone.getText() + ",\""+ cusaddress.getText()+"\" );";
				System.out.println(STR);
				PreparedStatement create = getConnection()
						.prepareStatement(STR);
				 create.executeUpdate();
				 stage.close();
					
					cusname.setText("");
				
					cusaddress.setText("");
					
					cusphone.setText("");
					sup1.setItems(buildData("SELECT suppId FROM SUPPLIER ORDER BY suppId;"));
					sup2.setItems(buildData("SELECT suppId FROM SUPPLIER ORDER BY suppId;"));
		
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
}
