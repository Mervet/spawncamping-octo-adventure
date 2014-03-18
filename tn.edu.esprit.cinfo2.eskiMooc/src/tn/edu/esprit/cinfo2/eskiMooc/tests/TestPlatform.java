package tn.edu.esprit.cinfo2.eskiMooc.tests;

import org.junit.Assert;
import org.junit.Test;

import tn.edu.esprit.cinfo2.eskiMooc.domain.Skill;
import tn.edu.esprit.cinfo2.eskiMooc.services.impl.SkillsDAO;
import tn.edu.esprit.cinfo2.eskiMooc.services.interfaces.GenericDAO;
import tn.edu.esprit.cinfo2.eskiMooc.utilities.MyConnection;

public class TestPlatform {

	@Test
	public void test() {
		MyConnection.hetConnection();
	}

	@Test
	public void testAdd() {
		Skill skill = new Skill();
		skill.setLabel("php");

		GenericDAO<Skill> genericDAO = new SkillsDAO();

		Assert.assertTrue(genericDAO.add(skill));
	}

}
