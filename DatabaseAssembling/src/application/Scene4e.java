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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scene4e {
	  Pane pane;
      TextField bookid;
      TextField duration;
      Label label;
      Label label0;
      Label label1;
      Label label2;
      TextField booktime;
      Label label3;
      Label label4;
      Button button;
      Label label5;
      Button button0;
      Button button1;
      Button load;
      TextField datePicker;
      ComboBox comboBox;
      ComboBox comboBox0;
      ComboBox comboBox1;
      Label label6;
      Label label7;
      Label label8;
      Label warning;
    AnchorPane anchorpane;
    Scene scene;
    public Scene4e() {
    	anchorpane = new AnchorPane();
    	
        pane = new Pane();
        bookid = new TextField();
        duration = new TextField();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        booktime = new TextField();
        label3 = new Label();
        label4 = new Label();
        button = new Button();
        label5 = new Label();
        button0 = new Button();
        button1 = new Button();
        load = new Button();
        datePicker = new TextField();
        comboBox = new ComboBox(buildData("SELECT * FROM STAFF;"));
        comboBox0 = new ComboBox(buildData("SELECT * FROM SERVICE;"));
        comboBox1 = new ComboBox(buildData("SELECT * FROM CUSTOMER;"));
        comboBox.getSelectionModel().select("Not used");
        comboBox0.getSelectionModel().select("Not used");
        comboBox1.getSelectionModel().select("Not used");

        
        label6 = new Label();
        
        label7 = new Label("");
        label8 = new Label("");
        comboBox.valueProperty().addListener(e->{
        	if(comboBox.getValue().toString().compareTo("Not used")!=0)
        	label6.setText(buildData("SELECT fName FROM STAFF WHERE staffID =\""+comboBox.getValue().toString()+"\";").get(0)+" " 
        			+ buildData("SELECT lName FROM STAFF WHERE staffID =\""+comboBox.getValue().toString()+"\";").get(0));
        	else
        		label6.setText("");
        });
        comboBox0.valueProperty().addListener(e->{
        	if(comboBox0.getValue().toString().compareTo("Not used")!=0)   
        		label7.setText(buildData("SELECT serviceType FROM SERVICE WHERE serviceID =\""+comboBox0.getValue().toString()+"\";").get(0));
        	else
        		label7.setText("");
        });
        comboBox1.valueProperty().addListener(e->{
        	if(comboBox1.getValue().toString().compareTo("Not used")!=0)
        		label8.setText(buildData("SELECT fName FROM CUSTOMER WHERE custID =\""+comboBox1.getValue().toString()+"\";").get(0)+" "+
        			buildData("SELECT lName FROM CUSTOMER WHERE custID =\""+comboBox1.getValue().toString()+"\";").get(0));
        	else
        		label8.setText("");
        });
        warning = new Label();
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
        label.setTextFill( Color.valueOf("#c50bdd"));
        label.setFont(new Font("System Bold", 20.0));

        label0.setLayoutX(42.0);
        label0.setLayoutY(94.0);
        label0.setText("Booking Date");
        label0.setTextFill( Color.valueOf("#c50bdd"));
        label0.setFont(new Font("System Bold", 20.0));

        label1.setLayoutX(54.0);
        label1.setLayoutY(231.0);
        label1.setText("duration");
        label1.setTextFill( Color.valueOf("#c50bdd"));
        label1.setFont(new Font("System Bold", 20.0));

        label2.setLayoutX(56.0);
        label2.setLayoutY(304.0);
        label2.setText("Staff Id");
        label2.setTextFill( Color.valueOf("#c50bdd"));
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
        label3.setTextFill( Color.valueOf("#c50bdd"));
        label3.setFont(new Font("System Bold", 20.0));

        label4.setLayoutX(48.0);
        label4.setLayoutY(382.0);
        label4.setText("Service Id");
        label4.setTextFill( Color.valueOf("#c50bdd"));
        label4.setFont(new Font("System Bold", 20.0));

        button.setLayoutX(449.0);
        button.setLayoutY(509.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(40.0);
        button.setPrefWidth(85.0);
        button.setText("Delete");

        label5.setLayoutX(49.0);
        label5.setLayoutY(451.0);
        label5.setText("Customer Id");
        label5.setTextFill( Color.valueOf("#c50bdd"));
        label5.setFont(new Font("System Bold", 20.0));

        button0.setLayoutX(318.0);
        button0.setLayoutY(509.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(85.0);
        button0.setText("Update");

        button1.setLayoutX(192.0);
        button1.setLayoutY(509.0);
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

        datePicker.setLayoutX(239.0);
        datePicker.setLayoutY(89.0);
        datePicker.setPrefHeight(40.0);
        datePicker.setPrefWidth(292.0);
        datePicker.setPromptText("Booking Date");
        datePicker.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        datePicker.setFont(new Font("System Bold", 16.0));


        comboBox.setLayoutX(243.0);
        comboBox.setLayoutY(307.0);
        comboBox.setPrefHeight(45.0);
        comboBox.setPrefWidth(152.0);
        comboBox.setPromptText("StaffId");
        
        
        comboBox0.setLayoutX(243.0);
        comboBox0.setLayoutY(377.0);
        comboBox0.setPrefHeight(40.0);
        comboBox0.setPrefWidth(152.0);
        comboBox0.setPromptText("ServiceId");

        comboBox1.setLayoutX(243.0);
        comboBox1.setLayoutY(446.0);
        comboBox1.setPrefHeight(40.0);
        comboBox1.setPrefWidth(152.0);
        comboBox1.setPromptText("CustomerId");

        label6.setLayoutX(464.0);
        label6.setLayoutY(310.0);
        label6.setPrefHeight(40.0);
        label6.setPrefWidth(200.0);
        label6.setText("");
        label6.setTextFill( Color.valueOf("#ff00dd"));
        label6.setFont(new Font(16.0));
         
         warning.setLayoutX(500);
         warning.setLayoutY(509);
        
         warning.setText("");
         warning.setTextFill( Color.valueOf("#ff00dd"));
         warning.setFont(new Font("System Bold",20.0));
         
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

        comboBox.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        comboBox0.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
        comboBox1.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");

        
        pane.getChildren().add(bookid);
        pane.getChildren().add(duration);
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(booktime);
        pane.getChildren().add(label3);
        pane.getChildren().add(label4);
        pane.getChildren().add(button);
        pane.getChildren().add(label5);
        pane.getChildren().add(button0);
        pane.getChildren().add(button1);
        pane.getChildren().add(load);
        pane.getChildren().add(datePicker);
        pane.getChildren().add(comboBox);
        pane.getChildren().add(warning);
        pane.getChildren().add(comboBox0);
        pane.getChildren().add(comboBox1);
        pane.getChildren().add(label6);
        pane.getChildren().add(label7);
        pane.getChildren().add(label8);
        anchorpane.getChildren().add(pane);
        pane.setPrefWidth(885.0);
        pane.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
	
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
				
				if (!(bookid.getText().length()==0||bookid.getText()==null))
				{ PreparedStatement create = getConnection()
				.prepareStatement(
						"SELECT * FROM APPOINTMENT WHERE bookingID = \""+ bookid.getText()+"\"");

				ResultSet Result = create.executeQuery();
				Result.next();
				
				bookid.setText(Result.getString("bookingID"));
				datePicker.setText(Result.getString("bookingdate"));
				booktime.setText(Result.getString("bookingTime"));
				duration.setText(Result.getString("duration"));
				comboBox.setValue(Result.getString("staffID"));
				comboBox0.setValue(Result.getString("serviceID"));
				comboBox1.setValue(Result.getString("custId"));
				warning.setText("");
				
				
				}} catch (Exception a) {}

		});}
	public void delete (Stage stage) {
		
		button.setOnAction(e->{
			if(bookid.getText()==null || bookid.getText().length()==0) {
				
			} else {
			
			String STR1= "DELETE FROM APPOINTMENT WHERE bookingid =\""+bookid.getText()+"\";";
			PreparedStatement create;
			
			stage.close();
			bookid.setText("");
			datePicker.setText("");
			booktime.setText("");
			duration.setText("");
			comboBox.getSelectionModel().select("Not used");;
			comboBox0.getSelectionModel().select("Not used");;
			comboBox1.getSelectionModel().select("Not used");;
			warning.setText("");

	
			try {
				create = getConnection()
						.prepareStatement(STR1);
			 create.executeUpdate();
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
				if(bookid.getText().length()==0 || datePicker.getText().length()==0 || booktime.getText().length()==0   || duration.getText().toString().length()==0 
				 || comboBox.getValue().toString().compareTo("Not used")==0|| comboBox1.getValue().toString().compareTo("Not used")==0 || comboBox0.getValue().toString().compareTo("Not used")==0
|| bookid.getText().toString()==null || datePicker.getText()==null || booktime.getText().toString()==null||duration.getText().toString()==null  )

				{
					warning.setText("All Fields are required");///////////////
				
				} else {
					
				warning.setText("");
				
				
					String STR1 = "UPDATE APPOINTMENT SET bookingID=\""+bookid.getText()+"\" ,bookingDate=\""+datePicker.getText().toString()+"\" , bookingTime= \""+ booktime.getText().toString()
					+"\" , duration="+duration.getText()+" , staffID=\"" + comboBox.getValue().toString() +"\" , serviceID= \""+ comboBox0.getValue().toString() + "\" , custID= \""+ comboBox1.getValue().toString()+"\" WHERE bookingID =\""
					+bookid.getText()+"\";";
					
					System.out.println(STR1);
					PreparedStatement create = getConnection()
							.prepareStatement(STR1);
					 create.executeUpdate();
					 stage.close();
					 	bookid.setText("");
						datePicker.setText("");
						booktime.setText("");
						duration.setText("");
						comboBox.getSelectionModel().select("Not used");;
						comboBox0.getSelectionModel().select("Not used");;
						comboBox1.getSelectionModel().select("Not used");;
						warning.setText("");

			}}
			catch(Exception et) {}

			
			
		});
	}

	public void insert(Stage stage) {
		button1.setOnAction(e->{
			try {
				warning.setText("");
				if(bookid.getText().length()==0 || datePicker.getText().length()==0 || booktime.getText().length()==0   || duration.getText().toString().length()==0 
						 || comboBox.getValue().toString().compareTo("Not used")==0|| comboBox1.getValue().toString().compareTo("Not used")==0 || comboBox0.getValue().toString().compareTo("Not used")==0
		|| bookid.getText().toString()==null || datePicker.getText()==null || booktime.getText().toString()==null||duration.getText().toString()==null  )

				{
					warning.setText("All Fields are required");///////////////
					}
				else {
					
					String str1 = "SELECT custID FROM APPOINTMENT WHERE bookingDate= \""+datePicker+"\" AND bookingTime=\""+booktime+"\";";
					String str2 = "SELECT staffID FROM APPOINTMENT WHERE bookingDate= \""+datePicker+"\" AND bookingTime=\""+booktime+"\";";
					
					
					PreparedStatement pr = getConnection().prepareStatement(str1);
					PreparedStatement pr1 = getConnection().prepareStatement(str2);
					
					ResultSet Result = pr.executeQuery();
					ResultSet Result1 = pr1.executeQuery();
					boolean bool = true;
					while(Result.next()&& bool) {
						if(comboBox1.getValue().toString().compareTo(Result.getString("staffId"))==0) {
							bool = false;
						}
					}
					while(Result1.next()&& bool) {
						if(comboBox.getValue().toString().compareTo(Result.getString("custId"))==0) {
							bool = false;
						}
					}
				
					/*ObservableList<String> list = buildData("SELECT custID FROM APPOINTMENT WHERE bookingDate= \""+datePicker+"\" AND bookingTime=\""+booktime+"\";");
					ObservableList<String> list1 = buildData("SELECT staffID FROM APPOINTMENT WHERE bookingDate= \""+datePicker+"\" AND bookingTime=\""+booktime+"\";");

					int i =0;
				
					boolean bool =true;
					
			
					while(i <list.size() && bool)
					{	if(!list.isEmpty())
						if(list.get(i).toString().compareTo(comboBox1.getValue().toString())==0) {
							warning.setText("Conflict");
							bool = false;
							System.out.print(1);

						} else {
							System.out.print(0);
						}
					i++;
					}
					i=0;
					while(i <list1.size() && bool) {
					if(!list1.isEmpty())
						if(list1.get(i).toString().compareTo(comboBox.getValue().toString())==0) {
							warning.setText("Conflict");
							bool = false;
							System.out.print(3);

						}else {
							System.out.print(4);

						}
						i++;
				}*/
					
					if(bool)
					 {
				
				String STR ="INSERT INTO APPOINTMENT VALUES ("+ "\""+	bookid.getText()+"\", \""+ datePicker.getText()+"\" , \""
				+booktime.getText()+"\" , "+duration.getText() + ",\""+ comboBox.getValue().toString()
				+ "\",\""+ comboBox0.getValue().toString()+ "\" ,\""+ comboBox1.getValue().toString()+"\");";
				System.out.println(STR);
				PreparedStatement create = getConnection()
						.prepareStatement(STR);
				 create.executeUpdate();
				 
				
					stage.close();
					bookid.setText("");
					datePicker.setText("");
					booktime.setText("");
					duration.setText("");
					comboBox.getSelectionModel().select("Not used");;
					comboBox0.getSelectionModel().select("Not used");;
					comboBox1.getSelectionModel().select("Not used");;
					warning.setText("");

				}}} catch (SQLException e1) {
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
	public ComboBox comboStaff() {
		return comboBox;
	}
	 public ComboBox getCust() {
		 return comboBox1;
	 }
	 public ComboBox getSer() {
		 return comboBox0;
	 }
}
