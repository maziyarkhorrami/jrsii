package com.jrsii.entities;

import java.util.List;

import javax.persistence.*;

import com.jrsii.entities.Adressgruppen;
import com.jrsii.view.frontend.Login;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
public class StudentQueries {
	@PersistenceContext(unitName = "StudentsQueries" )

	
//	public List<Adressgruppenverweise> findAdresseIDNamesContainsXFromAdressgruppenAdressgruppenverweise(String adressgruppeName){
//		return em.createNamedQuery("Adressgruppenverweise.FindAllAdressgruppen_WHERE_agv.AdressgruppenID_EQUAL_ag.ID_AND_ag.Name_LIKE_adressgruppeName"
//				                   , Adressgruppenverweise.class).setParameter("adressgruppeName", adressgruppeName).getResultList();
//				
//	}
	
//	public List<Adressgruppen> testMazy (String adressgruppeName){
//		return em.createNativeQuery("mazyTestQuery", Adressgruppen.class).setParameter("adressgruppeName", adressgruppeName).getResultList();
//	}
//	
	public List<Adressen> findAdressenFromAdressgruppenJOINAdressgruppenverweiseWHEREAdressgruppenNAMEis(String adressgruppeName){
		EntityManager em = JPAContainerFactory.createEntityManagerForPersistenceUnit(Login.PERSISTANCE_UNIT);
		Query q = em.createQuery(" SELECT DISTINCT agv.adressen FROM Adressgruppenverweise agv LEFT JOIN agv.adressgruppen ag ON ag.name LIKE :adressgruppeName");
		q.setParameter("adressgruppeName", "%"+adressgruppeName+"%");
		return q.getResultList();
	}
	
}
