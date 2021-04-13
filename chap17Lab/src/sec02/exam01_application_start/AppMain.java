package sec02.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();  //윈도우 보여주기
	}
	
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}

	public static void main(String[] args) {
		launch(args); //AppMain 객체 생성 및 메인 윈도우 생성
	}
}

