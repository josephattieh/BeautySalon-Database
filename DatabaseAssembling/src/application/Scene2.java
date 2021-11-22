package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Scene2 {
	AnchorPane anchorpaneb = new AnchorPane();
	Pane pane1b = new Pane();
	Scene scene;
	Button buttonb = new Button();
	Button button0b= new Button();
	Button button1b = new Button();
	Button button2b = new Button();
	Button button3b = new Button();
	Button button4b = new Button();
	Button button5b = new Button();
	Button button6b = new Button();
	Button button7b = new Button();
	Button button8b = new Button();
	Button button9b = new Button();
	Button button10b = new Button();
	ImageView imageview10 = new ImageView();
	Text textb = new Text();
	Text text0b = new Text();
	Text text1b = new Text();
	ImageView imageViewb = new ImageView();
	ImageView imageView0b = new ImageView();
	
    MenuBar menuBarb = new MenuBar();
    Menu menub = new Menu();
    MenuItem menuItemb = new MenuItem();
    ImageView imageView1b = new ImageView();
    MenuItem menuItem0b = new MenuItem();
    ImageView imageView2b = new ImageView();
    MenuItem menuItem1b = new MenuItem();
    ImageView imageView3b = new ImageView();
    ImageView imageView4b = new ImageView();
    ImageView imageView5b = new ImageView();
    ImageView imageView6b = new ImageView();
    ImageView imageView7b = new ImageView();
    ImageView imageView8b = new ImageView();
    ImageView imageView9b = new ImageView();
    ImageView imageView10b = new ImageView();
    ImageView imageView11b = new ImageView();
    ImageView imageView12 = new ImageView();
    public Scene2() {
	anchorpaneb.setPrefHeight(498.0);
	anchorpaneb.setPrefWidth(825.0);
	anchorpaneb.setStyle("-fx-background-color:  #990099;");

	pane1b.setLayoutX(380.0);
	pane1b.setLayoutY(44.0);
	pane1b.setPrefHeight(430.0);
	pane1b.setPrefWidth(410.0);
	pane1b.setStyle("-fx-background-color: white; -fx-background-radius: 15; ");

	buttonb.setLayoutX(39.0);
    buttonb.setLayoutY(29.0);
    buttonb.setMnemonicParsing(false);
    buttonb.setPrefHeight(56.0);
    buttonb.setPrefWidth(338.0);
    buttonb.setText("Customers");
    buttonb.setTextAlignment(TextAlignment.CENTER);
    buttonb.setWrapText(true);

    button0b.setLayoutX(40.0);
    button0b.setLayoutY(92.0);
    button0b.setMnemonicParsing(false);
    button0b.setPrefHeight(56.0);
    button0b.setPrefWidth(338.0);
    button0b.setText("Staff");
    button0b.setTextAlignment( TextAlignment.CENTER);
    button0b.setWrapText(true);

    button1b.setLayoutX(39.0);
    button1b.setLayoutY(157.0);
    button1b.setMnemonicParsing(false);
    button1b.setPrefHeight(56.0);
    button1b.setPrefWidth(338.0);
    button1b.setText("Orders");
    button1b.setTextAlignment( TextAlignment.CENTER);
    button1b.setWrapText(true);

    button2b.setLayoutX(40.0);
    button2b.setLayoutY(222.0);
    button2b.setMnemonicParsing(false);
    button2b.setPrefHeight(56.0);
    button2b.setPrefWidth(338.0);
    button2b.setText("Products");
    button2b.setTextAlignment( TextAlignment.CENTER);
    button2b.setWrapText(true);

    button3b.setLayoutX(40.0);
    button3b.setLayoutY(285.0);
    button3b.setMnemonicParsing(false);
    button3b.setPrefHeight(56.0);
    button3b.setPrefWidth(338.0);
    button3b.setText("Suppliers");
    button3b.setTextAlignment( TextAlignment.CENTER);
    button3b.setWrapText(true);

    button4b.setLayoutX(40.0);
    button4b.setLayoutY(348.0);
    button4b.setMnemonicParsing(false);
    button4b.setPrefHeight(56.0);
    button4b.setPrefWidth(338.0);
    button4b.setText("Appointments");
    button4b.setTextAlignment( TextAlignment.CENTER);
    button4b.setWrapText(true);

	textb.setFill( Color.WHITE);
	textb.setLayoutX(105.0);
	textb.setLayoutY(169.0);
	textb.setStrokeType(StrokeType.OUTSIDE);
	textb.setStrokeWidth(0.0);
	textb.setText("Welcome !");
	textb.setFont(new Font("Book Antiqua Bold", 37.0));

	text0b.setFill( Color.WHITE);
	text0b.setLayoutX(76.0);
	text0b.setLayoutY(217.0);
	text0b.setStrokeType(StrokeType.OUTSIDE);
	text0b.setStrokeWidth(0.0);
	text0b.setText("Press a button");
	text0b.setFont(new Font("Book Antiqua Bold", 38.0));

	text1b.setFill(Color.WHITE);
	text1b.setLayoutX(92.0);
	text1b.setLayoutY(265.0);
	text1b.setStrokeType(StrokeType.OUTSIDE);
	text1b.setStrokeWidth(0.0);
	text1b.setText("to proceed");
	text1b.setFont(new Font("Book Antiqua Bold", 37.0));

	imageViewb.setFitHeight(41.0);
    imageViewb.setFitWidth(42.0);
    imageViewb.setLayoutX(93.0);
    imageViewb.setLayoutY(37.0);
    imageViewb.setPickOnBounds(true);
    imageViewb.setPreserveRatio(true);
    imageViewb.setImage(new Image(getClass().getResource("17962-200.png").toExternalForm()));

    imageView0b.setFitHeight(41.0);
    imageView0b.setFitWidth(42.0);
    imageView0b.setLayoutX(93.0);
    imageView0b.setLayoutY(165.0);
    imageView0b.setPickOnBounds(true);
    imageView0b.setPreserveRatio(true);
    imageView0b.setImage(new Image(getClass().getResource("101952-200.png").toExternalForm()));

    imageView1b.setFitHeight(41.0);
    imageView1b.setFitWidth(42.0);
    imageView1b.setLayoutX(93.0);
    imageView1b.setLayoutY(230.0);
    imageView1b.setPickOnBounds(true);
    imageView1b.setPreserveRatio(true);
    imageView1b.setImage(new Image(getClass().getResource("img_231353.png").toExternalForm()));

    imageView2b.setFitHeight(41.0);
    imageView2b.setFitWidth(42.0);
    imageView2b.setLayoutX(93.0);
    imageView2b.setLayoutY(293.0);
    imageView2b.setPickOnBounds(true);
    imageView2b.setPreserveRatio(true);
    imageView2b.setImage(new Image(getClass().getResource("poxpvjoyldqryjtvvegv.png").toExternalForm()));

    imageView3b.setFitHeight(41.0);
    imageView3b.setFitWidth(42.0);
    imageView3b.setLayoutX(93.0);
    imageView3b.setLayoutY(356.0);
    imageView3b.setPickOnBounds(true);
    imageView3b.setPreserveRatio(true);
    imageView3b.setImage(new Image(getClass().getResource("Agenda-512.png").toExternalForm()));

    imageView4b.setFitHeight(41.0);
    imageView4b.setFitWidth(42.0);
    imageView4b.setLayoutX(93.0);
    imageView4b.setLayoutY(105.0);
    imageView4b.setPickOnBounds(true);
    imageView4b.setPreserveRatio(true);
    imageView4b.setImage(new Image(getClass().getResource("download.png").toExternalForm()));

    

    imageView5b.setFitHeight(102.0);
    imageView5b.setFitWidth(223.0);
    imageView5b.setLayoutX(32.0);
    imageView5b.setLayoutY(34.0);
    imageView5b.setPickOnBounds(true);
    imageView5b.setPreserveRatio(true);
    imageView5b.setImage(new Image(getClass().getResource("back.png").toExternalForm()));
    
    imageView6b.setFitHeight(56.0);
    imageView6b.setFitWidth(321.0);
    imageView6b.setLayoutX(14.0);
    imageView6b.setLayoutY(233.0);
    imageView6b.setPickOnBounds(true);
    imageView6b.setPreserveRatio(true);
    imageView6b.setImage(new Image(getClass().getResource("coollogo_com-30375551.gif").toExternalForm()));
    
    imageView7b.setFitHeight(81.0);
    imageView7b.setFitWidth(282.0);
    imageView7b.setLayoutX(18.0);
    imageView7b.setLayoutY(294.0);
    imageView7b.setPickOnBounds(true);
    imageView7b.setPreserveRatio(true);
    imageView7b.setImage(new Image(getClass().getResource("coollogo_com-9187494.gif").toExternalForm()));

    
    AnchorPane.setLeftAnchor(menuBarb, 0.0);
    AnchorPane.setRightAnchor(menuBarb, 0.0);
    AnchorPane.setTopAnchor(menuBarb, -5.0);
    menuBarb.setLayoutY(-5.0);
    menuBarb.setStyle("-fx-background-color: #EC2590;");

    menub.setMnemonicParsing(false);
    
    

    menuItemb.setMnemonicParsing(false);
    menuItemb.setText("Edit info");

    imageView8b.setFitHeight(15.0);
    imageView8b.setFitWidth(20.0);
    imageView8b.setPickOnBounds(true);
    imageView8b.setPreserveRatio(true);
    imageView8b.setImage(new Image(getClass().getResource("Blackpen.png").toExternalForm()));
    menuItemb.setGraphic(imageView8b);

    menuItem0b.setMnemonicParsing(false);
    menuItem0b.setText("Edit password");

    imageView9b.setFitHeight(15.0);
    imageView9b.setFitWidth(20.0);
    imageView9b.setPickOnBounds(true);
    imageView9b.setPreserveRatio(true);
    imageView9b.setImage(new Image(getClass().getResource("key.png").toExternalForm()));
    menuItem0b.setGraphic(imageView9b);

    menuItem1b.setMnemonicParsing(false);
    menuItem1b.setText("Log out");

 

    imageView11b.setFitHeight(15.0);
    imageView11b.setFitWidth(20.0);
    imageView11b.setPickOnBounds(true);
    imageView11b.setPreserveRatio(true);
    imageView11b.setImage(new Image(getClass().getResource("Reset.png").toExternalForm()));
    menuItem1b.setGraphic(imageView11b);

	pane1b.getChildren().addAll(buttonb,button0b);
	
    pane1b.getChildren().add(button1b);
    pane1b.getChildren().add(button2b);
    pane1b.getChildren().add(button3b);
    pane1b.getChildren().add(button4b);
    anchorpaneb.getChildren().add(pane1b);
    pane1b.getChildren().add(imageViewb);
    pane1b.getChildren().add(imageView0b);
    pane1b.getChildren().add(imageView1b);
    pane1b.getChildren().add(imageView2b);
    pane1b.getChildren().add(imageView3b);
    pane1b.getChildren().add(imageView4b);
    

    anchorpaneb.getChildren().add(imageView5b);
    anchorpaneb.getChildren().add(imageView6b);
    anchorpaneb.getChildren().add(imageView7b);
   /* menub.getItems().add(menuItemb);
    menub.getItems().add(menuItem0b);*/
    menub.getItems().add(menuItem1b);
    menuBarb.getMenus().add(menub);
    anchorpaneb.getChildren().add(menuBarb);
    anchorpaneb.getChildren().add(imageView10b);
    
    anchorpaneb.getChildren().add(imageView11b);
  
    scene = new Scene(anchorpaneb);
    scene.getStylesheets().add
	(getClass().getResource("application.css").toExternalForm());}
    
    public Scene getScene () {
    	return scene;    }
	public AnchorPane getAnchorpaneb() {
		return anchorpaneb;
	}
	public Pane getPane1b() {
		return pane1b;
	}
	public Button getButtonb() {
		return buttonb;
	}
	public Button getButton0b() {
		return button0b;
	}
	public Button getButton1b() {
		return button1b;
	}
	public Button getButton2b() {
		return button2b;
	}
	public Button getButton3b() {
		return button3b;
	}
	public Button getButton4b() {
		return button4b;
	}
	public Button getButton5b() {
		return button5b;
	}
	public Button getButton6b() {
		return button6b;
	}
	public Button getButton7b() {
		return button7b;
	}
	public Button getButton8b() {
		return button8b;
	}
	public Button getButton9b() {
		return button9b;
	}
	public Button getButton10b() {
		return button10b;
	}
	public Text getTextb() {
		return textb;
	}
	public Text getText0b() {
		return text0b;
	}
	public Text getText1b() {
		return text1b;
	}
	public ImageView getImageViewb() {
		return imageViewb;
	}
	public ImageView getImageView0b() {
		return imageView0b;
	}
	public MenuBar getMenuBarb() {
		return menuBarb;
	}
	public Menu getMenub() {
		return menub;
	}
	public MenuItem getMenuItemb() {
		return menuItemb;
	}
	public ImageView getImageView1b() {
		return imageView1b;
	}
	public MenuItem getMenuItem0b() {
		return menuItem0b;
	}
	public ImageView getImageView2b() {
		return imageView2b;
	}
	public MenuItem getMenuItem1b() {
		return menuItem1b;
	}
	public ImageView getImageView3b() {
		return imageView3b;
	}
	public ImageView getImageView4b() {
		return imageView4b;
	}
	public ImageView getImageView5b() {
		return imageView5b;
	}
	public ImageView getImageView6b() {
		return imageView6b;
	}
	public ImageView getImageView7b() {
		return imageView7b;
	}
	public ImageView getImageView8b() {
		return imageView8b;
	}
	public ImageView getImageView9b() {
		return imageView9b;
	}
	public ImageView getImageView10b() {
		return imageView10b;
	}
	public ImageView getImageView11b() {
		return imageView11b;
	}
    public void LogOut(Scene1 scene1,Stage primaryStage) {
    	menuItem1b.setOnAction(e->{
    		primaryStage.setScene(scene1.getScene());
    		scene1.getUsername().setText("");
    		scene1.getPassword().setText("");
    	});
    }
    
    public void useStaff(Stage primaryStage,Scene scene){
    	getButton0b().setOnAction(e->{
    		
    		primaryStage.setScene(scene);
    	});
    }
    public void jumpCustomer(Stage primaryStage, Scene scene) {
    	buttonb.setOnAction(e->{
    		primaryStage.setScene(scene);
    	});
    	
    }
    public void jumpSupplier(Stage primaryStage, Scene scene) {
    	button3b.setOnAction(e->{
    		primaryStage.setScene(scene);
    	});
    	
    }
	public void jumpProd(Stage primaryStage, Scene scene) {
    	button2b.setOnAction(e->{
    		primaryStage.setScene(scene);
    	});

	}
	public void jumpApp (Stage primaryStage, Scene scene) {
		button4b.setOnAction(e->{
    		primaryStage.setScene(scene);
    	});
	}
	public void jumpOrder(Stage primaryStage, Scene scene) {
		button1b.setOnAction(e->{
    		primaryStage.setScene(scene);
    	});
	}
}
