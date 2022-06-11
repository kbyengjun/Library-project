package application;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * 로그인 화면
 * 
 * 기능 : 회원 로그인, 회원가입 폼 열기 이벤트
 *
 */
public class ControllerMain implements Initializable{
	
	@FXML
	private TextField Username;
	
	@FXML 
	private Label lbl_title;
	
	@FXML
	private PasswordField Password;

	MemberList mb_info = null;
	
	public void Login(ActionEvent event) throws Exception{
		
		List<MemberItem> mb_item = mb_info.getCurrentAll();
		
	    for ( int i = 0; i < mb_item.size(); i++ ) {
	    	
			if ( Username.getText().equals(mb_item.get(i).getUserId()) 
				&& Password.getText().equals(mb_item.get(i).getUserPw()) ) {
				
				// 회원가입 창 설정 
				FXMLLoader loader = new FXMLLoader(getClass().getResource("LibraryFrm.fxml"));
				loader.setController(new ControllerLibrary());
				Parent root = (Parent)loader.load();
				
				// 로그인 아이디 전달
				ControllerLibrary controller = loader.<ControllerLibrary>getController();
				controller.initData(mb_item.get(i));
						
				Stage primaryStage = new Stage();
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Library Booking System");
				primaryStage.setScene(scene);
				primaryStage.show();	
				
				// 로그인 창 숨김
				((Node) event.getSource()).getScene().getWindow().hide();
			}else {
				lbl_title.setText("Loign Error");
			}
	    }
	}
	
	public void register(ActionEvent event) throws Exception{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("registerFrm.fxml"));
		loader.setController(new ControllerRegister());
		Parent root = (Parent)loader.load();
		
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Library Booking Register");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		// Main 클래스에 있는 mb_info 
		Username.setText("test");
		Password.setText("test");
		mb_info = Main.getMemberList();
		
	}
}
