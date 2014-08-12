package com.jrsii.main.frontend.user;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class UserBenutzerOptionen extends CustomComponent implements View {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_Main;
	@AutoGenerated
	private HorizontalSplitPanel horizontalSplitPanel_Main;
	@AutoGenerated
	private VerticalLayout verticalLayout_Right;
	@AutoGenerated
	private Panel panel_Right;
	@AutoGenerated
	private VerticalLayout verticalLayout_PanelRight;
	@AutoGenerated
	private VerticalLayout verticalLayout_Left;
	@AutoGenerated
	private Button button_Abmelden;
	@AutoGenerated
	private Button button_BenutzerOptionen;
	@AutoGenerated
	private Button button_SetUp;
	@AutoGenerated
	private Button button_Marketing;
	@AutoGenerated
	private Button button_Kurse;
	@AutoGenerated
	private Button button_Lehrer;
	@AutoGenerated
	private Button button_SchuelerStudent;
	public static final String USER_BENUTZER_OPTIONEN_PAGE = "UserBenutzerOptionenPage";
	/**
	 * 
	 */
	private static final long serialVersionUID = 521985652200676883L;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public UserBenutzerOptionen() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		horizontalSplitPanel_Main.setSplitPosition(13);
		
		
		// TODO add user code here
	}

	@Override
	public void enter(ViewChangeEvent event) {
		panel_Right.setCaption("Benutzer Home Page");
		
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// horizontalLayout_Main
		horizontalLayout_Main = buildHorizontalLayout_Main();
		mainLayout.addComponent(horizontalLayout_Main,
				"top:0.0px;right:-2.0px;bottom:2.0px;left:0.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_Main() {
		// common part: create layout
		horizontalLayout_Main = new HorizontalLayout();
		horizontalLayout_Main.setImmediate(false);
		horizontalLayout_Main.setWidth("100.0%");
		horizontalLayout_Main.setHeight("100.0%");
		horizontalLayout_Main.setMargin(false);
		
		// horizontalSplitPanel_Main
		horizontalSplitPanel_Main = buildHorizontalSplitPanel_Main();
		horizontalLayout_Main.addComponent(horizontalSplitPanel_Main);
		
		return horizontalLayout_Main;
	}

	@AutoGenerated
	private HorizontalSplitPanel buildHorizontalSplitPanel_Main() {
		// common part: create layout
		horizontalSplitPanel_Main = new HorizontalSplitPanel();
		horizontalSplitPanel_Main.setImmediate(false);
		horizontalSplitPanel_Main.setWidth("100.0%");
		horizontalSplitPanel_Main.setHeight("100.0%");
		
		// verticalLayout_Left
		verticalLayout_Left = buildVerticalLayout_Left();
		horizontalSplitPanel_Main.addComponent(verticalLayout_Left);
		
		// verticalLayout_Right
		verticalLayout_Right = buildVerticalLayout_Right();
		horizontalSplitPanel_Main.addComponent(verticalLayout_Right);
		
		return horizontalSplitPanel_Main;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_Left() {
		// common part: create layout
		verticalLayout_Left = new VerticalLayout();
		verticalLayout_Left.setImmediate(false);
		verticalLayout_Left.setWidth("100.0%");
		verticalLayout_Left.setHeight("100.0%");
		verticalLayout_Left.setMargin(false);
		
		// button_SchuelerStudent
		button_SchuelerStudent = new Button();
		button_SchuelerStudent.setCaption("sch�ler/student");
		button_SchuelerStudent.setImmediate(true);
		button_SchuelerStudent.setWidth("-1px");
		button_SchuelerStudent.setHeight("-1px");
		verticalLayout_Left.addComponent(button_SchuelerStudent);
		verticalLayout_Left.setComponentAlignment(button_SchuelerStudent,
				new Alignment(34));
		
		// button_Lehrer
		button_Lehrer = new Button();
		button_Lehrer.setCaption("lehrer");
		button_Lehrer.setImmediate(true);
		button_Lehrer.setWidth("-1px");
		button_Lehrer.setHeight("-1px");
		verticalLayout_Left.addComponent(button_Lehrer);
		verticalLayout_Left.setComponentAlignment(button_Lehrer, new Alignment(
				34));
		
		// button_Kurse
		button_Kurse = new Button();
		button_Kurse.setCaption("kurse");
		button_Kurse.setImmediate(true);
		button_Kurse.setWidth("-1px");
		button_Kurse.setHeight("-1px");
		verticalLayout_Left.addComponent(button_Kurse);
		verticalLayout_Left.setComponentAlignment(button_Kurse, new Alignment(
				34));
		
		// button_Marketing
		button_Marketing = new Button();
		button_Marketing.setCaption("marketing");
		button_Marketing.setImmediate(true);
		button_Marketing.setWidth("-1px");
		button_Marketing.setHeight("-1px");
		verticalLayout_Left.addComponent(button_Marketing);
		verticalLayout_Left.setComponentAlignment(button_Marketing,
				new Alignment(34));
		
		// button_SetUp
		button_SetUp = new Button();
		button_SetUp.setCaption("set up");
		button_SetUp.setImmediate(true);
		button_SetUp.setWidth("-1px");
		button_SetUp.setHeight("-1px");
		verticalLayout_Left.addComponent(button_SetUp);
		verticalLayout_Left.setComponentAlignment(button_SetUp, new Alignment(
				34));
		
		// button_BenutzerOptionen
		button_BenutzerOptionen = new Button();
		button_BenutzerOptionen.setCaption("benutzer optionen");
		button_BenutzerOptionen.setImmediate(true);
		button_BenutzerOptionen.setWidth("-1px");
		button_BenutzerOptionen.setHeight("-1px");
		verticalLayout_Left.addComponent(button_BenutzerOptionen);
		verticalLayout_Left.setComponentAlignment(button_BenutzerOptionen,
				new Alignment(34));
		
		// button_Abmelden
		button_Abmelden = new Button();
		button_Abmelden.setCaption("abmelden");
		button_Abmelden.setImmediate(true);
		button_Abmelden.setWidth("-1px");
		button_Abmelden.setHeight("-1px");
		verticalLayout_Left.addComponent(button_Abmelden);
		verticalLayout_Left.setComponentAlignment(button_Abmelden,
				new Alignment(10));
		
		return verticalLayout_Left;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_Right() {
		// common part: create layout
		verticalLayout_Right = new VerticalLayout();
		verticalLayout_Right.setImmediate(false);
		verticalLayout_Right.setWidth("100.0%");
		verticalLayout_Right.setHeight("100.0%");
		verticalLayout_Right.setMargin(false);
		
		// panel_Right
		panel_Right = buildPanel_Right();
		verticalLayout_Right.addComponent(panel_Right);
		verticalLayout_Right.setExpandRatio(panel_Right, 1.0f);
		verticalLayout_Right.setComponentAlignment(panel_Right, new Alignment(
				48));
		
		return verticalLayout_Right;
	}

	@AutoGenerated
	private Panel buildPanel_Right() {
		// common part: create layout
		panel_Right = new Panel();
		panel_Right.setImmediate(false);
		panel_Right.setWidth("100.0%");
		panel_Right.setHeight("100.0%");
		
		// verticalLayout_PanelRight
		verticalLayout_PanelRight = new VerticalLayout();
		verticalLayout_PanelRight.setImmediate(false);
		verticalLayout_PanelRight.setWidth("100.0%");
		verticalLayout_PanelRight.setHeight("100.0%");
		verticalLayout_PanelRight.setMargin(false);
		panel_Right.setContent(verticalLayout_PanelRight);
		
		return panel_Right;
	}

}
