package application;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

	public class Scene6e {
	
		 Pane pane;
		     TextField serviceid;
		     TextField price;
		     Label label;
		     Label label0;
		     Label label1;
		     TextField type;
		     Label label2;
		     Button button;
		     Button button0;
		     Button button1;
		     Button load;
		     ComboBox comboBox;
		     Label label3;
		     Label Name;
		     AnchorPane anchorpane;
		     Scene scene;
		    
		    public Scene6e() {
		    	Name = new Label();
		    	anchorpane = new AnchorPane();
		        pane = new Pane();
		        serviceid = new TextField();
		        price = new TextField();
		        label = new Label();
		        label0 = new Label();
		        label1 = new Label();
		        type = new TextField();
		        label2 = new Label();
		        button = new Button();
		        button0 = new Button();
		        button1 = new Button();
		        load = new Button();
		        comboBox = new ComboBox(buildData("SELECT * FROM STAFF"));
		        comboBox.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");

		        label3 = new Label();
		       

		        
		        anchorpane.setPrefHeight(650.0);
		        anchorpane.setPrefWidth(990.0);
		        anchorpane.setStyle("-fx-background-color: #EC2590;");

		        pane.setLayoutX(55.0);
		        pane.setLayoutY(46.0);
		        pane.setPrefHeight(570.0);
		        pane.setPrefWidth(880.0);
		        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");

		        serviceid.setLayoutX(234.0);
		        serviceid.setLayoutY(22.0);
		        serviceid.setPrefHeight(45.0);
		        serviceid.setPrefWidth(300.0);
		        serviceid.setPromptText("Service ID");
		        serviceid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		        serviceid.setFont(new Font("System Bold", 16.0));

		        price.setLayoutX(234.0);
		        price.setLayoutY(200.0);
		        price.setPrefHeight(45.0);
		        price.setPrefWidth(300.0);
		        price.setPromptText("Price");
		        price.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		        price.setFont(new Font("System Bold", 16.0));

		        label.setLayoutX(42.0);
		        label.setLayoutY(29.0);
		        label.setText("Service ID");
		        label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		        label.setFont(new Font("System Bold", 20.0));

		        label0.setLayoutX(53.0);
		        label0.setLayoutY(208.0);
		        label0.setText("Price");
		        label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		        label0.setFont(new Font("System Bold", 20.0));

		        label1.setLayoutX(59.0);
		        label1.setLayoutY(315.0);
		        label1.setText("Staff Id");
		        label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		        label1.setFont(new Font("System Bold", 20.0));

		        type.setLayoutX(235.0);
		        type.setLayoutY(113.0);
		        type.setPrefHeight(45.0);
		        type.setPrefWidth(300.0);
		        type.setPromptText("Service Type");
		        type.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		        type.setFont(new Font("System Bold", 16.0));

		        label2.setLayoutX(42.0);
		        label2.setLayoutY(121.0);
		        label2.setText("Service Type");
		        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		        label2.setFont(new Font("System Bold", 20.0));

		        button.setLayoutX(449.0);
		        button.setLayoutY(489.0);
		        button.setMnemonicParsing(false);
		        button.setPrefHeight(40.0);
		        button.setPrefWidth(85.0);
		        button.setText("Delete");

		        button0.setLayoutX(323.0);
		        button0.setLayoutY(489.0);
		        button0.setMnemonicParsing(false);
		        button0.setPrefHeight(40.0);
		        button0.setPrefWidth(85.0);
		        button0.setText("Update");

		        button1.setLayoutX(192.0);
		        button1.setLayoutY(489.0);
		        button1.setMnemonicParsing(false);
		        button1.setPrefHeight(40.0);
		        button1.setPrefWidth(85.0);
		        button1.setText("Insert");

		        load.setLayoutX(554.0);
		        load.setLayoutY(47.0);
		        load.setMnemonicParsing(false);
		        load.setPrefHeight(40.0);
		        load.setPrefWidth(85.0);
		        load.setText("Load");

		        comboBox.setLayoutX(243.0);
		        comboBox.setLayoutY(307.0);
		        comboBox.setPrefHeight(45.0);
		        comboBox.setPrefWidth(285.0);
		        comboBox.setPromptText("StaffId");
		        comboBox.getSelectionModel().select("Not used");
		        comboBox.valueProperty().addListener(e->{
		        	if(comboBox.getValue().toString().compareTo("Not used")==0) {
		        		label3.setText("");
		        	}
		        	else {
		        		label3.setText(buildData("SELECT lName FROM STAFF where staffID= \""+comboBox.getValue().toString()+"\";").get(0)
		        				+" "+ buildData("SELECT fName FROM STAFF where staffID= \""+comboBox.getValue().toString()+"\";").get(0));
		        	}
		        });
		       
		        label3.setLayoutX(243.0);
		        label3.setLayoutY(378.0);
		        label3.setPrefHeight(40.0);
		        label3.setPrefWidth(285.0);
		        label3.setText("");
		        label3.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
		        label3.setFont(new Font(16.0));
		        pane.getChildren().add(serviceid);
		        pane.getChildren().add(price);
		        pane.getChildren().add(label);
		        pane.getChildren().add(label0);
		        pane.getChildren().add(label1);
		        pane.getChildren().add(type);
		        pane.getChildren().add(label2);
		        pane.getChildren().add(button);
		        pane.getChildren().add(button0);
		        pane.getChildren().add(button1);
		        pane.getChildren().add(load);
		        pane.getChildren().add(comboBox);
		        pane.getChildren().add(label3);
		        anchorpane.getChildren().add(pane);

			scene = new Scene (anchorpane);
			scene.getStylesheets().add
			(getClass().getResource("application.css").toExternalForm());


		}
		public Scene getScene() {
			return scene;
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
					if (!(serviceid.getText().length()==0||serviceid.getText()==null))
					{ PreparedStatement create = getConnection()
					.prepareStatement(
							"SELECT * FROM SERVICE WHERE serviceId = \""+ serviceid.getText()+"\";");
					ResultSet Result = create.executeQuery();
					
					Result.next();
					
					serviceid.setText(Result.getString("serviceId"));
				
					type.setText(Result.getString("serviceType"));
					price.setText(Result.getString("servicePrice"));
					comboBox.setValue(Result.getString("staffId"));
					
					

					}} catch (Exception a) {}

			});}
		public void delete (Stage stage , ComboBox ser , ComboBox serv) {
			
			button.setOnAction(e->{
				if(serviceid.getText()==null || serviceid.getText().length()==0) {
					Name.setText("SupplierId Required !");
				} else {
					Name.setText("");
				String STR1= "DELETE FROM SERVICE WHERE serviceId =\""+serviceid.getText()+"\";";
				PreparedStatement create;
				
				
				
				serviceid.setText("");
				
				type.setText("");
				price.setText("");
				comboBox.getSelectionModel().select("Not used");
				
				stage.close();
				try {
					create = getConnection()
							.prepareStatement(STR1);
				 create.executeUpdate();
				 ser.setItems(buildData("SELECT serviceID FROM SERVICE ORDER BY serviceId;"));
					serv.setItems(buildData("SELECT serviceID FROM SERVICE ORDER BY serviceId;"));

				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				}});
			
			
		}
		public void update (Stage stage, ComboBox ser, ComboBox serv) {
			
			button0.setOnAction(e->{
			
				try{
					
					if(serviceid.getText().length()==0 || type.getText().length()==0 || price.getText().length()==0
							|| serviceid.getText()==null || type.getText()==null  || price.getText()==null
								||comboBox.getValue().toString().compareTo("Not used")==0  )
						
					{
						Name.setText("All Fields are required");///////////////
					
					} else {
					Name.setText("");
					
					
						String STR1 = "UPDATE SERVICE SET serviceId=\""+serviceid.getText()+"\" , serviceType= \""+ type.getText()
						+ "\" , serviceprice=\"" + price.getText()+"\" , staffID =\"" +comboBox.getValue().toString() +"\"  WHERE serviceID =\""+
								serviceid.getText()+"\";";
						
						System.out.println(STR1);
						PreparedStatement create = getConnection()
								.prepareStatement(STR1);
						 create.executeUpdate();
						
						 serviceid.setText("");
							
							type.setText("");
							price.setText("");
							comboBox.getSelectionModel().select("Not used");
							 stage.close();
							ser.setItems(buildData("SELECT serviceID FROM SERVICE ORDER BY serviceId;"));
							serv.setItems(buildData("SELECT serviceID FROM SERVICE ORDER BY serviceId;"));


				
				}}
				catch(Exception et) {}

				
				
			});
		}

		public void insert(Stage stage , ComboBox ser , ComboBox serv) {
			button1.setOnAction(e->{
				try {
					

					if(serviceid.getText().length()==0 || type.getText().length()==0 || price.getText().length()==0
						|| serviceid.getText()==null || type.getText()==null  || price.getText()==null
							||comboBox.getValue().toString().compareTo("Not used")==0  )
					{
						Name.setText("All Fields are required");///////////////
						}
					else {
						Name.setText(" ");
					
					
					String STR ="INSERT INTO SERVICE VALUES ("+ "\""+	serviceid.getText()+"\", \""+ type.getText()+"\" ,  "+
							price.getText() + ",\""+ comboBox.getValue().toString()+"\" );";
					System.out.println(STR);
					PreparedStatement create = getConnection()
							.prepareStatement(STR);
					 create.executeUpdate();
					 stage.close();
						
					 serviceid.setText("");
						
						type.setText("");
						price.setText("");
						comboBox.getSelectionModel().select("Not used");
						
						ser.setItems(buildData("SELECT serviceID FROM SERVICE ORDER BY serviceId;"));
						serv.setItems(buildData("SELECT serviceID FROM SERVICE ORDER BY serviceId;"));

					}} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				} 
				);}
			
		
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
		public ComboBox  ComboboxStaffIDServ() {
			return comboBox;
		}
		
	
}
