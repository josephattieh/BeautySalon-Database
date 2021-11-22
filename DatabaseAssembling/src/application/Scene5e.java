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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Scene5e {
	
	 
	 Pane pane;
	 Scene scene;
	 AnchorPane anchorpane;
     TextField bookid;
     TextField bookdate;
     ComboBox staffid;
     TextField duration;
     Label label;
     Label label0;
     Label label1;
     Label label2;
     TextField booktime;
     Label label3;
     ComboBox serviceId;
     Label label4;
     Button button;
     Label label5;
    ComboBox custId;
    Label label6;
    Label label7;
    Label label8;

    public Scene5e (){
    	label6 = new Label("");
    	label7= new Label("");
    	label8 = new Label("");
        pane = new Pane();
        bookid = new TextField();
        bookdate = new TextField();
        staffid = new ComboBox(buildData("SELECT staffID from STAFF;"));
        staffid.getSelectionModel().select("Not used");
        duration = new TextField();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        booktime = new TextField();
        label3 = new Label();
        serviceId = new ComboBox(buildData("SELECT serviceID FROM SERVICE;"));
        serviceId.getSelectionModel().select("Not used");

        label4 = new Label();
        button = new Button();
        label5 = new Label();
        custId = new ComboBox(buildData("SELECT custId FROM CUSTOMER;"));
        custId.getSelectionModel().select("Not used");

        anchorpane = new AnchorPane();
        anchorpane.setId("AnchorPane");
        anchorpane.setPrefHeight(650.0);
        anchorpane.setPrefWidth(990.0);
        anchorpane.setStyle("-fx-background-color: #EC2590;");

        pane.setLayoutX(55.0);
        pane.setLayoutY(46.0);
        pane.setPrefHeight(570.0);
        pane.setPrefWidth(880.0);
        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");

        bookid.setLayoutX(234.0);
        bookid.setLayoutY(22.0);
        bookid.setPrefHeight(45.0);
        bookid.setPrefWidth(300.0);
        bookid.setPromptText("Booking ID");
        bookid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        bookid.setFont(new Font("System Bold", 16.0));

        bookdate.setLayoutX(234.0);
        bookdate.setLayoutY(86.0);
        bookdate.setPrefHeight(45.0);
        bookdate.setPrefWidth(300.0);
        bookdate.setPromptText("Booking Date");
        bookdate.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        bookdate.setFont(new Font("System Bold", 16.0));

        
        duration.setLayoutX(235.0);
        duration.setLayoutY(223.0);
        duration.setPrefHeight(45.0);
        duration.setPrefWidth(300.0);
        duration.setPromptText("Duration");
        duration.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        duration.setFont(new Font("System Bold", 16.0));

        label.setLayoutX(42.0);
        label.setLayoutY(29.0);
        label.setText("Booking ID");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label.setFont(new Font("System Bold", 20.0));

        label0.setLayoutX(42.0);
        label0.setLayoutY(94.0);
        label0.setText("Booking Date");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label0.setFont(new Font("System Bold", 20.0));

        label1.setLayoutX(54.0);
        label1.setLayoutY(231.0);
        label1.setText("duration");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label1.setFont(new Font("System Bold", 20.0));

        label2.setLayoutX(56.0);
        label2.setLayoutY(304.0);
        label2.setText("Staff Id");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label2.setFont(new Font("System Bold", 20.0));

        booktime.setLayoutX(234.0);
        booktime.setLayoutY(155.0);
        booktime.setPrefHeight(45.0);
        booktime.setPrefWidth(300.0);
        booktime.setPromptText("Booking Time");
        booktime.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        booktime.setFont(new Font("System Bold", 16.0));

        label3.setLayoutX(41.0);
        label3.setLayoutY(163.0);
        label3.setText("Booking Time");
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label3.setFont(new Font("System Bold", 20.0));

        label4.setLayoutX(48.0);
        label4.setLayoutY(382.0);
        label4.setText("Service Id");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label4.setFont(new Font("System Bold", 20.0));

        button.setLayoutX(449.0);
        button.setLayoutY(509.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(85.0);
        button.setText("Search");

        label5.setLayoutX(49.0);
        label5.setLayoutY(451.0);
        label5.setText("Customer Id");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
        label5.setFont(new Font("System Bold", 20.0));
       
        staffid.setLayoutX(243.0);
        staffid.setLayoutY(307.0);
        staffid.setPrefHeight(45.0);
        staffid.setPrefWidth(152.0);
        staffid.setPromptText("StaffId");
        
        
        serviceId.setLayoutX(243.0);
        serviceId.setLayoutY(377.0);
        serviceId.setPrefHeight(40.0);
        serviceId.setPrefWidth(152.0);
        serviceId.setPromptText("ServiceId");

        custId.setLayoutX(243.0);
        custId.setLayoutY(446.0);
        custId.setPrefHeight(40.0);
        custId.setPrefWidth(152.0);
        custId.setPromptText("CustomerId");

        label6.setLayoutX(464.0);
        label6.setLayoutY(310.0);
        label6.setPrefHeight(40.0);
        label6.setPrefWidth(200.0);
        label6.setText("");
        label6.setTextFill( Color.valueOf("#ff00dd"));
        label6.setFont(new Font(16.0));

        label7.setLayoutX(464.0);
        label7.setLayoutY(377.0);
        label7.setPrefHeight(40.0);
        label7.setPrefWidth(200.0);
        label7.setText("");
        label7.setTextFill( Color.valueOf("#ff00dd"));
        label7.setFont(new Font(16.0));

        label8.setLayoutX(465.0);
        label8.setLayoutY(446.0);
        label8.setPrefHeight(40.0);
        label8.setPrefWidth(200.0);
        label8.setText("");
        label8.setTextFill( Color.valueOf("#ff00dd"));
        label8.setFont(new Font(16.0));

        serviceId.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        staffid.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        custId.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        staffid.valueProperty().addListener(e->{
        	if(staffid.getValue().toString().compareTo("Not used")!=0)
        	label6.setText(buildData("SELECT fName FROM STAFF WHERE staffID =\""+staffid.getValue().toString()+"\";").get(0)+" " 
        			+ buildData("SELECT lName FROM STAFF WHERE staffID =\""+staffid.getValue().toString()+"\";").get(0));
        	else
        		label6.setText("");
        });
        serviceId.valueProperty().addListener(e->{
        	if(serviceId.getValue().toString().compareTo("Not used")!=0)
        	label7.setText(buildData("SELECT serviceType FROM SERVICE WHERE serviceID =\""+serviceId.getValue().toString()+"\";").get(0));
        	else
        		label7.setText("");
        });
        custId.valueProperty().addListener(e->{
        	if(custId.getValue().toString().compareTo("Not used")!=0)
        	label8.setText(buildData("SELECT fName FROM CUSTOMER WHERE custID =\""+custId.getValue().toString()+"\";").get(0)+" "+
        			buildData("SELECT lName FROM CUSTOMER WHERE custID =\""+custId.getValue().toString()+"\";").get(0));
        	else
        		label8.setText("");
        });
        
        pane.getChildren().add(bookid);
        pane.getChildren().add(bookdate);
        pane.getChildren().add(staffid);
        pane.getChildren().add(duration);
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(label3);
        pane.getChildren().add(label4);
        pane.getChildren().add(label5);
        pane.getChildren().add(booktime);
        pane.getChildren().add(label6);
        pane.getChildren().add(serviceId);
        pane.getChildren().add(label7);
        pane.getChildren().add(button);
        pane.getChildren().add(label8);
        pane.getChildren().add(custId);
        anchorpane.getChildren().add(pane);
        scene = new Scene(anchorpane);
        scene.getStylesheets().add
		(getClass().getResource("application.css").toExternalForm());
    }	
    public Scene getScene() {
    	return scene;
    }
    public String SearchOnACriteria() {/////////addd salary
		StringBuilder sb = new StringBuilder();
		
	
		sb.append(" SELECT A.bookingID, A.bookingDate,A.bookingTime, A.duration, A.custId , C.fName ,c.lName ,A.staffID, S.serviceId, S.servicetype, ST.fname , st.lname   FROM APPOINTMENT A, SERVICE S, STAFF ST, CUSTOMER C WHERE A.serviceID=S.serviceID AND A.custID=C.custID AND S.staffID=ST.staffID  ");
		int i=0;
		int j=0;
		if(bookid.getText().toString().length()!=0 && bookid.getText()!=null) {
			i++;
		}
		
		if(bookdate.getText().toString().length()!=0 && bookdate.getText()!=null) {
			i++;
		}
		
    	if(staffid.getValue().toString().compareTo("Not used")!=0) {
			i++;
		}
		if(booktime.getText().toString().length()!=0 && booktime.getText()!=null) {
			i++;
		}
		if(duration.getText().toString().length()!=0 && duration.getText()!=null) {
			i++;
		}
    	if(custId.getValue().toString().compareTo("Not used")!=0) {
			i++;
		}
    	if(serviceId.getValue().toString().compareTo("Not used")!=0) {
			i++;
		}
			
		if(i!=0) {
			sb.append(" AND ");
		}
		if(bookid.getText().toString().length()!=0 && bookid.getText()!=null) {
			sb.append("A.bookingID=\""+ bookid.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
		
	
		if(bookdate.getText().toString().length()!=0 && bookdate.getText()!=null) {
			sb.append("A.bookingDate=\""+bookdate.getText()+"\"");
			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		
    	if(staffid.getValue().toString().compareTo("Not used")!=0) {
			sb.append("A.staffID =\""+staffid.getValue()+"\"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(booktime.getText().toString().length()!=0 && booktime.getText()!=null) {
			sb.append(" A.bookingTime =\""+booktime.getText()+"\"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
		if(duration.getText().toString().length()!=0 && duration.getText()!=null) {
			sb.append(" A.duration ="+duration.getText()+"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
    	if(custId.getValue().toString().compareTo("Not used")!=0) {
			sb.append(" A.custID =\""+custId.getValue()+"\"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
    	if(serviceId.getValue().toString().compareTo("Not used")!=0) {
			sb.append(" A.serviceID =\""+serviceId.getValue()+"\"");			j++;
			if(j!=i) {
				sb.append(" AND ");
			}
		}
			
		sb.append(";");
		serviceId.getSelectionModel().select("Not used");;
		custId.getSelectionModel().select("Not used");;
		staffid.getSelectionModel().select("Not used");;

		System.out.println(sb.toString());
		return sb.toString();}
    	
    public Button getButton() {
    	return button;
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
	 public ComboBox getCust() {
		 return custId;
	 }
	 public ComboBox getServ() {
		 return serviceId;
	 }
}