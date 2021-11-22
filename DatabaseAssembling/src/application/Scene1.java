package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Scene1 {
	Label label1;
	String StaffId;
	StringBuilder name;
	StringBuilder position;
	AnchorPane anchorpanea;
	Pane Pane1a;
	TextField username;
	PasswordField passwordtf;
	ImageView imageViewa;
	ImageView imageView0a;
	Label labela;
	Button buttona;
	Scene scene1;
	boolean isManager;
	private ObservableList<ObservableList> data;

	ImageView imageView1a = new ImageView();

	public Scene1() {

		isManager = false;
		StaffId = null;
		label1 = new Label("");

		buttona = new Button();
		labela = new Label();
		imageView0a = new ImageView();
		imageViewa = new ImageView();
		passwordtf = new PasswordField();
		username = new TextField();
		position = new StringBuilder();
		name = new StringBuilder();
		Pane1a = new Pane();
		anchorpanea = new AnchorPane();
		anchorpanea = new AnchorPane();
		anchorpanea.setPrefHeight(500);
		anchorpanea.setPrefWidth(830);

		Pane1a.setLayoutX(400);
		Pane1a.setLayoutY(45);
		Pane1a.setPrefHeight(420);
		Pane1a.setPrefWidth(410);
		Pane1a.setStyle("-fx-background-color: white; -fx-background-radius: 15;");

		username.setLayoutX(40);
		username.setLayoutY(100);
		username.setPrefHeight(50);
		username.setPrefWidth(305);
		username.setPromptText("User ID");
		username.setStyle(
				"-fx-border-color:  #EC2590; -fx-border-width: 2; -fx-border-radius: 20; -fx-background-radius: 22;");
		username.setFont(new Font("System Bold", 18));

		passwordtf.setLayoutX(40);
		passwordtf.setLayoutY(185);
		passwordtf.setPrefHeight(50);
		passwordtf.setPrefWidth(305);
		passwordtf.setPromptText("Password");
		passwordtf.setStyle(
				"-fx-border-color:  #EC2590; -fx-border-width: 2; -fx-background-radius: 22; -fx-border-radius: 20;");
		passwordtf.setFont(new Font("System Bold", 18));

		imageViewa.setFitWidth(25);
		imageViewa.setLayoutX(355);
		imageViewa.setLayoutY(110);
		imageViewa.setOpacity(0.5);
		imageViewa.setPickOnBounds(true);
		imageViewa.setPreserveRatio(true);
		imageViewa.setImage(new Image(getClass().getResource("user.png").toExternalForm()));

		imageView0a.setFitWidth(25);
		imageView0a.setLayoutX(355);
		imageView0a.setLayoutY(195);
		imageView0a.setOpacity(0.5);
		imageView0a.setPickOnBounds(true);
		imageView0a.setPreserveRatio(true);
		imageView0a.setImage(new Image(getClass().getResource("key.png").toExternalForm()));

		labela.setLayoutX(47);
		labela.setLayoutY(37);
		labela.setPrefHeight(35);
		labela.setPrefWidth(292);
		labela.setText("Enter Credentials");
		labela.setTextFill(Color.valueOf("#c50bdd"));
		labela.setFont(new Font("Berlin Sans FB Demi Bold", 25));

		buttona.setLayoutX(232);
		buttona.setLayoutY(270);

		buttona.setPrefHeight(45);
		buttona.setPrefWidth(113);
		buttona.setText("LOGIN");

		label1.setLayoutX(500.0);
		label1.setLayoutY(400.0);
		label1.setTextFill(Color.RED);

		label1.setTextAlignment(TextAlignment.CENTER);
		/* text.setWrappingWidth(182.13671875); */
		label1.setFont(new Font("System Bold", 12.0));

		imageView1a.setFitHeight(225);
		imageView1a.setFitWidth(360);
		imageView1a.setLayoutX(14);
		imageView1a.setLayoutY(176);
		imageView1a.setPickOnBounds(true);
		imageView1a.setPreserveRatio(true);
		imageView1a.setImage(new Image(getClass().getResource("back.png").toExternalForm()));

		Pane1a.getChildren().add(username);
		Pane1a.getChildren().add(passwordtf);
		Pane1a.getChildren().add(imageViewa);
		Pane1a.getChildren().add(imageView0a);
		Pane1a.getChildren().add(labela);
		Pane1a.getChildren().add(buttona);

		anchorpanea.getChildren().add(Pane1a);
		anchorpanea.getChildren().add(label1);
		anchorpanea.getChildren().add(imageView1a);
		anchorpanea.setStyle("-fx-background-color: purple ");
		scene1 = new Scene(anchorpanea);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	}

	public AnchorPane getAnchorPane() {

		return anchorpanea;
	}

	public Scene getScene() {

		return scene1;
	}

	public Button getButton() {
		return buttona;
	}

	public TextField getUsername() {
		return username;
	}

	public PasswordField getPassword() {
		return passwordtf;
	}

	public Label getLabel() {
		return labela;
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

	public void workButton(Menu Menub, Stage primaryStage,Scene scene2 , boolean [] arr, Scene3 scene3a, Scene3Prod scene3c, Scene3SUPP scene3d ){
		passwordtf.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent keyEvent) {
				if (keyEvent.getCode() == KeyCode.ENTER)  {
					sendFunction(Menub,primaryStage,scene2,arr,scene3a,scene3c,scene3d);
				}
			}
		});
		getButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				sendFunction(Menub,primaryStage,scene2,arr,scene3a,scene3c,scene3d);
			}
		});
	}
	public void sendFunction(Menu Menub, Stage primaryStage,Scene scene2 , boolean [] arr, Scene3 scene3a, Scene3Prod scene3c, Scene3SUPP scene3d ){
		try{
			if(buildData("SELECT password FROM STAFF WHERE staffid =\""+username.getText()+"\";").size()==0) {
				label1.setText("Wrong username");
			}
			else {
				String password =
						buildData("SELECT password FROM STAFF WHERE staffid =\""+username.getText()+"\";").get(0);
				if(password.compareTo(passwordtf.getText().toString())==0) {
					String position  = buildData("SELECT position FROM STAFF WHERE staffid =\""+username.getText()+"\";").get(0);
					isManager = position.toLowerCase().compareTo("manager")==0;
					arr[0] = isManager;
					String str;
					if(isManager) 
						str= "SELECT * FROM STAFF;";
					else 
						str="SELECT staffID, fname,lName, staffPhoneNb, address, gender, salary, position FROM STAFF;";

					scene3a.getTableView().getColumns().clear();
					scene3a.getTableView().getItems().clear();
					buildData(str, scene3a.getTableView());
					if(!isManager) {
						scene3a.toDisable().setDisable(true);
						scene3c.toDisable().setDisable(true);
						scene3d.toDisable().setDisable(true);
						scene3a.refresh(str);
					}else{
						scene3a.toDisable().setDisable(false);
						scene3c.toDisable().setDisable(false);
						scene3d.toDisable().setDisable(false);
						scene3a.refresh(str);
					}
					primaryStage.setScene(scene2);
					Menub.setText(buildData("SELECT fName FROM STAFF WHERE staffid =\""+username.getText()+"\";").get(0)
							+" "+ buildData("SELECT lName FROM STAFF WHERE staffid =\""+username.getText()+"\";").get(0));

				} 
				else {
					label1.setText("Wrong password");
					passwordtf.setText("");
				}
			}

		}catch(Exception ex) {
		}
	}

	public ObservableList<String> buildData(String SQL) {
		Connection c;

		ObservableList<String> st = FXCollections.observableArrayList();
		try {

			c = getConnection();
			// SQL FOR SELECTING ALL OF CUSTOMER

			// ResultSet
			ResultSet rs = c.createStatement().executeQuery(SQL);

			while (rs.next()) {
				// Iterate Row
				{// Iterate Column
					if (rs.getString(1) == null || rs.getString(1).isEmpty())
						st.add("NULL");
					else
						st.add(rs.getString(1));
				}
			}

			return st;

		} catch (Exception e) {

		}
		return st;
	}

	public String StaffLoggedIn() {
		return StaffId;
	}

	public void buildData(String SQL, TableView tableview) {
		Connection c;
		data = FXCollections.observableArrayList();
		try {
			c = getConnection();
			// SQL FOR SELECTING ALL OF CUSTOMER

			// ResultSet
			ResultSet rs = c.createStatement().executeQuery(SQL);

			/**********************************
			 * TABLE COLUMN ADDED DYNAMICALLY *
			 **********************************/
			for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
				// We are using non property style for making dynamic table
				final int j = i;
				TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
				col.setCellValueFactory(
						new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
							public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
								return new SimpleStringProperty(param.getValue().get(j).toString());
							}
						});

				tableview.getColumns().addAll(col);
				System.out.println("Column [" + i + "] ");
			}

			/********************************
			 * Data added to ObservableList *
			 ********************************/
			while (rs.next()) {
				// Iterate Row
				ObservableList<String> row = FXCollections.observableArrayList();
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					// Iterate Column
					if (rs.getString(i) == null || rs.getString(i).isEmpty())
						row.add("NULL");
					else
						row.add(rs.getString(i));
				}
				System.out.println("Row [1] added " + row);
				data.add(row);

			}

			// FINALLY ADDED TO TableView
			tableview.setItems(data);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error on Building Data");
		}
	}
}
