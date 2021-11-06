package com.pastley.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pastley.model.CategoryModel;
import com.pastley.util.Pastley;

import lombok.Data;

@Data
public class Footer implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item<CategoryModel>> categories;
	private List<Item<String>> services;
	private List<Item<String>> social;

	public Footer() {
		this.init();
	}
	
	public void init() {
		this.categories = new ArrayList<Item<CategoryModel>>();
		this.services = new ArrayList<Item<String>>();
		this.social = new ArrayList<Item<String>>();
	}

	public void fill() {
		this.fillServicies();
		this.fillSocial();
	}

	public void fillServicies() {
		Pastley.addItem(new Item<String>("Iniciar Sesión", "login?faces-redirect=true", "Iniciar Sesión", "pi pi-user"),
				this.services);
		Pastley.addItem(new Item<String>("Contacto", "contact?faces-redirect=true", "Contacto", "pi pi-user"),
				this.services);
		Pastley.addItem(new Item<String>("Carrito", "cart?faces-redirect=true", "Carrito", "pi pi-user"),
				this.services);
	}

	public void fillSocial() {
		Pastley.addItem(new Item<String>(null, "login?faces-redirect=true", "Facebook", "pi pi-facebook"), this.social);
		Pastley.addItem(new Item<String>(null, "login?faces-redirect=true", "Twitter", "pi pi-twitter"), this.social);
		Pastley.addItem(new Item<String>(null, "login?faces-redirect=true", "Mensaje", "pi pi-send"), this.social);
	}
}
