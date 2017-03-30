package online.mrsys.movierecommender.dao.impl;

import java.util.List;

import online.mrsys.common.dao.impl.BaseDaoHibernate;
import online.mrsys.movierecommender.dao.RoleDao;
import online.mrsys.movierecommender.domain.Role;
import online.mrsys.movierecommender.domain.User;

public class RoleDaoHibernate extends BaseDaoHibernate<Role> implements RoleDao {

	@Override
	public Role findById(Integer id) {
		// TODO Auto-generated method stub
		List<Role> roles = find("select r from Role r where r.role_id = ?0", id);
		if (roles != null && roles.size() >= 1)
			return roles.get(0);
		return null;
	}

}
