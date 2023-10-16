package dao.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import beans.MessageBean;
import dao.SampleDAO;

@Repository("dao.sample")
@Scope(value="prototype")
public class SampleDAOImpl implements SampleDAO {

	@Resource(name="bean.message")
	private MessageBean data;
	
	public MessageBean loadData() {
		System.out.println("[DAO] - Obteniendo datos de BD");
		return data;
	}

	public void setData(MessageBean data) {
		this.data = data;
	}

}
