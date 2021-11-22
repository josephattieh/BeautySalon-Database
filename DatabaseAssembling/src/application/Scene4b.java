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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scene4b {
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
	Label staff;
	ComboBox pass;
	Label label7;
	AnchorPane anchorpane = new AnchorPane();    
	Pane pane;
	Label warning;
	public Scene4b() {
		button1 = new Button();
		button0 = new Button();
		button2 = new Button();
		label7 = new Label();

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



		pass = new ComboBox(buildData("SELECT staffId FROM STAFF;"));
		pass.getSelectionModel().select("Not used");
		pass.setLayoutX(235.0);
		pass.setLayoutY(380.0);
		pass.setPrefHeight(45.0);
		pass.setPrefWidth(300.0);
		pass.setPromptText("Staff Id");
		pass.setStyle("-fx-background-radius: 22; -fx-border-color: #c50bdd; -fx-border-radius: 20; -fx-border-width: 2;");
		staff = new Label("");
		staff.setLayoutX(235.0);
		staff.setLayoutY(430.0);

		staff.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		staff.setFont(new Font("System Bold", 20.0));
		pass.valueProperty().addListener(e->{
			if(pass.getValue().toString().compareTo("Not used")==0) {
				staff.setText("");
			}else
				staff.setText(buildData("SELECT Fname FROM STAFF WHERE staffID=\""+ pass.getValue().toString()+"\";").get(0)+" "+ buildData("SELECT lName FROM STAFF WHERE staffID=\""+pass.getValue().toString()+"\";").get(0));
		});
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
		anchorpane.setPrefWidth(990.0);
		anchorpane.setStyle("-fx-background-color: #c50bdd;");

		pane.setLayoutX(50.0);
		pane.setLayoutY(55.0);
		pane.setPrefHeight(580.0);
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
		label.setText("Customer ID");
		label.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label.setFont(new Font("System Bold", 20.0));

		label0.setLayoutX(43.0);
		label0.setLayoutY(84.0);
		label0.setText("First Name ");
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

		label3.setLayoutX(43.0);
		label3.setLayoutY(308.0);
		label3.setText("Gender");
		label3.setTextFill(javafx.scene.paint.Color.valueOf("#c50bdd"));
		label3.setFont(new Font("System Bold", 20.0));

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

		radioButton.setText("Male");
		radioButton.setFont(new Font(18.0));

		radioButton0.setLayoutX(335.0);
		radioButton0.setLayoutY(309.0);

		radioButton0.setText("Female");
		radioButton0.setFont(new Font(18.0));


		button1.setLayoutX(209.0);
		button1.setLayoutY(520.0);


		button1.setPrefHeight(40.0);
		button1.setPrefWidth(85.0);
		button1.setText("Insert");


		button2.setLayoutX(358.0);
		button2.setLayoutY(520.0);

		button2.setPrefHeight(40.0);
		button2.setPrefWidth(85.0);
		button2.setText("Update");

		button0.setLayoutX(503.0);
		button0.setLayoutY(520.0);
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
		pane.getChildren().add(staff);

		pane.getChildren().add(cusaddress);
		pane.getChildren().add(cusname1);
		pane.getChildren().add(label5);

		pane.getChildren().add(radioButton);
		pane.getChildren().add(radioButton0);

		pane.getChildren().add(label7);
		pane.getChildren().add(pass);

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
						"SELECT * FROM CUSTOMER WHERE custId = \""+ cusid.getText()+"\" ;");
				/*	if (!(pass.getValue().toString().length()==0||pass.getValue().toString()==null))
				{

				}*/
				ResultSet Result = create.executeQuery();

				Result.next();

				cusid.setText(Result.getString("custID"));
				pass.setValue(Result.getString("StaffID"));
				cusname.setText(Result.getString("fName"));
				cusname1.setText(Result.getString("lName"));
				cusaddress.setText(Result.getString("address"));
				cusphone.setText(Result.getString("custPhoneNb"));
				if(Result.getString("gender").compareTo("F")==0)
				{radioButton0.setSelected(true);
				radioButton.setSelected(false);
				}
				else
				{radioButton.setSelected(true);
				radioButton0.setSelected(false);
				
				}
				
				}} catch (Exception a) {}

		});}
	public void delete (Stage stage, ComboBox cust, ComboBox cust1,  ComboBox cust2 , ComboBox cust3 ) {

		button0.setOnAction(e->{
			if(cusid.getText()==null || cusid.getText().length()==0) {
				
			} else {
				
				String STR1= "DELETE FROM CUSTOMER WHERE custId =\""+cusid.getText()+"\";";
				PreparedStatement create,create1,create3;
				String STR0 = "UPDATE ORDER_DATA SET custID=\"C000\" WHERE custID=\""+cusid.getText()+"\";";
				String STR2 = "UPDATE APPOINTMENT SET custID=\"C000\" WHERE custID=\""+cusid.getText()+"\";";

				stage.close();
				pass.getSelectionModel().select("Not used");
				cusname.setText("");
				cusname1.setText("");
				cusaddress.setText("");
				Name.setText("");
				cusid.setText("");
				cusphone.setText("");


				radioButton.setSelected(false);
				radioButton0.setSelected(false);
				
				stage.close();
				try {
					create = getConnection()
							.prepareStatement(STR0);
					create.executeUpdate();
					create1 = getConnection()
							.prepareStatement(STR2);
					create3 = getConnection()
							.prepareStatement(STR1);
					create1.executeUpdate();
					create3.executeUpdate();
					
					cust.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust1.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust2.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust3.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));

				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}});


	}
	public void update (Stage stage , ComboBox cust , ComboBox cust1, ComboBox cust2,ComboBox cust3) {

		button2.setOnAction(e->{

			try{

				if(cusid.getText().length()==0 || cusname.getText().length()==0 || cusname1.getText().length()==0|| cusphone.getText().length()==0
						||cusaddress.getText().length()==0 || pass.getValue().toString().compareTo("Not used")==0
                      || cusid.getText()==null || cusname.getText()==null || cusname1.getText()==null || cusphone.getText()==null
						||cusaddress.getText()==null  )
				{
					warning.setText("All Fields are required");///////////////

				} else {
					warning.setText("");
					String gg;
					if(radioButton.isSelected())
						gg="M";
					else gg="F";

					String STR1 = "UPDATE CUSTOMER SET custid=\""+cusid.getText()+"\" ,StaffId=\""+pass.getValue().toString()+"\" , fname= \""+ cusname.getText()+"\" , lname=\""+cusname1.getText()+
							"\" , address=\"" + cusaddress.getText()+"\" ,custPhoneNb =" +cusphone.getText() +" , gender=\"" + gg +"\" WHERE custId =\""+
							cusid.getText()+"\";";

					System.out.println(STR1);
					PreparedStatement create = getConnection()
							.prepareStatement(STR1);
					create.executeUpdate();
					
					pass.setValue("Not used");
					cusname.setText("");
					cusname1.setText("");
					cusaddress.setText("");

					cusphone.setText("");

					radioButton.setSelected(false);
					radioButton0.setSelected(false);
					cust.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId; "));
					cust1.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust2.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust3.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));

					stage.close();

				}}
			catch(Exception et) {}



		});
	}

	public void insert(Stage stage , ComboBox cust , ComboBox cust1, ComboBox cust2 , ComboBox cust3) {
		button1.setOnAction(e->{
			try {

				if(cusid.getText().length()==0 || cusname.getText().length()==0 || cusname1.getText().length()==0|| cusphone.getText().length()==0
						||cusaddress.getText().length()==0 ||
								pass.getValue().toString().compareTo("Not used")==0 ||
						cusid.getText()==null || cusname.getText()==null || cusname1.getText()==null || cusphone.getText()==null
						||cusaddress.getText()==null    || pass.getValue().toString().compareTo("Not used")==0)
				{
					warning.setText("All Fields are required");///////////////
				}
				else {
					warning.setText(" ");
					String gg;
					if(radioButton.isSelected())
						gg="M";
					else gg="F";
					String STR ="INSERT INTO CUSTOMER VALUES ("+ "\""+	cusid.getText()+"\", \""+ cusname.getText()+"\" , \""+cusname1.getText()+"\" , "+
							cusphone.getText() + ",\""+ cusaddress.getText()+"\" , \""+ gg +"\" , "+ "\""+pass.getValue().toString()+"\");";
					System.out.println(STR);
					PreparedStatement create = getConnection()
							.prepareStatement(STR);
					create.executeUpdate();
					
					pass.getSelectionModel().select("Not used");
					cusname.setText("");
					cusname1.setText("");
					cusaddress.setText("");

					cusphone.setText("");


					radioButton.setSelected(false);
					radioButton0.setSelected(false);
					cust.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust1.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust2.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));
					cust3.setItems(buildData("SELECT custId FROM CUSTOMER ORDER BY custId;"));

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
	public ComboBox ComboStaff() {
		return pass;
	}
}
