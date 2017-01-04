package com.eeiwdey.train.nodeService;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class NodeService {

	@EJB
	NodeServiceDao nodeServiceDao;
	
	public void addNode(Node node) {
		System.out.println("Received request to add node [" + node.getName() + "]");
		nodeServiceDao.addNode(node);
	}

	public Node getNodeByName(String name) {
		return nodeServiceDao.getNodeByName(name);
	}
	
	public Node getNodeById(int id) {
		return nodeServiceDao.getNodeById(id);
	}
}
