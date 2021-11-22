package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Scene3SUPP {

	private ObservableList<ObservableList> data;
	Pane pane;
	Button button;
	Button button0;
	Button button1;
	Button button3;
	Button button2;
	ImageView imageView;
	ImageView imageView0;
	ImageView imageView1;
	ImageView imageView2;
	ImageView imageView3;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem;
	ImageView imageView4;
	MenuItem menuItem0;
	ImageView imageView5;
	MenuItem menuItem1;
	ImageView imageView6;
	private TableView tableview;
	Text text;
	Scene scene3;
	AnchorPane pp;
	TextField searchname = new TextField();

	public Scene3SUPP() {
		button3 = new Button();
		pp = new AnchorPane();
		pane = new Pane();
		button = new Button();
		button0 = new Button();
		button1 = new Button();
		button2 = new Button();
		imageView = new ImageView();
		imageView0 = new ImageView();
		imageView1 = new ImageView();
		imageView2 = new ImageView();
		imageView3 = new ImageView();
		menuBar = new MenuBar();
		menu = new Menu();
		menuItem = new MenuItem();
		imageView4 = new ImageView();
		menuItem0 = new MenuItem();
		imageView5 = new ImageView();
		menuItem1 = new MenuItem();
		imageView6 = new ImageView();
		tableview = new TableView();

		text = new Text();
		pp.setPrefHeight(498.0);
		pp.setPrefWidth(825.0);
		pp.setStyle("-fx-background-color: #bf00ff;");

		pane.setLayoutX(638.0);
		pane.setLayoutY(33.0);
		pane.setPrefHeight(435.0);
		pane.setPrefWidth(164.0);
		pane.setStyle("-fx-background-color: white;  -fx-background-radius: 15;");

		button.setAlignment(Pos.BASELINE_LEFT);
		button.setLayoutX(26.0);
		button.setLayoutY(36.0);
		button.setMnemonicParsing(false);
		button.setPrefHeight(56.0);
		button.setPrefWidth(108.0);
		button.setText("Search");
		button.setTextAlignment(TextAlignment.CENTER);
		button.setWrapText(true);

		button0.setAlignment(Pos.BASELINE_LEFT);
		button0.setLayoutX(26.0);
		button0.setLayoutY(125.0);
		button0.setMnemonicParsing(false);
		button0.setPrefHeight(56.0);
		button0.setPrefWidth(108.0);
		button0.setText("Edit");
		button0.setTextAlignment(TextAlignment.CENTER);
		button0.setWrapText(true);

		button1.setAlignment(Pos.BASELINE_LEFT);
		button1.setLayoutX(26.0);
		button1.setLayoutY(218.0);
		
		button1.setPrefHeight(56.0);
		button1.setPrefWidth(108.0);
		button1.setText("Refresh");
		button1.setTextAlignment(TextAlignment.CENTER);
		button1.setWrapText(true);
		
		button3.setAlignment(Pos.BASELINE_LEFT);
		button3.setLayoutX(26.0);
		button3.setLayoutY(311.0);
		
		button3.setPrefHeight(56.0);
		button3.setPrefWidth(108.0);
		button3.setText("Back");
		button3.setTextAlignment(TextAlignment.CENTER);
		button3.setWrapText(true);

	/*	button2.setAlignment(Pos.BASELINE_LEFT);
		button2.setLayoutX(28.0);
		button2.setLayoutY(308.0);
		button2.setMnemonicParsing(false);
		button2.setPrefHeight(56.0);
		button2.setPrefWidth(108.0);
		button2.setText("Delete");
		button2.setTextAlignment(TextAlignment.CENTER);
		button2.setWrapText(true);*/

		imageView.setFitHeight(25.0);
		imageView.setFitWidth(25.0);
		imageView.setLayoutX(88.0);
		imageView.setLayoutY(52.0);
		imageView.setPickOnBounds(true);
		imageView.setPreserveRatio(true);
		imageView.setImage(new Image(getClass().getResource("14173-200.png").toExternalForm()));

		imageView0.setFitHeight(41.0);
		imageView0.setFitWidth(42.0);
		imageView0.setLayoutX(79.0);
		imageView0.setLayoutY(226.0);
		imageView0.setPickOnBounds(true);
		imageView0.setPreserveRatio(true);
		imageView0.setImage(new Image(getClass().getResource("refresh.png").toExternalForm()));
		
		imageView1.setFitHeight(41.0);
		imageView1.setFitWidth(42.0);
		imageView1.setLayoutX(79.0);
		imageView1.setLayoutY(311.0);
		imageView1.setPickOnBounds(true);
		imageView1.setPreserveRatio(true);
		imageView1.setImage(new Image(getClass().getResource("backb.png").toExternalForm()));

		/*imageView1.setFitHeight(34.0);
		imageView1.setFitWidth(34.0);
		imageView1.setLayoutX(84.0);
		imageView1.setLayoutY(319.0);
		imageView1.setPickOnBounds(true);
		imageView1.setPreserveRatio(true);
		imageView1.setImage(new Image(getClass().getResource("delete.png").toExternalForm()));
*/
		imageView2.setFitHeight(25.0);
		imageView2.setFitWidth(34.0);
		imageView2.setLayoutX(82.0);
		imageView2.setLayoutY(141.0);
		imageView2.setPickOnBounds(true);
		imageView2.setPreserveRatio(true);
		imageView2.setImage(new Image(getClass().getResource("delete.png").toExternalForm()));

		imageView3.setFitHeight(102.0);
		imageView3.setFitWidth(223.0);
		imageView3.setLayoutX(32.0);
		imageView3.setLayoutY(34.0);
		imageView3.setPickOnBounds(true);
		imageView3.setPreserveRatio(true);
		imageView3.setImage(new Image(getClass().getResource("back.png").toExternalForm()));

		AnchorPane.setLeftAnchor(menuBar, 0.0);
		AnchorPane.setRightAnchor(menuBar, 0.0);
		AnchorPane.setTopAnchor(menuBar, -5.0);
		menuBar.setLayoutY(-5.0);
		menuBar.setStyle("-fx-background-color: #EC2590;");

		menu.setMnemonicParsing(false);
		menu.setText("John Smith");

		menuItem.setMnemonicParsing(false);
		menuItem.setText("Edit info");

		imageView4.setFitHeight(15.0);
		imageView4.setFitWidth(20.0);
		imageView4.setPickOnBounds(true);
		imageView4.setPreserveRatio(true);
		imageView4.setImage(new Image(getClass().getResource("600px-Black_pencil.svg.png").toExternalForm()));
		menuItem.setGraphic(imageView4);

		menuItem0.setMnemonicParsing(false);
		menuItem0.setText("Edit password");

		imageView5.setFitHeight(15.0);
		imageView5.setFitWidth(20.0);
		imageView5.setPickOnBounds(true);
		imageView5.setPreserveRatio(true);
		imageView5.setImage(new Image(getClass().getResource("key.png").toExternalForm()));
		menuItem0.setGraphic(imageView5);

		menuItem1.setMnemonicParsing(false);
		menuItem1.setText("Log out");

		imageView6.setFitHeight(15.0);
		imageView6.setFitWidth(20.0);
		imageView6.setPickOnBounds(true);
		imageView6.setPreserveRatio(true);
		imageView6.setImage(new Image(getClass().getResource("2000px-Reset_button.svg.png").toExternalForm()));
		menuItem1.setGraphic(imageView6);

		tableview.setLayoutX(32.0);
		tableview.setLayoutY(135.0);
		tableview.setPrefHeight(333.0);
		tableview.setPrefWidth(597.0);

		text.setLayoutX(388.0);
		text.setLayoutY(91.0);
		text.setStrokeType(StrokeType.OUTSIDE);
		text.setStrokeWidth(0.0);
		text.setText("SUPPLIERS");
		text.setFill(Color.WHITE);
		text.setFont(new Font(28.0));

		pane.getChildren().add(button);
		pane.getChildren().add(button0);
		pane.getChildren().add(button1);
		pane.getChildren().add(button3);

		pane.getChildren().add(imageView);
		pane.getChildren().add(imageView0);
		pane.getChildren().add(imageView1);
		pane.getChildren().add(imageView2);
		pp.getChildren().add(pane);
		pp.getChildren().add(imageView3);
		menu.getItems().add(menuItem);
		menu.getItems().add(menuItem0);
		menu.getItems().add(menuItem1);
		 
		pp.getChildren().add(menuBar);
		pp.getChildren().add(tableview);
		pp.getChildren().add(text);
		pp.setStyle("-fx-background-color: purple ");
		tableview.setStyle("-fx-background-radius: 15;");

		searchname.setLayoutX(60);
		searchname.setLayoutY(30);
		searchname.setPrefHeight(40);
		searchname.setPrefWidth(200);
		searchname.setPromptText("First name");
		searchname.setStyle(
				"-fx-border-color:  #EC2590; -fx-border-width: 2; -fx-border-radius: 20; -fx-background-radius: 22;");
		searchname.setFont(new Font("System Bold", 16));

		scene3 = new Scene(pp);
		scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	}

	public void LogOut(Scene1 scene1, Stage primaryStage) {
		menuItem1.setOnAction(e -> {
			primaryStage.setScene(scene1.getScene());
			scene1.getUsername().setText("");
			scene1.getPassword().setText("");
		});
	}

	public Pane getPane() {
		return pane;
	}

	public Button getButton() {
		return button;
	}

	public Button getButton0() {
		return button0;
	}

	public Button getButton1() {
		return button1;
	}

	public Button getButton2() {
		return button2;
	}

	public ImageView getImageView() {
		return imageView;
	}

	public ImageView getImageView0() {
		return imageView0;
	}

	public ImageView getImageView1() {
		return imageView1;
	}

	public ImageView getImageView2() {
		return imageView2;
	}

	public ImageView getImageView3() {
		return imageView3;
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

	public Menu getMenu() {
		return menu;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public ImageView getImageView4() {
		return imageView4;
	}

	public MenuItem getMenuItem0() {
		return menuItem0;
	}

	public ImageView getImageView5() {
		return imageView5;
	}

	public MenuItem getMenuItem1() {
		return menuItem1;
	}

	public ImageView getImageView6() {
		return imageView6;
	}

	public TableView getTableView() {
		return tableview;
	}

	public Text getText() {
		return text;
	}

	public AnchorPane getPp() {
		return pp;
	}

	public Scene getScene() {
		return scene3;
	}

	public TextField getSearchname() {
		return searchname;
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
	public void setTable (TableView table) {
		tableview=table;
	}
	public static Connection getConnection() throws Exception {
		try {
			String url = "jdbc:mysql://localhost:3306/BeautySalon";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}


	public Stage searchCustomer(Scene scene) {
     Stage stage = new Stage();
		
		button.setOnAction(e->{
			stage.setScene(scene);
			stage.show();
		});
		return stage;
	}
	public Stage jumpAddCust( Scene scene) {
		
		Stage stage = new Stage();
		
		button0.setOnAction(e->{
			stage.setScene(scene);
			stage.show();
		});
		return stage;
	}
	public void refresh () {
		button1.setOnAction(e->{
			getTableView().getColumns().clear();
			getTableView().getItems().clear();
			buildData("SELECT * FROM SUPPLIER ;",getTableView());
		});
	}
	public void getBack(Stage stage, Scene scene) {
		button3.setOnAction(e->{
			stage.setScene(scene);
		});
	}
	public Button toDisable() {
		return button0;
	}
	}

