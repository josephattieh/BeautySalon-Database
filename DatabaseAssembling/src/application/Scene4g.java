package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.util.Callback;

public class Scene4g {
	 ObservableList<ObservableList> data;
	 TableView tableView;
	AnchorPane anchorpane;
	Pane pane;
	TextField warning;
	ComboBox prodid;
	Label label;
	Label label0;
	Button button;
	Button button0;
	Button button1;
	Label label1;
	Label label2;
	Label label3;
	
	
	Scene scene;
	TextField qty;
	Label label4;
	int nb;

	public Scene4g() {
		nb=0;
		warning = new TextField();
		
		anchorpane = new AnchorPane();
		pane = new Pane();
		prodid = new ComboBox(buildData("SELECT * FROM PRODUCT_LIST"));
		prodid.getSelectionModel().select("Not used");
		prodid.valueProperty().addListener(e->{
			if(prodid.getValue().toString().compareTo("Not used")==0)
				label1.setText("");
			else 
				label1.setText(buildData("SELECT prodName FROM PRODUCT_LIST WHERE prodid= \""+prodid.getValue().toString()+"\";").get(0));
		});
		label = new Label();
		label0 = new Label();
		button = new Button();
		button0 = new Button();
		button1 = new Button();
		label1 = new Label();
		label2 = new Label();
		label3 = new Label();
		qty = new TextField();
		label4 = new Label("Quantity");
		tableView = new TableView();
		
		

		anchorpane.setPrefHeight(650.0);
		anchorpane.setPrefWidth(990.0);
		anchorpane.setStyle("-fx-background-color: #EC2590;");

		label4.setLayoutX(344.0);
        label4.setLayoutY(208.0);
 
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label4.setFont(new Font("System Bold", 20.0));
		
		qty = new TextField();
		qty.setLayoutX(445.0);
        qty.setLayoutY(201.0);
        qty.setPrefHeight(45.0);
        qty.setPrefWidth(115.0);
        qty.setPromptText("qty");
        qty.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        qty.setFont(new Font("System Bold", 16.0));
        
		pane.setLayoutX(55.0);
		pane.setLayoutY(46.0);
		pane.setPrefHeight(570.0);
		pane.setPrefWidth(880.0);
		pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");

		prodid.setLayoutX(234.0);
		prodid.setLayoutY(103.0);
		prodid.setPrefHeight(45.0);
		prodid.setPrefWidth(300.0);
		prodid.setPromptText("Product ID");
		prodid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		

		label.setLayoutX(77.0);
		label.setLayoutY(111.0);
		label.setText("Product ID");
		label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label.setFont(new Font("System Bold", 20.0));

		label0.setLayoutX(77.0);
		label0.setLayoutY(208.0);
		label0.setText("Order ID");
		label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label0.setFont(new Font("System Bold", 20.0));

		button.setLayoutX(440.0);
		button.setLayoutY(509.0);
		button.setMnemonicParsing(false);
		button.setPrefHeight(40.0);
		button.setPrefWidth(85.0);
		button.setText("Delete");

		button0.setLayoutX(178.0);
		button0.setLayoutY(509.0);
		button0.setMnemonicParsing(false);
		button0.setPrefHeight(40.0);
		button0.setPrefWidth(85.0);
		button0.setText("Insert");

		button1.setLayoutX(573.0);
		button1.setLayoutY(72.0);
		button1.setMnemonicParsing(false);
		button1.setPrefHeight(40.0);
		button1.setPrefWidth(85.0);
		button1.setText("Load");

		label1.setLayoutX(242.0);
		label1.setLayoutY(150.0);
		label1.setPrefHeight(40.0);
		label1.setPrefWidth(285.0);
		label1.setText("");
		label1.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
		label1.setFont(new Font(16.0));

		label2.setLayoutX(234.0);
		label2.setLayoutY(60.0);
		label2.setPrefHeight(40.0);
		label2.setPrefWidth(285.0);
		label2.setText("");
		label2.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
		label2.setFont(new Font("System Bold", 25.0));
		
		

		
		tableView.setLayoutX(77.0);
		tableView.setLayoutY(259.0);
		tableView.setPrefHeight(230.0);
		tableView.setPrefWidth(518.0);

		pane.getChildren().add(prodid);
		pane.getChildren().add(label);
		pane.getChildren().add(label0);

		pane.getChildren().add(button);
		pane.getChildren().add(button0);
		
		pane.getChildren().add(label1);
		pane.getChildren().add(label2);
		pane.getChildren().add(label3);
		pane.getChildren().add(label4);

		pane.getChildren().add(qty);

		pane.getChildren().add(tableView);
		anchorpane.getChildren().add(pane);
		scene = new Scene(anchorpane);
		scene.getStylesheets().add
		(getClass().getResource("application.css").toExternalForm());

	}
	
