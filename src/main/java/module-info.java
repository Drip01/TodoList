module com.drip.todolist {
	requires javafx.controls;
	requires javafx.fxml;

	opens com.drip.todolist to javafx.fxml;
	opens com.drip.todolist.datamodel to javafx.fxml;
	exports com.drip.todolist;
}