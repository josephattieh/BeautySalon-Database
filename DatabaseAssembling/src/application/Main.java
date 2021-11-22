package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Main extends Application {
	
	private ObservableList<ObservableList> data;
    private TableView tableview;
	public void start(Stage primaryStage) {		
		
	   Scene1 scene1 = new Scene1();
		Scene scenea = scene1.getScene();
	
		
		
        primaryStage.setTitle("Login");
        primaryStage.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
		primaryStage.setScene(scenea);
		primaryStage.maximizedProperty().addListener(ef->{
			if(primaryStage.isMaximized()) {
			primaryStage.setMaximized(false);}
		});
		
		
        
		Scene2 scene2 = new Scene2();
		Scene sceneb = scene2.getScene();
		sceneb.getStylesheets().add
		(getClass().getResource("application.css").toExternalForm());
		
		
		boolean [] bool = new boolean [1];
		
		scene2.LogOut(scene1, primaryStage);
		primaryStage.show();
		
	
		Scene3 scene3a = new  Scene3();
		scene3a.getMenu().setText(scene2.getMenub().getText());
		scene3a.getTableView().getColumns().clear();
		scene3a.getTableView().getItems().clear();
		scene3a.getBack(primaryStage, sceneb);
	
	   
		Scene scenea3 = scene3a.getScene();

		scene2.useStaff(primaryStage, scenea3);
		scene3a.LogOut(scene1, primaryStage);
		
		Scene4  scene4a = new Scene4();
		Scene scenea4 = scene4a.getScene();
		
		Stage stage = scene3a.jumpAddCust(scenea4); //stage of insert staff
		scene4a.loadValues();
		
		
		Scene5 scene5a = new Scene5();
		Scene scenea5 = scene5a.getScene();
		Stage stage0 =scene3a.searchCustomer( scenea5); //stage of search cust
		scene5a.getButton().setOnAction(e->{
			scene3a.getTableView().getItems().clear();
			buildData(scene5a.SearchOnACriteria(), scene3a.getTableView());
			stage0.close();
		});
		
		
		Scene3b scene3b = new Scene3b();
		Scene sceneb3 = scene3b.getScene();
       scene2.jumpCustomer(primaryStage, sceneb3);
        scene3b.getMenu().setText(scene2.getMenub().getText());
		scene3b.getTableView().getColumns().clear();
		scene3b.getTableView().getItems().clear();
		
		scene3b.getBack(primaryStage, sceneb);
		 buildData("SELECT * FROM CUSTOMER;", scene3b.getTableView());
		 scene2.useStaff(primaryStage, scenea3);
			scene3a.LogOut(scene1, primaryStage);
			
			Scene4b  scene4b = new Scene4b();
			Scene sceneb4 = scene4b.getScene();
			
			Stage stageb = scene3b.jumpAddCust(sceneb4); //insert cust
			scene4b.loadValues();
			
			scene3b.refresh();
		
			Scene5b scene5b = new Scene5b();
			Scene sceneb5 = scene5b.getScene();
			Stage stageb0 =scene3b.searchCustomer( sceneb5);  //search cust
			scene5b.getButton().setOnAction(e->{
				scene3b.getTableView().getItems().clear();
				scene3b.getTableView().getColumns().clear();

				buildData(scene5b.SearchOnACriteria(), scene3b.getTableView());
				stageb0.close();
			});

			Scene3SUPP scene3c = new Scene3SUPP();
			Scene scenec3 = scene3c.getScene();
	       scene2.jumpSupplier(primaryStage, scenec3);
	     
	        scene3c.getMenu().setText(scene2.getMenub().getText());
			scene3c.getTableView().getColumns().clear();
			scene3c.getTableView().getItems().clear();
			
			scene3c.getBack(primaryStage, sceneb);
			 buildData("SELECT * FROM SUPPLIER;", scene3c.getTableView());
			
				scene3c.LogOut(scene1, primaryStage);
				Scene4c  scene4c = new Scene4c();
				Scene scenec4 = scene4c.getScene();
				
				Stage stagec = scene3c.jumpAddCust(scenec4); //insert supplier
				scene4c.loadValues();
				
				scene3c.refresh();
				
				Scene5c scene5c = new Scene5c();
				Scene scenec5 = scene5c.getScene();
				Stage stageb0c =scene3c.searchCustomer( scenec5);
				scene5c.getButton().setOnAction(e->{
					scene3c.getTableView().getItems().clear();
					scene3c.getTableView().getColumns().clear();

           buildData(scene5c.SearchOnACriteria(), scene3c.getTableView());
					stageb0c.close();
				});

				Scene3Prod scene3d = new Scene3Prod();
				Scene scened3 = scene3d.getScene();
		        scene2.jumpProd(primaryStage, scened3);
		     
		        scene3d.getMenu().setText(scene2.getMenub().getText());
				scene3d.getTableView().getColumns().clear();
				scene3d.getTableView().getItems().clear();
				
				scene3d.getBack(primaryStage, sceneb);
				 buildData("SELECT * FROM Product_list;", scene3d.getTableView());
				
					scene3d.LogOut(scene1, primaryStage);
					Scene4d  scene4d = new Scene4d();
					Scene scened4 = scene4d.getScene();
					scene3d.refresh();
					Stage staged = scene3d.jumpAddCust(scened4);;
					
					scene4d.loadValues();
					
					Scene5d scene5d = new Scene5d();
					Scene scened5 = scene5d.getScene();
					Stage stageb0d =scene3d.searchCustomer( scened5);
					scene5d.getButton().setOnAction(e->{
						scene3d.getTableView().getItems().clear();
						scene3d.getTableView().getColumns().clear();

						buildData(scene5d.SearchOnACriteria(), scene3d.getTableView());
						stageb0d.close();
					});
					
				Scene3App scene3e = new Scene3App();
			
				Scene scenee3 = scene3e.getScene();
		        scene2.jumpApp(primaryStage, scenee3);
		        scene3e.getMenu().setText(scene2.getMenub().getText());
				scene3e.getTableView().getColumns().clear();
				scene3e.getTableView().getItems().clear();
				scene3e.refresh();
				Scene6e scene6e = new Scene6e();
				Scene scenee6 = scene6e.getScene();
				Stage stg6 = new Stage();
				scene3e.getServices(stg6, scenee6);
				
				
				scene3e.getBack(primaryStage, sceneb);
				buildData("SELECT A.bookingID, A.bookingDate,A.bookingTime, A.duration, A.custId , C.fName ,c.lName ,A.staffID, S.serviceId, S.servicetype, ST.fname , st.lname   FROM APPOINTMENT A, SERVICE S, STAFF ST, CUSTOMER C WHERE A.serviceID=S.serviceID AND A.custID=C.custID AND S.staffID=ST.staffID ;",scene3e.getTableView());

				scene3e.LogOut(scene1, primaryStage);
				Scene4e  scene4e = new Scene4e();
				Scene scenee4 = scene4e.getScene();
				
				Stage stagee = scene3e.jumpAddCust(scenee4);;
				scene6e.loadValues();
				scene4e.loadValues();
				scene4e.update(stagee);
				scene4e.insert(stagee);
				scene4e.delete(stagee);
				Scene5e scene5e = new Scene5e();
				Scene scenee5 = scene5e.getScene();
				Stage stageb0e =scene3e.searchCustomer( scenee5);
				scene5e.getButton().setOnAction(e->{
					scene3e.getTableView().getItems().clear();
					scene3e.getTableView().getColumns().clear();

					buildData(scene5e.SearchOnACriteria(), scene3e.getTableView());
					stageb0e.close();
				});
			
				scene1.workButton(scene2.getMenub(), primaryStage, sceneb, bool, scene3a, scene3d, scene3c);
				Scene3Order scene3f = new Scene3Order();
				Scene scenef3 = scene3f.getScene();
		        scene2.jumpOrder(primaryStage, scenef3);
		        
		        scene3f.getMenu().setText(scene2.getMenub().getText());
				scene3f.getTableView().getColumns().clear();
				scene3f.getTableView().getItems().clear();
				scene3f.refresh();
				
				 buildData("  SELECT O.* , C.lName,fName FROM Order_data O, Customer C WHERE O.custId = C.custId; ;", scene3f.getTableView());
				scene3f.getBack(primaryStage, sceneb);
				scene3f.LogOut(scene1, primaryStage);
				Scene4f scene4f = new Scene4f();
				Scene scenef4 = scene4f.getScene();
				Stage stage0f4 = new Stage();
				
				scene3f.goEdit(stage0f4, scenef4);
				scene4f.update(stage0f4);
				scene4f.loadValues();
				scene4f.delete(stage0f4);
				scene4f.insert(stage0f4);
				
				Scene4g scene4g = new Scene4g();
				Scene sceneg4 = scene4g.getScene();
				
				scene4f.jumpProd(sceneg4,scene4g);
				scene4g.delete();
				scene4g.insert();
				scene4g.loadValues();
				
				
				Scene6f scene6f = new Scene6f();
				Scene scenef6 = scene6f.getScene();
				Stage stageb0f =scene3f.searchOrder( scenef6);
				scene6f.getButton().setOnAction(e->{
					scene3f.getTableView().getItems().clear();
					scene3f.getTableView().getColumns().clear();
					buildData(scene6f.SearchOnACriteria(), scene3f.getTableView());
					stageb0f.close();
				});

				
				scene4a.update(stage,scene6e.ComboboxStaffIDServ(),scene4e.comboStaff(),scene4b.ComboStaff(),scene5b.ComboStaff());
				scene4a.insert(stage,scene6e.ComboboxStaffIDServ(),scene4e.comboStaff(),scene4b.ComboStaff(),scene5b.ComboStaff());
				scene4a.delete(stage,scene6e.ComboboxStaffIDServ(),scene4e.comboStaff() ,scene4b.ComboStaff(),scene5b.ComboStaff() );	
				scene4b.update(stageb,scene5e.getCust(),scene4e.getCust(),scene4f.getCust(),scene6f.getCust());
				scene4b.insert(stageb,scene5e.getCust(),scene4e.getCust(),scene4f.getCust(),scene6f.getCust());
				scene4b.delete(stageb,scene5e.getCust(),scene4e.getCust(),scene4f.getCust(),scene6f.getCust());
				scene4c.update(stagec,scene4d.getSupp(),scene5d.getSupp());
				scene4c.insert(stagec,scene4d.getSupp(),scene5d.getSupp());
				scene4c.delete(stagec,scene4d.getSupp(),scene5d.getSupp());
				scene6e.delete(stg6,scene4e.getSer(),scene5e.getServ());
				scene6e.update(stg6 , scene4e.getSer(),scene5e.getServ());
				scene6e.insert(stg6, scene4e.getSer(),scene5e.getServ());
				scene4d.update(staged,scene4g.getProd(),scene6f.getProd());
				scene4d.insert(staged,scene4g.getProd(),scene6f.getProd());
				scene4d.delete(staged,scene4g.getProd(),scene6f.getProd());
				
				primaryStage.setTitle("BeautyShop");
				primaryStage.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stage.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stage0.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stage0f4.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stageb.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stageb0.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stageb0c.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stageb0d.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stageb0e.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stagec.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				staged.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));
				stagee.getIcons().add(new Image(getClass().getResource("user.png").toExternalForm()));

				
				
				
	
	}
	
	public static void main(String[] args) {
		launch(args);
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

	 
	 
}