	public Scene getScene() {
		return scene;
	}
	public Label getLabel() {
		return label2;
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
	  public void loadValues() {

			button1.setOnAction(e->{	
				try{


					if (!(label2.getText().length()==0||label2.getText()==null))
					{ PreparedStatement create = getConnection()
					.prepareStatement(
							"SELECT * FROM ORDER_DETAILS WHERE orderID = \""+ label2.getText()+"\"");

					ResultSet Result = create.executeQuery();
					Result.next();
					

					prodid.getSelectionModel().select("Not used");;
					qty.setText(Result.getString("qty"));
					

					
					
					}} catch (Exception a) {}

			});}
		public void delete () {
			
			button.setOnAction(e->{
				if(label2.getText()==null || label2.getText().length()==0) {
					
				} else {
				
				String STR1= "DELETE FROM ORDER_DETAILS WHERE orderid =\""+label2.getText()+"\" AND prodID =\""
				+ prodid.getValue().toString()+"\";";
				PreparedStatement create1,create2;
				
				System.out.println(STR1);

				
				prodid.setValue("");
				qty.setText("");
				
				try {
					create1 = getConnection()
							.prepareStatement(STR1);
				 create1.executeUpdate();
				 tableView.getItems().clear();
					tableView.getColumns().clear();
					buildData("SELECT orderID,O.prodID,prodName,prodType,prodprice,suppID,qty FROM ORDER_DETAILS O, PRODUCT_LIST P WHERE O.ProdID=P.PRODID AND orderID =\""+label2.getText()+"\";", tableView);
					prodid.getSelectionModel().select("Not used");;

				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				}});
			
			
		}


		public void insert() {
			button0.setOnAction(e->{
				try {

					if(label4.getText().length()==0 || qty.getText().length()==0 ||prodid.getValue().toString().compareTo("Not used")==0
						|| label4.getText()==null || qty.getText()==null)

					{
						warning.setText("All Fields are required");///////////////
						}
					else {
						warning.setText(" ");
					
				String STR ="INSERT INTO ORDER_DETAILS VALUES ("+ "\""+ label2.getText()+"\", \""
		  + prodid.getValue().toString() + "\" ,"+ qty.getText()+"); " ;
					System.out.println(STR);
					PreparedStatement create = getConnection()
							.prepareStatement(STR);
					 create.executeUpdate();
					 
					System.out.println(STR);
					 
						qty.setText("");
						tableView.getItems().clear();
						tableView.getColumns().clear();
						buildData("SELECT orderID,O.prodID,prodName,prodType,prodprice,suppID,qty FROM ORDER_DETAILS O, PRODUCT_LIST P WHERE O.ProdID=P.PRODID AND orderID =\""+label2.getText()+"\";", tableView);
						prodid.getSelectionModel().select("Not used");;

						
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
		 public void buildData(String SQL, TableView tableview){
		        Connection c ;
		        data = FXCollections.observableArrayList();
		        try{
		          c = getConnection();
		          //SQL FOR SELECTING ALL OF CUSTOMER
		          
		          //ResultSet
		          ResultSet rs = c.createStatement().executeQuery(SQL);

		          /**********************************
		           * TABLE COLUMN ADDED DYNAMICALLY *
		           **********************************/
		          for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
		              //We are using non property style for making dynamic table
		              final int j = i;                
		              TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
		              col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
		                  public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
		                      return new SimpleStringProperty(param.getValue().get(j).toString());                        
		                  }                    
		              });

		              tableview.getColumns().addAll(col); 
		              System.out.println("Column ["+i+"] ");
		          }

		          /********************************
		           * Data added to ObservableList *
		           ********************************/
		          while(rs.next()){
		              //Iterate Row
		              ObservableList<String> row = FXCollections.observableArrayList();
		              for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
		                  //Iterate Column
		            	  if(rs.getString(i)==null || rs.getString(i).isEmpty() )
		            		  row.add("NULL");
		            		  else 
		                  row.add(rs.getString(i));
		              }
		              System.out.println("Row [1] added "+row );
		              data.add(row);

		          }

		          //FINALLY ADDED TO TableView
		          tableview.setItems(data);
		        }catch(Exception e){
		            e.printStackTrace();
		            System.out.println("Error on Building Data");             
		        }}
		
		 public TableView getTableView() {
			 return tableView;
		 }
		 public ComboBox getProd() {
			 return prodid;
		 }
}
