package com.dmjsistemas.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named("menu")
@ViewScoped
public class MenuBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private MenuModel model;

    public MenuBean() {

    }

    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();
        Usuarios us = (Usuarios) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("nombre");
        if (us.getPerfil().equals("Administrador")) {
            // First submenu
            DefaultSubMenu firstSubmenu = DefaultSubMenu.builder().label("MENÚ").build();

            DefaultMenuItem item = DefaultMenuItem
                    .builder()
                    .value("Precios")
                    .icon("pi pi-cog")
                    .outcome("/views/Precios")
                    .build();
            firstSubmenu.getElements().add(item);

            model.getElements().add(firstSubmenu);
        } 

    }

    public MenuModel getModel() {
        return model;
    }

}
