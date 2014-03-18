package tn.edu.esprit.cinfo2.eskiMooc.services.impl;

import java.sql.Statement;

import tn.edu.esprit.cinfo2.eskiMooc.domain.Skill;
import tn.edu.esprit.cinfo2.eskiMooc.services.interfaces.GenericDAO;
import tn.edu.esprit.cinfo2.eskiMooc.utilities.MyConnection;

public class SkillsDAO implements GenericDAO<Skill> {

	@Override
	public boolean add(Skill skill) {
		boolean b = false;
		try {
			Statement statement = MyConnection.hetStatement();
			String sql = "insert into t_skill (label) values ('"
					+ skill.getLabel() + "')";
			statement.executeUpdate(sql);
			b = true;
		} catch (Exception e) {
			System.err.println("emm haw fibali ...");
		}
		return b;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Skill b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Skill findObjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
