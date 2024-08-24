package com.hyvercode.gluondays;

import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class MainPresenter {

    @FXML
    private View main;


    @FXML
    private ResourceBundle resources;

    public void initialize() {
        //Navigation Bar
        main.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = AppManager.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> AppManager.getInstance().getDrawer().open()));
                appBar.setTitleText("De'Holiday");
            }
        });
    }
}
