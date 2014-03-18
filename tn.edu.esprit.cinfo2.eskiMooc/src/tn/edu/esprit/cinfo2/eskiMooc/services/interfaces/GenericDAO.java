package tn.edu.esprit.cinfo2.eskiMooc.services.interfaces;

public interface GenericDAO<B> {
	boolean add(B b);

	boolean delete(int id);

	boolean update(B b);

	B findObjectById(int id);

}
