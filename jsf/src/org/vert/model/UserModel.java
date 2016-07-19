package org.vert.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.vert.db.User;
import org.vert.hibernate.HibernateSession;
import org.vert.hibernate.SQL;

public class UserModel {
	@SuppressWarnings("unchecked")
	public static User findByUserName(String userName){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("User", "findByUsername");
		System.out.println(sql);
		Query query = session.createQuery(sql);
		query.setParameter("username", userName);
		List<User> list = query.list();
		session.close();
		return list.get(0);
	}
}
