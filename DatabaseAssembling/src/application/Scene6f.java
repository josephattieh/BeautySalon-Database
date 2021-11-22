package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.text.ChangedCharSetException;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

public class Scene6f {
	 ObservableList<ObservableList> data;
	 TableView tableView;
	      Pane pane;
	      TextField orderid;
	      TextField ordertime;
	      Label label;
	      Label label0;
	      Label label1;
	      TextField orderdate;
	      Label label2;
	      Button button;
	      Button button0;
	      ComboBox custid;
	      Label label3;
	      CheckBox checkBox;
	      Label label4;
	      ComboBox prodid;
	      Label label5;
	      CheckBox checkBox0;
	      CheckBox checkBox1;
	      AnchorPane anchorpane;
	      Scene scene;
	    public Scene6f() {
	    	anchorpane= new AnchorPane();
	    	
	        pane = new Pane();
	        orderid = new TextField();
	        ordertime = new TextField();
	        label = new Label();
	        label0 = new Label();
	        label1 = new Label();
	        orderdate = new TextField();
	        label2 = new Label();
	        button = new Button();
	        button0 = new Button();
	        custid = new ComboBox(buildData("SELECT custID FROM CUSTOMER ORDER BY custID;"));
	        custid.getSelectionModel().select("Not used");
	        custid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
	        prodid = new ComboBox(buildData("SELECT prodId FROM PRODUCT_LIST ORDER BY prodid;"));
	        prodid.getSelectionModel().select("Not used");
	        label3 = new Label("");
	       
	        label4 = new Label();
	     
	        label5 = new Label("");
	        checkBox = new CheckBox();
	        checkBox0 = new CheckBox();
	        checkBox1 = new CheckBox();
	        
	        

	       
	        anchorpane.setPrefHeight(650.0);
	        anchorpane.setPrefWidth(990.0);
	        anchorpane.setStyle("-fx-background-color: #EC2590;");

	        pane.setLayoutX(55.0);
	        pane.setLayoutY(40.0);
	        pane.setPrefHeight(570.0);
	        pane.setPrefWidth(880.0);
	        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");

	        orderid.setLayoutX(234.0);
	        orderid.setLayoutY(22.0);
	        orderid.setPrefHeight(45.0);
	        orderid.setPrefWidth(300.0);
	        orderid.setPromptText("Order ID");
	        orderid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
	        orderid.setFont(new Font("System Bold", 16.0));

	        ordertime.setLayoutX(234.0);
	        ordertime.setLayoutY(154.0);
	        ordertime.setPrefHeight(45.0);
	        ordertime.setPrefWidth(300.0);
	        ordertime.setPromptText("Order Time");
	        ordertime.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
	        ordertime.setFont(new Font("System Bold", 16.0));

	        label.setLayoutX(66.0);
	        label.setLayoutY(30.0);
	        label.setText("Order ID");
	        label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
	        label.setFont(new Font("System Bold", 20.0));

	        label0.setLayoutX(64.0);
	        label0.setLayoutY(162.0);
	        label0.setText("Order Time");
	        label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
	        label0.setFont(new Font("System Bold", 20.0));

	        label1.setLayoutX(59.0);
	        label1.setLayoutY(325.0);
	        label1.setText("Customer ID");
	        label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
	        label1.setFont(new Font("System Bold", 20.0));

	        orderdate.setLayoutX(235.0);
	        orderdate.setLayoutY(82.0);
	        orderdate.setPrefHeight(45.0);
	        orderdate.setPrefWidth(300.0);
	        orderdate.setPromptText("Order date");
	        orderdate.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
	        orderdate.setFont(new Font("System Bold", 16.0));

	        label2.setLayoutX(66.0);
	        label2.setLayoutY(90.0);
	        label2.setText("Order Date");
	        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
	        label2.setFont(new Font("System Bold", 20.0));

	        button.setLayoutX(440.0);
	        button.setLayoutY(509.0);
	        button.setMnemonicParsing(false);
	        button.setPrefHeight(40.0);
	        button.setPrefWidth(85.0);
	        button.setText("Select");

	        

	        custid.setLayoutX(239.0);
	        custid.setLayoutY(317.0);
	        custid.setPrefHeight(45.0);
	        custid.setPrefWidth(285.0);
	        custid.setPromptText("Customer ID");

	        label3.setLayoutX(243.0);
	        label3.setLayoutY(270.0);
	        label3.setPrefHeight(40.0);
	        label3.setPrefWidth(285.0);
	        label3.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
	        label3.setFont(new Font(16.0));

	        checkBox.setLayoutX(243.0);
	        checkBox.setLayoutY(449.0);
	        checkBox.setMnemonicParsing(false);
	        checkBox.setText("Product");

	        label4.setLayoutX(64.0);
	        label4.setLayoutY(232.0);
	        label4.setText("Product Id");
	        label4.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
	        label4.setFont(new Font("System Bold", 20.0));

	        prodid.setLayoutX(243.0);
	        prodid.setLayoutY(225.0);
	        prodid.setPrefHeight(45.0);
	        prodid.setPrefWidth(285.0);
	        prodid.setPromptText("Product ID");

	        label5.setLayoutX(239.0);
	        label5.setLayoutY(369.0);


	        label5.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
	        label5.setFont(new Font(16.0));

	        checkBox0.setLayoutX(345.0);
	        checkBox0.setLayoutY(449.0);
	        checkBox0.setMnemonicParsing(false);
	        checkBox0.setText("Customer");

	        checkBox1.setLayoutX(465.0);
	        checkBox1.setLayoutY(449.0);
	        checkBox1.setMnemonicParsing(false);
	        checkBox1.setText("Order");

	        custid.valueProperty().addListener(e->{
	        	if(custid.getValue().toString().compareTo("Not used")==0)
	        	label5.setText("");
	        	else 
	        		label5.setText(buildData("SELECT fName FROM CUSTOMER WHERE custID=\""+custid.getValue().toString()+"\";").get(0)
	        				+" "+buildData("SELECT lName FROM CUSTOMER WHERE custID=\""+ custid.getValue().toString()+"\";").get(0));
	        	
	        });
	        
	       
	        prodid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
	        prodid.valueProperty().addListener(e->{
	        	if(prodid.getValue().toString().compareTo("Not used")==0)
	        	label3.setText("");
	        	else 
	        		label3.setText(buildData("SELECT prodName FROM PRODUCT_LIST WHERE prodid=\""+prodid.getValue().toString()+"\";").get(0));
	        	
	        });
	        
	        pane.getChildren().add(orderid);
	        pane.getChildren().add(ordertime);
	        pane.getChildren().add(label);
	        pane.getChildren().add(label0);
	        pane.getChildren().add(label1);
	        pane.getChildren().add(orderdate);
	        pane.getChildren().add(label2);
	        pane.getChildren().add(button);
	        pane.getChildren().add(custid);
	        pane.getChildren().add(label3);
	 
	        pane.getChildren().add(label4);
	        pane.getChildren().add(prodid);
	        pane.getChildren().add(label5);
	      
	        anchorpane.getChildren().add(pane);
	        scene = new Scene(anchorpane);
	        scene.getStylesheets().add
			(getClass().getResource("application.css").toExternalForm());

	    }
	    
