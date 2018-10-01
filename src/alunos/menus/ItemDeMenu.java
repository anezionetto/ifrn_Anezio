package alunos.menus;

import alunos.dao.Dao;
import alunos.dao.DaoArrayList;

public abstract class ItemDeMenu {
	
	protected Dao dao;
	
	public ItemDeMenu() {
		dao = new DaoArrayList();
	}

	public abstract String getDescricao();

	public abstract Boolean executar();
}
