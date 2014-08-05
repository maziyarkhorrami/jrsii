package com.jrsii.main;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.servlet.annotation.WebServlet;

import com.jrsii.entities.Benutzer;
import com.jrsii.view.backend.AdminPage;
import com.jrsii.view.frontend.Admin_NeueBenutzerHinzufuegen;
import com.jrsii.view.frontend.Admin_NeuebenutzernameHinzufuegenBestaetigen;
import com.jrsii.view.frontend.Login;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("mits")
public class JrsiiUI extends UI {
	
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = JrsiiUI.class, widgetset = "com.jrsii.main.widgetset.JrsiiWidgetset")
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout(); 
		layout.setMargin(true); 
		setContent(layout); 
		
		Navigator navigator = new Navigator(this, this);
		
		navigator.addView("", new Login());
//		navigator.addView(AdminPage.ADMIN_PAGE, new AdminPage());
//		navigator.addView(Admin_NeueBenutzerHinzufuegen.ADMIN_NEUE_BENUTZER_HINZUFUEGEN, new Admin_NeueBenutzerHinzufuegen());
//		navigator.addView(Admin_NeuebenutzernameHinzufuegenBestaetigen.ADMIN_NEUE_BENUTZER_HINZUFUEGEN_BESTAETIGEN, new Admin_NeuebenutzernameHinzufuegenBestaetigen());
//		navigator.navigateTo(Login.LOGIN_PAGE);
		
//		JrsiiUI.getCurrent().setContent(new Login());


	}

}