	    public Scene getScene() {
	    	return scene;
	    }
	    public Button getButton() {
	    	return button;
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
	    public String SearchOnACriteria() {/////////addd salary
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT OD.orderID,OD.prodId,prodNAME,PRODtYPE,ProdType,prodPrice,qty,orderdate,orderTime,custId,suppId FROM  ORDER_DETAILS OD , ORDER_DATA O, PRODUCT_LIST P WHERE OD.orderID=O.orderId and P.prodID=OD.prodId ");
			int i=0;
			int j=0;
			if(orderid.getText().toString().length()!=0 && orderid.getText()!=null) {
				i++;
			}
			if(orderdate.getText().toString().length()!=0 && orderdate.getText()!=null) {
				i++;
			}
			
			if(ordertime.getText().toString().length()!=0 && ordertime.getText()!=null) {
				i++;
			}
			if(prodid.getValue().toString().compareTo("Not used")!=0){
				i++;
			}
			if(custid.getValue().toString().compareTo("Not used")!=0) {
				i++;
			}
			if(i!=0) {
				sb.append(" AND ");
			}
			
			
			
			if(orderid.getText().toString().length()!=0 && orderid.getText()!=null) {
				sb.append("O.orderId=\""+ orderid.getText()+"\"");
				j++;
				if(j!=i) {
					sb.append(" AND ");
				}
			}//////////
			
			
			if(orderdate.getText().toString().length()!=0 && orderdate.getText()!=null) {
			sb.append("orderDate=\""+orderdate.getText()+"\"");
				j++;
				if(j!=i) {
					sb.append(" AND ");
				}
			}
			
			if(ordertime.getText().toString().length()!=0 && ordertime.getText()!=null) {
				sb.append("orderTime =\""+ordertime.getText()+"\"");			j++;
				if(j!=i) {
					sb.append(" AND ");
				}
			}
			if(prodid.getValue().toString().compareTo("Not used")!=0){
					sb.append(" P.prodid =\""+prodid.getValue().toString()+"\"");			j++;
				if(j!=i) {
					sb.append(" AND ");
				}
			}
			if(custid.getValue().toString().compareTo("Not used")!=0){
				sb.append(" O.custid =\""+custid.getValue().toString()+"\"");			j++;
				if(j!=i) {
					sb.append(" AND ");
				}
			}
			custid.getSelectionModel().select("Not used");	
			prodid.getSelectionModel().select("Not used");	
			sb.append(";");
			
			System.out.println(sb.toString());
			return sb.toString();}

	    
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
	 public ComboBox getCust() {
		 return custid;
	 }
	 public ComboBox getProd() {
		 return prodid;
	 }
		
	}

