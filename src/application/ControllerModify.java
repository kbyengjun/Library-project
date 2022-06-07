package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * 회원정보 수정 화면 
 * 
 * 기능 : 회원 정보 수정 ( 비밀번호, 학과, 전화번호  )
 */
public class ControllerModify implements Initializable{
    @FXML
    private PasswordField m_pw;

    @FXML
    private PasswordField m_repw;

    @FXML
    private PasswordField m_repw2;

    @FXML
    private TextField m_dpName;

    @FXML
    private Label m_id;

    @FXML
    private Label m_name;

    @FXML
    private Label m_stnum;

    @FXML
    private TextField m_ph1;

    @FXML
    private TextField m_ph2;

    @FXML
    private TextField m_ph3;

    @FXML
    private Button btn_modify;

    MemberItem userInfo;
    
    void initData(MemberItem mb_item) {
	   	this.userInfo = mb_item;
	   	m_id.setText(userInfo.getUserId());
		m_name.setText(userInfo.getUserName());
		m_dpName.setText(userInfo.getDepartmentName());
		m_stnum.setText(String.valueOf(userInfo.getStudentNumber()));
		
		String[] phoneArr = userInfo.getPhoneNumber().split("-");
		
		m_ph1.setText(phoneArr[0]);
		m_ph2.setText(phoneArr[1]);
		m_ph3.setText(phoneArr[2]);
	}
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	

		/**
		 * 휴대폰 공백 체크, 학과 공백 체크, 기존 비밀번호 체크(무조건)
		 * 변경 비밀번호 둘중 하나만 입력되어있으면 비밀번호 확인 체크 
		 */
	}
   
	boolean pwChangeFlag = false;
	@FXML
    void modifyOK(ActionEvent event) {
			
		if ( m_pw.getText() == null || m_pw.getText().trim().isEmpty()) {
			Main.showAlert("비밀번호를 입력해주세요.");
			return;
		}
		
		if ( !m_pw.getText().equals(userInfo.getUserPw())){
			Main.showAlert("비밀번호를 확인해주세요.");
			return;
		}
	
		if ( (m_repw.getText() == null && m_repw.getText().trim().isEmpty())
				|| (m_repw2.getText() == null && m_repw2.getText().trim().isEmpty()) ) {
			Main.showAlert("변경하실 비밀번호를 확인해주세요.");
			return;
		}else {
			if ( !m_repw.getText().equals(m_repw2.getText())) {
				Main.showAlert("변경할 비밀번호가 서로 일치하지 않습니다.");
				return;
			}else {
				if ( !m_repw.getText().trim().isEmpty() && !m_repw2.getText().trim().isEmpty()) {
					
					pwChangeFlag = true;
				}
			}
		}
	
		if ( m_dpName.getText() == null || m_dpName.getText().trim().isEmpty()) {
			Main.showAlert("학과를 입력해주세요.");
			return;
		}
		if ( !Main.isStringDouble(m_ph1.getText()) || !Main.isStringDouble(m_ph2.getText()) || !Main.isStringDouble(m_ph3.getText()) ) {
			Main.showAlert("핸드폰 번호는 숫자만 입력 해주세요. ");
			return;
		}
		
		userInfo.setDepartmentName(m_dpName.getText());
		userInfo.setPhoneNumber(m_ph1.getText()+"-"+m_ph2.getText()+"-"+m_ph3.getText());
		if ( pwChangeFlag ) {
			userInfo.setUserPw(m_repw.getText());
		}
		
		Main.showAlert("회원정보가 수정되었습니다.");
		
		((Node) event.getSource()).getScene().getWindow().hide();
    }


}
