package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * ȸ������ ȭ��
 */
public class ControllerRegister implements Initializable{

    @FXML
    private TextField r_uid;

    @FXML
    private PasswordField r_upw;

    @FXML
    private PasswordField r_upw2;

    @FXML
    private TextField r_uname;
    
    @FXML
    private TextField r_stNum;

    @FXML
    private TextField r_dpName;

    @FXML
    private Button r_success;

    @FXML
    private TextField r_phone1;

    @FXML
    private TextField r_phone2;

    @FXML
    private TextField r_phone3;
    
    MemberList mb_info = null;
    
	public void r_success(ActionEvent event) throws Exception
	{
		if ( r_uid.getText() == null || r_uid.getText().trim().isEmpty()) {
			Main.showAlert("���̵� �Է����ּ���.");
			return;
		}else {
			for ( int i = 0; i < mb_info.item.size(); i++) {
				if ( r_uid.getText().equals(mb_info.item.get(i).getUserId()) ){	
					Main.showAlert("�ߺ��� ���̵� �Դϴ�.");
					return;
				}
			}
		}
		
		if ( r_upw.getText() == null || r_upw.getText().trim().isEmpty()) {
			Main.showAlert("��й�ȣ�� �Է����ּ���.");
			return;
		}
		if ( !r_upw.getText().equals(r_upw2.getText())) {
			Main.showAlert("��й�ȣ�� ���� ��ġ���� �ʽ��ϴ�.");
			return;
		}
		if ( r_uname.getText() == null || r_uname.getText().trim().isEmpty()) {
			Main.showAlert("�̸��� �Է����ּ���.");
			return;
		}
		if ( r_dpName.getText() == null || r_dpName.getText().trim().isEmpty()) {
			Main.showAlert("�а��� �Է����ּ���.");
			return;
		}
		if ( !Main.isStringDouble(r_stNum.getText()) ) {
			Main.showAlert("�й��� ���ڸ� �Է����ּ���.");
			return;
		}
		if ( !Main.isStringDouble(r_phone1.getText()) || !Main.isStringDouble(r_phone2.getText()) || !Main.isStringDouble(r_phone3.getText()) ) {
			Main.showAlert("�ڵ��� ��ȣ�� ���ڸ� �Է� ���ּ���. ");
			return;
		}
		
		// ���̵� �ߺ� �˻� �ؾ���.
		
		String userId = r_uid.getText();
		String userPw = r_upw.getText();
		String userName = r_uname.getText();
		int	userstNum = Integer.parseInt(r_stNum.getText());
		String departName = r_dpName.getText();
		String userPhone = r_phone1.getText()+"-"+r_phone2.getText()+"-"+r_phone3.getText();
	
	   
		mb_info.item.add(new MemberItem(userId,userPw,userName,userstNum,departName,userPhone));
		Main.showAlert("������ ���ϵ帳�ϴ�.");

		((Node) event.getSource()).getScene().getWindow().hide();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		mb_info = Main.getMemberList();
	}
	
	
}
