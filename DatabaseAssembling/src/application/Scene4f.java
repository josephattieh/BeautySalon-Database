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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Scene4f {
 Pane pane;
	private ObservableList<ObservableList> data;

     TextField orderid;
     TextField ordertime;
     Label label;
     Label label0;
     Label label1;
     TextField orderdate;
     Label label2;
     Label label4;
     Label label5;
     Button button;
     Button button0;
     Button button1;
     Button button2;
     ComboBox custId;
     Label label3;
    Button button3;
    AnchorPane anchorpane;
    Scene scene;
    Label warning;
    public Scene4f() {
    	label4 = new Label();
    	label5= new Label();
    	warning = new Label("");
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
        button1 = new Button();
        button2 = new Button();
        custId = new ComboBox(buildData("SELECT * FROM CUSTOMER"));
        custId.getSelectionModel().select("Not used");;
        label3 = new Label();
        button3 = new Button();
        anchorpane = new AnchorPane();
   
        anchorpane.setPrefHeight(650.0);
        anchorpane.setPrefWidth(990.0);
        anchorpane.setStyle("-fx-background-color: #EC2590;");
        custId.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        
        pane.setLayoutX(55.0);
        pane.setLayoutY(46.0);
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
        ordertime.setLayoutY(200.0);
        ordertime.setPrefHeight(45.0);
        ordertime.setPrefWidth(300.0);
        ordertime.setPromptText("Order Time");
        ordertime.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        ordertime.setFont(new Font("System Bold", 16.0));

        label.setLayoutX(77.0);
        label.setLayoutY(30.0);
        label.setText("Order ID");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label.setFont(new Font("System Bold", 20.0));

        label0.setLayoutX(64.0);
        label0.setLayoutY(208.0);
        label0.setText("Order Time");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label0.setFont(new Font("System Bold", 20.0));

        label1.setLayoutX(59.0);
        label1.setLayoutY(315.0);
        label1.setText("Customer ID");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label1.setFont(new Font("System Bold", 20.0));

        orderdate.setLayoutX(235.0);
        orderdate.setLayoutY(113.0);
        orderdate.setPrefHeight(45.0);
        orderdate.setPrefWidth(300.0);
        orderdate.setPromptText("Order date");
        orderdate.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        orderdate.setFont(new Font("System Bold", 16.0));

        label2.setLayoutX(66.0);
        label2.setLayoutY(121.0);
        label2.setText("Order Date");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label2.setFont(new Font("System Bold", 20.0));

        
        button.setLayoutX(440.0);
        button.setLayoutY(509.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(85.0);
        button.setText("Delete");

        button0.setLayoutX(342.0);
        button0.setLayoutY(509.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(85.0);
        button0.setText("Update");

        button1.setLayoutX(243.0);
        button1.setLayoutY(509.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(85.0);
        button1.setText("Insert");

        button2.setLayoutX(555.0);
        button2.setLayoutY(50.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(40.0);
        button2.setPrefWidth(85.0);
        button2.setText("Load");

        custId.setLayoutX(243.0);
        custId.setLayoutY(307.0);
        custId.setPrefHeight(45.0);
        custId.setPrefWidth(285.0);
        custId.setPromptText("Customer ID");

        label3.setLayoutX(243.0);
        label3.setLayoutY(378.0);
        label3.setPrefHeight(40.0);
        label3.setPrefWidth(285.0);
        label3.setText("");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
        label3.setFont(new Font(16.0));
        
        label4.setLayoutX(640.0);
        label4.setLayoutY(443.0);
        label4.setPrefHeight(40.0);
        label4.setPrefWidth(135.0);
        label4.setText("");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#ff00dd"));
        label4.setFont(new Font(16.0));
        
        label5.setLayoutX(635.0);
        label5.setLayoutY(401.0);
        label5.setText("Total Price:");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label5.setFont(new Font("System Bold", 20.0));

        button3.setLayoutX(243.0);
        button3.setLayoutY(418.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(45.0);
        button3.setPrefWidth(285.0);
        button3.setText("Edit Products");
        custId.valueProperty().addListener(e->{
        	if(custId.getValue().toString().compareTo("Not used")==0)
        		label3.setText("");
        	else label3.setText(buildData("SELECT fName FROM CUSTOMER WHERE custid=\""+custId.getValue().toString()+"\";").get(0)+" "
        		+ (buildData("SELECT lName FROM CUSTOMER WHERE custid=\""+custId.getValue().toString()+"\";").get(0)));
        });
        pane.getChildren().add(orderid);
        pane.getChildren().add(ordertime);
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(orderdate);
        pane.getChildren().add(label2);
        pane.getChildren().add(label4);
        pane.getChildren().add(label5);
        pane.getChildren().add(button);
        pane.getChildren().add(button0);
        pane.getChildren().add(button1);
        pane.getChildren().add(button2);
        pane.getChildren().add(custId);
        pane.getChildren().add(label3);
        pane.getChildren().add(button3);
        anchorpane.getChildren().add(pane);
       
        scene = new Scene (anchorpane);
        scene.getStylesheets().add
		(getClass().getResource("application.css").toExternalForm());

        
}
    public Scene getScene() {
    	return scene;
    }
    public void loadValues() {

		button2.setOnAction(e->{	
			try{


				if (!(orderid.getText().length()==0||orderid.getText()==null))
				{ PreparedStatement create = getConnection()
				.prepareStatement(
						"SELECT * FROM ORDER_DATA WHERE orderID = \""+ orderid.getText()+"\"");

				ResultSet Result = create.executeQuery();
				Result.next();
				
				orderid.setText(Result.getString("orderID"));
				orderdate.setText(Result.getString("orderdate"));
				ordertime.setText(Result.getString("ordertime"));
				custId.setValue(Result.getString("custId"));

				String price = buildData("Select  SUM(qty*prodPrice) FROM ORDER_DATA ODA, ORDER_DETAILS ODE, PRODUCT_LIST PL WHERE ODA.orderID=ODE.orderID AND ODE.prodID=PL.prodID AND ODA.orderID=\""+orderid.getText()+"\"  GROUP BY ODA.orderID;").get(0);
				label4.setText(price);
				
				
				
				}} catch (Exception a) {}

		});}
	public void delete (Stage stage) {
		
		button.setOnAction(e->{
			if(orderid.getText()==null || orderid.getText().length()==0) {
				
			} else {
			
			String STR1= "DELETE FROM ORDER_DETAILS WHERE orderId =\""+orderid.getText()+"\";";
			PreparedStatement create1,create2;
			String STR2 = "DELETE FROM ORDER_DATA WHERE orderId =\""+orderid.getText()+"\";";
			System.out.println(STR1+" " +STR2);
			stage.close();
			orderid.setText("");
			orderdate.setText("");
			ordertime.setText("");
			custId.getSelectionModel().select("Not used");
	
			try {
				create1 = getConnection()
						.prepareStatement(STR1);
			 create1.executeUpdate();
			 
			 create1 = getConnection()
						.prepareStatement(STR2);
			 create1.executeUpdate();
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			}});
		
		
	}
	public void update (Stage stage) {
		
		button0.setOnAction(e->{
		
			try{
				
				if(orderid.getText().length()==0 || orderdate.getText().length()==0 || ordertime.getText().length()==0 
						|| orderid.getText()==null || orderdate.getText()==null || ordertime.getText()==null || custId.getValue().toString().compareTo("Not used")==0)

					{
					warning.setText("All Fields are required");///////////////
				
				} else {
				warning.setText("");
				
				
					String STR1 = "UPDATE ORDER_DATA SET orderId=\""+orderid.getText()+"\" ,orderdate=\""+orderdate.getText().toString()+"\" , orderTime= \""+ ordertime.getText().toString()
					+"\" , custId = \""+ custId.getValue().toString()+"\" WHERE orderId =\""
					+orderid.getText()+"\";";
					
					System.out.println(STR1);
					PreparedStatement create = getConnection()
							.prepareStatement(STR1);
					 create.executeUpdate();
					 stage.close();
					 orderid.setText("");
						orderdate.setText("");
						ordertime.setText("");
						custId.getSelectionModel().select("Not used");
			}}
			catch(Exception et) {}

			
			
		});
	}

	public void insert(Stage stage) {
		button1.setOnAction(e->{
			try {
				
				if(orderid.getText().length()==0 || orderdate.getText().length()==0 || ordertime.getText().length()==0 
						|| orderid.getText()==null || orderdate.getText()==null || ordertime.getText()==null || custId.getValue().toString().compareTo("Not used")==0)

				{
					warning.setText("All Fields are required");///////////////
					}
				else {
					warning.setText(" ");
				
			String STR ="INSERT INTO ORDER_DATA VALUES ("+ "\""+	orderid.getText()+"\", \""
	   + orderdate.getText()+"\" ,\""+ordertime.getText() + "\" ,\""+ custId.getValue().toString()+"\"); " ;
				System.out.println(STR);
				PreparedStatement create = getConnection()
						.prepareStatement(STR);
				 create.executeUpdate();
				 
				
					stage.close();
					orderid.setText("");
					orderdate.setText("");
					ordertime.setText("");
					custId.getSelectionModel().select("Not used");
					
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

	
	public void jumpProd ( Scene scene , Scene4g scene4g) {
		button3.setOnAction(e->
		
		{	if(orderid.getText().length()==0 || orderid.getText()==null || (buildData("SELECT orderID FROM ORDER_DATA WHERE orderID= \""+orderid.getText()+"\";").get(0).compareTo(orderid.getText()))!=0) {
			
		}else {
			
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			scene4g.getLabel().setText(orderid.getText().toString());
			scene4g.getTableView().getItems().clear();
			scene4g.getTableView().getColumns().clear();
			buildData("SELECT orderID,O.prodID,prodName,prodType,prodprice,suppID,qty FROM ORDER_DETAILS O, PRODUCT_LIST P WHERE O.ProdID=P.PRODID AND orderID =\""
					+ orderid.getText()+"\";", scene4g.getTableView());
			
		}
			
		});
		
	}

	public String getOrderId() {
		return orderid.getText().toString();
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

	 public ComboBox getCust() {
		 return custId;
	 }
	 public Button getButton() {
		 return button3;
	 }
	 public String Orderid() {
		 return orderid.getText();
	 }

}